package typingsSlinky.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Write extends js.Object {
  /**
    * An optional precondition on the document.
    *
    * The write will fail if this is set and not met by the target document.
    */
  var currentDocument: js.UndefOr[Precondition] = js.native
  /**
    * A document name to delete. In the format:
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    */
  var delete: js.UndefOr[String] = js.native
  /**
    * Applies a tranformation to a document.
    * At most one `transform` per document is allowed in a given request.
    * An `update` cannot follow a `transform` on the same document in a given
    * request.
    */
  var transform: js.UndefOr[DocumentTransform] = js.native
  /** A document to write. */
  var update: js.UndefOr[Document] = js.native
  /**
    * The fields to update in this write.
    *
    * This field can be set only when the operation is `update`.
    * None of the field paths in the mask may contain a reserved name.
    * If the document exists on the server and has fields not referenced in the
    * mask, they are left unchanged.
    * Fields referenced in the mask, but not present in the input document, are
    * deleted from the document on the server.
    * The field paths in this mask must not contain a reserved field name.
    */
  var updateMask: js.UndefOr[DocumentMask] = js.native
}

object Write {
  @scala.inline
  def apply(): Write = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Write]
  }
  @scala.inline
  implicit class WriteOps[Self <: Write] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentDocument(value: Precondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDocument")(js.undefined)
        ret
    }
    @scala.inline
    def withDelete(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: DocumentTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateMask(value: DocumentMask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMask")(js.undefined)
        ret
    }
  }
  
}

