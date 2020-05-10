package typingsSlinky.firebaseFirestore.queryEngineMod

import typingsSlinky.firebaseFirestore.collectionsMod.DocumentKeySet_
import typingsSlinky.firebaseFirestore.collectionsMod.DocumentMap_
import typingsSlinky.firebaseFirestore.localDocumentsViewMod.LocalDocumentsView
import typingsSlinky.firebaseFirestore.persistenceMod.PersistenceTransaction
import typingsSlinky.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typingsSlinky.firebaseFirestore.queryMod.Query
import typingsSlinky.firebaseFirestore.snapshotVersionMod.SnapshotVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryEngine extends js.Object {
  /** Returns all local documents matching the specified query. */
  def getDocumentsMatchingQuery(
    transaction: PersistenceTransaction,
    query: Query,
    lastLimboFreeSnapshotVersion: SnapshotVersion,
    remoteKeys: DocumentKeySet_
  ): PersistencePromise[DocumentMap_] = js.native
  /** Sets the document view to query against. */
  def setLocalDocumentsView(localDocuments: LocalDocumentsView): Unit = js.native
}

object QueryEngine {
  @scala.inline
  def apply(
    getDocumentsMatchingQuery: (PersistenceTransaction, Query, SnapshotVersion, DocumentKeySet_) => PersistencePromise[DocumentMap_],
    setLocalDocumentsView: LocalDocumentsView => Unit
  ): QueryEngine = {
    val __obj = js.Dynamic.literal(getDocumentsMatchingQuery = js.Any.fromFunction4(getDocumentsMatchingQuery), setLocalDocumentsView = js.Any.fromFunction1(setLocalDocumentsView))
    __obj.asInstanceOf[QueryEngine]
  }
  @scala.inline
  implicit class QueryEngineOps[Self <: QueryEngine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDocumentsMatchingQuery(
      value: (PersistenceTransaction, Query, SnapshotVersion, DocumentKeySet_) => PersistencePromise[DocumentMap_]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDocumentsMatchingQuery")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSetLocalDocumentsView(value: LocalDocumentsView => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLocalDocumentsView")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

