package typingsSlinky.dndCore.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropTarget extends js.Object {
  def canDrop(monitor: DragDropMonitor, targetId: Identifier): Boolean = js.native
  def drop(monitor: DragDropMonitor, targetId: Identifier): js.Any = js.native
  def hover(monitor: DragDropMonitor, targetId: Identifier): Unit = js.native
}

object DropTarget {
  @scala.inline
  def apply(
    canDrop: (DragDropMonitor, Identifier) => Boolean,
    drop: (DragDropMonitor, Identifier) => js.Any,
    hover: (DragDropMonitor, Identifier) => Unit
  ): DropTarget = {
    val __obj = js.Dynamic.literal(canDrop = js.Any.fromFunction2(canDrop), drop = js.Any.fromFunction2(drop), hover = js.Any.fromFunction2(hover))
    __obj.asInstanceOf[DropTarget]
  }
  @scala.inline
  implicit class DropTargetOps[Self <: DropTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanDrop(value: (DragDropMonitor, Identifier) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canDrop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDrop(value: (DragDropMonitor, Identifier) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHover(value: (DragDropMonitor, Identifier) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

