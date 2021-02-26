package typingsSlinky.agGrid

import typingsSlinky.agGrid.beanStubMod.BeanStub
import typingsSlinky.agGrid.clientSideRowModelMod.RowDataTransaction
import typingsSlinky.agGrid.iDatasourceMod.IDatasource
import typingsSlinky.agGrid.iRowModelMod.IRowModel
import typingsSlinky.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infiniteRowModelMod {
  
  @JSImport("ag-grid/dist/lib/rowModels/infinite/infiniteRowModel", "InfiniteRowModel")
  @js.native
  class InfiniteRowModel ()
    extends BeanStub
       with IRowModel {
    
    /* private */ def addEventListeners(): js.Any = js.native
    
    /* private */ def checkForDeprecated(): js.Any = js.native
    
    var columnApi: js.Any = js.native
    
    var context: js.Any = js.native
    
    /* private */ def createModelUpdatedEvent(): js.Any = js.native
    
    var datasource: js.Any = js.native
    
    /* private */ def destroyCache(): js.Any = js.native
    
    /* private */ def destroyDatasource(): js.Any = js.native
    
    var eventService: js.Any = js.native
    
    var filterManager: js.Any = js.native
    
    def forEachNode(callback: js.Function2[/* rowNode */ RowNode, /* index */ Double, Unit]): Unit = js.native
    
    def getBlockState(): js.Any = js.native
    
    def getVirtualRowCount(): Double = js.native
    
    var gridApi: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    var infiniteCache: js.Any = js.native
    
    def init(): Unit = js.native
    
    def isMaxRowFound(): Boolean = js.native
    
    /* private */ def onCacheUpdated(): js.Any = js.native
    
    /* private */ def onColumnEverything(): js.Any = js.native
    
    /* private */ def onFilterChanged(): js.Any = js.native
    
    /* private */ def onSortChanged(): js.Any = js.native
    
    def purgeCache(): Unit = js.native
    
    def refreshCache(): Unit = js.native
    
    /* private */ def reset(): js.Any = js.native
    
    /* private */ def resetCache(): js.Any = js.native
    
    var rowHeight: js.Any = js.native
    
    var rowNodeBlockLoader: js.Any = js.native
    
    var selectionController: js.Any = js.native
    
    def setDatasource(datasource: IDatasource): Unit = js.native
    
    def setVirtualRowCount(rowCount: Double): Unit = js.native
    def setVirtualRowCount(rowCount: Double, maxRowFound: Boolean): Unit = js.native
    
    var sortController: js.Any = js.native
    
    def updateRowData(transaction: RowDataTransaction): Unit = js.native
  }
}
