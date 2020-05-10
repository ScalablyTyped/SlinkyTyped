package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.databaseInfoMod.DatabaseInfo
import typingsSlinky.firebaseFirestore.lruGarbageCollectorMod.LruDelegate
import typingsSlinky.firebaseFirestore.lruGarbageCollectorMod.LruParams
import typingsSlinky.firebaseFirestore.persistenceMod.Persistence
import typingsSlinky.firebaseFirestore.persistenceMod.PersistenceTransaction
import typingsSlinky.firebaseFirestore.persistenceMod.ReferenceDelegate
import typingsSlinky.firebaseFirestore.simpleDbMod.SimpleDbStore
import typingsSlinky.firebaseFirestore.simpleDbMod.SimpleDbTransaction
import typingsSlinky.firebaseFirestore.typesMod.ListenSequenceNumber
import typingsSlinky.std.IDBValidKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/local/indexeddb_persistence", JSImport.Namespace)
@js.native
object indexeddbPersistenceMod extends js.Object {
  @js.native
  class IndexedDbLruDelegate protected ()
    extends ReferenceDelegate
       with LruDelegate {
    def this(db: IndexedDbPersistence, params: LruParams) = this()
    val db: js.Any = js.native
    /**
      * Call provided function for each document in the cache that is 'orphaned'. Orphaned
      * means not a part of any target, so the only entry in the target-document index for
      * that document will be the sentinel row (targetId 0), which will also have the sequence
      * number for the last time the document was accessed.
      */
    var forEachOrphanedDocument: js.Any = js.native
    var inMemoryPins: js.Any = js.native
    /**
      * Returns true if anything would prevent this document from being garbage
      * collected, given that the document in question is not present in any
      * targets and has a sequence number less than or equal to the upper bound for
      * the collection run.
      */
    var isPinned: js.Any = js.native
    var orphanedDocmentCount: js.Any = js.native
  }
  
