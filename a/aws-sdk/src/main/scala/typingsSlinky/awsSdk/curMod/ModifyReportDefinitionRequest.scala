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
}

