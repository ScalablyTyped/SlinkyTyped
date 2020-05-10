package typingsSlinky.firebaseFirestore.coreViewMod

import typingsSlinky.firebaseFirestore.coreViewSnapshotMod.ViewSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewChange extends js.Object {
  var limboChanges: js.Array[LimboDocumentChange] = js.native
  var snapshot: js.UndefOr[ViewSnapshot] = js.native
}

object ViewChange {
  @scala.inline
  def apply(limboChanges: js.Array[LimboDocumentChange]): ViewChange = {
    val __obj = js.Dynamic.literal(limboChanges = limboChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewChange]
  }
  @scala.inline
  implicit class ViewChangeOps[Self <: ViewChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLimboChanges(value: js.Array[LimboDocumentChange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limboChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapshot(value: ViewSnapshot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshot")(js.undefined)
        ret
    }
  }
  
}