  @js.native
  class IndexedDbPersistence protected () extends Persistence {
    var _started: js.Any = js.native
    /**
      * Obtains or extends the new primary lease for the local client. This
      * method does not verify that the client is eligible for this lease.
      */
    var acquireOrExtendPrimaryLease: js.Any = js.native
    val allowTabSynchronization: js.Any = js.native
    var attachVisibilityHandler: js.Any = js.native
    /**
      * Attaches a window.unload handler that will synchronously write our
      * clientId to a "zombie client id" location in LocalStorage. This can be used
      * by tabs trying to acquire the primary lease to determine that the lease
      * is no longer valid even if the timestamp is recent. This is particularly
      * important for the refresh case (so the tab correctly re-acquires the
      * primary lease). LocalStorage is used for this rather than IndexedDb because
      * it is a synchronous API and so can be used reliably from  an unload
      * handler.
      */
    var attachWindowUnloadHook: js.Any = js.native
    /**
      * Evaluate the state of all active clients and determine whether the local
      * client is or can act as the holder of the primary lease. Returns whether
      * the client is eligible for the lease, but does not actually acquire it.
      * May return 'false' even if there is no active leaseholder and another
      * (foreground) client should become leaseholder instead.
      */
    var canActAsPrimary: js.Any = js.native
    val clientId: js.Any = js.native
    /** The client metadata refresh task. */
    var clientMetadataRefresher: js.Any = js.native
    var dbName: js.Any = js.native
    var detachVisibilityHandler: js.Any = js.native
    var detachWindowUnloadHook: js.Any = js.native
    val document: js.Any = js.native
    /** Our 'visibilitychange' listener if registered. */
    var documentVisibilityHandler: js.Any = js.native
    /**
      * Returns clients that are not zombied and have an updateTime within the
      * provided threshold.
      */
    var filterActiveClients: js.Any = js.native
    var inForeground: js.Any = js.native
    val indexManager: js.Any = js.native
    /**
      * Returns whether a client is "zombied" based on its LocalStorage entry.
      * Clients become zombied when their tab closes without running all of the
      * cleanup logic in `shutdown()`.
      */
    var isClientZombied: js.Any = js.native
    /** Checks whether `client` is the local client. */
    var isLocalClient: js.Any = js.native
    var isPrimary: js.Any = js.native
    /** Verifies that `updateTimeMs` is within `maxAgeMs`. */
    var isWithinAge: js.Any = js.native
    /** The last time we garbage collected the client metadata object store. */
    var lastGarbageCollectionTime: js.Any = js.native
    var listenSequence: js.Any = js.native
    /**
      * Record client as zombied (a client that had its tab closed). Zombied
      * clients are ignored during primary tab selection.
      */
    var markClientZombied: js.Any = js.native
    /**
      * If the garbage collection threshold has passed, prunes the
      * RemoteDocumentChanges and the ClientMetadata store based on the last update
      * time of all clients.
      */
    var maybeGarbageCollectMultiClientState: js.Any = js.native
    var networkEnabled: js.Any = js.native
    val persistenceKey: js.Any = js.native
    /** A listener to notify on primary state changes. */
    var primaryStateListener: js.Any = js.native
    val queue: js.Any = js.native
    @JSName("referenceDelegate")
    val referenceDelegate_IndexedDbPersistence: IndexedDbLruDelegate = js.native
    /** Checks the primary lease and removes it if we are the current primary. */
    var releasePrimaryLeaseIfHeld: js.Any = js.native
    val remoteDocumentCache: js.Any = js.native
    var removeClientMetadata: js.Any = js.native
    /** Removes the zombied client entry if it exists. */
    var removeClientZombiedEntry: js.Any = js.native
    /**
      * Schedules a recurring timer to update the client metadata and to either
      * extend or acquire the primary lease if the client is eligible.
      */
    var scheduleClientMetadataAndPrimaryLeaseRefreshes: js.Any = js.native
    val sequenceNumberSyncer: js.Any = js.native
    var serializer: js.Any = js.native
    var simpleDb: js.Any = js.native
    /**
      * Attempt to start IndexedDb persistence.
      *
      * @return {Promise<void>} Whether persistence was enabled.
      */
    var start: js.Any = js.native
    val targetCache: js.Any = js.native
    /**
      * Updates the client metadata in IndexedDb and attempts to either obtain or
      * extend the primary lease for the local client. Asynchronously notifies the
      * primary state listener if the client either newly obtained or released its
      * primary lease.
      */
    var updateClientMetadataAndTryBecomePrimary: js.Any = js.native
    /**
      * Verifies that the current tab is the primary leaseholder or alternatively
      * that the leaseholder has opted into multi-tab synchronization.
      */
    var verifyAllowTabSynchronization: js.Any = js.native
    var verifyPrimaryLease: js.Any = js.native
    val webStorage: js.Any = js.native
    val window: js.Any = js.native
    /** Our window.unload handler, if registered. */
    var windowUnloadHandler: js.Any = js.native
    var zombiedClientLocalStorageKey: js.Any = js.native
    @JSName("started")
    def started_MIndexedDbPersistence: Boolean = js.native
  }
  
  @js.native
  class IndexedDbTransaction protected () extends PersistenceTransaction {
    def this(simpleDbTransaction: SimpleDbTransaction, currentSequenceNumber: ListenSequenceNumber) = this()
    val simpleDbTransaction: SimpleDbTransaction = js.native
  }
  
  /* static members */
  @js.native
  object IndexedDbPersistence extends js.Object {
    /**
      * The name of the main (and currently only) IndexedDB database. this name is
      * appended to the prefix provided to the IndexedDbPersistence constructor.
      */
    var MAIN_DATABASE: String = js.native
    /**
      * Generates a string used as a prefix when storing data in IndexedDB and
      * LocalStorage.
      */
    def buildStoragePrefix(databaseInfo: DatabaseInfo): String = js.native
    def clearPersistence(persistenceKey: String): js.Promise[Unit] = js.native
    def createIndexedDbPersistence(options: AnonAllowTabSynchronization): js.Promise[IndexedDbPersistence] = js.native
    def getStore[Key /* <: IDBValidKey */, Value](txn: PersistenceTransaction, store: String): SimpleDbStore[Key, Value] = js.native
    def isAvailable(): Boolean = js.native
  }
  
}

