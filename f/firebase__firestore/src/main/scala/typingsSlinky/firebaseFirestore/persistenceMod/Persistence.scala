package typingsSlinky.firebaseFirestore.persistenceMod

import typingsSlinky.firebaseFirestore.indexManagerMod.IndexManager
import typingsSlinky.firebaseFirestore.mutationQueueMod.MutationQueue
import typingsSlinky.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typingsSlinky.firebaseFirestore.remoteDocumentCacheMod.RemoteDocumentCache
import typingsSlinky.firebaseFirestore.sharedClientStateMod.ClientId
import typingsSlinky.firebaseFirestore.targetCacheMod.TargetCache
import typingsSlinky.firebaseFirestore.userMod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Persistence extends js.Object {
  val referenceDelegate: ReferenceDelegate = js.native
  /**
    * Whether or not this persistence instance has been started.
    */
  val started: Boolean = js.native
  /**
    * Returns the IDs of the clients that are currently active. If multi-tab
    * is not supported, returns an array that only contains the local client's
    * ID.
    *
    * PORTING NOTE: This is only used for Web multi-tab.
    */
  def getActiveClients(): js.Promise[js.Array[ClientId]] = js.native
  /**
    * Returns an IndexManager instance that manages our persisted query indexes.
    *
    * Note: The implementation is free to return the same instance every time
    * this is called. In particular, the memory-backed implementation does this
    * to emulate the persisted implementation to the extent possible.
    */
  def getIndexManager(): IndexManager = js.native
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
  def getMutationQueue(user: User): MutationQueue = js.native
  /**
    * Returns a RemoteDocumentCache representing the persisted cache of remote
    * documents.
    *
    * Note: The implementation is free to return the same instance every time
    * this is called. In particular, the memory-backed implementation does this
    * to emulate the persisted implementation to the extent possible.
    */
  def getRemoteDocumentCache(): RemoteDocumentCache = js.native
  /**
    * Returns a TargetCache representing the persisted cache of targets.
    *
    * Note: The implementation is free to return the same instance every time
    * this is called. In particular, the memory-backed implementation does this
    * to emulate the persisted implementation to the extent possible.
    */
  def getTargetCache(): TargetCache = js.native
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
  ): js.Promise[T] = js.native
  /**
    * Registers a listener that gets called when the database receives a
    * version change event indicating that it has deleted.
    *
    * PORTING NOTE: This is only used for Web multi-tab.
    */
  def setDatabaseDeletedListener(databaseDeletedListener: js.Function0[js.Promise[Unit]]): Unit = js.native
  /**
    * Adjusts the current network state in the client's metadata, potentially
    * affecting the primary lease.
    *
    * PORTING NOTE: This is only used for Web multi-tab.
    */
  def setNetworkEnabled(networkEnabled: Boolean): Unit = js.native
  /**
    * Registers a listener that gets called when the primary state of the
    * instance changes. Upon registering, this listener is invoked immediately
    * with the current primary state.
    *
    * PORTING NOTE: This is only used for Web multi-tab.
    */
  def setPrimaryStateListener(primaryStateListener: PrimaryStateListener): js.Promise[Unit] = js.native
  /**
    * Releases any resources held during eager shutdown.
    */
  def shutdown(): js.Promise[Unit] = js.native
}

object Persistence {
  @scala.inline
  def apply(
    getActiveClients: () => js.Promise[js.Array[ClientId]],
    getIndexManager: () => IndexManager,
    getMutationQueue: User => MutationQueue,
    getRemoteDocumentCache: () => RemoteDocumentCache,
    getTargetCache: () => TargetCache,
    referenceDelegate: ReferenceDelegate,
    runTransaction: (String, PersistenceTransactionMode, js.Function1[/* transaction */ PersistenceTransaction, PersistencePromise[js.Any]]) => js.Promise[js.Any],
    setDatabaseDeletedListener: js.Function0[js.Promise[Unit]] => Unit,
    setNetworkEnabled: Boolean => Unit,
    setPrimaryStateListener: PrimaryStateListener => js.Promise[Unit],
    shutdown: () => js.Promise[Unit],
    started: Boolean
  ): Persistence = {
    val __obj = js.Dynamic.literal(getActiveClients = js.Any.fromFunction0(getActiveClients), getIndexManager = js.Any.fromFunction0(getIndexManager), getMutationQueue = js.Any.fromFunction1(getMutationQueue), getRemoteDocumentCache = js.Any.fromFunction0(getRemoteDocumentCache), getTargetCache = js.Any.fromFunction0(getTargetCache), referenceDelegate = referenceDelegate.asInstanceOf[js.Any], runTransaction = js.Any.fromFunction3(runTransaction), setDatabaseDeletedListener = js.Any.fromFunction1(setDatabaseDeletedListener), setNetworkEnabled = js.Any.fromFunction1(setNetworkEnabled), setPrimaryStateListener = js.Any.fromFunction1(setPrimaryStateListener), shutdown = js.Any.fromFunction0(shutdown), started = started.asInstanceOf[js.Any])
    __obj.asInstanceOf[Persistence]
  }
  @scala.inline
  implicit class PersistenceOps[Self <: Persistence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetActiveClients(value: () => js.Promise[js.Array[ClientId]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveClients")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIndexManager(value: () => IndexManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndexManager")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMutationQueue(value: User => MutationQueue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMutationQueue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetRemoteDocumentCache(value: () => RemoteDocumentCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRemoteDocumentCache")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTargetCache(value: () => TargetCache): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTargetCache")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReferenceDelegate(value: ReferenceDelegate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceDelegate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunTransaction(
      value: (String, PersistenceTransactionMode, js.Function1[/* transaction */ PersistenceTransaction, PersistencePromise[js.Any]]) => js.Promise[js.Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runTransaction")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetDatabaseDeletedListener(value: js.Function0[js.Promise[Unit]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDatabaseDeletedListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetNetworkEnabled(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNetworkEnabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPrimaryStateListener(value: PrimaryStateListener => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPrimaryStateListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShutdown(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutdown")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStarted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("started")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

