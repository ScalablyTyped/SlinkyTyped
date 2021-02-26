package typingsSlinky.reactDnd

import typingsSlinky.dndCore.interfacesMod.DragDropManager
import typingsSlinky.dndCore.interfacesMod.Identifier
import typingsSlinky.dndCore.interfacesMod.Listener
import typingsSlinky.dndCore.interfacesMod.Unsubscribe
import typingsSlinky.reactDnd.anon.Shallow
import typingsSlinky.reactDnd.monitorsMod.DragSourceMonitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragSourceMonitorImplMod {
  
  @JSImport("react-dnd/lib/common/DragSourceMonitorImpl", "DragSourceMonitorImpl")
  @js.native
  class DragSourceMonitorImpl protected () extends DragSourceMonitor {
    def this(manager: DragDropManager) = this()
    
    def canDragSource(sourceId: Identifier): Boolean = js.native
    
    def canDropOnTarget(targetId: Identifier): Boolean = js.native
    
    def getSourceId(): Identifier | Null = js.native
    
    var internalMonitor: js.Any = js.native
    
    def isDraggingSource(sourceId: Identifier): Boolean = js.native
    
    def isOverTarget(targetId: Identifier): Boolean = js.native
    def isOverTarget(targetId: Identifier, options: Shallow): Boolean = js.native
    
    def isSourcePublic(): Boolean | Null = js.native
    
    var sourceId: js.Any = js.native
    
    def subscribeToOffsetChange(listener: Listener): Unsubscribe = js.native
  }
}
