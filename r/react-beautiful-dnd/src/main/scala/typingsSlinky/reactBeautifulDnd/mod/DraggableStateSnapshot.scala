package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraggableStateSnapshot extends js.Object {
  // a combine target is being dragged over by
  var combineTargetFor: js.UndefOr[DraggableId] = js.native
  // the id of a draggable that you are combining with
  var combineWith: js.UndefOr[DraggableId] = js.native
  var draggingOver: js.UndefOr[DroppableId] = js.native
  var dropAnimation: js.UndefOr[DropAnimation] = js.native
  var isDragging: Boolean = js.native
  var isDropAnimating: Boolean = js.native
  // What type of movement is being done: 'FLUID' or 'SNAP'
  var mode: js.UndefOr[MovementMode] = js.native
}

object DraggableStateSnapshot {
  @scala.inline
  def apply(isDragging: Boolean, isDropAnimating: Boolean): DraggableStateSnapshot = {
    val __obj = js.Dynamic.literal(isDragging = isDragging.asInstanceOf[js.Any], isDropAnimating = isDropAnimating.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableStateSnapshot]
  }
  @scala.inline
  implicit class DraggableStateSnapshotOps[Self <: DraggableStateSnapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDropAnimating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDropAnimating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCombineTargetFor(value: DraggableId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combineTargetFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCombineTargetFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combineTargetFor")(js.undefined)
        ret
    }
    @scala.inline
    def withCombineWith(value: DraggableId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combineWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCombineWith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combineWith")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggingOver(value: DroppableId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggingOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggingOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggingOver")(js.undefined)
        ret
    }
    @scala.inline
    def withDropAnimation(value: DropAnimation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: MovementMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
  }
  
}

