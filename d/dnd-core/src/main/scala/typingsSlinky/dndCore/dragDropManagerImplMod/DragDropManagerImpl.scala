package typingsSlinky.dndCore.dragDropManagerImplMod

import typingsSlinky.dndCore.interfacesMod.Backend
import typingsSlinky.dndCore.interfacesMod.DragDropActions
import typingsSlinky.dndCore.interfacesMod.DragDropManager
import typingsSlinky.dndCore.interfacesMod.DragDropMonitor
import typingsSlinky.dndCore.interfacesMod.HandlerRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragDropManagerImpl extends DragDropManager {
  var backend: js.Any = js.native
  var handleRefCountChange: js.Any = js.native
  var isSetUp: js.Any = js.native
  var monitor: js.Any = js.native
  var store: js.Any = js.native
  def receiveBackend(backend: Backend): Unit = js.native
}

object DragDropManagerImpl {
  @scala.inline
  def apply(
    backend: js.Any,
    dispatch: js.Any => Unit,
    getActions: () => DragDropActions,
    getBackend: () => Backend,
    getMonitor: () => DragDropMonitor,
    getRegistry: () => HandlerRegistry,
    handleRefCountChange: js.Any,
    isSetUp: js.Any,
    monitor: js.Any,
    receiveBackend: Backend => Unit,
    store: js.Any
  ): DragDropManagerImpl = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], dispatch = js.Any.fromFunction1(dispatch), getActions = js.Any.fromFunction0(getActions), getBackend = js.Any.fromFunction0(getBackend), getMonitor = js.Any.fromFunction0(getMonitor), getRegistry = js.Any.fromFunction0(getRegistry), handleRefCountChange = handleRefCountChange.asInstanceOf[js.Any], isSetUp = isSetUp.asInstanceOf[js.Any], monitor = monitor.asInstanceOf[js.Any], receiveBackend = js.Any.fromFunction1(receiveBackend), store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragDropManagerImpl]
  }
  @scala.inline
  implicit class DragDropManagerImplOps[Self <: DragDropManagerImpl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackend(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandleRefCountChange(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleRefCountChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSetUp(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSetUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonitor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceiveBackend(value: Backend => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receiveBackend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStore(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

