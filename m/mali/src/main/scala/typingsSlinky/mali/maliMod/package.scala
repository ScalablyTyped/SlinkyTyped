package typingsSlinky.mali

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object maliMod {
  import typingsSlinky.grpc.grpcMod.ServerDuplexStream
  import typingsSlinky.grpc.grpcMod.ServerReadableStream
  import typingsSlinky.grpc.grpcMod.ServerUnaryCall
  import typingsSlinky.grpc.grpcMod.ServerWriteableStream

  type GrpcCall = ServerUnaryCall[js.Any] | ServerReadableStream[js.Any] | ServerWriteableStream[js.Any] | (ServerDuplexStream[js.Any, js.Any])
  type GrpcRequest = js.Any
  type GrpcResponse = js.Any
}
