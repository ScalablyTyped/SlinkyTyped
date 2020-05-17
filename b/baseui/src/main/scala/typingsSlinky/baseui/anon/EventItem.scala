package typingsSlinky.baseui.anon

import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventItem extends js.Object {
  var event: SyntheticEvent[org.scalajs.dom.raw.Event, _] = js.native
  var item: js.Any = js.native
}

object EventItem {
  @scala.inline
  def apply(event: SyntheticEvent[org.scalajs.dom.raw.Event, _], item: js.Any): EventItem = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
  @scala.inline
  implicit class EventItemOps[Self <: EventItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: SyntheticEvent[org.scalajs.dom.raw.Event, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

