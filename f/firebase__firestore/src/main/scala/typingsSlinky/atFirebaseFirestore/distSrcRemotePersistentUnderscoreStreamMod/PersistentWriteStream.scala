package typingsSlinky.atFirebaseFirestore.distSrcRemotePersistentUnderscoreStreamMod

import typingsSlinky.atFirebaseFirestore.distSrcApiCredentialsMod.CredentialsProvider
import typingsSlinky.atFirebaseFirestore.distSrcCoreTypesMod.ProtoByteString
import typingsSlinky.atFirebaseFirestore.distSrcModelMutationMod.Mutation
import typingsSlinky.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.WriteResponse
import typingsSlinky.atFirebaseFirestore.distSrcRemoteConnectionMod.Connection
import typingsSlinky.atFirebaseFirestore.distSrcRemoteSerializerMod.JsonProtoSerializer
import typingsSlinky.atFirebaseFirestore.distSrcUtilAsyncUnderscoreQueueMod.AsyncQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/remote/persistent_stream", "PersistentWriteStream")
@js.native
class PersistentWriteStream protected ()
  extends PersistentStream[
      typingsSlinky.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.WriteRequest, 
      WriteResponse, 
      WriteStreamListener
    ] {
  def this(
    queue: AsyncQueue,
    connection: Connection,
    credentials: CredentialsProvider,
    serializer: JsonProtoSerializer,
    listener: WriteStreamListener
  ) = this()
  var handshakeComplete_ : js.Any = js.native
  /**
    * The last received stream token from the server, used to acknowledge which
    * responses the client has processed. Stream tokens are opaque checkpoint
    * markers whose only real value is their inclusion in the next request.
    *
    * PersistentWriteStream manages propagating this value from responses to the
    * next request.
    */
  var lastStreamToken: ProtoByteString = js.native
  var serializer: js.Any = js.native
  /**
    * Tracks whether or not a handshake has been successfully exchanged and
    * the stream is ready to accept mutations.
    */
  def handshakeComplete(): Boolean = js.native
  /**
    * Sends an initial streamToken to the server, performing the handshake
    * required to make the StreamingWrite RPC work. Subsequent
    * calls should wait until onHandshakeComplete was called.
    */
  def writeHandshake(): Unit = js.native
  /** Sends a group of mutations to the Firestore backend to apply. */
  def writeMutations(mutations: js.Array[Mutation]): Unit = js.native
}

