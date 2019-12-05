package typingsSlinky.gestalt

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventValueBoolean extends js.Object {
  var event: SyntheticEvent[Event, HTMLInputElement]
  var value: Boolean
}

object Anon_EventValueBoolean {
  @scala.inline
  def apply(event: SyntheticEvent[Event, HTMLInputElement], value: Boolean): Anon_EventValueBoolean = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EventValueBoolean]
  }
}

