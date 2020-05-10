package typingsSlinky.firebaseFirestore.remoteSyncerMod

import typingsSlinky.firebaseFirestore.collectionsMod.DocumentKeySet_
import typingsSlinky.firebaseFirestore.errorMod.FirestoreError
import typingsSlinky.firebaseFirestore.mutationBatchMod.MutationBatchResult
import typingsSlinky.firebaseFirestore.remoteEventMod.RemoteEvent
import typingsSlinky.firebaseFirestore.typesMod.BatchId
import typingsSlinky.firebaseFirestore.typesMod.TargetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteSyncer extends js.Object {
  /**
    * Applies one remote event to the sync engine, notifying any views of the
    * changes, and releasing any pending mutation batches that would become
    * visible because of the snapshot version the remote event contains.
    */
  def applyRemoteEvent(remoteEvent: RemoteEvent): js.Promise[Unit] = js.native
  /**
    * Applies the result of a successful write of a mutation batch to the sync
    * engine, emitting snapshots in any views that the mutation applies to, and
    * removing the batch from the mutation queue.
    */
  def applySuccessfulWrite(result: MutationBatchResult): js.Promise[Unit] = js.native
  /**
    * Returns the set of remote document keys for the given target ID. This list
    * includes the documents that were assigned to the target when we received
    * the last snapshot.
    */
  def getRemoteKeysForTarget(targetId: TargetId): DocumentKeySet_ = js.native
  /**
    * Rejects the batch, removing the batch from the mutation queue, recomputing
    * the local view of any documents affected by the batch and then, emitting
    * snapshots with the reverted value.
    */
  def rejectFailedWrite(batchId: BatchId, error: FirestoreError): js.Promise[Unit] = js.native
  /**
    * Rejects the listen for the given targetID. This can be triggered by the
    * backend for any active target.
    *
    * @param targetId The targetID corresponds to one previously initiated by the
    * user as part of TargetData passed to listen() on RemoteStore.
    * @param error A description of the condition that has forced the rejection.
    * Nearly always this will be an indication that the user is no longer
    * authorized to see the data matching the target.
    */
  def rejectListen(targetId: TargetId, error: FirestoreError): js.Promise[Unit] = js.native
}

object RemoteSyncer {
  @scala.inline
  def apply(
    applyRemoteEvent: RemoteEvent => js.Promise[Unit],
    applySuccessfulWrite: MutationBatchResult => js.Promise[Unit],
    getRemoteKeysForTarget: TargetId => DocumentKeySet_,
    rejectFailedWrite: (BatchId, FirestoreError) => js.Promise[Unit],
    rejectListen: (TargetId, FirestoreError) => js.Promise[Unit]
  ): RemoteSyncer = {
    val __obj = js.Dynamic.literal(applyRemoteEvent = js.Any.fromFunction1(applyRemoteEvent), applySuccessfulWrite = js.Any.fromFunction1(applySuccessfulWrite), getRemoteKeysForTarget = js.Any.fromFunction1(getRemoteKeysForTarget), rejectFailedWrite = js.Any.fromFunction2(rejectFailedWrite), rejectListen = js.Any.fromFunction2(rejectListen))
    __obj.asInstanceOf[RemoteSyncer]
  }
  @scala.inline
  implicit class RemoteSyncerOps[Self <: RemoteSyncer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyRemoteEvent(value: RemoteEvent => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyRemoteEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withApplySuccessfulWrite(value: MutationBatchResult => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applySuccessfulWrite")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRemoteKeysForTarget(value: TargetId => DocumentKeySet_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRemoteKeysForTarget")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRejectFailedWrite(value: (BatchId, FirestoreError) => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectFailedWrite")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRejectListen(value: (TargetId, FirestoreError) => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectListen")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

