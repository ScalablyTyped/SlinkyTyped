package typingsSlinky.reactCalendarTimeline.mod

import typingsSlinky.reactCalendarTimeline.reactCalendarTimelineStrings.move
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnItemDragObjectMove extends OnItemDragObjectBase {
  @JSName("eventType")
  var eventType_OnItemDragObjectMove: move = js.native
  var newGroupOrder: Double = js.native
}

object OnItemDragObjectMove {
  @scala.inline
  def apply(eventType: move, itemId: Id, newGroupOrder: Double, time: Double): OnItemDragObjectMove = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], newGroupOrder = newGroupOrder.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnItemDragObjectMove]
  }
  @scala.inline
  implicit class OnItemDragObjectMoveOps[Self <: OnItemDragObjectMove] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventType(value: move): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewGroupOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGroupOrder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

