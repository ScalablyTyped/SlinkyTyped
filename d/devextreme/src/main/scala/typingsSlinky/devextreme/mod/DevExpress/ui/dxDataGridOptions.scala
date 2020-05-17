package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.AllowCollapsing
import typingsSlinky.devextreme.anon.AllowColumnDragging
import typingsSlinky.devextreme.anon.AllowExportSelectedData
import typingsSlinky.devextreme.anon.AutoExpandAll
import typingsSlinky.devextreme.anon.CalculateCustomSummary
import typingsSlinky.devextreme.anon.CancelColumn
import typingsSlinky.devextreme.anon.CellElement
import typingsSlinky.devextreme.anon.ColumnIndex
import typingsSlinky.devextreme.anon.Columns
import typingsSlinky.devextreme.anon.ComponentDxDataGrid
import typingsSlinky.devextreme.anon.DataField
import typingsSlinky.devextreme.anon.Disabled
import typingsSlinky.devextreme.anon.DisplayValue
import typingsSlinky.devextreme.anon.ElementFileName
import typingsSlinky.devextreme.anon.Filtering
import typingsSlinky.devextreme.anon.Format
import typingsSlinky.devextreme.anon.GroupColumn
import typingsSlinky.devextreme.anon.GroupIndex
import typingsSlinky.devextreme.anon.IsExpanded
import typingsSlinky.devextreme.anon.IsNewRow
import typingsSlinky.devextreme.anon.IsSelected
import typingsSlinky.devextreme.anon.Items
import typingsSlinky.devextreme.anon.NewRowIndex
import typingsSlinky.devextreme.anon.Row
import typingsSlinky.devextreme.anon.RowElement
import typingsSlinky.devextreme.devextremeStrings.auto
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxDataGridOptions extends GridBaseOptions[dxDataGrid] {
  /** An array of grid columns. */
  @JSName("columns")
  var columns_dxDataGridOptions: js.UndefOr[js.Array[dxDataGridColumn | String]] = js.native
  /** Customizes columns after they are created. */
  var customizeColumns: js.UndefOr[js.Function1[/* columns */ js.Array[dxDataGridColumn], _]] = js.native
  /** Customizes data before export. You can use the export.customizeExcelCell function instead. */
  var customizeExportData: js.UndefOr[
    js.Function2[
      /* columns */ js.Array[dxDataGridColumn], 
      /* rows */ js.Array[dxDataGridRowObject], 
      _
    ]
  ] = js.native
  /** Configures editing. */
  @JSName("editing")
  var editing_dxDataGridOptions: js.UndefOr[dxDataGridEditing] = js.native
  /** Configures client-side exporting. */
  var export: js.UndefOr[AllowExportSelectedData] = js.native
  /** Configures the group panel. */
  var groupPanel: js.UndefOr[AllowColumnDragging] = js.native
  /** Configures grouping. */
  var grouping: js.UndefOr[AllowCollapsing] = js.native
  /** Specifies which data field provides keys for data items. Applies only if data is a simple array. */
  var keyExpr: js.UndefOr[String | js.Array[String]] = js.native
  /** Allows you to build a master-detail interface in the grid. */
  var masterDetail: js.UndefOr[AutoExpandAll] = js.native
  /** A function that is executed when a cell is clicked or tapped. Executed before onRowClick. */
  var onCellClick: js.UndefOr[(js.Function1[/* e */ CellElement, _]) | String] = js.native
  /** A function that is executed when a cell is double-clicked or double-tapped. Executed before onRowDblClick. */
  var onCellDblClick: js.UndefOr[js.Function1[/* e */ ColumnIndex, _]] = js.native
  /** A function that is executed after the pointer enters or leaves a cell. */
  var onCellHoverChanged: js.UndefOr[js.Function1[/* e */ DisplayValue, _]] = js.native
  /** A function that is executed after a cell is created. */
  var onCellPrepared: js.UndefOr[js.Function1[/* e */ IsExpanded, _]] = js.native
  /** A function that is executed before the context menu is rendered. */
  var onContextMenuPreparing: js.UndefOr[js.Function1[/* e */ Items, _]] = js.native
  /** A function that is executed before a cell or row switches to the editing state. */
  var onEditingStart: js.UndefOr[js.Function1[/* e */ CancelColumn, _]] = js.native
  /** A function that is executed after an editor is created. Not executed for cells with an editCellTemplate. */
  var onEditorPrepared: js.UndefOr[js.Function1[/* options */ DataField, _]] = js.native
  /** A function used to customize or replace default editors. Not executed for cells with an editCellTemplate. */
  var onEditorPreparing: js.UndefOr[js.Function1[/* e */ Disabled, _]] = js.native
  /** A function that is executed after data is exported. */
  var onExported: js.UndefOr[js.Function1[/* e */ ComponentDxDataGrid, _]] = js.native
  /** A function that is executed before data is exported. */
  var onExporting: js.UndefOr[js.Function1[/* e */ ElementFileName, _]] = js.native
  /** A function that is executed before a file with exported data is saved to the user's local storage. */
  var onFileSaving: js.UndefOr[js.Function1[/* e */ Format, _]] = js.native
  /** A function that is executed after the focused cell changes. */
  var onFocusedCellChanged: js.UndefOr[js.Function1[/* e */ Row, _]] = js.native
  /** A function that is executed before the focused cell changes. */
  var onFocusedCellChanging: js.UndefOr[js.Function1[/* e */ Columns, _]] = js.native
  /** A function that is executed after the focused row changes. Applies only when focusedRowEnabled is true. */
  var onFocusedRowChanged: js.UndefOr[js.Function1[/* e */ RowElement, _]] = js.native
  /** A function that is executed before the focused row changes. Applies only when focusedRowEnabled is true. */
  var onFocusedRowChanging: js.UndefOr[js.Function1[/* e */ NewRowIndex, _]] = js.native
  /** A function that is executed when a row is clicked or tapped. */
  var onRowClick: js.UndefOr[(js.Function1[/* e */ GroupIndex, _]) | String] = js.native
  /** A function that is executed when a row is double-clicked or double-tapped. Executed after onCellDblClick. */
  var onRowDblClick: js.UndefOr[js.Function1[/* e */ IsNewRow, _]] = js.native
  /** A function that is executed after a row is created. */
  var onRowPrepared: js.UndefOr[js.Function1[/* e */ IsSelected, _]] = js.native
  /** Notifies the DataGrid of the server's data processing operations. */
  var remoteOperations: js.UndefOr[Boolean | Filtering | auto] = js.native
  /** Specifies a custom template for rows. */
  var rowTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* rowElement */ dxElement, /* rowInfo */ js.Any, _])
  ] = js.native
  /** Configures scrolling. */
  @JSName("scrolling")
  var scrolling_dxDataGridOptions: js.UndefOr[dxDataGridScrolling] = js.native
  /** Specifies filters for the rows that must be selected initially. Applies only if selection.deferred is true. */
  var selectionFilter: js.UndefOr[String | js.Array[_] | js.Function] = js.native
  /** Configures runtime selection. */
  @JSName("selection")
  var selection_dxDataGridOptions: js.UndefOr[dxDataGridSelection] = js.native
  /** Allows you to sort groups according to the values of group summary items. */
  var sortByGroupSummaryInfo: js.UndefOr[js.Array[GroupColumn]] = js.native
  /** Specifies the options of the grid summary. */
  var summary: js.UndefOr[CalculateCustomSummary] = js.native
}

