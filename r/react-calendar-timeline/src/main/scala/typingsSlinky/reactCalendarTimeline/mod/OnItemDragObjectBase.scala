package typingsSlinky.reactCalendarTimeline.mod

import typingsSlinky.reactCalendarTimeline.reactCalendarTimelineStrings.move
import typingsSlinky.reactCalendarTimeline.reactCalendarTimelineStrings.resize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnItemDragObjectBase extends js.Object {
  var eventType: move | resize = js.native
  var itemId: Id = js.native
  var time: Double = js.native
}

object OnItemDragObjectBase {
  @scala.inline
  def apply(eventType: move | resize, itemId: Id, time: Double): OnItemDragObjectBase = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnItemDragObjectBase]
  }
  @scala.inline
  implicit class OnItemDragObjectBaseOps[Self <: OnItemDragObjectBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventType(value: move | resize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

