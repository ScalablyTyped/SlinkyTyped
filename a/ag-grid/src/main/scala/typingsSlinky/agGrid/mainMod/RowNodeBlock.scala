package typingsSlinky.agGrid.mainMod

import typingsSlinky.agGrid.rowNodeCacheMod.RowNodeCacheParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/main", "RowNodeBlock")
@js.native
abstract class RowNodeBlock protected ()
  extends typingsSlinky.agGrid.rowNodeBlockMod.RowNodeBlock {
  protected def this(blockNumber: Double, rowNodeCacheParams: RowNodeCacheParams) = this()
}
/* static members */
@JSImport("ag-grid/dist/lib/main", "RowNodeBlock")
@js.native
object RowNodeBlock extends js.Object {
  
  var EVENT_LOAD_COMPLETE: String = js.native
  
  var STATE_DIRTY: String = js.native
  
  var STATE_FAILED: String = js.native
  
  var STATE_LOADED: String = js.native
  
  var STATE_LOADING: String = js.native
}
