package typingsSlinky.relayCompiler.reporterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reporter extends js.Object {
  def reportError(caughtLocation: String, error: js.Error): Unit = js.native
  def reportMessage(message: String): Unit = js.native
  def reportTime(name: String, ms: Double): Unit = js.native
}

object Reporter {
  @scala.inline
  def apply(
    reportError: (String, js.Error) => Unit,
    reportMessage: String => Unit,
    reportTime: (String, Double) => Unit
  ): Reporter = {
    val __obj = js.Dynamic.literal(reportError = js.Any.fromFunction2(reportError), reportMessage = js.Any.fromFunction1(reportMessage), reportTime = js.Any.fromFunction2(reportTime))
    __obj.asInstanceOf[Reporter]
  }
  @scala.inline
  implicit class ReporterOps[Self <: Reporter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReportError(value: (String, js.Error) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportError")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withReportMessage(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReportTime(value: (String, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportTime")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

