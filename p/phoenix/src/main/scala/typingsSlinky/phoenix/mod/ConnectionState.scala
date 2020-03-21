package typingsSlinky.phoenix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.phoenix.phoenixStrings.connecting
  - typingsSlinky.phoenix.phoenixStrings.open
  - typingsSlinky.phoenix.phoenixStrings.closing
  - typingsSlinky.phoenix.phoenixStrings.closed
*/
trait ConnectionState extends js.Object

object ConnectionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typingsSlinky.phoenix.phoenixStrings.closed = this.cast("closed")
  @scala.inline
  def closing: typingsSlinky.phoenix.phoenixStrings.closing = this.cast("closing")
  @scala.inline
  def connecting: typingsSlinky.phoenix.phoenixStrings.connecting = this.cast("connecting")
  @scala.inline
  def open: typingsSlinky.phoenix.phoenixStrings.open = this.cast("open")
}

