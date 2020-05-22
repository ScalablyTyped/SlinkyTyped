package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.asyncQueueMod.AsyncQueue
import typingsSlinky.firebaseFirestore.connectionMod.Connection
import typingsSlinky.firebaseFirestore.credentialsMod.CredentialsProvider
import typingsSlinky.firebaseFirestore.documentKeyMod.DocumentKey
import typingsSlinky.firebaseFirestore.documentMod.Document
import typingsSlinky.firebaseFirestore.documentMod.MaybeDocument
import typingsSlinky.firebaseFirestore.mutationMod.Mutation
import typingsSlinky.firebaseFirestore.mutationMod.MutationResult
import typingsSlinky.firebaseFirestore.persistentStreamMod.PersistentListenStream
import typingsSlinky.firebaseFirestore.persistentStreamMod.PersistentWriteStream
import typingsSlinky.firebaseFirestore.persistentStreamMod.WatchStreamListener
import typingsSlinky.firebaseFirestore.persistentStreamMod.WriteStreamListener
import typingsSlinky.firebaseFirestore.queryMod.Query
import typingsSlinky.firebaseFirestore.serializerMod.JsonProtoSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/remote/datastore", JSImport.Namespace)
@js.native
object datastoreMod extends js.Object {
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

