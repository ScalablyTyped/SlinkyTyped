package typingsSlinky.grpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Any client call type
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.grpc.mod.ClientUnaryCall
  - typingsSlinky.grpc.mod.ClientReadableStream[js.Any]
  - typingsSlinky.grpc.mod.ClientWritableStream[js.Any]
  - typingsSlinky.grpc.mod.ClientDuplexStream[js.Any, js.Any]
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

