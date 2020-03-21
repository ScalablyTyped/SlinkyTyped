package typingsSlinky.mitm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mitm.mitmStrings.connect
  - typingsSlinky.mitm.mitmStrings.connection
  - typingsSlinky.mitm.mitmStrings.request
*/
trait Event extends js.Object

object Event {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connect: typingsSlinky.mitm.mitmStrings.connect = this.cast("connect")
  @scala.inline
  def connection: typingsSlinky.mitm.mitmStrings.connection = this.cast("connection")
  @scala.inline
  def request: typingsSlinky.mitm.mitmStrings.request = this.cast("request")
}

