package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraggableDescriptor extends js.Object {
  // Inherited from Droppable
  var droppableId: DroppableId = js.native
  var id: DraggableId = js.native
  var index: Double = js.native
  // This is technically redundant but it avoids
  // needing to look up a parent droppable just to get its type
  var `type`: TypeId = js.native
}

object DraggableDescriptor {
  @scala.inline
  def apply(droppableId: DroppableId, id: DraggableId, index: Double, `type`: TypeId): DraggableDescriptor = {
    val __obj = js.Dynamic.literal(droppableId = droppableId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableDescriptor]
  }
  @scala.inline
  implicit class DraggableDescriptorOps[Self <: DraggableDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDroppableId(value: DroppableId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("droppableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: DraggableId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TypeId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

