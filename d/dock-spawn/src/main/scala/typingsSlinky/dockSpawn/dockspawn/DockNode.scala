package typingsSlinky.dockSpawn.dockspawn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DockNode extends js.Object {
  def detachFromParent(): Unit = js.native
}

object DockNode {
  @scala.inline
  def apply(detachFromParent: () => Unit): DockNode = {
    val __obj = js.Dynamic.literal(detachFromParent = js.Any.fromFunction0(detachFromParent))
    __obj.asInstanceOf[DockNode]
  }
  @scala.inline
  implicit class DockNodeOps[Self <: DockNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetachFromParent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detachFromParent")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

