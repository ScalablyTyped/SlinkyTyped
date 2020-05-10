package typingsSlinky.firebaseFirestore.localStoreMod

import typingsSlinky.firebaseFirestore.collectionsMod.MaybeDocumentMap_
import typingsSlinky.firebaseFirestore.typesMod.BatchId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserChangeResult extends js.Object {
  val addedBatchIds: js.Array[BatchId] = js.native
  val affectedDocuments: MaybeDocumentMap_ = js.native
  val removedBatchIds: js.Array[BatchId] = js.native
}

object UserChangeResult {
  @scala.inline
  def apply(
    addedBatchIds: js.Array[BatchId],
    affectedDocuments: MaybeDocumentMap_,
    removedBatchIds: js.Array[BatchId]
  ): UserChangeResult = {
    val __obj = js.Dynamic.literal(addedBatchIds = addedBatchIds.asInstanceOf[js.Any], affectedDocuments = affectedDocuments.asInstanceOf[js.Any], removedBatchIds = removedBatchIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserChangeResult]
  }
  @scala.inline
  implicit class UserChangeResultOps[Self <: UserChangeResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddedBatchIds(value: js.Array[BatchId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addedBatchIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAffectedDocuments(value: MaybeDocumentMap_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affectedDocuments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemovedBatchIds(value: js.Array[BatchId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedBatchIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

