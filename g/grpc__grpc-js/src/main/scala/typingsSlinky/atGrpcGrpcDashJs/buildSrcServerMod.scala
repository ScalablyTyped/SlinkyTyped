package typingsSlinky.atGrpcGrpcDashJs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atGrpcGrpcDashJs.buildSrcChannelDashOptionsMod.ChannelOptions
import typingsSlinky.atGrpcGrpcDashJs.buildSrcMakeDashClientMod.Deserialize
import typingsSlinky.atGrpcGrpcDashJs.buildSrcMakeDashClientMod.Serialize
import typingsSlinky.atGrpcGrpcDashJs.buildSrcMakeDashClientMod.ServiceDefinition
import typingsSlinky.atGrpcGrpcDashJs.buildSrcServerDashCallMod.HandleCall
import typingsSlinky.atGrpcGrpcDashJs.buildSrcServerDashCredentialsMod.ServerCredentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/server", JSImport.Namespace)
@js.native
object buildSrcServerMod extends js.Object {
  @js.native
  class Server () extends js.Object {
    def this(options: ChannelOptions) = this()
    var _setupHandlers: js.Any = js.native
    var handlers: js.Any = js.native
    var http2Server: js.Any = js.native
    var options: js.Any = js.native
    var sessions: js.Any = js.native
    var started: js.Any = js.native
    def addHttp2Port(): Unit = js.native
    def addProtoService(): Unit = js.native
    def addService(service: ServiceDefinition, implementation: UntypedServiceImplementation): Unit = js.native
    def bind(port: String, creds: ServerCredentials): Unit = js.native
    def bindAsync(
      port: String,
      creds: ServerCredentials,
      callback: js.Function2[/* error */ js.Error | Null, /* port */ Double, Unit]
    ): Unit = js.native
    def forceShutdown(): Unit = js.native
    def register[RequestType, ResponseType](
      name: String,
      handler: HandleCall[RequestType, ResponseType],
      serialize: Serialize[ResponseType],
      deserialize: Deserialize[RequestType],
      `type`: String
    ): Boolean = js.native
    def start(): Unit = js.native
    def tryShutdown(callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
  }
  
  type UntypedHandleCall = HandleCall[js.Any, js.Any]
  type UntypedServiceImplementation = StringDictionary[UntypedHandleCall]
}

