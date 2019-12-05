package typingsSlinky.baseui.tableDashSemanticMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableBuilderColumnProps[RowT] extends js.Object {
  var header: js.UndefOr[TagMod[Any]] = js.native
  var id: js.UndefOr[String] = js.native
  var numeric: js.UndefOr[Boolean] = js.native
  var overrides: js.UndefOr[ColumnOverrides] = js.native
  var sortable: js.UndefOr[Boolean] = js.native
  def children(row: RowT): TagMod[Any] = js.native
  def children(row: RowT, rowIndex: Double): TagMod[Any] = js.native
  def children(row: js.Any): TagMod[Any] = js.native
  def children(row: js.Any, rowIndex: Double): TagMod[Any] = js.native
}

