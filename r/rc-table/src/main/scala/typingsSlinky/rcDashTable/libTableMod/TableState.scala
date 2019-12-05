package typingsSlinky.rcDashTable.libTableMod

import slinky.core.TagMod
import typingsSlinky.rcDashTable.libInterfaceMod.ColumnType
import typingsSlinky.rcDashTable.libInterfaceMod.DefaultValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableState extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var columns: js.UndefOr[js.Array[ColumnType[DefaultValueType]]] = js.undefined
}

object TableState {
  @scala.inline
  def apply(children: TagMod[Any] = null, columns: js.Array[ColumnType[DefaultValueType]] = null): TableState = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableState]
  }
}

