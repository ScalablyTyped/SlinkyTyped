package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.ColumnColumnIndex
import typingsSlinky.devextreme.anon.GroupContinuedMessage
import typingsSlinky.devextreme.anon.OldValue
import typingsSlinky.devextreme.anon.RowIndex
import typingsSlinky.devextreme.devextremeStrings.adaptive
import typingsSlinky.devextreme.devextremeStrings.buttons
import typingsSlinky.devextreme.devextremeStrings.cancel
import typingsSlinky.devextreme.devextremeStrings.delete
import typingsSlinky.devextreme.devextremeStrings.detailExpand
import typingsSlinky.devextreme.devextremeStrings.edit
import typingsSlinky.devextreme.devextremeStrings.groupExpand
import typingsSlinky.devextreme.devextremeStrings.save
import typingsSlinky.devextreme.devextremeStrings.selection
import typingsSlinky.devextreme.devextremeStrings.undelete
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxDataGridColumn extends GridBaseColumn {
  /** Specifies whether data from this column should be exported. Applies only if the column is visible. */
  var allowExporting: js.UndefOr[Boolean] = js.native
  /** Specifies whether the user can group data by values of this column. Applies only when grouping is enabled. */
  var allowGrouping: js.UndefOr[Boolean] = js.native
  /** Specifies whether groups appear expanded or not when records are grouped by a specific column. Setting this option makes sense only when grouping is allowed for this column. */
  var autoExpandGroup: js.UndefOr[Boolean] = js.native
  /** Allows you to customize buttons in the editing column or create a custom command column. Applies only if the column's type is "buttons". */
  var buttons: js.UndefOr[js.Array[cancel | delete | edit | save | undelete | dxDataGridColumnButton]] = js.native
  /** Specifies a field name or a function that returns a field name or a value to be used for grouping column cells. */
  var calculateGroupValue: js.UndefOr[String | (js.Function1[/* rowData */ js.Any, _])] = js.native
  /** Specifies a custom template for data cells. */
  var cellTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ OldValue, _])
  ] = js.native
  /** An array of grid columns. */
  var columns: js.UndefOr[js.Array[dxDataGridColumn | String]] = js.native
  /** Specifies a custom template for data cells in editing state. */
  var editCellTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ RowIndex, _])
  ] = js.native
  /** Specifies a custom template for group cells (group rows). */
  var groupCellTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ GroupContinuedMessage, _])
  ] = js.native
  /** Specifies the index of a column when grid records are grouped by the values of this column. */
  var groupIndex: js.UndefOr[Double] = js.native
  /** Specifies a custom template for column headers. */
  var headerCellTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* columnHeader */ dxElement, /* headerInfo */ ColumnColumnIndex, _])
  ] = js.native
  /** Specifies whether or not to display the column when grid records are grouped by it. */
  var showWhenGrouped: js.UndefOr[Boolean] = js.native
  /** Specifies the command column that this object customizes. */
  var `type`: js.UndefOr[adaptive | buttons | detailExpand | groupExpand | selection] = js.native
}

object dxDataGridColumn {
  @scala.inline
  def apply(): dxDataGridColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDataGridColumn]
  }
  @scala.inline
  implicit class dxDataGridColumnOps[Self <: dxDataGridColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowExporting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowExporting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowExporting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowExporting")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowGrouping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowGrouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowGrouping")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoExpandGroup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoExpandGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoExpandGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoExpandGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withButtons(value: js.Array[cancel | delete | edit | save | undelete | dxDataGridColumnButton]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(js.undefined)
        ret
    }
    @scala.inline
    def withCalculateGroupValueFunction1(value: /* rowData */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateGroupValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCalculateGroupValue(value: String | (js.Function1[/* rowData */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateGroupValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalculateGroupValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateGroupValue")(js.undefined)
        ret
    }
    @scala.inline
    def withCellTemplateFunction2(value: (/* cellElement */ dxElement, /* cellInfo */ OldValue) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCellTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ OldValue, _])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[dxDataGridColumn | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withEditCellTemplateFunction2(value: (/* cellElement */ dxElement, /* cellInfo */ RowIndex) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editCellTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEditCellTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditCellTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ RowIndex, _])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditCellTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editCellTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupCellTemplateFunction2(value: (/* cellElement */ dxElement, /* cellInfo */ GroupContinuedMessage) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupCellTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGroupCellTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupCellTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ GroupContinuedMessage, _])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupCellTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupCellTemplate")(js.undefined)
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
    def withHeaderCellTemplateFunction2(value: (/* columnHeader */ dxElement, /* headerInfo */ ColumnColumnIndex) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCellTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHeaderCellTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderCellTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* columnHeader */ dxElement, /* headerInfo */ ColumnColumnIndex, _])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderCellTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCellTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withShowWhenGrouped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWhenGrouped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowWhenGrouped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWhenGrouped")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: adaptive | buttons | detailExpand | groupExpand | selection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

