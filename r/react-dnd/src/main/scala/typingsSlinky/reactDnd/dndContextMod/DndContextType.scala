package typingsSlinky.reactDnd.dndContextMod

import typingsSlinky.dndCore.interfacesMod.DragDropManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DndContextType extends js.Object {
  var dragDropManager: js.UndefOr[DragDropManager] = js.native
}

object DndContextType {
  @scala.inline
  def apply(): DndContextType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DndContextType]
  }
  @scala.inline
  implicit class DndContextTypeOps[Self <: DndContextType] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutDragDropManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDropManager")(js.undefined)
        ret
    }
  }
  
}

