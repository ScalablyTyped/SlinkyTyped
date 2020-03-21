package typingsSlinky.gestalt

import org.scalajs.dom.raw.Element
import slinky.core.SyntheticEvent
import slinky.web.SyntheticFocusEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValueString extends js.Object {
  var event: SyntheticEvent[Event_, SyntheticFocusEvent[Element]]
  var value: String
}

object AnonValueString {
  @scala.inline
  def apply(event: SyntheticEvent[Event_, SyntheticFocusEvent[Element]], value: String): AnonValueString = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValueString]
  }
}

