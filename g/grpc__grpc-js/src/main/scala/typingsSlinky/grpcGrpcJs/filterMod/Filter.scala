package typingsSlinky.grpcGrpcJs.filterMod

import typingsSlinky.grpcGrpcJs.callStreamMod.StatusObject
import typingsSlinky.grpcGrpcJs.callStreamMod.WriteObject
import typingsSlinky.grpcGrpcJs.metadataMod.Metadata
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  def receiveMessage(message: js.Promise[Buffer]): js.Promise[Buffer]
  def receiveMetadata(metadata: Metadata): Metadata
  def receiveTrailers(status: StatusObject): StatusObject
  def sendMessage(message: js.Promise[WriteObject]): js.Promise[WriteObject]
  def sendMetadata(metadata: js.Promise[Metadata]): js.Promise[Metadata]
}

object Filter {
  @scala.inline
  def apply(
    receiveMessage: js.Promise[Buffer] => js.Promise[Buffer],
    receiveMetadata: Metadata => Metadata,
    receiveTrailers: StatusObject => StatusObject,
    sendMessage: js.Promise[WriteObject] => js.Promise[WriteObject],
    sendMetadata: js.Promise[Metadata] => js.Promise[Metadata]
  ): Filter = {
    val __obj = js.Dynamic.literal(receiveMessage = js.Any.fromFunction1(receiveMessage), receiveMetadata = js.Any.fromFunction1(receiveMetadata), receiveTrailers = js.Any.fromFunction1(receiveTrailers), sendMessage = js.Any.fromFunction1(sendMessage), sendMetadata = js.Any.fromFunction1(sendMetadata))
    __obj.asInstanceOf[Filter]
  }
}

