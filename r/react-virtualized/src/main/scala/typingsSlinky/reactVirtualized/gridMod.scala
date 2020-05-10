package typingsSlinky.reactVirtualized

import typingsSlinky.reactVirtualized.esGridMod.GridCellRangeRenderer
import typingsSlinky.reactVirtualized.esGridMod.OverscanIndicesGetter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/commonjs/Grid", JSImport.Namespace)
@js.native
object gridMod extends js.Object {
  @js.native
  class Grid ()
    extends typingsSlinky.reactVirtualized.esGridMod.Grid
  
  val DEFAULT_SCROLLING_RESET_TIME_INTERVAL: /* 150 */ Double = js.native
  val accessibilityOverscanIndicesGetter: OverscanIndicesGetter = js.native
  val defaultCellRangeRenderer: GridCellRangeRenderer = js.native
  val defaultOverscanIndicesGetter: OverscanIndicesGetter = js.native
  /* static members */
  @js.native
  object Grid extends js.Object {
    var defaultProps: AnonAriareadonly = js.native
  }
  
}

