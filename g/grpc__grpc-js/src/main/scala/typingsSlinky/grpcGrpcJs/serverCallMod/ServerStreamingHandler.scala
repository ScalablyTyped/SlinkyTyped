package typingsSlinky.grpcGrpcJs.serverCallMod

import typingsSlinky.grpcGrpcJs.makeClientMod.Deserialize
import typingsSlinky.grpcGrpcJs.makeClientMod.Serialize
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerStreamingHandler[RequestType, ResponseType] extends Handler[RequestType, ResponseType] {
  
  def deserialize(bytes: Buffer): RequestType = js.native
  @JSName("deserialize")
  var deserialize_Original: Deserialize[RequestType] = js.native
  
  def func(call: ServerWritableStream[RequestType, ResponseType]): Unit = js.native
  @JSName("func")
  var func_Original: handleServerStreamingCall[RequestType, ResponseType] = js.native
  
  var path: String = js.native
  
  def serialize(value: ResponseType): Buffer = js.native
  @JSName("serialize")
  var serialize_Original: Serialize[ResponseType] = js.native
  
  var `type`: HandlerType = js.native
}
