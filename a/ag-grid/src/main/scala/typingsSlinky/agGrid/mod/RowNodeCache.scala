package typingsSlinky.agGrid.mod

import typingsSlinky.agGrid.rowNodeCacheMod.RowNodeCacheParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid", "RowNodeCache")
@js.native
abstract class RowNodeCache[T /* <: typingsSlinky.agGrid.rowNodeBlockMod.RowNodeBlock */, P /* <: RowNodeCacheParams */] protected ()
  extends typingsSlinky.agGrid.rowNodeCacheMod.RowNodeCache[T, P] {
  protected def this(cacheParams: P) = this()
}
/* static members */
object RowNodeCache {
  
  @JSImport("ag-grid", "RowNodeCache")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ag-grid", "RowNodeCache.EVENT_CACHE_UPDATED")
  @js.native
  def EVENT_CACHE_UPDATED: String = js.native
  @scala.inline
  def EVENT_CACHE_UPDATED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_CACHE_UPDATED")(x.asInstanceOf[js.Any])
}