object dxDataGridOptions {
  @scala.inline
  def apply(): dxDataGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDataGridOptions]
  }
  @scala.inline
  implicit class dxDataGridOptionsOps[Self <: dxDataGridOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCustomizeColumns(value: /* columns */ js.Array[dxDataGridColumn] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeColumns")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizeColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomizeExportData(value: (/* columns */ js.Array[dxDataGridColumn], /* rows */ js.Array[dxDataGridRowObject]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeExportData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCustomizeExportData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeExportData")(js.undefined)
        ret
    }
    @scala.inline
    def withEditing(value: dxDataGridEditing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editing")(js.undefined)
        ret
    }
    @scala.inline
    def withExport(value: AllowExportSelectedData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupPanel(value: AllowColumnDragging): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupPanel")(js.undefined)
        ret
    }
    @scala.inline
    def withGrouping(value: AllowCollapsing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouping")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyExpr(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterDetail(value: AutoExpandAll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellClickFunction1(value: /* e */ CellElement => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnCellClick(value: (js.Function1[/* e */ CellElement, _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCellClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellDblClick(value: /* e */ ColumnIndex => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellDblClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCellDblClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellDblClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellHoverChanged(value: /* e */ DisplayValue => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellHoverChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCellHoverChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellHoverChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellPrepared(value: /* e */ IsExpanded => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellPrepared")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCellPrepared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellPrepared")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContextMenuPreparing(value: /* e */ Items => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenuPreparing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnContextMenuPreparing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenuPreparing")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEditingStart(value: /* e */ CancelColumn => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditingStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEditingStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditingStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEditorPrepared(value: /* options */ DataField => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditorPrepared")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEditorPrepared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditorPrepared")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEditorPreparing(value: /* e */ Disabled => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditorPreparing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEditorPreparing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditorPreparing")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExported(value: /* e */ ComponentDxDataGrid => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExported")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnExported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExported")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExporting(value: /* e */ ElementFileName => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExporting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnExporting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExporting")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFileSaving(value: /* e */ Format => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFileSaving")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFileSaving: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFileSaving")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocusedCellChanged(value: /* e */ Row => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusedCellChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocusedCellChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusedCellChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocusedCellChanging(value: /* e */ Columns => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusedCellChanging")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocusedCellChanging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusedCellChanging")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocusedRowChanged(value: /* e */ RowElement => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusedRowChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocusedRowChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusedRowChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocusedRowChanging(value: /* e */ NewRowIndex => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusedRowChanging")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocusedRowChanging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusedRowChanging")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowClickFunction1(value: /* e */ GroupIndex => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnRowClick(value: (js.Function1[/* e */ GroupIndex, _]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnRowClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowDblClick(value: /* e */ IsNewRow => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowDblClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowDblClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowDblClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowPrepared(value: /* e */ IsSelected => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowPrepared")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowPrepared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowPrepared")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteOperations(value: Boolean | Filtering | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteOperations")(js.undefined)
        ret
    }
    @scala.inline
    def withRowTemplateFunction2(value: (/* rowElement */ dxElement, /* rowInfo */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRowTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* rowElement */ dxElement, /* rowInfo */ js.Any, _])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withScrolling(value: dxDataGridScrolling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withSelection(value: dxDataGridSelection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionFilter(value: String | js.Array[_] | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withSortByGroupSummaryInfo(value: js.Array[GroupColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortByGroupSummaryInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortByGroupSummaryInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortByGroupSummaryInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withSummary(value: CalculateCustomSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.undefined)
        ret
    }
  }
  
}

