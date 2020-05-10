package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DroppableStateSnapshot extends js.Object {
  var draggingFromThisWith: js.UndefOr[DraggableId] = js.native
  var draggingOverWith: js.UndefOr[DraggableId] = js.native
  var isDraggingOver: Boolean = js.native
  var isUsingPlaceholder: Boolean = js.native
}

object DroppableStateSnapshot {
  @scala.inline
  def apply(isDraggingOver: Boolean, isUsingPlaceholder: Boolean): DroppableStateSnapshot = {
    val __obj = js.Dynamic.literal(isDraggingOver = isDraggingOver.asInstanceOf[js.Any], isUsingPlaceholder = isUsingPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableStateSnapshot]
  }
  @scala.inline
  implicit class DroppableStateSnapshotOps[Self <: DroppableStateSnapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsDraggingOver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDraggingOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsUsingPlaceholder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUsingPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDraggingFromThisWith(value: DraggableId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggingFromThisWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggingFromThisWith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggingFromThisWith")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggingOverWith(value: DraggableId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggingOverWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggingOverWith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggingOverWith")(js.undefined)
        ret
    }
  }
  
}

