package typingsSlinky.grpcGrpcJs.serverMod

import typingsSlinky.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typingsSlinky.grpcGrpcJs.makeClientMod.Deserialize
import typingsSlinky.grpcGrpcJs.makeClientMod.Serialize
import typingsSlinky.grpcGrpcJs.makeClientMod.ServiceDefinition
import typingsSlinky.grpcGrpcJs.serverCallMod.HandleCall
import typingsSlinky.grpcGrpcJs.serverCredentialsMod.ServerCredentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/server", "Server")
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

