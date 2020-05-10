package typingsSlinky.chunkedDc.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiReporter extends Reporter {
  def addReporter(reporter: Reporter): Unit = js.native
}

object MultiReporter {
  @scala.inline
  def apply(
    addReporter: Reporter => Unit,
    log: String => Unit,
    reportRunnerResults: Runner => Unit,
    reportRunnerStarting: Runner => Unit,
    reportSpecResults: Spec => Unit,
    reportSpecStarting: Spec => Unit,
    reportSuiteResults: Suite => Unit
  ): MultiReporter = {
    val __obj = js.Dynamic.literal(addReporter = js.Any.fromFunction1(addReporter), log = js.Any.fromFunction1(log), reportRunnerResults = js.Any.fromFunction1(reportRunnerResults), reportRunnerStarting = js.Any.fromFunction1(reportRunnerStarting), reportSpecResults = js.Any.fromFunction1(reportSpecResults), reportSpecStarting = js.Any.fromFunction1(reportSpecStarting), reportSuiteResults = js.Any.fromFunction1(reportSuiteResults))
    __obj.asInstanceOf[MultiReporter]
  }
  @scala.inline
  implicit class MultiReporterOps[Self <: MultiReporter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddReporter(value: Reporter => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addReporter")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

