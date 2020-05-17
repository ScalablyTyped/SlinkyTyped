package typingsSlinky.googleCloudPubsub.messageStreamMod

import typingsSlinky.grpcGrpcJs.callStreamMod.StatusObject
import typingsSlinky.grpcGrpcJs.mod.Metadata
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/message-stream", "StatusError")
@js.native
class StatusError protected ()
  extends Error
     with StatusObject {
  def this(status: StatusObject) = this()
  @JSName("metadata")
  var metadata_StatusError: Metadata = js.native
}

