package typingsSlinky.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportReadGroupSetRequest extends js.Object {
  /**
    * Required. A Google Cloud Storage URI for the exported BAM file.
    * The currently authenticated user must have write access to the new file.
    * An error will be returned if the URI already contains data.
    */
  var exportUri: js.UndefOr[String] = js.native
  /**
    * Required. The Google Cloud project ID that owns this
    * export. The caller must have WRITE access to this project.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * The reference names to export. If this is not specified, all reference
    * sequences, including unmapped reads, are exported.
    * Use `&#42;` to export only unmapped reads.
    */
  var referenceNames: js.UndefOr[js.Array[String]] = js.native
}

object ExportReadGroupSetRequest {
  @scala.inline
  def apply(): ExportReadGroupSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportReadGroupSetRequest]
  }
  @scala.inline
  implicit class ExportReadGroupSetRequestOps[Self <: ExportReadGroupSetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportUri")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceNames")(js.undefined)
        ret
    }
  }
  
}

