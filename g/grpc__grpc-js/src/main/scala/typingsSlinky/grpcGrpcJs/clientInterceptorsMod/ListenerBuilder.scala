package typingsSlinky.grpcGrpcJs.clientInterceptorsMod

import typingsSlinky.grpcGrpcJs.callStreamMod.Listener
import typingsSlinky.grpcGrpcJs.callStreamMod.MessageListener
import typingsSlinky.grpcGrpcJs.callStreamMod.MetadataListener
import typingsSlinky.grpcGrpcJs.callStreamMod.StatusListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@grpc/grpc-js/build/src/client-interceptors", "ListenerBuilder")
@js.native
class ListenerBuilder () extends js.Object {
  
  def build(): Listener = js.native
  
  var message: js.Any = js.native
  
  var metadata: js.Any = js.native
  
  var status: js.Any = js.native
  
  def withOnReceiveMessage(onReceiveMessage: MessageListener): this.type = js.native
  
  def withOnReceiveMetadata(onReceiveMetadata: MetadataListener): this.type = js.native
  
  def withOnReceiveStatus(onReceiveStatus: StatusListener): this.type = js.native
}
