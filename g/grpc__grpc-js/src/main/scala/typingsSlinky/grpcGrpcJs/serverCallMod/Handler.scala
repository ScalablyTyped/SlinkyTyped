package typingsSlinky.grpcGrpcJs.serverCallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.grpcGrpcJs.serverCallMod.UnaryHandler[RequestType, ResponseType]
  - typingsSlinky.grpcGrpcJs.serverCallMod.ClientStreamingHandler[RequestType, ResponseType]
  - typingsSlinky.grpcGrpcJs.serverCallMod.ServerStreamingHandler[RequestType, ResponseType]
  - typingsSlinky.grpcGrpcJs.serverCallMod.BidiStreamingHandler[RequestType, ResponseType]
*/
trait Handler[RequestType, ResponseType] extends js.Object

object Handler {
  @scala.inline
  implicit def apply[RequestType, ResponseType](value: BidiStreamingHandler[RequestType, ResponseType]): Handler[RequestType, ResponseType] = value.asInstanceOf[Handler[RequestType, ResponseType]]
  @scala.inline
  implicit def apply[RequestType, ResponseType](value: ClientStreamingHandler[RequestType, ResponseType]): Handler[RequestType, ResponseType] = value.asInstanceOf[Handler[RequestType, ResponseType]]
  @scala.inline
  implicit def apply[RequestType, ResponseType](value: ServerStreamingHandler[RequestType, ResponseType]): Handler[RequestType, ResponseType] = value.asInstanceOf[Handler[RequestType, ResponseType]]
  @scala.inline
  implicit def apply[RequestType, ResponseType](value: UnaryHandler[RequestType, ResponseType]): Handler[RequestType, ResponseType] = value.asInstanceOf[Handler[RequestType, ResponseType]]
}

