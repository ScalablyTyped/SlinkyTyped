package typingsSlinky.maximMazurokGapiClientFirestore.gapi.client.firestore

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientFirestore.anon.AccesstokenAlt
import typingsSlinky.maximMazurokGapiClientFirestore.anon.AltCallback
import typingsSlinky.maximMazurokGapiClientFirestore.anon.CallbackDatabase
import typingsSlinky.maximMazurokGapiClientFirestore.anon.CollectionId
import typingsSlinky.maximMazurokGapiClientFirestore.anon.CurrentDocumentexists
import typingsSlinky.maximMazurokGapiClientFirestore.anon.CurrentDocumentupdateTime
import typingsSlinky.maximMazurokGapiClientFirestore.anon.Database
import typingsSlinky.maximMazurokGapiClientFirestore.anon.DocumentId
import typingsSlinky.maximMazurokGapiClientFirestore.anon.MaskfieldPaths
import typingsSlinky.maximMazurokGapiClientFirestore.anon.Name
import typingsSlinky.maximMazurokGapiClientFirestore.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientFirestore.anon.OrderBy
import typingsSlinky.maximMazurokGapiClientFirestore.anon.Parent
import typingsSlinky.maximMazurokGapiClientFirestore.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientFirestore.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientFirestore.anon.Resource
import typingsSlinky.maximMazurokGapiClientFirestore.anon.UploadType
import typingsSlinky.maximMazurokGapiClientFirestore.anon.Uploadprotocol
import typingsSlinky.maximMazurokGapiClientFirestore.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentsResource extends StObject {
  
  /** Gets multiple documents. Documents returned by this method are not guaranteed to be returned in the same order that they were requested. */
  def batchGet(request: Database): Request[BatchGetDocumentsResponse] = js.native
  def batchGet(request: PrettyPrint, body: BatchGetDocumentsRequest): Request[BatchGetDocumentsResponse] = js.native
  
  def batchWrite(request: PrettyPrint, body: BatchWriteRequest): Request[BatchWriteResponse] = js.native
  /**
    * Applies a batch of write operations. The BatchWrite method does not apply the write operations atomically and can apply them out of order. Method does not allow more than one write
    * per document. Each write succeeds or fails independently. See the BatchWriteResponse for the success status of each write. If you require an atomically applied set of writes, use
    * Commit instead.
    */
  def batchWrite(request: QuotaUser): Request[BatchWriteResponse] = js.native
  
  def beginTransaction(request: PrettyPrint, body: BeginTransactionRequest): Request[BeginTransactionResponse] = js.native
  /** Starts a new transaction. */
  def beginTransaction(request: Resource): Request[BeginTransactionResponse] = js.native
  
  def commit(request: PrettyPrint, body: CommitRequest): Request[CommitResponse] = js.native
  /** Commits a transaction, while optionally updating documents. */
  def commit(request: UploadType): Request[CommitResponse] = js.native
  
  /** Creates a new document. */
  def createDocument(request: CollectionId): Request[Document] = js.native
  def createDocument(request: DocumentId, body: Document): Request[Document] = js.native
  
  /** Deletes a document. */
  def delete(): Request[js.Object] = js.native
  def delete(request: CurrentDocumentexists): Request[js.Object] = js.native
  
  /** Gets a single document. */
  def get(): Request[Document] = js.native
  def get(request: MaskfieldPaths): Request[Document] = js.native
  
  /** Lists documents. */
  def list(): Request[ListDocumentsResponse] = js.native
  def list(request: OrderBy): Request[ListDocumentsResponse] = js.native
  
  def listCollectionIds(request: Oauthtoken, body: ListCollectionIdsRequest): Request[ListCollectionIdsResponse] = js.native
  /** Lists all the collection IDs underneath a document. */
  def listCollectionIds(request: Parent): Request[ListCollectionIdsResponse] = js.native
  
  def listen(request: PrettyPrint, body: ListenRequest): Request[ListenResponse] = js.native
  /** Listens to changes. */
  def listen(request: Uploadprotocol): Request[ListenResponse] = js.native
  
  def partitionQuery(request: Oauthtoken, body: PartitionQueryRequest): Request[PartitionQueryResponse] = js.native
  /**
    * Partitions a query by returning partition cursors that can be used to run the query in parallel. The returned partition cursors are split points that can be used by RunQuery as
    * starting/end points for the query results.
    */
  def partitionQuery(request: Xgafv): Request[PartitionQueryResponse] = js.native
  
  /** Updates or inserts a document. */
  def patch(request: CurrentDocumentupdateTime): Request[Document] = js.native
  def patch(request: Name, body: Document): Request[Document] = js.native
  
  /** Rolls back a transaction. */
  def rollback(request: AccesstokenAlt): Request[js.Object] = js.native
  def rollback(request: PrettyPrint, body: RollbackRequest): Request[js.Object] = js.native
  
  /** Runs a query. */
  def runQuery(request: AltCallback): Request[RunQueryResponse] = js.native
  def runQuery(request: Oauthtoken, body: RunQueryRequest): Request[RunQueryResponse] = js.native
  
  /** Streams batches of document updates and deletes, in order. */
  def write(request: CallbackDatabase): Request[WriteResponse] = js.native
  def write(request: PrettyPrint, body: WriteRequest): Request[WriteResponse] = js.native
}
