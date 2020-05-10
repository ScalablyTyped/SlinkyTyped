package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.documentKeyMod.DocumentKey
import typingsSlinky.firebaseFirestore.documentMod.MaybeDocument
import typingsSlinky.firebaseFirestore.lruGarbageCollectorMod.LruDelegate
import typingsSlinky.firebaseFirestore.lruGarbageCollectorMod.LruParams
import typingsSlinky.firebaseFirestore.persistenceMod.Persistence
import typingsSlinky.firebaseFirestore.persistenceMod.PersistenceTransaction
import typingsSlinky.firebaseFirestore.persistenceMod.ReferenceDelegate
import typingsSlinky.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typingsSlinky.firebaseFirestore.sharedClientStateMod.ClientId
import typingsSlinky.firebaseFirestore.typesMod.ListenSequenceNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/local/memory_persistence", JSImport.Namespace)
@js.native
object memoryPersistenceMod extends js.Object {
  @js.native
  class MemoryEagerDelegate protected () extends ReferenceDelegate {
    def this(persistence: MemoryPersistence) = this()
    var _orphanedDocuments: js.Any = js.native
    var inMemoryPins: js.Any = js.native
    var isReferenced: js.Any = js.native
    val persistence: js.Any = js.native
    def documentSize(doc: MaybeDocument): Double = js.native
    def onTransactionCommitted(txn: PersistenceTransaction): PersistencePromise[Unit] = js.native
    def onTransactionStarted(): Unit = js.native
    /* private */ def orphanedDocuments: js.Any = js.native
  }
  
  @js.native
  class MemoryLruDelegate protected ()
    extends ReferenceDelegate
       with LruDelegate {
    def this(persistence: MemoryPersistence, lruParams: LruParams) = this()
    var inMemoryPins: js.Any = js.native
    var isPinned: js.Any = js.native
    var orphanedDocumentCount: js.Any = js.native
    var orphanedSequenceNumbers: js.Any = js.native
    val persistence: js.Any = js.native
    def documentSize(maybeDoc: MaybeDocument): Double = js.native
    def onTransactionCommitted(txn: PersistenceTransaction): PersistencePromise[Unit] = js.native
    def onTransactionStarted(): Unit = js.native
  }
  
  @js.native
  /**
    * The constructor accepts a factory for creating a reference delegate. This
    * allows both the delegate and this instance to have strong references to
    * each other without having nullable fields that would then need to be
    * checked or asserted on every access.
    */
  class MemoryPersistence protected () extends Persistence {
    var _started: js.Any = js.native
    val clientId: js.Any = js.native
    /**
      * Note that these are retained here to make it easier to write tests
      * affecting both the in-memory and IndexedDB-backed persistence layers. Tests
      * can create a new LocalStore wrapping this Persistence instance and this
      * will make the in-memory persistence layer behave as if it were actually
      * persisting values.
      */
    val indexManager: js.Any = js.native
    val listenSequence: js.Any = js.native
    var mutationQueues: js.Any = js.native
    @JSName("referenceDelegate")
    val referenceDelegate_MemoryPersistence: MemoryLruDelegate | MemoryEagerDelegate = js.native
    val remoteDocumentCache: js.Any = js.native
    val targetCache: js.Any = js.native
    def mutationQueuesContainKey(transaction: PersistenceTransaction, key: DocumentKey): PersistencePromise[Boolean] = js.native
    def setDatabaseDeletedListener(): Unit = js.native
    @JSName("started")
    def started_MMemoryPersistence: Boolean = js.native
  }
  
  @js.native
  class MemoryTransaction protected () extends PersistenceTransaction {
    def this(currentSequenceNumber: ListenSequenceNumber) = this()
  }
  
  /* static members */
  @js.native
  object MemoryPersistence extends js.Object {
    def createEagerPersistence(clientId: ClientId): MemoryPersistence = js.native
    def createLruPersistence(clientId: ClientId, params: LruParams): MemoryPersistence = js.native
  }
  
}

