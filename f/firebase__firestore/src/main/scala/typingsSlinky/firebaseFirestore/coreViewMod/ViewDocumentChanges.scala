package typingsSlinky.firebaseFirestore.coreViewMod

import typingsSlinky.firebaseFirestore.coreViewSnapshotMod.DocumentChangeSet
import typingsSlinky.firebaseFirestore.modelCollectionsMod.DocumentKeySet_
import typingsSlinky.firebaseFirestore.modelDocumentSetMod.DocumentSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewDocumentChanges extends js.Object {
  /** The diff of these docs with the previous set of docs. */
  var changeSet: DocumentChangeSet = js.native
  /** The new set of docs that should be in the view. */
  var documentSet: DocumentSet = js.native
  var mutatedKeys: DocumentKeySet_ = js.native
  /**
    * Whether the set of documents passed in was not sufficient to calculate the
    * new state of the view and there needs to be another pass based on the
    * local cache.
    */
  var needsRefill: Boolean = js.native
}

object ViewDocumentChanges {
  @scala.inline
  def apply(
    changeSet: DocumentChangeSet,
    documentSet: DocumentSet,
    mutatedKeys: DocumentKeySet_,
    needsRefill: Boolean
  ): ViewDocumentChanges = {
    val __obj = js.Dynamic.literal(changeSet = changeSet.asInstanceOf[js.Any], documentSet = documentSet.asInstanceOf[js.Any], mutatedKeys = mutatedKeys.asInstanceOf[js.Any], needsRefill = needsRefill.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewDocumentChanges]
  }
  @scala.inline
  implicit class ViewDocumentChangesOps[Self <: ViewDocumentChanges] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeSet(value: DocumentChangeSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentSet(value: DocumentSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMutatedKeys(value: DocumentKeySet_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutatedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeedsRefill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needsRefill")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

