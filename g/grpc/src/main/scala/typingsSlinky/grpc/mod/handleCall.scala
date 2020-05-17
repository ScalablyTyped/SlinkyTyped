package typingsSlinky.grpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.grpc.mod.handleUnaryCall[RequestType, ResponseType]
  - typingsSlinky.grpc.mod.handleClientStreamingCall[RequestType, ResponseType]
  - typingsSlinky.grpc.mod.handleServerStreamingCall[RequestType, ResponseType]
  - typingsSlinky.grpc.mod.handleBidiStreamingCall[RequestType, ResponseType]
*/
trait handleCall[RequestType, ResponseType] extends js.Object

object handleCall {
  @scala.inline
  implicit def apply[RequestType, ResponseType](
    value: (handleBidiStreamingCall[RequestType, ResponseType]) | (handleClientStreamingCall[RequestType, ResponseType]) | (handleServerStreamingCall[RequestType, ResponseType]) | (handleUnaryCall[RequestType, ResponseType])
  ): handleCall[RequestType, ResponseType] = value.asInstanceOf[handleCall[RequestType, ResponseType]]
}

