package typingsSlinky.firebaseFirestore

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.firebaseFirestore.collectionsMod.DocumentKeySet_
import typingsSlinky.firebaseFirestore.collectionsMod.DocumentMap_
import typingsSlinky.firebaseFirestore.localDocumentsViewMod.LocalDocumentsView
import typingsSlinky.firebaseFirestore.persistenceMod.PersistenceTransaction
import typingsSlinky.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typingsSlinky.firebaseFirestore.queryEngineMod.QueryEngine
import typingsSlinky.firebaseFirestore.queryMod.Query
import typingsSlinky.firebaseFirestore.snapshotVersionMod.SnapshotVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/test/unit/local/counting_query_engine", JSImport.Namespace)
@js.native
object countingQueryEngineMod extends js.Object {
  @js.native
  class CountingQueryEngine protected () extends QueryEngine {
    def this(queryEngine: QueryEngine, `type`: QueryEngineType) = this()
    /**
      * The number of documents returned by the RemoteDocumentCache's `getEntry()`
      * and `getEntries()` APIs (since the last call to `resetCounts()`)
      */
    var documentsReadByKey: Double = js.native
    /**
      * The number of documents returned by the RemoteDocumentCache's
      * `getDocumentsMatchingQuery()` API (since the last call to `resetCounts()`)
      */
    var documentsReadByQuery: Double = js.native
    /**
      * The number of mutations returned by the MutationQueue's
      * `getAllMutationBatchesAffectingDocumentKey()` and
      * `getAllMutationBatchesAffectingDocumentKeys()` APIs (since the last call
      * to `resetCounts()`)
      */
    var mutationsReadByKey: Double = js.native
    /**
      * The number of mutations returned by the MutationQueue's
      * `getAllMutationBatchesAffectingQuery()` API (since the last call to
      * `resetCounts()`)
      */
    var mutationsReadByQuery: Double = js.native
    val queryEngine: js.Any = js.native
    val `type`: QueryEngineType = js.native
    var wrapMutationQueue: js.Any = js.native
    var wrapRemoteDocumentCache: js.Any = js.native
    /** Returns all local documents matching the specified query. */
    /* CompleteClass */
    override def getDocumentsMatchingQuery(
      transaction: PersistenceTransaction,
      query: Query,
      lastLimboFreeSnapshotVersion: SnapshotVersion,
      remoteKeys: DocumentKeySet_
    ): PersistencePromise[DocumentMap_] = js.native
    def resetCounts(): Unit = js.native
    /** Sets the document view to query against. */
    /* CompleteClass */
    override def setLocalDocumentsView(localDocuments: LocalDocumentsView): Unit = js.native
  }
  
  @js.native
  sealed trait QueryEngineType extends js.Object
  
  @js.native
  object QueryEngineType extends js.Object {
    @js.native
    sealed trait IndexFree extends QueryEngineType
    
    @js.native
    sealed trait Simple extends QueryEngineType
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[QueryEngineType with Double] = js.native
    /* 0 */ @js.native
    object IndexFree extends TopLevel[IndexFree with Double]
    
    /* 1 */ @js.native
    object Simple extends TopLevel[Simple with Double]
    
  }
  
}

