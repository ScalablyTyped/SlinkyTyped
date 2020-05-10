package typingsSlinky.atlaskitTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeDraggableProps extends js.Object {
  // used for shared global styles
  var `data-react-beautiful-dnd-draggable`: String = js.native
  // Props that can be spread onto the element directly
  // inline style
  var style: js.UndefOr[TreeDraggableStyle] = js.native
}

object TreeDraggableProps {
  @scala.inline
  def apply(`data-react-beautiful-dnd-draggable`: String): TreeDraggableProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data-react-beautiful-dnd-draggable")(`data-react-beautiful-dnd-draggable`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeDraggableProps]
  }
  @scala.inline
  implicit class TreeDraggablePropsOps[Self <: TreeDraggableProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withData-react-beautiful-dnd-draggable`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data-react-beautiful-dnd-draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: TreeDraggableStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

