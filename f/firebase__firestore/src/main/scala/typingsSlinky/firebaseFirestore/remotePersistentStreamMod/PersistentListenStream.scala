package typingsSlinky.firebaseFirestore.remotePersistentStreamMod

import typingsSlinky.firebaseFirestore.apiCredentialsMod.CredentialsProvider
import typingsSlinky.firebaseFirestore.coreTypesMod.TargetId
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.ListenRequest
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.ListenResponse
import typingsSlinky.firebaseFirestore.localTargetDataMod.TargetData
import typingsSlinky.firebaseFirestore.remoteConnectionMod.Connection
import typingsSlinky.firebaseFirestore.remoteSerializerMod.JsonProtoSerializer
import typingsSlinky.firebaseFirestore.utilAsyncQueueMod.AsyncQueue
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

