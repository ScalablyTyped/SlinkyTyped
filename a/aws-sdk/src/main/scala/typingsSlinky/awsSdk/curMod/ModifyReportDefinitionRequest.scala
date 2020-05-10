package typingsSlinky.awsSdk.curMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyReportDefinitionRequest extends js.Object {
  var ReportDefinition: typingsSlinky.awsSdk.curMod.ReportDefinition = js.native
  var ReportName: typingsSlinky.awsSdk.curMod.ReportName = js.native
}

object ModifyReportDefinitionRequest {
  @scala.inline
  def apply(ReportDefinition: ReportDefinition, ReportName: ReportName): ModifyReportDefinitionRequest = {
    val __obj = js.Dynamic.literal(ReportDefinition = ReportDefinition.asInstanceOf[js.Any], ReportName = ReportName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyReportDefinitionRequest]
  }
  @scala.inline
  implicit class ModifyReportDefinitionRequestOps[Self <: ModifyReportDefinitionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReportDefinition(value: ReportDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReportName(value: ReportName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReportName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

