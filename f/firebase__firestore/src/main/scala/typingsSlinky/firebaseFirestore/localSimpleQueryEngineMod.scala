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

@JSImport("@firebase/firestore/dist/src/local/simple_query_engine", JSImport.Namespace)
@js.native
object localSimpleQueryEngineMod extends js.Object {
  @js.native
  class SimpleQueryEngine () extends QueryEngine {
    var localDocumentsView: js.Any = js.native
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

