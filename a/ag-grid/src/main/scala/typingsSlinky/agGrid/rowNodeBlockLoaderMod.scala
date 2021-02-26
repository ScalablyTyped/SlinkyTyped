package typingsSlinky.agGrid

import typingsSlinky.agGrid.rowNodeBlockMod.RowNodeBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rowNodeBlockLoaderMod {
  
  @JSImport("ag-grid/dist/lib/rowModels/cache/rowNodeBlockLoader", "RowNodeBlockLoader")
  @js.native
  class RowNodeBlockLoader protected () extends StObject {
    def this(maxConcurrentRequests: Double) = this()
    
    var active: js.Any = js.native
    
    var activeBlockLoadsCount: js.Any = js.native
    
    def addBlock(block: RowNodeBlock): Unit = js.native
    
    var blocks: js.Any = js.native
    
    def checkBlockToLoad(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def getBlockState(): js.Any = js.native
    
    def loadComplete(): Unit = js.native
    
    var logger: js.Any = js.native
    
    var maxConcurrentRequests: js.Any = js.native
    
    /* private */ def printCacheStatus(): js.Any = js.native
    
    def removeBlock(block: RowNodeBlock): Unit = js.native
    
    /* private */ def setBeans(loggerFactory: js.Any): js.Any = js.native
  }
}
