package typingsSlinky.grpcGrpcJs.serverCallMod

import typingsSlinky.grpcGrpcJs.makeClientMod.Deserialize
import typingsSlinky.grpcGrpcJs.makeClientMod.Serialize
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnaryHandler[RequestType, ResponseType] extends Handler[RequestType, ResponseType] {
  @JSName("deserialize")
  var deserialize_Original: Deserialize[RequestType] = js.native
  @JSName("func")
  var func_Original: handleUnaryCall[RequestType, ResponseType] = js.native
  @JSName("serialize")
  var serialize_Original: Serialize[ResponseType] = js.native
  var `type`: HandlerType = js.native
  def deserialize(bytes: Buffer): RequestType = js.native
  def func(call: ServerUnaryCall[RequestType, ResponseType], callback: sendUnaryData[ResponseType]): Unit = js.native
  def serialize(value: ResponseType): Buffer = js.native
}

