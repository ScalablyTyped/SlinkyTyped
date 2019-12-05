package typingsSlinky.atAtlaskitSingleDashSelect

import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event extends js.Object {
  var event: SyntheticEvent[Event, _]
  var isOpen: Boolean
}

object Anon_Event {
  @scala.inline
  def apply(event: SyntheticEvent[Event, _], isOpen: Boolean): Anon_Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Event]
  }
}

