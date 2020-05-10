package typingsSlinky.reactNativeFirebase.mod.RNFirebase.firestore

import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.added
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.modified
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.removed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentChange extends js.Object {
  val doc: DocumentSnapshot = js.native
  val newIndex: Double = js.native
  val oldIndex: Double = js.native
  val `type`: added | modified | removed = js.native
}

object DocumentChange {
  @scala.inline
  def apply(doc: DocumentSnapshot, newIndex: Double, oldIndex: Double, `type`: added | modified | removed): DocumentChange = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentChange]
  }
  @scala.inline
  implicit class DocumentChangeOps[Self <: DocumentChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoc(value: DocumentSnapshot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: added | modified | removed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

