package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateReportGroupInput extends js.Object {
  /**
    *  A ReportExportConfig object that contains information about where the report group test results are exported. 
    */
  var exportConfig: ReportExportConfig = js.native
  /**
    *  The name of the report group. 
    */
  var name: ReportGroupName = js.native
  /**
    *  The type of report group. 
    */
  var `type`: ReportType = js.native
}

object CreateReportGroupInput {
  @scala.inline
  def apply(exportConfig: ReportExportConfig, name: ReportGroupName, `type`: ReportType): CreateReportGroupInput = {
    val __obj = js.Dynamic.literal(exportConfig = exportConfig.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReportGroupInput]
  }
  @scala.inline
  implicit class CreateReportGroupInputOps[Self <: CreateReportGroupInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportConfig(value: ReportExportConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: ReportGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ReportType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

