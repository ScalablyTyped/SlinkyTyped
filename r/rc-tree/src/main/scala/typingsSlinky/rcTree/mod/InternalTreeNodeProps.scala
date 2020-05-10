package typingsSlinky.rcTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalTreeNodeProps extends TreeNodeProps {
  var checked: Boolean = js.native
  var dragOver: Boolean = js.native
  var dragOverGapBottom: Boolean = js.native
  var dragOverGapTop: Boolean = js.native
  var eventKey: String = js.native
  var expanded: Boolean = js.native
  var halfChecked: Boolean = js.native
  var pos: String = js.native
  var selected: Boolean = js.native
}

object InternalTreeNodeProps {
  @scala.inline
  def apply(
    checked: Boolean,
    dragOver: Boolean,
    dragOverGapBottom: Boolean,
    dragOverGapTop: Boolean,
    eventKey: String,
    expanded: Boolean,
    halfChecked: Boolean,
    pos: String,
    selected: Boolean
  ): InternalTreeNodeProps = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], dragOver = dragOver.asInstanceOf[js.Any], dragOverGapBottom = dragOverGapBottom.asInstanceOf[js.Any], dragOverGapTop = dragOverGapTop.asInstanceOf[js.Any], eventKey = eventKey.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], halfChecked = halfChecked.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalTreeNodeProps]
  }
  @scala.inline
  implicit class InternalTreeNodePropsOps[Self <: InternalTreeNodeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragOver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragOverGapBottom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragOverGapBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragOverGapTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragOverGapTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHalfChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halfChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPos(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

