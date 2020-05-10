package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestReportSummary extends js.Object {
  /**
    *  The number of nanoseconds it took to run all of the test cases in this report. 
    */
  var durationInNanoSeconds: WrapperLong = js.native
  /**
    *  A map that contains the number of each type of status returned by the test results in this TestReportSummary. 
    */
  var statusCounts: ReportStatusCounts = js.native
  /**
    *  The number of test cases in this TestReportSummary. The total includes truncated test cases. 
    */
  var total: WrapperInt = js.native
}

object TestReportSummary {
  @scala.inline
  def apply(durationInNanoSeconds: WrapperLong, statusCounts: ReportStatusCounts, total: WrapperInt): TestReportSummary = {
    val __obj = js.Dynamic.literal(durationInNanoSeconds = durationInNanoSeconds.asInstanceOf[js.Any], statusCounts = statusCounts.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestReportSummary]
  }
  @scala.inline
  implicit class TestReportSummaryOps[Self <: TestReportSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDurationInNanoSeconds(value: WrapperLong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationInNanoSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCounts(value: ReportStatusCounts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: WrapperInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

