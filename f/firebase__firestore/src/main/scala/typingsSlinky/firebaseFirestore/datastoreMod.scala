package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.asyncQueueMod.AsyncQueue
import typingsSlinky.firebaseFirestore.connectionMod.Connection
import typingsSlinky.firebaseFirestore.credentialsMod.CredentialsProvider
import typingsSlinky.firebaseFirestore.documentKeyMod.DocumentKey
import typingsSlinky.firebaseFirestore.documentMod.MaybeDocument
import typingsSlinky.firebaseFirestore.mutationMod.Mutation
import typingsSlinky.firebaseFirestore.mutationMod.MutationResult
import typingsSlinky.firebaseFirestore.persistentStreamMod.PersistentListenStream
import typingsSlinky.firebaseFirestore.persistentStreamMod.PersistentWriteStream
import typingsSlinky.firebaseFirestore.persistentStreamMod.WatchStreamListener
import typingsSlinky.firebaseFirestore.persistentStreamMod.WriteStreamListener
import typingsSlinky.firebaseFirestore.serializerMod.JsonProtoSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/remote/datastore", JSImport.Namespace)
@js.native
object datastoreMod extends js.Object {
  @js.native
  class Datastore protected () extends js.Object {
    def this(
      queue: AsyncQueue,
      connection: Connection,
      credentials: CredentialsProvider,
      serializer: JsonProtoSerializer
    ) = this()
    var connection: js.Any = js.native
    var credentials: js.Any = js.native
    /** Gets an auth token and invokes the provided RPC. */
    var invokeRPC: js.Any = js.native
    /** Gets an auth token and invokes the provided RPC with streamed results. */
    var invokeStreamingRPC: js.Any = js.native
    var queue: js.Any = js.native
    var serializer: js.Any = js.native
    def commit(mutations: js.Array[Mutation]): js.Promise[js.Array[MutationResult]] = js.native
    def lookup(keys: js.Array[DocumentKey]): js.Promise[js.Array[MaybeDocument]] = js.native
    def newPersistentWatchStream(listener: WatchStreamListener): PersistentListenStream = js.native
    def newPersistentWriteStream(listener: WriteStreamListener): PersistentWriteStream = js.native
  }
  
}

