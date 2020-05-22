package typingsSlinky.googleCloudPubsub.messageStreamMod

import typingsSlinky.grpcGrpcJs.callStreamMod.StatusObject
import typingsSlinky.grpcGrpcJs.constantsMod.Status
import typingsSlinky.grpcGrpcJs.metadataMod.Metadata
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
  /* CompleteClass */
  override var code: Status = js.native
  /* CompleteClass */
  override var details: String = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var metadata: Metadata = js.native
  @JSName("metadata")
  var metadata_ChannelError: typingsSlinky.grpcGrpcJs.mod.Metadata = js.native
  /* CompleteClass */
  override var name: String = js.native
}

