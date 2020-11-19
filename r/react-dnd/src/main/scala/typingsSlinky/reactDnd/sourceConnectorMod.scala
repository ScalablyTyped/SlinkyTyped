package typingsSlinky.reactDnd

import typingsSlinky.dndCore.interfacesMod.Backend
import typingsSlinky.dndCore.interfacesMod.Identifier
import typingsSlinky.reactDnd.optionsMod.DragPreviewOptions
import typingsSlinky.reactDnd.optionsMod.DragSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-dnd/lib/common/SourceConnector", JSImport.Namespace)
@js.native
object sourceConnectorMod extends js.Object {
  
  @js.native
  trait Connector extends js.Object {
    
    var connectTarget: js.Any = js.native
    
    var hooks: js.Any = js.native
    
    def receiveHandlerId(): Unit = js.native
    def receiveHandlerId(handlerId: Identifier): Unit = js.native
    
    def reconnect(): Unit = js.native
  }
  
  @js.native
  class SourceConnector protected () extends Connector {
    def this(backend: Backend) = this()
    
    val backend: js.Any = js.native
    
    var clearDragPreview: js.Any = js.native
    
    var clearDragSource: js.Any = js.native
    
    @JSName("connectTarget")
    def connectTarget_MSourceConnector: js.Any = js.native
    
    var didConnectedDragPreviewChange: js.Any = js.native
    
    var didConnectedDragSourceChange: js.Any = js.native
    
    var didDragPreviewOptionsChange: js.Any = js.native
    
    var didDragSourceOptionsChange: js.Any = js.native
    
    var didHandlerIdChange: js.Any = js.native
    
    var disconnectDragPreview: js.Any = js.native
    
    var disconnectDragSource: js.Any = js.native
    
    /* private */ def dragPreview: js.Any = js.native
    
    var dragPreviewNode: js.Any = js.native
    
    def dragPreviewOptions: DragPreviewOptions | Null = js.native
    
    var dragPreviewOptionsInternal: js.Any = js.native
    
    def dragPreviewOptions_=(options: DragPreviewOptions | Null): Unit = js.native
    
    var dragPreviewRef: js.Any = js.native
    
    var dragPreviewUnsubscribe: js.Any = js.native
    
    /* private */ def dragSource: js.Any = js.native
    
    var dragSourceNode: js.Any = js.native
    
    def dragSourceOptions: DragSourceOptions | Null = js.native
    
    var dragSourceOptionsInternal: js.Any = js.native
    
    def dragSourceOptions_=(options: DragSourceOptions | Null): Unit = js.native
    
    var dragSourceRef: js.Any = js.native
    
    var dragSourceUnsubscribe: js.Any = js.native
    
    var handlerId: js.Any = js.native
    
    var lastConnectedDragPreview: js.Any = js.native
    
    var lastConnectedDragPreviewOptions: js.Any = js.native
    
    var lastConnectedDragSource: js.Any = js.native
    
    var lastConnectedDragSourceOptions: js.Any = js.native
    
    var lastConnectedHandlerId: js.Any = js.native
    
    var reconnectDragPreview: js.Any = js.native
    
    var reconnectDragSource: js.Any = js.native
  }
}
