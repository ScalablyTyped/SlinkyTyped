package typingsSlinky.reactDnd

import typingsSlinky.dndCore.interfacesMod.DragDropManager
import typingsSlinky.reactDnd.monitorsMod.DropTargetMonitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-dnd/lib/common/DropTargetMonitorImpl", JSImport.Namespace)
@js.native
object dropTargetMonitorImplMod extends js.Object {
  
  @js.native
  class DropTargetMonitorImpl protected () extends DropTargetMonitor {
    def this(manager: DragDropManager) = this()
    
    var internalMonitor: js.Any = js.native
    
    var targetId: js.Any = js.native
  }
}
