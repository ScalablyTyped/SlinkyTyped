package typingsSlinky.reactVirtualized.esMasonryMod

import typingsSlinky.react.mod.Component
import typingsSlinky.reactVirtualized.anon.KeyMapper
import typingsSlinky.reactVirtualized.anon.RowIndexNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-virtualized/dist/es/Masonry", "Masonry")
@js.native
class Masonry ()
  extends Component[MasonryProps, MasonryState, js.Any] {
  
  def clearCellPositions(): Unit = js.native
  
  // HACK This method signature was intended for Grid
  def invalidateCellSizeAfterRender(params: RowIndexNumber): Unit = js.native
  
  def recomputeCellPositions(): Unit = js.native
}
/* static members */
@JSImport("react-virtualized/dist/es/Masonry", "Masonry")
@js.native
object Masonry extends js.Object {
  
  var defaultProps: KeyMapper = js.native
  
  def getDerivedStateFromProps(nextProps: MasonryProps, prevState: MasonryState): MasonryState | Null = js.native
}
