package typingsSlinky.reactVirtualized.esMultiGridMod

import typingsSlinky.react.mod.Component
import typingsSlinky.reactVirtualized.AnonClassNameBottomLeftGrid
import typingsSlinky.reactVirtualized.AnonClassNameBottomRightGrid
import typingsSlinky.reactVirtualized.AnonRowIndex
import typingsSlinky.reactVirtualized.PartialCellPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def recomputeGridSize(params: AnonRowIndex): Unit = js.native
}

/* static members */
@JSImport("react-virtualized/dist/es/MultiGrid", "MultiGrid")
@js.native
object MultiGrid extends js.Object {
  var defaultProps: AnonClassNameBottomRightGrid = js.native
  var propTypes: AnonClassNameBottomLeftGrid = js.native
  def getDerivedStateFromProps(nextProps: MultiGridProps, prevState: MultiGridState): MultiGridState | Null = js.native
}

