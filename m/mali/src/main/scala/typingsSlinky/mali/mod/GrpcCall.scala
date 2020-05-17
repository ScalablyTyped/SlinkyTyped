package typingsSlinky.mali.mod

import typingsSlinky.grpc.mod.ServerDuplexStream
import typingsSlinky.grpc.mod.ServerReadableStream
import typingsSlinky.grpc.mod.ServerUnaryCall
import typingsSlinky.grpc.mod.ServerWriteableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.grpc.mod.ServerUnaryCall[js.Any]
  - typingsSlinky.grpc.mod.ServerReadableStream[js.Any]
  - typingsSlinky.grpc.mod.ServerWriteableStream[js.Any]
  - typingsSlinky.grpc.mod.ServerDuplexStream[js.Any, js.Any]
*/
trait GrpcCall extends js.Object

object GrpcCall {
  @scala.inline
  implicit def apply(value: ServerDuplexStream[js.Any, js.Any]): GrpcCall = value.asInstanceOf[GrpcCall]
  @scala.inline
  implicit def apply(value: ServerReadableStream[js.Any]): GrpcCall = value.asInstanceOf[GrpcCall]
  @scala.inline
  implicit def apply(value: ServerUnaryCall[js.Any]): GrpcCall = value.asInstanceOf[GrpcCall]
  @scala.inline
  implicit def apply(value: ServerWriteableStream[js.Any]): GrpcCall = value.asInstanceOf[GrpcCall]
}

