package typingsSlinky.devextreme.mod.DevExpress.exporter

import typingsSlinky.devextreme.anon.NameValue
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDataGridColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcelDataGridCell extends js.Object {
  /** The configuration of the cell's column. */
  var column: js.UndefOr[dxDataGridColumn] = js.native
  /** The data object of the cell's row. */
  var data: js.UndefOr[js.Any] = js.native
  /** The group index of the cell's row. Available when the rowType is "group". */
  var groupIndex: js.UndefOr[Double] = js.native
  /** Information about group summary items the cell represents. */
  var groupSummaryItems: js.UndefOr[js.Array[NameValue]] = js.native
  /** The type of the cell's row. */
  var rowType: js.UndefOr[String] = js.native
  /** The identifier of the total summary item that the cell represents. */
  var totalSummaryItemName: js.UndefOr[String] = js.native
  /** The cell's raw value. */
  var value: js.UndefOr[js.Any] = js.native
}

object ExcelDataGridCell {
  @scala.inline
  def apply(): ExcelDataGridCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcelDataGridCell]
  }
  @scala.inline
  implicit class ExcelDataGridCellOps[Self <: ExcelDataGridCell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: dxDataGridColumn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupSummaryItems(value: js.Array[NameValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSummaryItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupSummaryItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSummaryItems")(js.undefined)
        ret
    }
    @scala.inline
    def withRowType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowType")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalSummaryItemName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSummaryItemName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalSummaryItemName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSummaryItemName")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

