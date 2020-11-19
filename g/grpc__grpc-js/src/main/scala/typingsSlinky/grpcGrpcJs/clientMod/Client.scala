package typingsSlinky.grpcGrpcJs.clientMod

import typingsSlinky.grpcGrpcJs.callMod.ClientDuplexStream
import typingsSlinky.grpcGrpcJs.callMod.ClientReadableStream
import typingsSlinky.grpcGrpcJs.callMod.ClientUnaryCall
import typingsSlinky.grpcGrpcJs.callMod.ClientWritableStream
import typingsSlinky.grpcGrpcJs.callStreamMod.Deadline
import typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials
import typingsSlinky.grpcGrpcJs.channelMod.Channel
import typingsSlinky.grpcGrpcJs.metadataMod.Metadata
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@grpc/grpc-js/build/src/client", "Client")
@js.native
class Client protected () extends js.Object {
  def this(address: String, credentials: ChannelCredentials) = this()
  def this(address: String, credentials: ChannelCredentials, options: ClientOptions) = this()
  
  var checkMetadataAndOptions: js.Any = js.native
  
  var checkOptionalUnaryResponseArguments: js.Any = js.native
  
  def close(): Unit = js.native
  
  def getChannel(): Channel = js.native
  
  def makeBidiStreamRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType]
  ): ClientDuplexStream[RequestType, ResponseType] = js.native
  def makeBidiStreamRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType],
    metadata: Metadata
  ): ClientDuplexStream[RequestType, ResponseType] = js.native
  def makeBidiStreamRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType],
    metadata: Metadata,
    options: CallOptions
  ): ClientDuplexStream[RequestType, ResponseType] = js.native
  def makeBidiStreamRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType],
    options: CallOptions
  ): ClientDuplexStream[RequestType, ResponseType] = js.native
  
  def makeClientStreamRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType],
    callback: UnaryCallback[ResponseType]
  ): ClientWritableStream[RequestType] = js.native
  def makeClientStreamRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType],
    metadata: Metadata,
    callback: UnaryCallback[ResponseType]
  ): ClientWritableStream[RequestType] = js.native
  def makeClientStreamRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType],
    metadata: Metadata,
    options: CallOptions,
    callback: UnaryCallback[ResponseType]
  ): ClientWritableStream[RequestType] = js.native
  def makeClientStreamRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType],
    options: CallOptions,
    callback: UnaryCallback[ResponseType]
  ): ClientWritableStream[RequestType] = js.native
  
  def makeServerStreamRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType],
    argument: RequestType
  ): ClientReadableStream[ResponseType] = js.native
  def makeServerStreamRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType],
    argument: RequestType,
    metadata: Metadata
  ): ClientReadableStream[ResponseType] = js.native
  def makeServerStreamRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType],
    argument: RequestType,
    metadata: Metadata,
    options: CallOptions
  ): ClientReadableStream[ResponseType] = js.native
  def makeServerStreamRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType],
    argument: RequestType,
    options: CallOptions
  ): ClientReadableStream[ResponseType] = js.native
  
  def makeUnaryRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType],
    argument: RequestType,
    callback: UnaryCallback[ResponseType]
  ): ClientUnaryCall = js.native
  def makeUnaryRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType],
    argument: RequestType,
    metadata: Metadata,
    callback: UnaryCallback[ResponseType]
  ): ClientUnaryCall = js.native
  def makeUnaryRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType],
    argument: RequestType,
    metadata: Metadata,
    options: CallOptions,
    callback: UnaryCallback[ResponseType]
  ): ClientUnaryCall = js.native
  def makeUnaryRequest[RequestType, ResponseType](
    method: String,
    serialize: js.Function1[/* value */ RequestType, Buffer],
    deserialize: js.Function1[/* value */ Buffer, ResponseType],
    argument: RequestType,
    options: CallOptions,
    callback: UnaryCallback[ResponseType]
  ): ClientUnaryCall = js.native
  
  def waitForReady(deadline: Deadline, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
}
