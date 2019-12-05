package typingsSlinky.atFirebaseFirestore.distSrcRemotePersistentUnderscoreStreamMod

import typingsSlinky.atFirebaseFirestore.distSrcApiCredentialsMod.CredentialsProvider
import typingsSlinky.atFirebaseFirestore.distSrcCoreTypesMod.TargetId
import typingsSlinky.atFirebaseFirestore.distSrcLocalTargetUnderscoreDataMod.TargetData
import typingsSlinky.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.ListenRequest
import typingsSlinky.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.ListenResponse
import typingsSlinky.atFirebaseFirestore.distSrcRemoteConnectionMod.Connection
import typingsSlinky.atFirebaseFirestore.distSrcRemoteSerializerMod.JsonProtoSerializer
import typingsSlinky.atFirebaseFirestore.distSrcUtilAsyncUnderscoreQueueMod.AsyncQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/remote/persistent_stream", "PersistentListenStream")
@js.native
class PersistentListenStream protected () extends PersistentStream[ListenRequest, ListenResponse, WatchStreamListener] {
  def this(
    queue: AsyncQueue,
    connection: Connection,
    credentials: CredentialsProvider,
    serializer: JsonProtoSerializer,
    listener: WatchStreamListener
  ) = this()
  var serializer: js.Any = js.native
  /**
    * Unregisters interest in the results of the target associated with the
    * given targetId.
    */
  def unwatch(targetId: TargetId): Unit = js.native
  /**
    * Registers interest in the results of the given target. If the target
    * includes a resumeToken it will be included in the request. Results that
    * affect the target will be streamed back as WatchChange messages that
    * reference the targetId.
    */
  def watch(targetData: TargetData): Unit = js.native
}

