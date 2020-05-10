package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Critical extends js.Object {
  var draggable: DraggableDescriptor = js.native
  var droppable: DroppableDescriptor = js.native
}

object Critical {
  @scala.inline
  def apply(draggable: DraggableDescriptor, droppable: DroppableDescriptor): Critical = {
    val __obj = js.Dynamic.literal(draggable = draggable.asInstanceOf[js.Any], droppable = droppable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Critical]
  }
  @scala.inline
  implicit class CriticalOps[Self <: Critical] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDraggable(value: DraggableDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDroppable(value: DroppableDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("droppable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

