package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetExportResponse extends js.Object {
  /**
    * The status of the export.     IN_PROGRESS - The export is in progress.    READY - The export is complete.    FAILED - The export could not be completed.  
    */
  var exportStatus: js.UndefOr[ExportStatus] = js.native
  /**
    * The format of the exported data.
    */
  var exportType: js.UndefOr[ExportType] = js.native
  /**
    * If status is FAILED, Amazon Lex provides the reason that it failed to export the resource.
    */
  var failureReason: js.UndefOr[String] = js.native
  /**
    * The name of the bot being exported.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The type of the exported resource.
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  /**
    * An S3 pre-signed URL that provides the location of the exported resource. The exported resource is a ZIP archive that contains the exported resource in JSON format. The structure of the archive may change. Your code should not rely on the archive structure.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * The version of the bot being exported.
    */
  var version: js.UndefOr[NumericalVersion] = js.native
}

object GetExportResponse {
  @scala.inline
  def apply(): GetExportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExportResponse]
  }
  @scala.inline
  implicit class GetExportResponseOps[Self <: GetExportResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportStatus(value: ExportStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withExportType(value: ExportType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportType")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: NumericalVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

