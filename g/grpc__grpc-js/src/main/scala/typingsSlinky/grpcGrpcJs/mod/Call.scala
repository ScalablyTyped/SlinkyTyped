package typingsSlinky.grpcGrpcJs.mod

import typingsSlinky.grpcGrpcJs.callMod.ClientDuplexStream
import typingsSlinky.grpcGrpcJs.callMod.ClientReadableStream
import typingsSlinky.grpcGrpcJs.callMod.ClientUnaryCall
import typingsSlinky.grpcGrpcJs.callMod.ClientWritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.grpcGrpcJs.callMod.ClientUnaryCall
  - typingsSlinky.grpcGrpcJs.callMod.ClientReadableStream[js.Any]
  - typingsSlinky.grpcGrpcJs.callMod.ClientWritableStream[js.Any]
  - typingsSlinky.grpcGrpcJs.callMod.ClientDuplexStream[js.Any, js.Any]
*/
trait Call extends js.Object

object Call {
  @scala.inline
  implicit def apply(value: ClientDuplexStream[js.Any, js.Any]): Call = value.asInstanceOf[Call]
  @scala.inline
  implicit def apply(value: ClientReadableStream[js.Any]): Call = value.asInstanceOf[Call]
  @scala.inline
  implicit def apply(value: ClientUnaryCall): Call = value.asInstanceOf[Call]
  @scala.inline
  implicit def apply(value: ClientWritableStream[js.Any]): Call = value.asInstanceOf[Call]
}

