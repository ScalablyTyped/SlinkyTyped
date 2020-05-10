package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitiateDocumentVersionUploadResponse extends js.Object {
  /**
    * The document metadata.
    */
  var Metadata: js.UndefOr[DocumentMetadata] = js.native
  /**
    * The upload metadata.
    */
  var UploadMetadata: js.UndefOr[typingsSlinky.awsSdk.workdocsMod.UploadMetadata] = js.native
}

object InitiateDocumentVersionUploadResponse {
  @scala.inline
  def apply(): InitiateDocumentVersionUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitiateDocumentVersionUploadResponse]
  }
  @scala.inline
  implicit class InitiateDocumentVersionUploadResponseOps[Self <: InitiateDocumentVersionUploadResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetadata(value: DocumentMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadMetadata(value: UploadMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadMetadata")(js.undefined)
        ret
    }
  }
  
}

