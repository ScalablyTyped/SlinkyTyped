package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.coreQueryMod.Query
import typingsSlinky.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
import typingsSlinky.firebaseFirestore.localLocalDocumentsViewMod.LocalDocumentsView
import typingsSlinky.firebaseFirestore.localPersistenceMod.PersistenceTransaction
import typingsSlinky.firebaseFirestore.localPersistencePromiseMod.PersistencePromise
import typingsSlinky.firebaseFirestore.localQueryEngineMod.QueryEngine
import typingsSlinky.firebaseFirestore.modelCollectionsMod.DocumentKeySet_
import typingsSlinky.firebaseFirestore.modelCollectionsMod.DocumentMap_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/index_free_query_engine", JSImport.Namespace)
@js.native
object localIndexFreeQueryEngineMod extends js.Object {
  @js.native
  class IndexFreeQueryEngine () extends QueryEngine {
    /** Applies the query filter and sorting to the provided documents.  */
    var applyQuery: js.Any = js.native
    var executeFullCollectionScan: js.Any = js.native
    var localDocumentsView: js.Any = js.native
    /**
      * Determines if a limit query needs to be refilled from cache, making it
      * ineligible for index-free execution.
      *
      * @param sortedPreviousResults The documents that matched the query when it
      * was last synchronized, sorted by the query's comparator.
      * @param remoteKeys The document keys that matched the query at the last
      * snapshot.
      * @param limboFreeSnapshotVersion The version of the snapshot when the query
      * was last synchronized.
      */
    var needsRefill: js.Any = js.native
    /** Returns all local documents matching the specified query. */
    /* CompleteClass */
    override def getDocumentsMatchingQuery(
      transaction: PersistenceTransaction,
      query: Query,
      lastLimboFreeSnapshotVersion: SnapshotVersion,
      remoteKeys: DocumentKeySet_
    ): PersistencePromise[DocumentMap_] = js.native
    /** Sets the document view to query against. */
    /* CompleteClass */
    override def setLocalDocumentsView(localDocuments: LocalDocumentsView): Unit = js.native
  }
  
}

