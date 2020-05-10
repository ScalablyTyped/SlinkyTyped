package typingsSlinky.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentChange extends js.Object {
  var document: js.UndefOr[Document] = js.native
  var removedTargetIds: js.UndefOr[js.Array[Double]] = js.native
  var targetIds: js.UndefOr[js.Array[Double]] = js.native
}

object DocumentChange {
  @scala.inline
  def apply(): DocumentChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentChange]
  }
  @scala.inline
  implicit class DocumentChangeOps[Self <: DocumentChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocument(value: Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(js.undefined)
        ret
    }
    @scala.inline
    def withRemovedTargetIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedTargetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemovedTargetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedTargetIds")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetIds")(js.undefined)
        ret
    }
  }
  
}

