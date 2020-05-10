package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDocumentVersionResponse extends js.Object {
  /**
    * The custom metadata on the document version.
    */
  var CustomMetadata: js.UndefOr[CustomMetadataMap] = js.native
  /**
    * The version metadata.
    */
  var Metadata: js.UndefOr[DocumentVersionMetadata] = js.native
}

object GetDocumentVersionResponse {
  @scala.inline
  def apply(): GetDocumentVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDocumentVersionResponse]
  }
  @scala.inline
  implicit class GetDocumentVersionResponseOps[Self <: GetDocumentVersionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomMetadata(value: CustomMetadataMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: DocumentVersionMetadata): Self = {
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
  }
  
}

