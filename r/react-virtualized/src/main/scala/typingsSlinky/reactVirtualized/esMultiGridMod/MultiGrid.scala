package typingsSlinky.reactVirtualized.esMultiGridMod

import typingsSlinky.react.mod.Component
import typingsSlinky.reactVirtualized.anon.ClassNameBottomLeftGrid
import typingsSlinky.reactVirtualized.anon.ClassNameBottomRightGrid
import typingsSlinky.reactVirtualized.anon.PartialCellPosition
import typingsSlinky.reactVirtualized.anon.RowIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-virtualized/dist/es/MultiGrid", "MultiGrid")
@js.native
class MultiGrid ()
  extends Component[MultiGridProps, MultiGridState, js.Any] {
  
  def forceUpdateGrids(): Unit = js.native
  
  /** See Grid#invalidateCellSizeAfterRender */
  def invalidateCellSizeAfterRender(): Unit = js.native
  def invalidateCellSizeAfterRender(params: PartialCellPosition): Unit = js.native
  
  /** See Grid#measureAllCells */
  def measureAllCells(): Unit = js.native
  
  /** See Grid#recomputeGridSize */
  def recomputeGridSize(): Unit = js.native
  def recomputeGridSize(params: RowIndex): Unit = js.native
}
/* static members */
@JSImport("react-virtualized/dist/es/MultiGrid", "MultiGrid")
@js.native
object MultiGrid extends js.Object {
  
  var defaultProps: ClassNameBottomRightGrid = js.native
  
  def getDerivedStateFromProps(nextProps: MultiGridProps, prevState: MultiGridState): MultiGridState | Null = js.native
  
  var propTypes: ClassNameBottomLeftGrid = js.native
}
