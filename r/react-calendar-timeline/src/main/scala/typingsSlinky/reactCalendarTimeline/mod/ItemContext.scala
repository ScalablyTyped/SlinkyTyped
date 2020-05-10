package typingsSlinky.reactCalendarTimeline.mod

import typingsSlinky.reactCalendarTimeline.AnonCollisionLeft
import typingsSlinky.reactCalendarTimeline.AnonX
import typingsSlinky.reactCalendarTimeline.reactCalendarTimelineStrings.left
import typingsSlinky.reactCalendarTimeline.reactCalendarTimelineStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemContext extends js.Object {
  var canMove: Boolean = js.native
  var canResizeLeft: Boolean = js.native
  var canResizeRight: Boolean = js.native
  var dimensions: AnonCollisionLeft = js.native
  var dragGroupDelta: Double = js.native
  var dragStart: AnonX = js.native
  var dragTime: Double = js.native
  var dragging: Boolean = js.native
  var resizeEdge: left | right = js.native
  var resizeStart: Double = js.native
  var resizeTime: Double = js.native
  var resizing: Boolean = js.native
  var selected: Boolean = js.native
  var title: String = js.native
  var useResizeHandle: Boolean = js.native
  var width: Boolean = js.native
}

object ItemContext {
  @scala.inline
  def apply(
    canMove: Boolean,
    canResizeLeft: Boolean,
    canResizeRight: Boolean,
    dimensions: AnonCollisionLeft,
    dragGroupDelta: Double,
    dragStart: AnonX,
    dragTime: Double,
    dragging: Boolean,
    resizeEdge: left | right,
    resizeStart: Double,
    resizeTime: Double,
    resizing: Boolean,
    selected: Boolean,
    title: String,
    useResizeHandle: Boolean,
    width: Boolean
  ): ItemContext = {
    val __obj = js.Dynamic.literal(canMove = canMove.asInstanceOf[js.Any], canResizeLeft = canResizeLeft.asInstanceOf[js.Any], canResizeRight = canResizeRight.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], dragGroupDelta = dragGroupDelta.asInstanceOf[js.Any], dragStart = dragStart.asInstanceOf[js.Any], dragTime = dragTime.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], resizeEdge = resizeEdge.asInstanceOf[js.Any], resizeStart = resizeStart.asInstanceOf[js.Any], resizeTime = resizeTime.asInstanceOf[js.Any], resizing = resizing.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], useResizeHandle = useResizeHandle.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemContext]
  }
  @scala.inline
  implicit class ItemContextOps[Self <: ItemContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanResizeLeft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canResizeLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanResizeRight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canResizeRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDimensions(value: AnonCollisionLeft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragGroupDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragGroupDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragStart(value: AnonX): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResizeEdge(value: left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeEdge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResizeStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResizeTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResizing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseResizeHandle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useResizeHandle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

