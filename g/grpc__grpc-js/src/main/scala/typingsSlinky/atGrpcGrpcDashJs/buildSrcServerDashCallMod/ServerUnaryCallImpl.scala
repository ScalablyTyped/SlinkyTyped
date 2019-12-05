package typingsSlinky.atGrpcGrpcDashJs.buildSrcServerDashCallMod

import typingsSlinky.atGrpcGrpcDashJs.Anon_Cancelled
import typingsSlinky.atGrpcGrpcDashJs.Anon_Request
import typingsSlinky.atGrpcGrpcDashJs.buildSrcMetadataMod.Metadata
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/server-call", "ServerUnaryCallImpl")
@js.native
class ServerUnaryCallImpl[RequestType, ResponseType] protected ()
  extends EventEmitter
     with Anon_Cancelled
     with Anon_Request[RequestType] {
  def this(call: Http2ServerCallStream[RequestType, ResponseType], metadata: Metadata) = this()
  var call: js.Any = js.native
  /* CompleteClass */
  override var cancelled: Boolean = js.native
  var metadata: Metadata = js.native
  /* CompleteClass */
  override var request: RequestType | Null = js.native
  /* CompleteClass */
  override def getPeer(): String = js.native
  /* CompleteClass */
  override def sendMetadata(responseMetadata: Metadata): Unit = js.native
}

