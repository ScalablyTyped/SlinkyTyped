package typingsSlinky.engineIoClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.engineIoClient.engineIoClientStrings.polling
  - typingsSlinky.engineIoClient.engineIoClientStrings.websocket
*/
trait Transport extends js.Object

object Transport {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def polling: typingsSlinky.engineIoClient.engineIoClientStrings.polling = this.cast("polling")
  @scala.inline
  def websocket: typingsSlinky.engineIoClient.engineIoClientStrings.websocket = this.cast("websocket")
}

