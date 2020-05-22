package typingsSlinky.baseui.anon

import org.scalajs.dom.raw.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemAny extends js.Object {
  var event: org.scalajs.dom.raw.Event | KeyboardEvent
  var item: js.Any
}

object ItemAny {
  @scala.inline
  def apply(event: org.scalajs.dom.raw.Event | KeyboardEvent, item: js.Any): ItemAny = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemAny]
  }
}

