package typingsSlinky.gitlab

import typingsSlinky.gitlab.projectImportExportMod.UploadMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  metadata ? :gitlab.gitlab/dist/types/core/services/ProjectImportExport.UploadMetadata} & gitlab.gitlab/dist/types/core/infrastructure.Sudo */
@js.native
trait metadataUploadMetadataSud extends js.Object {
  var metadata: js.UndefOr[UploadMetadata] = js.native
  var sudo: js.UndefOr[String | Double] = js.native
}

object metadataUploadMetadataSud {
  @scala.inline
  def apply(): metadataUploadMetadataSud = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[metadataUploadMetadataSud]
  }
  @scala.inline
  implicit class metadataUploadMetadataSudOps[Self <: metadataUploadMetadataSud] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetadata(value: UploadMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withSudo(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sudo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSudo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sudo")(js.undefined)
        ret
    }
  }
  
}

