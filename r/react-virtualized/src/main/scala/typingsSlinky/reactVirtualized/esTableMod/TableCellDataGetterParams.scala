package typingsSlinky.reactVirtualized.esTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableCellDataGetterParams extends js.Object {
  var columnData: js.UndefOr[js.Any] = js.native
  var dataKey: String = js.native
  var rowData: js.Any = js.native
}

object TableCellDataGetterParams {
  @scala.inline
  def apply(dataKey: String, rowData: js.Any): TableCellDataGetterParams = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellDataGetterParams]
  }
  @scala.inline
  implicit class TableCellDataGetterParamsOps[Self <: TableCellDataGetterParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnData")(js.undefined)
        ret
    }
  }
  
}

