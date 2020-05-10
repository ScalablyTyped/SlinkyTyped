package typingsSlinky.awsSdk.curMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteReportDefinitionRequest extends js.Object {
  var ReportName: js.UndefOr[typingsSlinky.awsSdk.curMod.ReportName] = js.native
}

object DeleteReportDefinitionRequest {
  @scala.inline
  def apply(): DeleteReportDefinitionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteReportDefinitionRequest]
  }
  @scala.inline
  implicit class DeleteReportDefinitionRequestOps[Self <: DeleteReportDefinitionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReportName(value: ReportName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportName")(js.undefined)
        ret
    }
  }
  
}

