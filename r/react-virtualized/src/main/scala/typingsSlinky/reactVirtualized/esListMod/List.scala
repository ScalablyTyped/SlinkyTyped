package typingsSlinky.reactVirtualized.esListMod

import typingsSlinky.react.mod.Component
import typingsSlinky.reactVirtualized.anon.AlignmentIndex
import typingsSlinky.reactVirtualized.anon.AutoHeight
import typingsSlinky.reactVirtualized.anon.PartialCellPosition
import typingsSlinky.reactVirtualized.esCellMeasurerMod.CellPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/es/List", "List")
@js.native
class List ()
  extends Component[ListProps, js.Object, js.Any] {
  var Grid: js.UndefOr[typingsSlinky.reactVirtualized.esGridMod.Grid] = js.native
  def forceUpdateGrid(): Unit = js.native
  /** See Grid#getOffsetForCell */
  def getOffsetForRow(params: AlignmentIndex): Double = js.native
  /** CellMeasurer compatibility */
  def invalidateCellSizeAfterRender(hasColumnIndexRowIndex: CellPosition): Unit = js.native
  /** See Grid#measureAllCells */
  def measureAllRows(): Unit = js.native
  /** CellMeasurer compatibility */
  def recomputeGridSize(): Unit = js.native
  def recomputeGridSize(params: PartialCellPosition): Unit = js.native
  /** See Grid#recomputeGridSize */
  def recomputeRowHeights(): Unit = js.native
  def recomputeRowHeights(index: Double): Unit = js.native
  /** See Grid#scrollToPosition */
  def scrollToPosition(): Unit = js.native
  def scrollToPosition(scrollTop: Double): Unit = js.native
  /** See Grid#scrollToCell */
  def scrollToRow(): Unit = js.native
  def scrollToRow(index: Double): Unit = js.native
}

/* static members */
@JSImport("react-virtualized/dist/es/List", "List")
@js.native
object List extends js.Object {
  var defaultProps: AutoHeight = js.native
}

