package typingsSlinky.googleCloudPubsub.messageQueuesMod

import typingsSlinky.grpcGrpcJs.callMod.ServiceError
import typingsSlinky.grpcGrpcJs.callStreamMod.StatusObject
import typingsSlinky.grpcGrpcJs.mod.Metadata
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/message-queues", "BatchError")
@js.native
class BatchError protected ()
  extends Error
     with StatusObject {
  def this(err: ServiceError, ackIds: js.Array[String], rpc: String) = this()
  var ackIds: js.Array[String] = js.native
  @JSName("metadata")
  var metadata_BatchError: Metadata = js.native
}

