package typingsSlinky.baseui

import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventItemAny extends js.Object {
  var event: SyntheticEvent[Event, _]
  var item: js.Any
}

object Anon_EventItemAny {
  @scala.inline
  def apply(event: SyntheticEvent[Event, _], item: js.Any): Anon_EventItemAny = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EventItemAny]
  }
}

