package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.anon.TrackRemovals
import typingsSlinky.firebaseFirestore.coreQueryMod.Query
import typingsSlinky.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
import typingsSlinky.firebaseFirestore.localPersistenceMod.PersistenceTransaction
import typingsSlinky.firebaseFirestore.localPersistencePromiseMod.PersistencePromise
import typingsSlinky.firebaseFirestore.localRemoteDocumentChangeBufferMod.RemoteDocumentChangeBuffer
import typingsSlinky.firebaseFirestore.modelCollectionsMod.DocumentKeySet_
import typingsSlinky.firebaseFirestore.modelCollectionsMod.DocumentMap_
import typingsSlinky.firebaseFirestore.modelCollectionsMod.NullableMaybeDocumentMap_
import typingsSlinky.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typingsSlinky.firebaseFirestore.modelDocumentMod.MaybeDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/remote_document_cache", JSImport.Namespace)
@js.native
object localRemoteDocumentCacheMod extends js.Object {
  @js.native
  trait RemoteDocumentCache extends js.Object {
    /**
      * Executes a query against the cached Document entries.
      *
      * Implementations may return extra documents if convenient. The results
      * should be re-filtered by the consumer before presenting them to the user.
      *
      * Cached NoDocument entries have no bearing on query results.
      *
      * @param query The query to match documents against.
      * @param sinceReadTime If not set to SnapshotVersion.min(), return only
      *     documents that have been read since this snapshot version (exclusive).
      * @return The set of matching documents.
      */
    def getDocumentsMatchingQuery(transaction: PersistenceTransaction, query: Query, sinceReadTime: SnapshotVersion): PersistencePromise[DocumentMap_] = js.native
    /**
      * Looks up a set of entries in the cache.
      *
      * @param documentKeys The keys of the entries to look up.
      * @return The cached Document or NoDocument entries indexed by key. If an entry is not cached,
      *     the corresponding key will be mapped to a null value.
      */
    def getEntries(transaction: PersistenceTransaction, documentKeys: DocumentKeySet_): PersistencePromise[NullableMaybeDocumentMap_] = js.native
    /**
      * Looks up an entry in the cache.
      *
      * @param documentKey The key of the entry to look up.
      * @return The cached Document or NoDocument entry, or null if we have nothing
      * cached.
      */
    def getEntry(transaction: PersistenceTransaction, documentKey: DocumentKey): PersistencePromise[MaybeDocument | Null] = js.native
    /**
      * Get an estimate of the size of the document cache. Note that for eager
      * garbage collection, we don't track sizes so this will return 0.
      */
    def getSize(transaction: PersistenceTransaction): PersistencePromise[Double] = js.native
    /**
      * Provides access to add or update the contents of the cache. The buffer
      * handles proper size accounting for the change.
      *
      * Multi-Tab Note: This should only be called by the primary client.
      *
      * @param options.trackRemovals Whether to create sentinel entries for
      * removed documents, which allows removals to be tracked by
      * `getNewDocumentChanges()`.
      */
    def newChangeBuffer(): RemoteDocumentChangeBuffer = js.native
    def newChangeBuffer(options: TrackRemovals): RemoteDocumentChangeBuffer = js.native
  }
  
}

