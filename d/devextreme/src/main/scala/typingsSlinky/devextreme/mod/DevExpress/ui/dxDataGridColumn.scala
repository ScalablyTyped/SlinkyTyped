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
import typingsSlinky.devextreme.devextremeStrings.drag
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
  /** @name dxDataGridColumn.allowExporting */
  var allowExporting: js.UndefOr[Boolean] = js.native
  /** @name dxDataGridColumn.allowGrouping */
  var allowGrouping: js.UndefOr[Boolean] = js.native
  /** @name dxDataGridColumn.autoExpandGroup */
  var autoExpandGroup: js.UndefOr[Boolean] = js.native
  /** @name dxDataGridColumn.buttons */
  var buttons: js.UndefOr[js.Array[cancel | delete | edit | save | undelete | dxDataGridColumnButton]] = js.native
  /** @name dxDataGridColumn.calculateGroupValue */
  var calculateGroupValue: js.UndefOr[String | (js.Function1[/* rowData */ js.Any, _])] = js.native
  /** @name dxDataGridColumn.cellTemplate */
  var cellTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ OldValue, _])
  ] = js.native
  /** @name dxDataGridColumn.columns */
  var columns: js.UndefOr[js.Array[dxDataGridColumn | String]] = js.native
  /** @name dxDataGridColumn.editCellTemplate */
  var editCellTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ RowIndex, _])
  ] = js.native
  /** @name dxDataGridColumn.groupCellTemplate */
  var groupCellTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ GroupContinuedMessage, _])
  ] = js.native
  /** @name dxDataGridColumn.groupIndex */
  var groupIndex: js.UndefOr[Double] = js.native
  /** @name dxDataGridColumn.headerCellTemplate */
  var headerCellTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* columnHeader */ dxElement, /* headerInfo */ ColumnColumnIndex, _])
  ] = js.native
  /** @name dxDataGridColumn.showWhenGrouped */
  var showWhenGrouped: js.UndefOr[Boolean] = js.native
  /** @name dxDataGridColumn.type */
  var `type`: js.UndefOr[adaptive | buttons | detailExpand | groupExpand | selection | drag] = js.native
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowExporting(value: Boolean): Self = this.set("allowExporting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowExporting: Self = this.set("allowExporting", js.undefined)
    @scala.inline
    def setAllowGrouping(value: Boolean): Self = this.set("allowGrouping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowGrouping: Self = this.set("allowGrouping", js.undefined)
    @scala.inline
    def setAutoExpandGroup(value: Boolean): Self = this.set("autoExpandGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoExpandGroup: Self = this.set("autoExpandGroup", js.undefined)
    @scala.inline
    def setButtonsVarargs(value: (cancel | delete | edit | save | undelete | dxDataGridColumnButton)*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: js.Array[cancel | delete | edit | save | undelete | dxDataGridColumnButton]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setCalculateGroupValueFunction1(value: /* rowData */ js.Any => _): Self = this.set("calculateGroupValue", js.Any.fromFunction1(value))
    @scala.inline
    def setCalculateGroupValue(value: String | (js.Function1[/* rowData */ js.Any, _])): Self = this.set("calculateGroupValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalculateGroupValue: Self = this.set("calculateGroupValue", js.undefined)
    @scala.inline
    def setCellTemplateFunction2(value: (/* cellElement */ dxElement, /* cellInfo */ OldValue) => _): Self = this.set("cellTemplate", js.Any.fromFunction2(value))
    @scala.inline
    def setCellTemplateElement(value: Element): Self = this.set("cellTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ OldValue, _])
    ): Self = this.set("cellTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellTemplate: Self = this.set("cellTemplate", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: (dxDataGridColumn | String)*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[dxDataGridColumn | String]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setEditCellTemplateFunction2(value: (/* cellElement */ dxElement, /* cellInfo */ RowIndex) => _): Self = this.set("editCellTemplate", js.Any.fromFunction2(value))
    @scala.inline
    def setEditCellTemplateElement(value: Element): Self = this.set("editCellTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditCellTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ RowIndex, _])
    ): Self = this.set("editCellTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditCellTemplate: Self = this.set("editCellTemplate", js.undefined)
    @scala.inline
    def setGroupCellTemplateFunction2(value: (/* cellElement */ dxElement, /* cellInfo */ GroupContinuedMessage) => _): Self = this.set("groupCellTemplate", js.Any.fromFunction2(value))
    @scala.inline
    def setGroupCellTemplateElement(value: Element): Self = this.set("groupCellTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupCellTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* cellElement */ dxElement, /* cellInfo */ GroupContinuedMessage, _])
    ): Self = this.set("groupCellTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupCellTemplate: Self = this.set("groupCellTemplate", js.undefined)
    @scala.inline
    def setGroupIndex(value: Double): Self = this.set("groupIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupIndex: Self = this.set("groupIndex", js.undefined)
    @scala.inline
    def setHeaderCellTemplateFunction2(value: (/* columnHeader */ dxElement, /* headerInfo */ ColumnColumnIndex) => _): Self = this.set("headerCellTemplate", js.Any.fromFunction2(value))
    @scala.inline
    def setHeaderCellTemplateElement(value: Element): Self = this.set("headerCellTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderCellTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* columnHeader */ dxElement, /* headerInfo */ ColumnColumnIndex, _])
    ): Self = this.set("headerCellTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderCellTemplate: Self = this.set("headerCellTemplate", js.undefined)
    @scala.inline
    def setShowWhenGrouped(value: Boolean): Self = this.set("showWhenGrouped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowWhenGrouped: Self = this.set("showWhenGrouped", js.undefined)
    @scala.inline
    def setType(value: adaptive | buttons | detailExpand | groupExpand | selection | drag): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

