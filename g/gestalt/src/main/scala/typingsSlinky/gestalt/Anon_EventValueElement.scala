package typingsSlinky.gestalt

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.web.SyntheticFocusEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventValueElement extends js.Object {
  var event: SyntheticEvent[Event, SyntheticFocusEvent[Element]]
  var value: String
}

object Anon_EventValueElement {
  @scala.inline
  def apply(event: SyntheticEvent[Event, SyntheticFocusEvent[Element]], value: String): Anon_EventValueElement = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EventValueElement]
  }
}

