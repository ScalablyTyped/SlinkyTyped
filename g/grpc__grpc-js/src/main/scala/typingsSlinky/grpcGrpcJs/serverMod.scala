package typingsSlinky.grpcGrpcJs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typingsSlinky.grpcGrpcJs.makeClientMod.Deserialize
import typingsSlinky.grpcGrpcJs.makeClientMod.Serialize
import typingsSlinky.grpcGrpcJs.serverCallMod.HandleCall
import typingsSlinky.grpcGrpcJs.serverCredentialsMod.ServerCredentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@grpc/grpc-js/build/src/server", JSImport.Namespace)
@js.native
object serverMod extends js.Object {
  
  @js.native
  class Server () extends js.Object {
    def this(options: ChannelOptions) = this()
    
    var _setupHandlers: js.Any = js.native
    
    def addHttp2Port(): Unit = js.native
    
    def addProtoService(): Unit = js.native
    
    def addService(service: js.Object, implementation: UntypedServiceImplementation): Unit = js.native
    
    def bind(port: String, creds: ServerCredentials): Unit = js.native
    
    def bindAsync(
      port: String,
      creds: ServerCredentials,
      callback: js.Function2[/* error */ js.Error | Null, /* port */ Double, Unit]
    ): Unit = js.native
    
    def forceShutdown(): Unit = js.native
    
    var handlers: js.Any = js.native
    
    var http2ServerList: js.Any = js.native
    
    var options: js.Any = js.native
    
    def register[RequestType, ResponseType](
      name: String,
      handler: HandleCall[RequestType, ResponseType],
      serialize: Serialize[ResponseType],
      deserialize: Deserialize[RequestType],
      `type`: String
    ): Boolean = js.native
    
    var sessions: js.Any = js.native
    
    def start(): Unit = js.native
    
    var started: js.Any = js.native
    
    def tryShutdown(callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
  }
  
  type UntypedHandleCall = HandleCall[js.Any, js.Any]
  
  type UntypedServiceImplementation = StringDictionary[UntypedHandleCall]
}
