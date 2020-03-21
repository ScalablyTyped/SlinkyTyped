package typingsSlinky.jsonrpcSerializer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsonrpcSerializer.jsonrpcSerializerStrings.request
  - typingsSlinky.jsonrpcSerializer.jsonrpcSerializerStrings.notification
  - typingsSlinky.jsonrpcSerializer.jsonrpcSerializerStrings.success
  - typingsSlinky.jsonrpcSerializer.jsonrpcSerializerStrings.error
*/
trait PayloadType extends js.Object

object PayloadType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.jsonrpcSerializer.jsonrpcSerializerStrings.error = this.cast("error")
  @scala.inline
  def notification: typingsSlinky.jsonrpcSerializer.jsonrpcSerializerStrings.notification = this.cast("notification")
  @scala.inline
  def request: typingsSlinky.jsonrpcSerializer.jsonrpcSerializerStrings.request = this.cast("request")
  @scala.inline
  def success: typingsSlinky.jsonrpcSerializer.jsonrpcSerializerStrings.success = this.cast("success")
}

