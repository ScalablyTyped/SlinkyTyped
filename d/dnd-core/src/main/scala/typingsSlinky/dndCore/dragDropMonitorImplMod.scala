package typingsSlinky.dndCore

import typingsSlinky.dndCore.anon.HandlerIds
import typingsSlinky.dndCore.anon.Shallow
import typingsSlinky.dndCore.interfacesMod.DragDropMonitor
import typingsSlinky.dndCore.interfacesMod.HandlerRegistry
import typingsSlinky.dndCore.interfacesMod.Listener
import typingsSlinky.dndCore.interfacesMod.Unsubscribe
import typingsSlinky.dndCore.reducersMod.State
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core/lib/DragDropMonitorImpl", JSImport.Namespace)
@js.native
object dragDropMonitorImplMod extends js.Object {
  @js.native
  trait DragDropMonitorImpl extends DragDropMonitor {
    val registry: HandlerRegistry = js.native
    var store: js.Any = js.native
    def canDragSource(sourceId: String): Boolean = js.native
    def canDropOnTarget(targetId: String): Boolean = js.native
    def isDraggingSource(sourceId: String): Boolean = js.native
    def isOverTarget(targetId: String): Boolean = js.native
    def isOverTarget(targetId: String, options: Shallow): Boolean = js.native
    def subscribeToStateChange(listener: Listener, options: HandlerIds): Unsubscribe = js.native
  }
  
  @js.native
  class default protected () extends DragDropMonitorImpl {
    def this(store: Store[State, AnyAction], registry: HandlerRegistry) = this()
  }
  
}

