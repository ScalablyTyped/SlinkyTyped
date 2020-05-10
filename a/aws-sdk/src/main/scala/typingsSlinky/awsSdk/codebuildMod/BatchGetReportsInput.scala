package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetReportsInput extends js.Object {
  /**
    *  An array of ARNs that identify the Report objects to return. 
    */
  var reportArns: ReportArns = js.native
}

object BatchGetReportsInput {
  @scala.inline
  def apply(reportArns: ReportArns): BatchGetReportsInput = {
    val __obj = js.Dynamic.literal(reportArns = reportArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetReportsInput]
  }
  @scala.inline
  implicit class BatchGetReportsInputOps[Self <: BatchGetReportsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReportArns(value: ReportArns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportArns")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

