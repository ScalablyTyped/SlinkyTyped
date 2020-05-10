package typingsSlinky.reactSortableTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaceholderRendererProps extends js.Object {
  var canDrop: Boolean = js.native
  var draggedNode: TreeItem = js.native
  var isOver: Boolean = js.native
}

object PlaceholderRendererProps {
  @scala.inline
  def apply(canDrop: Boolean, draggedNode: TreeItem, isOver: Boolean): PlaceholderRendererProps = {
    val __obj = js.Dynamic.literal(canDrop = canDrop.asInstanceOf[js.Any], draggedNode = draggedNode.asInstanceOf[js.Any], isOver = isOver.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceholderRendererProps]
  }
  @scala.inline
  implicit class PlaceholderRendererPropsOps[Self <: PlaceholderRendererProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDraggedNode(value: TreeItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggedNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOver")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

