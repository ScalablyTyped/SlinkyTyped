package typingsSlinky.firebaseFirestore.modelCollectionsMod

import typingsSlinky.firebaseFirestore.modelDocumentMod.MaybeDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentSizeEntry extends js.Object {
  var maybeDocument: MaybeDocument = js.native
  var size: Double = js.native
}

object DocumentSizeEntry {
  @scala.inline
  def apply(maybeDocument: MaybeDocument, size: Double): DocumentSizeEntry = {
    val __obj = js.Dynamic.literal(maybeDocument = maybeDocument.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSizeEntry]
  }
  @scala.inline
  implicit class DocumentSizeEntryOps[Self <: DocumentSizeEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaybeDocument(value: MaybeDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maybeDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

