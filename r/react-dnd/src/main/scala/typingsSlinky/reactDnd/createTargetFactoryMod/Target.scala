package typingsSlinky.reactDnd.createTargetFactoryMod

import typingsSlinky.dndCore.interfacesMod.DragDropMonitor
import typingsSlinky.dndCore.interfacesMod.DropTarget
import typingsSlinky.dndCore.interfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Target extends DropTarget {
  def receiveMonitor(monitor: js.Any): Unit = js.native
  def receiveProps(props: js.Any): Unit = js.native
}

object Target {
  @scala.inline
  def apply(
    canDrop: (DragDropMonitor, Identifier) => Boolean,
    drop: (DragDropMonitor, Identifier) => js.Any,
    hover: (DragDropMonitor, Identifier) => Unit,
    receiveMonitor: js.Any => Unit,
    receiveProps: js.Any => Unit
  ): Target = {
    val __obj = js.Dynamic.literal(canDrop = js.Any.fromFunction2(canDrop), drop = js.Any.fromFunction2(drop), hover = js.Any.fromFunction2(hover), receiveMonitor = js.Any.fromFunction1(receiveMonitor), receiveProps = js.Any.fromFunction1(receiveProps))
    __obj.asInstanceOf[Target]
  }
  @scala.inline
  implicit class TargetOps[Self <: Target] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReceiveMonitor(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiveMonitor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReceiveProps(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiveProps")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

