package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Combine extends js.Object {
  var draggableId: DraggableId = js.native
  var droppableId: DroppableId = js.native
}

object Combine {
  @scala.inline
  def apply(draggableId: DraggableId, droppableId: DroppableId): Combine = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], droppableId = droppableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Combine]
  }
  @scala.inline
  implicit class CombineOps[Self <: Combine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDraggableId(value: DraggableId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDroppableId(value: DroppableId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("droppableId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

