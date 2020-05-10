package typingsSlinky.reactBeautifulDnd.mod

import typingsSlinky.react.mod.DragEvent
import typingsSlinky.react.mod.DragEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraggableProvidedDragHandleProps extends js.Object {
  var `aria-labelledby`: ElementId = js.native
  var `data-rbd-drag-handle-context-id`: ContextId = js.native
  var `data-rbd-drag-handle-draggable-id`: DraggableId = js.native
  var draggable: Boolean = js.native
  var onDragStart: DragEventHandler[_] = js.native
  var tabIndex: Double = js.native
}

object DraggableProvidedDragHandleProps {
  @scala.inline
  def apply(
    `aria-labelledby`: ElementId,
    `data-rbd-drag-handle-context-id`: ContextId,
    `data-rbd-drag-handle-draggable-id`: DraggableId,
    draggable: Boolean,
    onDragStart: DragEvent[_] => Unit,
    tabIndex: Double
  ): DraggableProvidedDragHandleProps = {
    val __obj = js.Dynamic.literal(draggable = draggable.asInstanceOf[js.Any], onDragStart = js.Any.fromFunction1(onDragStart), tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-rbd-drag-handle-context-id")(`data-rbd-drag-handle-context-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-rbd-drag-handle-draggable-id")(`data-rbd-drag-handle-draggable-id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableProvidedDragHandleProps]
  }
  @scala.inline
  implicit class DraggableProvidedDragHandlePropsOps[Self <: DraggableProvidedDragHandleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAria-labelledby`(value: ElementId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-labelledby")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withData-rbd-drag-handle-context-id`(value: ContextId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data-rbd-drag-handle-context-id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withData-rbd-drag-handle-draggable-id`(value: DraggableId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data-rbd-drag-handle-draggable-id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDragStart(value: DragEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

