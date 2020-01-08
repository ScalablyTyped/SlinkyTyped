package typingsSlinky.reactDashTable.reactDashTableMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseTableCellProps[D /* <: js.Object */] extends js.Object {
  var column: ColumnInstance[D] = js.native
  var row: Row[D] = js.native
  var value: CellValue = js.native
  def getCellProps(): TableCellProps = js.native
  def getCellProps(propGetter: CellPropGetter[D]): TableCellProps = js.native
  def render(`type`: String): TagMod[Any] = js.native
  def render(`type`: String, userProps: js.Object): TagMod[Any] = js.native
  @JSName("render")
  def render_Cell(`type`: typingsSlinky.reactDashTable.reactDashTableStrings.Cell): TagMod[Any] = js.native
  @JSName("render")
  def render_Cell(`type`: typingsSlinky.reactDashTable.reactDashTableStrings.Cell, userProps: js.Object): TagMod[Any] = js.native
}

