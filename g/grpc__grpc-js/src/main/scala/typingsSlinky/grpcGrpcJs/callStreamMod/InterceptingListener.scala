package typingsSlinky.grpcGrpcJs.callStreamMod

import typingsSlinky.grpcGrpcJs.metadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterceptingListener extends js.Object {
  def onReceiveMessage(message: js.Any): Unit
  def onReceiveMetadata(metadata: Metadata): Unit
  def onReceiveStatus(status: StatusObject): Unit
}

object InterceptingListener {
  @scala.inline
  def apply(
    onReceiveMessage: js.Any => Unit,
    onReceiveMetadata: Metadata => Unit,
    onReceiveStatus: StatusObject => Unit
  ): InterceptingListener = {
    val __obj = js.Dynamic.literal(onReceiveMessage = js.Any.fromFunction1(onReceiveMessage), onReceiveMetadata = js.Any.fromFunction1(onReceiveMetadata), onReceiveStatus = js.Any.fromFunction1(onReceiveStatus))
    __obj.asInstanceOf[InterceptingListener]
  }
}

