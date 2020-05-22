package typingsSlinky.grpcGrpcJs.callStreamMod

import typingsSlinky.grpcGrpcJs.metadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/call-stream", "InterceptingListenerImpl")
@js.native
class InterceptingListenerImpl protected () extends InterceptingListener {
  def this(listener: FullListener, nextListener: InterceptingListener) = this()
  var listener: js.Any = js.native
  var nextListener: js.Any = js.native
  var pendingStatus: js.Any = js.native
  var processingMessage: js.Any = js.native
  /* CompleteClass */
  override def onReceiveMessage(message: js.Any): Unit = js.native
  /* CompleteClass */
  override def onReceiveMetadata(metadata: Metadata): Unit = js.native
  /* CompleteClass */
  override def onReceiveStatus(status: StatusObject): Unit = js.native
}

