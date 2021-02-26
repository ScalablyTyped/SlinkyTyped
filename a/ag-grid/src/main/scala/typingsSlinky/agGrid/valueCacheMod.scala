package typingsSlinky.agGrid

import typingsSlinky.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueCacheMod {
  
  @JSImport("ag-grid/dist/lib/valueService/valueCache", "ValueCache")
  @js.native
  class ValueCache () extends StObject {
    
    var active: js.Any = js.native
    
    var cacheVersion: js.Any = js.native
    
    def expire(): Unit = js.native
    
    def getValue(rowNode: RowNode, colId: String): js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    def init(): Unit = js.native
    
    var neverExpires: js.Any = js.native
    
    def onDataChanged(): Unit = js.native
    
    def setValue(rowNode: RowNode, colId: String, value: js.Any): js.Any = js.native
  }
}
