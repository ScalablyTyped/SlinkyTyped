package typingsSlinky.reactDashVirtualized.distEsMultiGridMod

import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashVirtualized.Anon_
import typingsSlinky.reactDashVirtualized.Anon_ClassNameBottomLeftGrid
import typingsSlinky.reactDashVirtualized.Anon_ColumnIndexRowIndex
import typingsSlinky.reactDashVirtualized.distEsCellMeasurerMod.CellPosition
import typingsSlinky.std.Partial
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
  def invalidateCellSizeAfterRender(params: Partial[CellPosition]): Unit = js.native
  /** See Grid#measureAllCells */
  def measureAllCells(): Unit = js.native
  /** See Grid#recomputeGridSize */
  def recomputeGridSize(): Unit = js.native
  def recomputeGridSize(params: Anon_ColumnIndexRowIndex): Unit = js.native
}

/* static members */
@JSImport("react-virtualized/dist/es/MultiGrid", "MultiGrid")
@js.native
object MultiGrid extends js.Object {
  var defaultProps: Anon_ = js.native
  var propTypes: Anon_ClassNameBottomLeftGrid = js.native
  def getDerivedStateFromProps(nextProps: MultiGridProps, prevState: MultiGridState): MultiGridState | Null = js.native
}

