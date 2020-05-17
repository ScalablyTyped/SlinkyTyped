package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.ui.dxDataGrid
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDataGridRowObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OldValue extends js.Object {
  var column: js.UndefOr[this.type] = js.native
  var columnIndex: js.UndefOr[Double] = js.native
  var component: js.UndefOr[dxDataGrid] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var displayValue: js.UndefOr[js.Any] = js.native
  var oldValue: js.UndefOr[js.Any] = js.native
  var row: js.UndefOr[dxDataGridRowObject] = js.native
  var rowIndex: js.UndefOr[Double] = js.native
  var rowType: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
  var value: js.UndefOr[js.Any] = js.native
  var watch: js.UndefOr[js.Function] = js.native
}

object OldValue {
  @scala.inline
  def apply(): OldValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OldValue]
  }
  @scala.inline
  implicit class OldValueOps[Self <: OldValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: OldValue): Self = {
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
    def withColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withComponent(value: dxDataGrid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
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
    def withDisplayValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOldValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValue")(js.undefined)
        ret
    }
    @scala.inline
    def withRow(value: dxDataGridRowObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(js.undefined)
        ret
    }
    @scala.inline
    def withRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(js.undefined)
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
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
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
    @scala.inline
    def withWatch(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.undefined)
        ret
    }
  }
  
}

