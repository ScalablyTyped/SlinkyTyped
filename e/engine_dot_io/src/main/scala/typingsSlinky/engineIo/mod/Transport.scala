package typingsSlinky.engineIo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.engineIo.engineIoStrings.polling
  - typingsSlinky.engineIo.engineIoStrings.websocket
*/
trait Transport extends js.Object

object Transport {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def polling: typingsSlinky.engineIo.engineIoStrings.polling = this.cast("polling")
  @scala.inline
  def websocket: typingsSlinky.engineIo.engineIoStrings.websocket = this.cast("websocket")
}

