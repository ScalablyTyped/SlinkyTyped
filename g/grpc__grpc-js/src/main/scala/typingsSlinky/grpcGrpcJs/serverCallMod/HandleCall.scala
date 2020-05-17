package typingsSlinky.grpcGrpcJs.serverCallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.grpcGrpcJs.serverCallMod.handleUnaryCall[RequestType, ResponseType]
  - typingsSlinky.grpcGrpcJs.serverCallMod.handleClientStreamingCall[RequestType, ResponseType]
  - typingsSlinky.grpcGrpcJs.serverCallMod.handleServerStreamingCall[RequestType, ResponseType]
  - typingsSlinky.grpcGrpcJs.serverCallMod.handleBidiStreamingCall[RequestType, ResponseType]
*/
trait HandleCall[RequestType, ResponseType] extends js.Object

object HandleCall {
  @scala.inline
  implicit def apply[RequestType, ResponseType](
    value: (handleBidiStreamingCall[RequestType, ResponseType]) | (handleClientStreamingCall[RequestType, ResponseType]) | (handleServerStreamingCall[RequestType, ResponseType]) | (handleUnaryCall[RequestType, ResponseType])
  ): HandleCall[RequestType, ResponseType] = value.asInstanceOf[HandleCall[RequestType, ResponseType]]
}

