package typingsSlinky.reactDnd

import typingsSlinky.dndCore.interfacesMod.DragDropManager
import typingsSlinky.dndCore.interfacesMod.Listener
import typingsSlinky.dndCore.interfacesMod.Unsubscribe
import typingsSlinky.reactDnd.anon.HandlerIds
import typingsSlinky.reactDnd.monitorsMod.DropTargetMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/common/DropTargetMonitorImpl", JSImport.Namespace)
@js.native
object dropTargetMonitorImplMod extends js.Object {
  @js.native
  class DropTargetMonitorImpl protected () extends DropTargetMonitor {
    def this(manager: DragDropManager) = this()
    var internalMonitor: js.Any = js.native
    var targetId: js.Any = js.native
    def subscribeToStateChange(listener: Listener, options: HandlerIds): Unsubscribe = js.native
  }
  
}

