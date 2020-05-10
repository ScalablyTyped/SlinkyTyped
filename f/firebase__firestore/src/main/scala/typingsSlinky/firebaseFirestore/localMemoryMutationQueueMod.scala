package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.coreTypesMod.BatchId
import typingsSlinky.firebaseFirestore.localIndexManagerMod.IndexManager
import typingsSlinky.firebaseFirestore.localMutationQueueMod.MutationQueue
import typingsSlinky.firebaseFirestore.localPersistenceMod.PersistenceTransaction
import typingsSlinky.firebaseFirestore.localPersistenceMod.ReferenceDelegate
import typingsSlinky.firebaseFirestore.localPersistencePromiseMod.PersistencePromise
import typingsSlinky.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/memory_mutation_queue", JSImport.Namespace)
@js.native
object localMemoryMutationQueueMod extends js.Object {
  @js.native
  class MemoryMutationQueue protected () extends MutationQueue {
    def this(indexManager: IndexManager, referenceDelegate: ReferenceDelegate) = this()
    /** An ordered mapping between documents and the mutations batch IDs. */
    var batchesByDocumentKey: js.Any = js.native
    /**
      * A version of lookupMutationBatch that doesn't return a promise, this makes
      * other functions that uses this code easier to read and more efficent.
      */
    var findMutationBatch: js.Any = js.native
    var findMutationBatches: js.Any = js.native
    val indexManager: js.Any = js.native
    /**
      * Finds the index of the given batchId in the mutation queue. This operation
      * is O(1).
      *
      * @return The computed index of the batch with the given batchId, based on
      * the state of the queue. Note this index can be negative if the requested
      * batchId has already been remvoed from the queue or past the end of the
      * queue if the batchId is larger than the last added batch.
      */
    var indexOfBatchId: js.Any = js.native
    /**
      * Finds the index of the given batchId in the mutation queue and asserts that
      * the resulting index is within the bounds of the queue.
      *
      * @param batchId The batchId to search for
      * @param action A description of what the caller is doing, phrased in passive
      * form (e.g. "acknowledged" in a routine that acknowledges batches).
      */
    var indexOfExistingBatchId: js.Any = js.native
    /** The last received stream token from the server, used to acknowledge which
      * responses the client has processed. Stream tokens are opaque checkpoint
      * markers whose only real value is their inclusion in the next request.
      */
    var lastStreamToken: js.Any = js.native
    /**
      * The set of all mutations that have been sent but not yet been applied to
      * the backend.
      */
    var mutationQueue: js.Any = js.native
    /** Next value to use when assigning sequential IDs to each mutation batch. */
    var nextBatchId: js.Any = js.native
    val referenceDelegate: js.Any = js.native
    def containsKey(txn: PersistenceTransaction, key: DocumentKey): PersistencePromise[Boolean] = js.native
    def getHighestUnacknowledgedBatchId(): PersistencePromise[BatchId] = js.native
  }
  
}

