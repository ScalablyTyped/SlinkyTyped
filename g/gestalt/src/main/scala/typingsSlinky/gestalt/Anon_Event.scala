package typingsSlinky.gestalt

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event extends js.Object {
  var event: SyntheticEvent[Event, SyntheticMouseEvent[Element]]
}

object Anon_Event {
  @scala.inline
  def apply(event: SyntheticEvent[Event, SyntheticMouseEvent[Element]]): Anon_Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Event]
  }
}

