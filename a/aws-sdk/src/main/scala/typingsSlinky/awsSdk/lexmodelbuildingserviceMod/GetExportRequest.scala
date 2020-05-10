package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetExportRequest extends js.Object {
  /**
    * The format of the exported data.
    */
  var exportType: ExportType = js.native
  /**
    * The name of the bot to export.
    */
  var name: Name = js.native
  /**
    * The type of resource to export. 
    */
  var resourceType: ResourceType = js.native
  /**
    * The version of the bot to export.
    */
  var version: NumericalVersion = js.native
}

object GetExportRequest {
  @scala.inline
  def apply(exportType: ExportType, name: Name, resourceType: ResourceType, version: NumericalVersion): GetExportRequest = {
    val __obj = js.Dynamic.literal(exportType = exportType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExportRequest]
  }
  @scala.inline
  implicit class GetExportRequestOps[Self <: GetExportRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportType(value: ExportType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: NumericalVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

