package typingsSlinky.firebaseFirestore.persistenceMod

import typingsSlinky.firebaseFirestore.indexManagerMod.IndexManager
import typingsSlinky.firebaseFirestore.mutationQueueMod.MutationQueue
import typingsSlinky.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typingsSlinky.firebaseFirestore.remoteDocumentCacheMod.RemoteDocumentCache
import typingsSlinky.firebaseFirestore.targetCacheMod.TargetCache
import typingsSlinky.firebaseFirestore.userMod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Persistence extends js.Object {
  val referenceDelegate: ReferenceDelegate
  /**
    * Whether or not this persistence instance has been started.
    */
  val started: Boolean
  /**
    * Returns an IndexManager instance that manages our persisted query indexes.
    *
    * Note: The implementation is free to return the same instance every time
    * this is called. In particular, the memory-backed implementation does this
    * to emulate the persisted implementation to the extent possible.
    */
  def getIndexManager(): IndexManager
  /**
    * Returns a MutationQueue representing the persisted mutations for the
    * given user.
    *
    * Note: The implementation is free to return the same instance every time
    * this is called for a given user. In particular, the memory-backed
    * implementation does this to emulate the persisted implementation to the
    * extent possible (e.g. in the case of uid switching from
    * sally=>jack=>sally, sally's mutation queue will be preserved).
    */
  def getMutationQueue(user: User): MutationQueue
  /**
    * Returns a RemoteDocumentCache representing the persisted cache of remote
    * documents.
    *
    * Note: The implementation is free to return the same instance every time
    * this is called. In particular, the memory-backed implementation does this
    * to emulate the persisted implementation to the extent possible.
    */
  def getRemoteDocumentCache(): RemoteDocumentCache
  /**
    * Returns a TargetCache representing the persisted cache of targets.
    *
    * Note: The implementation is free to return the same instance every time
    * this is called. In particular, the memory-backed implementation does this
    * to emulate the persisted implementation to the extent possible.
    */
  def getTargetCache(): TargetCache
  /**
    * Performs an operation inside a persistence transaction. Any reads or writes
    * against persistence must be performed within a transaction. Writes will be
    * committed atomically once the transaction completes.
    *
    * Persistence operations are asynchronous and therefore the provided
    * transactionOperation must return a PersistencePromise. When it is resolved,
    * the transaction will be committed and the Promise returned by this method
    * will resolve.
    *
    * @param action A description of the action performed by this transaction,
    * used for logging.
    * @param mode The underlying mode of the IndexedDb transaction. Can be
    * 'readonly`, 'readwrite' or 'readwrite-primary'. Transactions marked
    * 'readwrite-primary' can only be executed by the primary client. In this
    * mode, the transactionOperation will not be run if the primary lease cannot
    * be acquired and the returned promise will be rejected with a
    * FAILED_PRECONDITION error.
    * @param transactionOperation The operation to run inside a transaction.
    * @return A promise that is resolved once the transaction completes.
    */
  def runTransaction[T](
    action: String,
    mode: PersistenceTransactionMode,
    transactionOperation: js.Function1[/* transaction */ PersistenceTransaction, PersistencePromise[T]]
  ): js.Promise[T]
  /**
    * Registers a listener that gets called when the database receives a
    * version change event indicating that it has deleted.
    *
    * PORTING NOTE: This is only used for Web multi-tab.
    */
  def setDatabaseDeletedListener(databaseDeletedListener: js.Function0[js.Promise[Unit]]): Unit
  /**
    * Releases any resources held during eager shutdown.
    */
  def shutdown(): js.Promise[Unit]
  /** Starts persistence. */
  def start(): js.Promise[Unit]
}

object Persistence {
  @scala.inline
  def apply(
    getIndexManager: () => IndexManager,
    getMutationQueue: User => MutationQueue,
    getRemoteDocumentCache: () => RemoteDocumentCache,
    getTargetCache: () => TargetCache,
    referenceDelegate: ReferenceDelegate,
    runTransaction: (String, PersistenceTransactionMode, js.Function1[/* transaction */ PersistenceTransaction, PersistencePromise[js.Any]]) => js.Promise[js.Any],
    setDatabaseDeletedListener: js.Function0[js.Promise[Unit]] => Unit,
    shutdown: () => js.Promise[Unit],
    start: () => js.Promise[Unit],
    started: Boolean
  ): Persistence = {
    val __obj = js.Dynamic.literal(getIndexManager = js.Any.fromFunction0(getIndexManager), getMutationQueue = js.Any.fromFunction1(getMutationQueue), getRemoteDocumentCache = js.Any.fromFunction0(getRemoteDocumentCache), getTargetCache = js.Any.fromFunction0(getTargetCache), referenceDelegate = referenceDelegate.asInstanceOf[js.Any], runTransaction = js.Any.fromFunction3(runTransaction), setDatabaseDeletedListener = js.Any.fromFunction1(setDatabaseDeletedListener), shutdown = js.Any.fromFunction0(shutdown), start = js.Any.fromFunction0(start), started = started.asInstanceOf[js.Any])
    __obj.asInstanceOf[Persistence]
  }
}

