package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.data.PivotGridDataSourceField
import typingsSlinky.devextreme.mod.DevExpress.ui.dxPivotGrid
import typingsSlinky.devextreme.mod.DevExpress.ui.dxPivotGridPivotGridCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnFields extends js.Object {
  var area: js.UndefOr[String] = js.native
  var cell: js.UndefOr[dxPivotGridPivotGridCell] = js.native
  var cellElement: js.UndefOr[dxElement] = js.native
  var columnFields: js.UndefOr[js.Array[PivotGridDataSourceField]] = js.native
  var columnIndex: js.UndefOr[Double] = js.native
  var component: js.UndefOr[dxPivotGrid] = js.native
  var dataFields: js.UndefOr[js.Array[PivotGridDataSourceField]] = js.native
  var element: js.UndefOr[dxElement] = js.native
  var field: js.UndefOr[PivotGridDataSourceField] = js.native
  var items: js.UndefOr[js.Array[_]] = js.native
  var model: js.UndefOr[js.Any] = js.native
  var rowFields: js.UndefOr[js.Array[PivotGridDataSourceField]] = js.native
  var rowIndex: js.UndefOr[Double] = js.native
}

object ColumnFields {
  @scala.inline
  def apply(): ColumnFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnFields]
  }
  @scala.inline
  implicit class ColumnFieldsOps[Self <: ColumnFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArea(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(js.undefined)
        ret
    }
    @scala.inline
    def withCell(value: dxPivotGridPivotGridCell): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cell")(js.undefined)
        ret
    }
    @scala.inline
    def withCellElement(value: dxElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellElement")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnFields(value: js.Array[PivotGridDataSourceField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFields")(js.undefined)
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
    def withComponent(value: dxPivotGrid): Self = {
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
    def withDataFields(value: js.Array[PivotGridDataSourceField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFields")(js.undefined)
        ret
    }
    @scala.inline
    def withElement(value: dxElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: PivotGridDataSourceField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withRowFields(value: js.Array[PivotGridDataSourceField]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowFields")(js.undefined)
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
  }
  
}

