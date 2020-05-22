package typingsSlinky.grpcGrpcJs.filterMod

import typingsSlinky.grpcGrpcJs.callStreamMod.StatusObject
import typingsSlinky.grpcGrpcJs.callStreamMod.WriteObject
import typingsSlinky.grpcGrpcJs.metadataMod.Metadata
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/filter", "BaseFilter")
@js.native
abstract class BaseFilter () extends Filter {
  /* CompleteClass */
  override def receiveMessage(message: js.Promise[Buffer]): js.Promise[Buffer] = js.native
  /* CompleteClass */
  override def receiveMetadata(metadata: Metadata): Metadata = js.native
  /* CompleteClass */
  override def receiveTrailers(status: StatusObject): StatusObject = js.native
  /* CompleteClass */
  override def sendMessage(message: js.Promise[WriteObject]): js.Promise[WriteObject] = js.native
  /* CompleteClass */
  override def sendMetadata(metadata: js.Promise[Metadata]): js.Promise[Metadata] = js.native
}

