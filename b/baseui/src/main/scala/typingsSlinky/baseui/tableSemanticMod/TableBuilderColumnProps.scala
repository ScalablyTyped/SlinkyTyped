package typingsSlinky.baseui.tableSemanticMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableBuilderColumnProps[RowT] extends js.Object {
  var header: js.UndefOr[ReactElement] = js.native
  var id: js.UndefOr[String] = js.native
  var numeric: js.UndefOr[Boolean] = js.native
  var overrides: js.UndefOr[ColumnOverrides] = js.native
  var sortable: js.UndefOr[Boolean] = js.native
  def children(row: RowT): ReactElement = js.native
  def children(row: RowT, rowIndex: Double): ReactElement = js.native
  def children(row: js.Any): ReactElement = js.native
  def children(row: js.Any, rowIndex: Double): ReactElement = js.native
}

