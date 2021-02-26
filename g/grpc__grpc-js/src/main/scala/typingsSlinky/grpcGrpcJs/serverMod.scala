package typingsSlinky.grpcGrpcJs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typingsSlinky.grpcGrpcJs.makeClientMod.Deserialize
import typingsSlinky.grpcGrpcJs.makeClientMod.Serialize
import typingsSlinky.grpcGrpcJs.serverCallMod.HandleCall
import typingsSlinky.grpcGrpcJs.serverCredentialsMod.ServerCredentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  @JSImport("@grpc/grpc-js/build/src/server", "Server")
  @js.native
  class Server () extends StObject {
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
