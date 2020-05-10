package typingsSlinky.reactSortableTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnDragStateChangedData extends js.Object {
  var draggedNode: TreeItem = js.native
  var isDragging: Boolean = js.native
}

object OnDragStateChangedData {
  @scala.inline
  def apply(draggedNode: TreeItem, isDragging: Boolean): OnDragStateChangedData = {
    val __obj = js.Dynamic.literal(draggedNode = draggedNode.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDragStateChangedData]
  }
  @scala.inline
  implicit class OnDragStateChangedDataOps[Self <: OnDragStateChangedData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDraggedNode(value: TreeItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggedNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDragging")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

