package typingsSlinky.reactDnd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragDropManager extends js.Object {
  var dragDropManager: typingsSlinky.dndCore.interfacesMod.DragDropManager = js.native
}

object DragDropManager {
  @scala.inline
  def apply(dragDropManager: typingsSlinky.dndCore.interfacesMod.DragDropManager): DragDropManager = {
    val __obj = js.Dynamic.literal(dragDropManager = dragDropManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragDropManager]
  }
  @scala.inline
  implicit class DragDropManagerOps[Self <: DragDropManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDragDropManager(value: typingsSlinky.dndCore.interfacesMod.DragDropManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDropManager")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

