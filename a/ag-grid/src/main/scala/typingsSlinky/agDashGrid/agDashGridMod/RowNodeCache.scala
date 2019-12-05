package typingsSlinky.agDashGrid.agDashGridMod

import typingsSlinky.agDashGrid.distLibRowModelsCacheRowNodeCacheMod.RowNodeCacheParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid", "RowNodeCache")
@js.native
abstract class RowNodeCache[T /* <: typingsSlinky.agDashGrid.distLibRowModelsCacheRowNodeBlockMod.RowNodeBlock */, P /* <: RowNodeCacheParams */] protected ()
  extends typingsSlinky.agDashGrid.distLibRowModelsCacheRowNodeCacheMod.RowNodeCache[T, P] {
  protected def this(cacheParams: P) = this()
}

/* static members */
@JSImport("ag-grid", "RowNodeCache")
@js.native
object RowNodeCache extends js.Object {
  var EVENT_CACHE_UPDATED: String = js.native
}

