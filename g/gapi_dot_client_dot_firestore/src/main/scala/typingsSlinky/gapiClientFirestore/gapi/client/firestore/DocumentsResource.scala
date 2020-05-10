package typingsSlinky.gapiClientFirestore.gapi.client.firestore

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientFirestore.AnonAccesstoken
import typingsSlinky.gapiClientFirestore.AnonAlt
import typingsSlinky.gapiClientFirestore.AnonBearertoken
import typingsSlinky.gapiClientFirestore.AnonCallback
import typingsSlinky.gapiClientFirestore.AnonCollectionId
import typingsSlinky.gapiClientFirestore.AnonCurrentDocumentexists
import typingsSlinky.gapiClientFirestore.AnonFields
import typingsSlinky.gapiClientFirestore.AnonKey
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
  def batchGet(request: AnonAccesstoken): Request_[BatchGetDocumentsResponse] = js.native
  /** Starts a new transaction. */
  def beginTransaction(request: AnonAccesstoken): Request_[BeginTransactionResponse] = js.native
  /** Commits a transaction, while optionally updating documents. */
  def commit(request: AnonAccesstoken): Request_[CommitResponse] = js.native
  /** Creates a new document. */
  def createDocument(request: AnonAlt): Request_[Document] = js.native
  /** Deletes a document. */
  def delete(request: AnonBearertoken): Request_[js.Object] = js.native
  /** Gets a single document. */
  def get(request: AnonCallback): Request_[Document] = js.native
  /** Lists documents. */
  def list(request: AnonCollectionId): Request_[ListDocumentsResponse] = js.native
  /** Lists all the collection IDs underneath a document. */
  def listCollectionIds(request: AnonFields): Request_[ListCollectionIdsResponse] = js.native
  /** Listens to changes. */
  def listen(request: AnonAccesstoken): Request_[ListenResponse] = js.native
  /** Updates or inserts a document. */
  def patch(request: AnonCurrentDocumentexists): Request_[Document] = js.native
  /** Rolls back a transaction. */
  def rollback(request: AnonAccesstoken): Request_[js.Object] = js.native
  /** Runs a query. */
  def runQuery(request: AnonKey): Request_[RunQueryResponse] = js.native
  /** Streams batches of document updates and deletes, in order. */
  def write(request: AnonAccesstoken): Request_[WriteResponse] = js.native
}

object DocumentsResource {
  @scala.inline
  def apply(
    batchGet: AnonAccesstoken => Request_[BatchGetDocumentsResponse],
    beginTransaction: AnonAccesstoken => Request_[BeginTransactionResponse],
    commit: AnonAccesstoken => Request_[CommitResponse],
    createDocument: AnonAlt => Request_[Document],
    delete: AnonBearertoken => Request_[js.Object],
    get: AnonCallback => Request_[Document],
    list: AnonCollectionId => Request_[ListDocumentsResponse],
    listCollectionIds: AnonFields => Request_[ListCollectionIdsResponse],
    listen: AnonAccesstoken => Request_[ListenResponse],
    patch: AnonCurrentDocumentexists => Request_[Document],
    rollback: AnonAccesstoken => Request_[js.Object],
    runQuery: AnonKey => Request_[RunQueryResponse],
    write: AnonAccesstoken => Request_[WriteResponse]
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
    def withBatchGet(value: AnonAccesstoken => Request_[BatchGetDocumentsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchGet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBeginTransaction(value: AnonAccesstoken => Request_[BeginTransactionResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginTransaction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCommit(value: AnonAccesstoken => Request_[CommitResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateDocument(value: AnonAlt => Request_[Document]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDocument")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonBearertoken => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonCallback => Request_[Document]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonCollectionId => Request_[ListDocumentsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListCollectionIds(value: AnonFields => Request_[ListCollectionIdsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listCollectionIds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListen(value: AnonAccesstoken => Request_[ListenResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonCurrentDocumentexists => Request_[Document]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRollback(value: AnonAccesstoken => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRunQuery(value: AnonKey => Request_[RunQueryResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runQuery")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWrite(value: AnonAccesstoken => Request_[WriteResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

