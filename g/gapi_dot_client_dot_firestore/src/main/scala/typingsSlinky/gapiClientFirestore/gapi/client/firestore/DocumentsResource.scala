package typingsSlinky.gapiClientFirestore.gapi.client.firestore

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientFirestore.anon.Accesstoken
import typingsSlinky.gapiClientFirestore.anon.Alt
import typingsSlinky.gapiClientFirestore.anon.Bearertoken
import typingsSlinky.gapiClientFirestore.anon.Callback
import typingsSlinky.gapiClientFirestore.anon.CollectionId
import typingsSlinky.gapiClientFirestore.anon.CurrentDocumentexists
import typingsSlinky.gapiClientFirestore.anon.Fields
import typingsSlinky.gapiClientFirestore.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentsResource extends js.Object {
  /**
    * Gets multiple documents.
    *
    * Documents returned by this method are not guaranteed to be returned in the
    * same order that they were requested.
    */
  def batchGet(request: Accesstoken): Request[BatchGetDocumentsResponse] = js.native
  /** Starts a new transaction. */
  def beginTransaction(request: Accesstoken): Request[BeginTransactionResponse] = js.native
  /** Commits a transaction, while optionally updating documents. */
  def commit(request: Accesstoken): Request[CommitResponse] = js.native
  /** Creates a new document. */
  def createDocument(request: Alt): Request[Document] = js.native
  /** Deletes a document. */
  def delete(request: Bearertoken): Request[js.Object] = js.native
  /** Gets a single document. */
  def get(request: Callback): Request[Document] = js.native
  /** Lists documents. */
  def list(request: CollectionId): Request[ListDocumentsResponse] = js.native
  /** Lists all the collection IDs underneath a document. */
  def listCollectionIds(request: Fields): Request[ListCollectionIdsResponse] = js.native
  /** Listens to changes. */
  def listen(request: Accesstoken): Request[ListenResponse] = js.native
  /** Updates or inserts a document. */
  def patch(request: CurrentDocumentexists): Request[Document] = js.native
  /** Rolls back a transaction. */
  def rollback(request: Accesstoken): Request[js.Object] = js.native
  /** Runs a query. */
  def runQuery(request: Key): Request[RunQueryResponse] = js.native
  /** Streams batches of document updates and deletes, in order. */
  def write(request: Accesstoken): Request[WriteResponse] = js.native
}

object DocumentsResource {
  @scala.inline
  def apply(
    batchGet: Accesstoken => Request[BatchGetDocumentsResponse],
    beginTransaction: Accesstoken => Request[BeginTransactionResponse],
    commit: Accesstoken => Request[CommitResponse],
    createDocument: Alt => Request[Document],
    delete: Bearertoken => Request[js.Object],
    get: Callback => Request[Document],
    list: CollectionId => Request[ListDocumentsResponse],
    listCollectionIds: Fields => Request[ListCollectionIdsResponse],
    listen: Accesstoken => Request[ListenResponse],
    patch: CurrentDocumentexists => Request[Document],
    rollback: Accesstoken => Request[js.Object],
    runQuery: Key => Request[RunQueryResponse],
    write: Accesstoken => Request[WriteResponse]
  ): DocumentsResource = {
    val __obj = js.Dynamic.literal(batchGet = js.Any.fromFunction1(batchGet), beginTransaction = js.Any.fromFunction1(beginTransaction), commit = js.Any.fromFunction1(commit), createDocument = js.Any.fromFunction1(createDocument), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listCollectionIds = js.Any.fromFunction1(listCollectionIds), listen = js.Any.fromFunction1(listen), patch = js.Any.fromFunction1(patch), rollback = js.Any.fromFunction1(rollback), runQuery = js.Any.fromFunction1(runQuery), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[DocumentsResource]
  }
  @scala.inline
  implicit class DocumentsResourceOps[Self <: DocumentsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchGet(value: Accesstoken => Request[BatchGetDocumentsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchGet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBeginTransaction(value: Accesstoken => Request[BeginTransactionResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginTransaction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCommit(value: Accesstoken => Request[CommitResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateDocument(value: Alt => Request[Document]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDocument")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: Bearertoken => Request[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Callback => Request[Document]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: CollectionId => Request[ListDocumentsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListCollectionIds(value: Fields => Request[ListCollectionIdsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listCollectionIds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListen(value: Accesstoken => Request[ListenResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: CurrentDocumentexists => Request[Document]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRollback(value: Accesstoken => Request[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRunQuery(value: Key => Request[RunQueryResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runQuery")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWrite(value: Accesstoken => Request[WriteResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

