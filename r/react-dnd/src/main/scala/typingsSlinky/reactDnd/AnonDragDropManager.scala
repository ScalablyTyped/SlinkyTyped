package typingsSlinky.reactDnd

import typingsSlinky.dndCore.interfacesMod.DragDropManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDragDropManager extends js.Object {
  var dragDropManager: DragDropManager = js.native
}

object AnonDragDropManager {
  @scala.inline
  def apply(dragDropManager: DragDropManager): AnonDragDropManager = {
    val __obj = js.Dynamic.literal(dragDropManager = dragDropManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDragDropManager]
  }
  @scala.inline
  implicit class AnonDragDropManagerOps[Self <: AnonDragDropManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDragDropManager(value: DragDropManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDropManager")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

