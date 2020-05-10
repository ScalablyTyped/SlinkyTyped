package typingsSlinky.firebaseFirestore.persistenceMod

import typingsSlinky.firebaseFirestore.documentKeyMod.DocumentKey
import typingsSlinky.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typingsSlinky.firebaseFirestore.referenceSetMod.ReferenceSet
import typingsSlinky.firebaseFirestore.targetDataMod.TargetData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferenceDelegate extends js.Object {
  /** Notify the delegate that the given document was added to a target. */
  def addReference(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit] = js.native
  /** Notify the delegate that a document is no longer being mutated by the user. */
  def removeMutationReference(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit] = js.native
  /** Notify the delegate that the given document was removed from a target. */
  def removeReference(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit] = js.native
  /**
    * Notify the delegate that a target was removed. The delegate may, but is not obligated to,
    * actually delete the target and associated data.
    */
  def removeTarget(txn: PersistenceTransaction, targetData: TargetData): PersistencePromise[Unit] = js.native
  /**
    * Registers a ReferenceSet of documents that should be considered 'referenced' and not eligible
    * for removal during garbage collection.
    */
  def setInMemoryPins(pins: ReferenceSet): Unit = js.native
  /** Notify the delegate that a limbo document was updated. */
  def updateLimboDocument(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit] = js.native
}

object ReferenceDelegate {
  @scala.inline
  def apply(
    addReference: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit],
    removeMutationReference: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit],
    removeReference: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit],
    removeTarget: (PersistenceTransaction, TargetData) => PersistencePromise[Unit],
    setInMemoryPins: ReferenceSet => Unit,
    updateLimboDocument: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit]
  ): ReferenceDelegate = {
    val __obj = js.Dynamic.literal(addReference = js.Any.fromFunction2(addReference), removeMutationReference = js.Any.fromFunction2(removeMutationReference), removeReference = js.Any.fromFunction2(removeReference), removeTarget = js.Any.fromFunction2(removeTarget), setInMemoryPins = js.Any.fromFunction1(setInMemoryPins), updateLimboDocument = js.Any.fromFunction2(updateLimboDocument))
    __obj.asInstanceOf[ReferenceDelegate]
  }
  @scala.inline
  implicit class ReferenceDelegateOps[Self <: ReferenceDelegate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddReference(value: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addReference")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveMutationReference(value: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMutationReference")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveReference(value: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeReference")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveTarget(value: (PersistenceTransaction, TargetData) => PersistencePromise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeTarget")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetInMemoryPins(value: ReferenceSet => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInMemoryPins")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateLimboDocument(value: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateLimboDocument")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

