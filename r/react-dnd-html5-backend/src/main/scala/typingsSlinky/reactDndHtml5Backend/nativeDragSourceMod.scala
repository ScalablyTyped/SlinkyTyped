package typingsSlinky.reactDndHtml5Backend

import org.scalajs.dom.raw.DataTransfer
import typingsSlinky.dndCore.interfacesMod.DragDropMonitor
import typingsSlinky.reactDndHtml5Backend.nativeTypesConfigMod.NativeItemConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDragSourceMod {
  
  @JSImport("react-dnd-html5-backend/lib/NativeDragSources/NativeDragSource", "NativeDragSource")
  @js.native
  class NativeDragSource protected () extends StObject {
    def this(config: NativeItemConfig) = this()
    
    def beginDrag(): js.Any = js.native
    
    def canDrag(): Boolean = js.native
    
    var config: js.Any = js.native
    
    def endDrag(): Unit = js.native
    
    var initializeExposedProperties: js.Any = js.native
    
    def isDragging(monitor: DragDropMonitor, handle: String): Boolean = js.native
    
    var item: js.Any = js.native
    
    def loadDataTransfer(): Unit = js.native
    def loadDataTransfer(dataTransfer: DataTransfer): Unit = js.native
  }
}
