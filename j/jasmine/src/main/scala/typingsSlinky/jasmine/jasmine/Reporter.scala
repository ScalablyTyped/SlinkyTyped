package typingsSlinky.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reporter extends js.Object {
  def log(str: String): Unit = js.native
  def reportRunnerResults(runner: Runner): Unit = js.native
  def reportRunnerStarting(runner: Runner): Unit = js.native
  def reportSpecResults(spec: Spec): Unit = js.native
  def reportSpecStarting(spec: Spec): Unit = js.native
  def reportSuiteResults(suite: Suite): Unit = js.native
}

object Reporter {
  @scala.inline
  def apply(
    log: String => Unit,
    reportRunnerResults: Runner => Unit,
    reportRunnerStarting: Runner => Unit,
    reportSpecResults: Spec => Unit,
    reportSpecStarting: Spec => Unit,
    reportSuiteResults: Suite => Unit
  ): Reporter = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log), reportRunnerResults = js.Any.fromFunction1(reportRunnerResults), reportRunnerStarting = js.Any.fromFunction1(reportRunnerStarting), reportSpecResults = js.Any.fromFunction1(reportSpecResults), reportSpecStarting = js.Any.fromFunction1(reportSpecStarting), reportSuiteResults = js.Any.fromFunction1(reportSuiteResults))
    __obj.asInstanceOf[Reporter]
  }
  @scala.inline
  implicit class ReporterOps[Self <: Reporter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLog(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReportRunnerResults(value: Runner => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportRunnerResults")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReportRunnerStarting(value: Runner => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportRunnerStarting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReportSpecResults(value: Spec => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportSpecResults")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReportSpecStarting(value: Spec => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportSpecStarting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReportSuiteResults(value: Suite => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportSuiteResults")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

