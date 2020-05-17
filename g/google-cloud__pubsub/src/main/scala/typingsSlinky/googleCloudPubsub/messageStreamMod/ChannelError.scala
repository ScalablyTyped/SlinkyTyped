package typingsSlinky.googleCloudPubsub.messageStreamMod

import typingsSlinky.grpcGrpcJs.callStreamMod.StatusObject
import typingsSlinky.grpcGrpcJs.mod.Metadata
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/message-stream", "ChannelError")
@js.native
class ChannelError protected ()
  extends Error
     with StatusObject {
  def this(err: js.Error) = this()
  @JSName("metadata")
  var metadata_ChannelError: Metadata = js.native
}

