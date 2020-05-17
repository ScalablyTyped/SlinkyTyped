package typingsSlinky.reactDnd.anon

import typingsSlinky.reactDnd.dndProviderMod.DndProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Manager
  extends DndProviderProps[js.Any, js.Any] {
  var manager: typingsSlinky.dndCore.interfacesMod.DragDropManager = js.native
}

object Manager {
  @scala.inline
  def apply(manager: typingsSlinky.dndCore.interfacesMod.DragDropManager): Manager = {
    val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manager]
  }
  @scala.inline
  implicit class ManagerOps[Self <: Manager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManager(value: typingsSlinky.dndCore.interfacesMod.DragDropManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manager")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

