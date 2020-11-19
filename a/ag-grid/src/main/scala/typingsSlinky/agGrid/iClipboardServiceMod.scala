package typingsSlinky.agGrid

import typingsSlinky.agGrid.columnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/interfaces/iClipboardService", JSImport.Namespace)
@js.native
object iClipboardServiceMod extends js.Object {
  
  @js.native
  trait IClipboardService extends js.Object {
    
    def copyRangeDown(): Unit = js.native
    
    def copySelectedRangeToClipboard(): Unit = js.native
    def copySelectedRangeToClipboard(includeHeader: Boolean): Unit = js.native
    
    def copySelectedRowsToClipboard(): Unit = js.native
    def copySelectedRowsToClipboard(includeHeader: js.UndefOr[scala.Nothing], columnKeys: js.Array[String | Column]): Unit = js.native
    def copySelectedRowsToClipboard(includeHeader: Boolean): Unit = js.native
    def copySelectedRowsToClipboard(includeHeader: Boolean, columnKeys: js.Array[String | Column]): Unit = js.native
    
    def copyToClipboard(): Unit = js.native
    def copyToClipboard(includeHeader: Boolean): Unit = js.native
    
    def pasteFromClipboard(): Unit = js.native
  }
}
