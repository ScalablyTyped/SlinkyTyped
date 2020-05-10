package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.documentKeyMod.DocumentKey
import typingsSlinky.firebaseFirestore.indexManagerMod.IndexManager
import typingsSlinky.firebaseFirestore.localSerializerMod.LocalSerializer
import typingsSlinky.firebaseFirestore.mutationBatchMod.MutationBatch
import typingsSlinky.firebaseFirestore.mutationQueueMod.MutationQueue
import typingsSlinky.firebaseFirestore.persistenceMod.PersistenceTransaction
import typingsSlinky.firebaseFirestore.persistenceMod.ReferenceDelegate
import typingsSlinky.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typingsSlinky.firebaseFirestore.simpleDbMod.SimpleDbTransaction
import typingsSlinky.firebaseFirestore.userMod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/local/indexeddb_mutation_queue", JSImport.Namespace)
@js.native
object indexeddbMutationQueueMod extends js.Object {
  @js.native
  class IndexedDbMutationQueue protected () extends MutationQueue {
    def this(
      /**
      * The normalized userId (e.g. null UID => "" userId) used to store /
      * retrieve mutations.
      */
    userId: String,
      serializer: LocalSerializer,
      indexManager: IndexManager,
      referenceDelegate: ReferenceDelegate
    ) = this()
    /**
      * Caches the document keys for pending mutation batches. If the mutation
      * has been removed from IndexedDb, the cached value may continue to
      * be used to retrieve the batch's document keys. To remove a cached value
      * locally, `removeCachedMutationKeys()` should be invoked either directly
      * or through `removeMutationBatches()`.
      *
      * With multi-tab, when the primary client acknowledges or rejects a mutation,
      * this cache is used by secondary clients to invalidate the local
      * view of the documents that were previously affected by the mutation.
      */
    var documentKeysByBatchId: js.Any = js.native
    /** Returns the mutation queue's metadata from IndexedDb. */
    var getMutationQueueMetadata: js.Any = js.native
    val indexManager: js.Any = js.native
    var lookupMutationBatches: js.Any = js.native
    val referenceDelegate: js.Any = js.native
    val serializer: js.Any = js.native
    /**
      * The normalized userId (e.g. null UID => "" userId) used to store /
      * retrieve mutations.
      */
    var userId: js.Any = js.native
    def containsKey(txn: PersistenceTransaction, key: DocumentKey): PersistencePromise[Boolean] = js.native
  }
  
  def mutationQueuesContainKey(txn: PersistenceTransaction, docKey: DocumentKey): PersistencePromise[Boolean] = js.native
  def removeMutationBatch(txn: SimpleDbTransaction, userId: String, batch: MutationBatch): PersistencePromise[js.Array[DocumentKey]] = js.native
  /* static members */
  @js.native
  object IndexedDbMutationQueue extends js.Object {
    /**
      * Creates a new mutation queue for the given user.
      * @param user The user for which to create a mutation queue.
      * @param serializer The serializer to use when persisting to IndexedDb.
      */
    def forUser(
      user: User,
      serializer: LocalSerializer,
      indexManager: IndexManager,
      referenceDelegate: ReferenceDelegate
    ): IndexedDbMutationQueue = js.native
  }
  
}

