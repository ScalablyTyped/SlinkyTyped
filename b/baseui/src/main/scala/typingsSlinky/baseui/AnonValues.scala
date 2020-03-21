package typingsSlinky.baseui

import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValues extends js.Object {
  var event: SyntheticEvent[EventTarget with HTMLInputElement, Event_]
  var values: js.Array[String]
}

object AnonValues {
  @scala.inline
  def apply(event: SyntheticEvent[EventTarget with HTMLInputElement, Event_], values: js.Array[String]): AnonValues = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValues]
  }
}

