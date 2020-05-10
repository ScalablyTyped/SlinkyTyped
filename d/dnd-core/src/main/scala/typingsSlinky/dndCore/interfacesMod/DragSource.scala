package typingsSlinky.dndCore.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragSource extends js.Object {
  def beginDrag(monitor: DragDropMonitor, targetId: Identifier): Unit = js.native
  def canDrag(monitor: DragDropMonitor, targetId: Identifier): Boolean = js.native
  def endDrag(monitor: DragDropMonitor, targetId: Identifier): Unit = js.native
  def isDragging(monitor: DragDropMonitor, targetId: Identifier): Boolean = js.native
}

object DragSource {
  @scala.inline
  def apply(
    beginDrag: (DragDropMonitor, Identifier) => Unit,
    canDrag: (DragDropMonitor, Identifier) => Boolean,
    endDrag: (DragDropMonitor, Identifier) => Unit,
    isDragging: (DragDropMonitor, Identifier) => Boolean
  ): DragSource = {
    val __obj = js.Dynamic.literal(beginDrag = js.Any.fromFunction2(beginDrag), canDrag = js.Any.fromFunction2(canDrag), endDrag = js.Any.fromFunction2(endDrag), isDragging = js.Any.fromFunction2(isDragging))
    __obj.asInstanceOf[DragSource]
  }
  @scala.inline
  implicit class DragSourceOps[Self <: DragSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeginDrag(value: (DragDropMonitor, Identifier) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginDrag")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCanDrag(value: (DragDropMonitor, Identifier) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDrag")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEndDrag(value: (DragDropMonitor, Identifier) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDrag")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsDragging(value: (DragDropMonitor, Identifier) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDragging")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

