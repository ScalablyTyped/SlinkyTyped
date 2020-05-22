package typingsSlinky.annyang.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandOptionRegex extends js.Object {
  var regexp: js.RegExp
  def callback(): Unit
}

object CommandOptionRegex {
  @scala.inline
  def apply(callback: () => Unit, regexp: js.RegExp): CommandOptionRegex = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), regexp = regexp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandOptionRegex]
  }
}

