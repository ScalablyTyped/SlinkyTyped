package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetReportGroupsInput extends js.Object {
  /**
    *  An array of report group ARNs that identify the report groups to return. 
    */
  var reportGroupArns: ReportGroupArns = js.native
}

object BatchGetReportGroupsInput {
  @scala.inline
  def apply(reportGroupArns: ReportGroupArns): BatchGetReportGroupsInput = {
    val __obj = js.Dynamic.literal(reportGroupArns = reportGroupArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetReportGroupsInput]
  }
  @scala.inline
  implicit class BatchGetReportGroupsInputOps[Self <: BatchGetReportGroupsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReportGroupArns(value: ReportGroupArns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportGroupArns")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

