package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetReportsOutput extends js.Object {
  /**
    *  The array of Report objects returned by BatchGetReports. 
    */
  var reports: js.UndefOr[Reports] = js.native
  /**
    *  An array of ARNs passed to BatchGetReportGroups that are not associated with a Report. 
    */
  var reportsNotFound: js.UndefOr[ReportArns] = js.native
}

object BatchGetReportsOutput {
  @scala.inline
  def apply(): BatchGetReportsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetReportsOutput]
  }
  @scala.inline
  implicit class BatchGetReportsOutputOps[Self <: BatchGetReportsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReports(value: Reports): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reports")(js.undefined)
        ret
    }
    @scala.inline
    def withReportsNotFound(value: ReportArns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportsNotFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportsNotFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportsNotFound")(js.undefined)
        ret
    }
  }
  
}

