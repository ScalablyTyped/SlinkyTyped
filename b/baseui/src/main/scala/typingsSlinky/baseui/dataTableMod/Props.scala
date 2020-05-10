package typingsSlinky.baseui.dataTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var batchActions: js.UndefOr[js.Array[BatchActionT]] = js.native
  var columns: js.Array[ColumnT] = js.native
  var onSelectionChange: js.UndefOr[js.Function1[/* rows */ js.Array[RowT], _]] = js.native
  var rowActions: js.UndefOr[js.Array[RowActionT]] = js.native
  var rows: js.Array[RowT] = js.native
}

object Props {
  @scala.inline
  def apply(columns: js.Array[ColumnT], rows: js.Array[RowT]): Props = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[ColumnT]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: js.Array[RowT]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatchActions(value: js.Array[BatchActionT]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchActions")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectionChange(value: /* rows */ js.Array[RowT] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withRowActions(value: js.Array[RowActionT]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowActions")(js.undefined)
        ret
    }
  }
  
}

