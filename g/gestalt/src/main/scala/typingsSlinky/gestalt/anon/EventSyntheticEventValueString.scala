package typingsSlinky.gestalt.anon

import org.scalajs.dom.raw.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSyntheticEventValueString extends js.Object {
  var event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLInputElement] = js.native
  var value: String = js.native
}

object EventSyntheticEventValueString {
  @scala.inline
  def apply(event: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLInputElement], value: String): EventSyntheticEventValueString = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSyntheticEventValueString]
  }
  @scala.inline
  implicit class EventSyntheticEventValueStringOps[Self <: EventSyntheticEventValueString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, HTMLInputElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

