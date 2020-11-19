package typingsSlinky.reactVirtualized

import typingsSlinky.reactVirtualized.anon.Ariareadonly
import typingsSlinky.reactVirtualized.esGridMod.GridCellRangeRenderer
import typingsSlinky.reactVirtualized.esGridMod.OverscanIndicesGetter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-virtualized/dist/commonjs/Grid", JSImport.Namespace)
@js.native
object gridMod extends js.Object {
  
  val DEFAULT_SCROLLING_RESET_TIME_INTERVAL: /* 150 */ Double = js.native
  
  val accessibilityOverscanIndicesGetter: OverscanIndicesGetter = js.native
  
  val defaultCellRangeRenderer: GridCellRangeRenderer = js.native
  
  val defaultOverscanIndicesGetter: OverscanIndicesGetter = js.native
  
  @js.native
  class Grid ()
    extends typingsSlinky.reactVirtualized.esGridMod.Grid
  /* static members */
  @js.native
  object Grid extends js.Object {
    
    var defaultProps: Ariareadonly = js.native
  }
}
