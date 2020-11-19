package typingsSlinky.agGrid

import typingsSlinky.agGrid.columnGroupMod.ColumnGroup
import typingsSlinky.agGrid.componentMod.Component
import typingsSlinky.agGrid.dragAndDropServiceMod.DragItem
import typingsSlinky.agGrid.dragAndDropServiceMod.DropTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/headerRendering/headerGroup/headerGroupWrapperComp", JSImport.Namespace)
@js.native
object headerGroupWrapperCompMod extends js.Object {
  
  @js.native
  class HeaderGroupWrapperComp protected () extends Component {
    def this(columnGroup: ColumnGroup, dragSourceDropTarget: DropTarget, pinned: String) = this()
    
    /* private */ def addAttributes(): js.Any = js.native
    
    /* private */ def addClasses(): js.Any = js.native
    
    /* private */ def addListenersToChildrenColumns(): js.Any = js.native
    
    /* private */ def afterHeaderCompCreated(displayName: js.Any, headerGroupComp: js.Any): js.Any = js.native
    
    /* private */ def appendHeaderGroupComp(displayName: js.Any): js.Any = js.native
    
    var beans: js.Any = js.native
    
    var childColumnsDestroyFuncs: js.Any = js.native
    
    var columnApi: js.Any = js.native
    
    var columnController: js.Any = js.native
    
    val columnGroup: js.Any = js.native
    
    var componentRecipes: js.Any = js.native
    
    var context: js.Any = js.native
    
    /* private */ def destroyListenersOnChildrenColumns(): js.Any = js.native
    
    var dragAndDropService: js.Any = js.native
    
    val dragSourceDropTarget: js.Any = js.native
    
    var eHeaderCellResize: js.Any = js.native
    
    def getDragItemForGroup(): DragItem = js.native
    
    var gridApi: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    var horizontalResizeService: js.Any = js.native
    
    /* private */ def isSuppressMoving(): js.Any = js.native
    
    /* private */ def normaliseDragChange(dragChange: js.Any): js.Any = js.native
    
    /* private */ def onColumnMovingChanged(): js.Any = js.native
    
    /* private */ def onDisplayedChildrenChanged(): js.Any = js.native
    
    def onResizeStart(shiftKey: Boolean): Unit = js.native
    
    def onResizing(finished: Boolean, resizeAmount: js.Any): Unit = js.native
    
    /* private */ def onWidthChanged(): js.Any = js.native
    
    val pinned: js.Any = js.native
    
    /* private */ def postConstruct(): js.Any = js.native
    
    var resizeCols: js.Any = js.native
    
    var resizeRatios: js.Any = js.native
    
    var resizeStartWidth: js.Any = js.native
    
    var resizeTakeFromCols: js.Any = js.native
    
    var resizeTakeFromRatios: js.Any = js.native
    
    var resizeTakeFromStartWidth: js.Any = js.native
    
    /* private */ def setupMove(eHeaderGroup: js.Any, displayName: js.Any): js.Any = js.native
    
    /* private */ def setupMovingCss(): js.Any = js.native
    
    /* private */ def setupResize(): js.Any = js.native
    
    /* private */ def setupTooltip(): js.Any = js.native
    
    /* private */ def setupWidth(): js.Any = js.native
  }
  /* static members */
  @js.native
  object HeaderGroupWrapperComp extends js.Object {
    
    var TEMPLATE: js.Any = js.native
  }
}
