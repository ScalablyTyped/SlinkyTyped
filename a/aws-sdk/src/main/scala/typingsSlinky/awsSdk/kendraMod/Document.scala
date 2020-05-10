package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  /**
    * Information to use for user context filtering.
    */
  var AccessControlList: js.UndefOr[PrincipalList] = js.native
  /**
    * Custom attributes to apply to the document. Use the custom attributes to provide additional information for searching, to provide facets for refining searches, and to provide additional information in the query response.
    */
  var Attributes: js.UndefOr[DocumentAttributeList] = js.native
  /**
    * The contents of the document as a base-64 encoded string.
    */
  var Blob: js.UndefOr[_Blob] = js.native
  /**
    * The file type of the document in the Blob field.
    */
  var ContentType: js.UndefOr[typingsSlinky.awsSdk.kendraMod.ContentType] = js.native
  /**
    * A unique identifier of the document in the index.
    */
  var Id: DocumentId = js.native
  var S3Path: js.UndefOr[typingsSlinky.awsSdk.kendraMod.S3Path] = js.native
  /**
    * The title of the document.
    */
  var Title: js.UndefOr[typingsSlinky.awsSdk.kendraMod.Title] = js.native
}

object Document {
  @scala.inline
  def apply(Id: DocumentId): Document = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
  @scala.inline
  implicit class DocumentOps[Self <: Document] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: DocumentId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessControlList(value: PrincipalList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessControlList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessControlList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessControlList")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributes(value: DocumentAttributeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withBlobUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Blob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlob(value: _Blob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Blob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Blob")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: ContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentType")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Path(value: S3Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Path")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: Title): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(js.undefined)
        ret
    }
  }
  
}

