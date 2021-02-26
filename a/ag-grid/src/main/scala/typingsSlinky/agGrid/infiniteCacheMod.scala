package typingsSlinky.agGrid

import typingsSlinky.agGrid.iDatasourceMod.IDatasource
import typingsSlinky.agGrid.infiniteBlockMod.InfiniteBlock
import typingsSlinky.agGrid.rowNodeBlockLoaderMod.RowNodeBlockLoader
import typingsSlinky.agGrid.rowNodeCacheMod.RowNodeCache
import typingsSlinky.agGrid.rowNodeCacheMod.RowNodeCacheParams
import typingsSlinky.agGrid.rowNodeMod.RowNode
import typingsSlinky.agGrid.utilsMod.NumberSequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infiniteCacheMod {
  
  @JSImport("ag-grid/dist/lib/rowModels/infinite/infiniteCache", "InfiniteCache")
  @js.native
  class InfiniteCache protected () extends RowNodeCache[InfiniteBlock, InfiniteCacheParams] {
    def this(params: InfiniteCacheParams) = this()
    
    var columnApi: js.Any = js.native
    
    var context: js.Any = js.native
    
    /* private */ def createBlock(blockNumber: js.Any): js.Any = js.native
    
    var eventService: js.Any = js.native
    
    def getRow(rowIndex: Double, dontCreatePage: Boolean): RowNode = js.native
    
    var gridApi: js.Any = js.native
    
    /* private */ def insertItems(block: js.Any, indexToInsert: js.Any, items: js.Any): js.Any = js.native
    
    def insertItemsAtIndex(indexToInsert: Double, items: js.Array[_]): Unit = js.native
    
    /* private */ def moveItemsDown(block: js.Any, moveFromIndex: js.Any, moveCount: js.Any): js.Any = js.native
    
    def refreshCache(): Unit = js.native
    
    /* private */ def setBeans(loggerFactory: js.Any): js.Any = js.native
  }
  
  @js.native
  trait InfiniteCacheParams extends RowNodeCacheParams {
    
    var datasource: IDatasource = js.native
  }
  object InfiniteCacheParams {
    
    @scala.inline
    def apply(
      blockSize: Double,
      datasource: IDatasource,
      dynamicRowHeight: Boolean,
      filterModel: js.Any,
      initialRowCount: Double,
      lastAccessedSequence: NumberSequence,
      maxBlocksInCache: Double,
      maxConcurrentRequests: Double,
      overflowSize: Double,
      rowHeight: Double,
      rowNodeBlockLoader: RowNodeBlockLoader,
      sortModel: js.Any
    ): InfiniteCacheParams = {
      val __obj = js.Dynamic.literal(blockSize = blockSize.asInstanceOf[js.Any], datasource = datasource.asInstanceOf[js.Any], dynamicRowHeight = dynamicRowHeight.asInstanceOf[js.Any], filterModel = filterModel.asInstanceOf[js.Any], initialRowCount = initialRowCount.asInstanceOf[js.Any], lastAccessedSequence = lastAccessedSequence.asInstanceOf[js.Any], maxBlocksInCache = maxBlocksInCache.asInstanceOf[js.Any], maxConcurrentRequests = maxConcurrentRequests.asInstanceOf[js.Any], overflowSize = overflowSize.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], rowNodeBlockLoader = rowNodeBlockLoader.asInstanceOf[js.Any], sortModel = sortModel.asInstanceOf[js.Any])
      __obj.asInstanceOf[InfiniteCacheParams]
    }
    
    @scala.inline
    implicit class InfiniteCacheParamsMutableBuilder[Self <: InfiniteCacheParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatasource(value: IDatasource): Self = StObject.set(x, "datasource", value.asInstanceOf[js.Any])
    }
  }
}
