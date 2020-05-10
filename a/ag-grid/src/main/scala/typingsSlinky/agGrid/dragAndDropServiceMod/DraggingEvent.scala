package typingsSlinky.agGrid.dragAndDropServiceMod

import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraggingEvent extends js.Object {
  var dragItem: DragItem = js.native
  var dragSource: DragSource = js.native
  var event: MouseEvent = js.native
  var fromNudge: Boolean = js.native
  var hDirection: HDirection = js.native
  var vDirection: VDirection = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object DraggingEvent {
  @scala.inline
  def apply(
    dragItem: DragItem,
    dragSource: DragSource,
    event: MouseEvent,
    fromNudge: Boolean,
    hDirection: HDirection,
    vDirection: VDirection,
    x: Double,
    y: Double
  ): DraggingEvent = {
    val __obj = js.Dynamic.literal(dragItem = dragItem.asInstanceOf[js.Any], dragSource = dragSource.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], fromNudge = fromNudge.asInstanceOf[js.Any], hDirection = hDirection.asInstanceOf[js.Any], vDirection = vDirection.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggingEvent]
  }
  @scala.inline
  implicit class DraggingEventOps[Self <: DraggingEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDragItem(value: DragItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragSource(value: DragSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromNudge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromNudge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHDirection(value: HDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVDirection(value: VDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

