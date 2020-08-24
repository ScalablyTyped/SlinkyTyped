package typingsSlinky.reactInfiniteCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangedSelection extends js.Object {
  var end: js.Date = js.native
  var eventType: EVENT_TYPE = js.native
  var start: js.Date = js.native
}

object RangedSelection {
  @scala.inline
  def apply(end: js.Date, eventType: EVENT_TYPE, start: js.Date): RangedSelection = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangedSelection]
  }
  @scala.inline
  implicit class RangedSelectionOps[Self <: RangedSelection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnd(value: js.Date): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventType(value: EVENT_TYPE): Self = this.set("eventType", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: js.Date): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

