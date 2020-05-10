package typingsSlinky.dndCore.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragDropManager extends js.Object {
  def dispatch(action: js.Any): Unit = js.native
  def getActions(): DragDropActions = js.native
  def getBackend(): Backend = js.native
  def getMonitor(): DragDropMonitor = js.native
  def getRegistry(): HandlerRegistry = js.native
}

object DragDropManager {
  @scala.inline
  def apply(
    dispatch: js.Any => Unit,
    getActions: () => DragDropActions,
    getBackend: () => Backend,
    getMonitor: () => DragDropMonitor,
    getRegistry: () => HandlerRegistry
  ): DragDropManager = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), getActions = js.Any.fromFunction0(getActions), getBackend = js.Any.fromFunction0(getBackend), getMonitor = js.Any.fromFunction0(getMonitor), getRegistry = js.Any.fromFunction0(getRegistry))
    __obj.asInstanceOf[DragDropManager]
  }
  @scala.inline
  implicit class DragDropManagerOps[Self <: DragDropManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDispatch(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetActions(value: () => DragDropActions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBackend(value: () => Backend): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBackend")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMonitor(value: () => DragDropMonitor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMonitor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRegistry(value: () => HandlerRegistry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRegistry")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

