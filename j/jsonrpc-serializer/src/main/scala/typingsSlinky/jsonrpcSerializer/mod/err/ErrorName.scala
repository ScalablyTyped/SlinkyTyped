package typingsSlinky.jsonrpcSerializer.mod.err

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsonrpcSerializer.jsonrpcSerializerStrings.JsonRpcError
  - typingsSlinky.jsonrpcSerializer.jsonrpcSerializerStrings.ParseError
  - typingsSlinky.jsonrpcSerializer.jsonrpcSerializerStrings.InvalidRequestError
  - typingsSlinky.jsonrpcSerializer.jsonrpcSerializerStrings.MethodNotFoundError
  - typingsSlinky.jsonrpcSerializer.jsonrpcSerializerStrings.InvalidParamsError
*/
trait ErrorName extends js.Object

object ErrorName {
  @scala.inline
  def InvalidParamsError: typingsSlinky.jsonrpcSerializer.jsonrpcSerializerStrings.InvalidParamsError = this.cast("InvalidParamsError")
  @scala.inline
  def InvalidRequestError: typingsSlinky.jsonrpcSerializer.jsonrpcSerializerStrings.InvalidRequestError = this.cast("InvalidRequestError")
  @scala.inline
  def JsonRpcError: typingsSlinky.jsonrpcSerializer.jsonrpcSerializerStrings.JsonRpcError = this.cast("JsonRpcError")
  @scala.inline
  def MethodNotFoundError: typingsSlinky.jsonrpcSerializer.jsonrpcSerializerStrings.MethodNotFoundError = this.cast("MethodNotFoundError")
  @scala.inline
  def ParseError: typingsSlinky.jsonrpcSerializer.jsonrpcSerializerStrings.ParseError = this.cast("ParseError")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

