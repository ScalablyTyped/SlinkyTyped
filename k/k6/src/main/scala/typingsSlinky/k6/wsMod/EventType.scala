package typingsSlinky.k6.wsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.k6.k6Strings.close
  - typings.k6.k6Strings.error
  - typings.k6.k6Strings.message
  - typings.k6.k6Strings.open
  - typings.k6.k6Strings.ping
  - typings.k6.k6Strings.pong
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def close: typingsSlinky.k6.k6Strings.close = this.cast("close")
  @scala.inline
  def error: typingsSlinky.k6.k6Strings.error = this.cast("error")
  @scala.inline
  def message: typingsSlinky.k6.k6Strings.message = this.cast("message")
  @scala.inline
  def open: typingsSlinky.k6.k6Strings.open = this.cast("open")
  @scala.inline
  def ping: typingsSlinky.k6.k6Strings.ping = this.cast("ping")
  @scala.inline
  def pong: typingsSlinky.k6.k6Strings.pong = this.cast("pong")
}

