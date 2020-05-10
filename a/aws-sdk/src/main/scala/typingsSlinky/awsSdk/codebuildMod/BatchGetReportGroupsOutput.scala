package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetReportGroupsOutput extends js.Object {
  /**
    *  The array of report groups returned by BatchGetReportGroups. 
    */
  var reportGroups: js.UndefOr[ReportGroups] = js.native
  /**
    *  An array of ARNs passed to BatchGetReportGroups that are not associated with a ReportGroup. 
    */
  var reportGroupsNotFound: js.UndefOr[ReportGroupArns] = js.native
}

object BatchGetReportGroupsOutput {
  @scala.inline
  def apply(): BatchGetReportGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetReportGroupsOutput]
  }
  @scala.inline
  implicit class BatchGetReportGroupsOutputOps[Self <: BatchGetReportGroupsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReportGroups(value: ReportGroups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withReportGroupsNotFound(value: ReportGroupArns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportGroupsNotFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportGroupsNotFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportGroupsNotFound")(js.undefined)
        ret
    }
  }
  
}

