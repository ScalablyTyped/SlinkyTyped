package typingsSlinky.agGrid

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.dragAndDropServiceMod.DraggingEvent
import typingsSlinky.agGrid.dragAndDropServiceMod.DropTarget
import typingsSlinky.agGrid.gridPanelMod.GridPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/gridPanel/rowDragFeature", JSImport.Namespace)
@js.native
object rowDragFeatureMod extends js.Object {
  
  @js.native
  class RowDragFeature protected () extends DropTarget {
    def this(eContainer: HTMLElement, gridPanel: GridPanel) = this()
    
    /* private */ def checkCenterForScrolling(pixel: js.Any): js.Any = js.native
    
    var clientSideRowModel: js.Any = js.native
    
    def dispatchEvent(`type`: String, draggingEvent: DraggingEvent): Unit = js.native
    
    /* private */ def doManagedDrag(draggingEvent: js.Any, pixel: js.Any): js.Any = js.native
    
    var dragAndDropService: js.Any = js.native
    
    var eContainer: js.Any = js.native
    
    /* private */ def ensureIntervalCleared(): js.Any = js.native
    
    /* private */ def ensureIntervalStarted(): js.Any = js.native
    
    var eventService: js.Any = js.native
    
    var focusedCellController: js.Any = js.native
    
    @JSName("getIconName")
    def getIconName_MRowDragFeature(): String = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    var gridPanel: js.Any = js.native
    
    var intervalCount: js.Any = js.native
    
    var lastDraggingEvent: js.Any = js.native
    
    /* private */ def moveInterval(): js.Any = js.native
    
    var movingIntervalId: js.Any = js.native
    
    var needToMoveDown: js.Any = js.native
    
    var needToMoveUp: js.Any = js.native
    
    /* private */ def normaliseForScroll(pixel: js.Any): js.Any = js.native
    
    @JSName("onDragEnter")
    def onDragEnter_MRowDragFeature(draggingEvent: DraggingEvent): Unit = js.native
    
    @JSName("onDragLeave")
    def onDragLeave_MRowDragFeature(draggingEvent: DraggingEvent): Unit = js.native
    
    @JSName("onDragStop")
    def onDragStop_MRowDragFeature(draggingEvent: DraggingEvent): Unit = js.native
    
    @JSName("onDragging")
    def onDragging_MRowDragFeature(draggingEvent: DraggingEvent): Unit = js.native
    
    /* private */ def onEnterOrDragging(draggingEvent: js.Any): js.Any = js.native
    
    /* private */ def postConstruct(): js.Any = js.native
    
    var rangeController: js.Any = js.native
    
    var rowModel: js.Any = js.native
    
    /* private */ def stopDragging(draggingEvent: js.Any): js.Any = js.native
  }
}
