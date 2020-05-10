package typingsSlinky.firebaseFirestore.coreViewSnapshotMod

import typingsSlinky.firebaseFirestore.modelDocumentMod.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentViewChange extends js.Object {
  var doc: Document = js.native
  var `type`: ChangeType = js.native
}

object DocumentViewChange {
  @scala.inline
  def apply(doc: Document, `type`: ChangeType): DocumentViewChange = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentViewChange]
  }
  @scala.inline
  implicit class DocumentViewChangeOps[Self <: DocumentViewChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoc(value: Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ChangeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

