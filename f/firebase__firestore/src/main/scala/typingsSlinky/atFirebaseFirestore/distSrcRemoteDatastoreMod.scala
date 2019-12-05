package typingsSlinky.atFirebaseFirestore

import typingsSlinky.atFirebaseFirestore.distSrcApiCredentialsMod.CredentialsProvider
import typingsSlinky.atFirebaseFirestore.distSrcModelDocumentMod.MaybeDocument
import typingsSlinky.atFirebaseFirestore.distSrcModelDocumentUnderscoreKeyMod.DocumentKey
import typingsSlinky.atFirebaseFirestore.distSrcModelMutationMod.Mutation
import typingsSlinky.atFirebaseFirestore.distSrcModelMutationMod.MutationResult
import typingsSlinky.atFirebaseFirestore.distSrcRemoteConnectionMod.Connection
import typingsSlinky.atFirebaseFirestore.distSrcRemotePersistentUnderscoreStreamMod.PersistentListenStream
import typingsSlinky.atFirebaseFirestore.distSrcRemotePersistentUnderscoreStreamMod.PersistentWriteStream
import typingsSlinky.atFirebaseFirestore.distSrcRemotePersistentUnderscoreStreamMod.WatchStreamListener
import typingsSlinky.atFirebaseFirestore.distSrcRemotePersistentUnderscoreStreamMod.WriteStreamListener
import typingsSlinky.atFirebaseFirestore.distSrcRemoteSerializerMod.JsonProtoSerializer
import typingsSlinky.atFirebaseFirestore.distSrcUtilAsyncUnderscoreQueueMod.AsyncQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/remote/datastore", JSImport.Namespace)
@js.native
object distSrcRemoteDatastoreMod extends js.Object {
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

