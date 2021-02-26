package typingsSlinky.agGrid

import typingsSlinky.agGrid.beanStubMod.BeanStub
import typingsSlinky.agGrid.contextMod.Context
import typingsSlinky.agGrid.eventsMod.AgEvent
import typingsSlinky.agGrid.rowNodeCacheMod.RowNodeCacheParams
import typingsSlinky.agGrid.rowNodeMod.RowNode
import typingsSlinky.agGrid.rowRendererMod.RowRenderer
import typingsSlinky.agGrid.utilsMod.NumberSequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rowNodeBlockMod {
  
  @JSImport("ag-grid/dist/lib/rowModels/cache/rowNodeBlock", "RowNodeBlock")
  @js.native
  abstract class RowNodeBlock protected () extends BeanStub {
    protected def this(blockNumber: Double, rowNodeCacheParams: RowNodeCacheParams) = this()
    
    var beans: js.Any = js.native
    
    val blockNumber: js.Any = js.native
    
    /* protected */ def createBlankRowNode(rowIndex: Double): RowNode = js.native
    
    /* protected */ def createRowNodes(): Unit = js.native
    
    val endRow: js.Any = js.native
    
    /* private */ def forEachNode(callback: js.Any, sequence: js.Any, rowCount: js.Any, deep: js.Any): js.Any = js.native
    
    /* private */ def forEachNodeCallback(callback: js.Any, rowCount: js.Any): js.Any = js.native
    
    def forEachNodeDeep(
      callback: js.Function2[/* rowNode */ RowNode, /* index */ Double, Unit],
      sequence: NumberSequence,
      rowCount: Double
    ): Unit = js.native
    
    def forEachNodeShallow(
      callback: js.Function2[/* rowNode */ RowNode, /* index */ Double, Unit],
      sequence: NumberSequence,
      rowCount: Double
    ): Unit = js.native
    
    def getBlockNumber(): Double = js.native
    
    def getEndRow(): Double = js.native
    
    def getLastAccessed(): Double = js.native
    
    def getNodeIdPrefix(): String = js.native
    
    def getRow(displayIndex: Double): RowNode = js.native
    
    def getRowUsingLocalIndex(rowIndex: Double): RowNode = js.native
    def getRowUsingLocalIndex(rowIndex: Double, dontTouchLastAccessed: Boolean): RowNode = js.native
    
    def getStartRow(): Double = js.native
    
    def getState(): String = js.native
    
    def getVersion(): Double = js.native
    
    /* protected */ def init(beans: RowNodeBlockBeans): Unit = js.native
    
    def isAnyNodeOpen(rowCount: Double): Boolean = js.native
    
    var lastAccessed: js.Any = js.native
    
    def load(): Unit = js.native
    
    /* protected */ def loadFromDatasource(): Unit = js.native
    
    /* protected */ def pageLoadFailed(): Unit = js.native
    
    /* protected */ def pageLoaded(version: Double, rows: js.Array[_], lastRow: Double): Unit = js.native
    
    /* private */ def populateWithRowData(rows: js.Any): js.Any = js.native
    
    var rowNodeCacheParams: js.Any = js.native
    
    var rowNodes: js.Array[RowNode] = js.native
    
    def setBlankRowNode(rowIndex: Double): RowNode = js.native
    
    /* protected */ def setDataAndId(rowNode: RowNode, data: js.Any, index: Double): Unit = js.native
    
    def setDirty(): Unit = js.native
    
    def setDirtyAndPurge(): Unit = js.native
    
    def setNewData(rowIndex: Double, dataItem: js.Any): RowNode = js.native
    
    def setRowNode(rowIndex: Double, rowNode: RowNode): Unit = js.native
    
    val startRow: js.Any = js.native
    
    var state: js.Any = js.native
    
    var version: js.Any = js.native
  }
  /* static members */
  object RowNodeBlock {
    
    @JSImport("ag-grid/dist/lib/rowModels/cache/rowNodeBlock", "RowNodeBlock")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/rowModels/cache/rowNodeBlock", "RowNodeBlock.EVENT_LOAD_COMPLETE")
    @js.native
    def EVENT_LOAD_COMPLETE: String = js.native
    @scala.inline
    def EVENT_LOAD_COMPLETE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_LOAD_COMPLETE")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/rowModels/cache/rowNodeBlock", "RowNodeBlock.STATE_DIRTY")
    @js.native
    def STATE_DIRTY: String = js.native
    @scala.inline
    def STATE_DIRTY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_DIRTY")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/rowModels/cache/rowNodeBlock", "RowNodeBlock.STATE_FAILED")
    @js.native
    def STATE_FAILED: String = js.native
    @scala.inline
    def STATE_FAILED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_FAILED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/rowModels/cache/rowNodeBlock", "RowNodeBlock.STATE_LOADED")
    @js.native
    def STATE_LOADED: String = js.native
    @scala.inline
    def STATE_LOADED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_LOADED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/rowModels/cache/rowNodeBlock", "RowNodeBlock.STATE_LOADING")
    @js.native
    def STATE_LOADING: String = js.native
    @scala.inline
    def STATE_LOADING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STATE_LOADING")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait LoadCompleteEvent extends AgEvent {
    
    var lastRow: Double = js.native
    
    var page: RowNodeBlock = js.native
    
    var success: Boolean = js.native
  }
  object LoadCompleteEvent {
    
    @scala.inline
    def apply(lastRow: Double, page: RowNodeBlock, success: Boolean, `type`: String): LoadCompleteEvent = {
      val __obj = js.Dynamic.literal(lastRow = lastRow.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadCompleteEvent]
    }
    
    @scala.inline
    implicit class LoadCompleteEventMutableBuilder[Self <: LoadCompleteEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLastRow(value: Double): Self = StObject.set(x, "lastRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPage(value: RowNodeBlock): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RowNodeBlockBeans extends StObject {
    
    var context: Context = js.native
    
    var rowRenderer: RowRenderer = js.native
  }
  object RowNodeBlockBeans {
    
    @scala.inline
    def apply(context: Context, rowRenderer: RowRenderer): RowNodeBlockBeans = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], rowRenderer = rowRenderer.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowNodeBlockBeans]
    }
    
    @scala.inline
    implicit class RowNodeBlockBeansMutableBuilder[Self <: RowNodeBlockBeans] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowRenderer(value: RowRenderer): Self = StObject.set(x, "rowRenderer", value.asInstanceOf[js.Any])
    }
  }
}
