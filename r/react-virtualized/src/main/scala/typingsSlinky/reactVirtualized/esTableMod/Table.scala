package typingsSlinky.reactVirtualized.esTableMod

import typingsSlinky.react.mod.Component
import typingsSlinky.reactVirtualized.AnonAlignmentIndex
import typingsSlinky.reactVirtualized.AnonClassName
import typingsSlinky.reactVirtualized.AnonDisableHeader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/es/Table", "Table")
@js.native
class Table ()
  extends Component[TableProps, js.Object, js.Any] {
  var Grid: typingsSlinky.reactVirtualized.esGridMod.Grid = js.native
  def forceUpdateGrid(): Unit = js.native
  /** See Grid#getOffsetForCell */
  def getOffsetForRow(params: AnonAlignmentIndex): Double = js.native
  /** See Grid#measureAllCells */
  def measureAllRows(): Unit = js.native
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
@JSImport("react-virtualized/dist/es/Table", "Table")
@js.native
object Table extends js.Object {
  var defaultProps: AnonDisableHeader = js.native
  var propTypes: AnonClassName = js.native
}

