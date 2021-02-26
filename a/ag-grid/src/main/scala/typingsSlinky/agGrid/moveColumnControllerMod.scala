package typingsSlinky.agGrid

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.bodyDropTargetMod.DropListener
import typingsSlinky.agGrid.columnMod.Column
import typingsSlinky.agGrid.dragAndDropServiceMod.DraggingEvent
import typingsSlinky.agGrid.eventsMod.ColumnEventType
import typingsSlinky.agGrid.gridPanelMod.GridPanel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moveColumnControllerMod {
  
  @JSImport("ag-grid/dist/lib/headerRendering/moveColumnController", "MoveColumnController")
  @js.native
  class MoveColumnController protected () extends DropListener {
    def this(pinned: String, eContainer: HTMLElement) = this()
    
    /* private */ def attemptMoveColumns(
      dragSourceType: js.Any,
      allMovingColumns: js.Any,
      hDirection: js.Any,
      xAdjusted: js.Any,
      fromEnter: js.Any
    ): js.Any = js.native
    
    /* private */ def calculateOldIndex(movingCols: js.Any): js.Any = js.native
    
    /* private */ def calculateValidMoves(movingCols: js.Any, draggingRight: js.Any, x: js.Any): js.Any = js.native
    
    var centerContainer: js.Any = js.native
    
    /* private */ def checkCenterForScrolling(xAdjustedForScroll: js.Any): js.Any = js.native
    
    var columnController: js.Any = js.native
    
    var dragAndDropService: js.Any = js.native
    
    var eContainer: js.Any = js.native
    
    /* private */ def ensureIntervalCleared(): js.Any = js.native
    
    /* private */ def ensureIntervalStarted(): js.Any = js.native
    
    var failedMoveAttempts: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    var gridPanel: js.Any = js.native
    
    def init(): Unit = js.native
    
    var intervalCount: js.Any = js.native
    
    /* private */ def isColumnHidden(displayedColumns: js.Any, col: js.Any): js.Any = js.native
    
    var lastDraggingEvent: js.Any = js.native
    
    var logger: js.Any = js.native
    
    var loggerFactory: js.Any = js.native
    
    /* private */ def moveInterval(): js.Any = js.native
    
    var movingIntervalId: js.Any = js.native
    
    var needToMoveLeft: js.Any = js.native
    
    var needToMoveRight: js.Any = js.native
    
    /* private */ def normaliseDirection(hDirection: js.Any): js.Any = js.native
    
    /* private */ def normaliseX(x: js.Any): js.Any = js.native
    
    def onDragStop(): Unit = js.native
    
    def onDragging(draggingEvent: DraggingEvent, fromEnter: Boolean): Unit = js.native
    
    var pinned: js.Any = js.native
    
    def registerGridComp(gridPanel: GridPanel): Unit = js.native
    
    def setColumnsPinned(columns: js.Array[Column], pinned: String): Unit = js.native
    def setColumnsPinned(columns: js.Array[Column], pinned: String, source: ColumnEventType): Unit = js.native
    
    def setColumnsVisible(columns: js.Array[Column], visible: Boolean): Unit = js.native
    def setColumnsVisible(columns: js.Array[Column], visible: Boolean, source: ColumnEventType): Unit = js.native
  }
}
