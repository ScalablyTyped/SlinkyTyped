package typingsSlinky.reactDnd

import typingsSlinky.dndCore.interfacesMod.DragDropManager
import typingsSlinky.reactDnd.dndProviderMod.DndProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonManager
  extends DndProviderProps[js.Any, js.Any] {
  var manager: DragDropManager = js.native
}

object AnonManager {
  @scala.inline
  def apply(manager: DragDropManager): AnonManager = {
    val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonManager]
  }
  @scala.inline
  implicit class AnonManagerOps[Self <: AnonManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManager(value: DragDropManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manager")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

