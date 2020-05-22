package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.apiCredentialsMod.CredentialsProvider
import typingsSlinky.firebaseFirestore.coreQueryMod.Query
import typingsSlinky.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typingsSlinky.firebaseFirestore.modelDocumentMod.Document
import typingsSlinky.firebaseFirestore.modelDocumentMod.MaybeDocument
import typingsSlinky.firebaseFirestore.modelMutationMod.Mutation
import typingsSlinky.firebaseFirestore.modelMutationMod.MutationResult
import typingsSlinky.firebaseFirestore.remoteConnectionMod.Connection
import typingsSlinky.firebaseFirestore.remotePersistentStreamMod.PersistentListenStream
import typingsSlinky.firebaseFirestore.remotePersistentStreamMod.PersistentWriteStream
import typingsSlinky.firebaseFirestore.remotePersistentStreamMod.WatchStreamListener
import typingsSlinky.firebaseFirestore.remotePersistentStreamMod.WriteStreamListener
import typingsSlinky.firebaseFirestore.remoteSerializerMod.JsonProtoSerializer
import typingsSlinky.firebaseFirestore.utilAsyncQueueMod.AsyncQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/remote/datastore", JSImport.Namespace)
@js.native
object remoteDatastoreMod extends js.Object {
  @js.native
  class Datastore () extends js.Object {
    @JSName("_")
    var _underscore: js.Any = js.native
  }
  
  def invokeBatchGetDocumentsRpc(datastore: Datastore, keys: js.Array[DocumentKey]): js.Promise[js.Array[MaybeDocument]] = js.native
  def invokeCommitRpc(datastore: Datastore, mutations: js.Array[Mutation]): js.Promise[js.Array[MutationResult]] = js.native
  def invokeRunQueryRpc(datastore: Datastore, query: Query): js.Promise[js.Array[Document]] = js.native
  def newDatastore(connection: Connection, credentials: CredentialsProvider, serializer: JsonProtoSerializer): Datastore = js.native
  def newPersistentWatchStream(datastore: Datastore, queue: AsyncQueue, listener: WatchStreamListener): PersistentListenStream = js.native
  def newPersistentWriteStream(datastore: Datastore, queue: AsyncQueue, listener: WriteStreamListener): PersistentWriteStream = js.native
}

