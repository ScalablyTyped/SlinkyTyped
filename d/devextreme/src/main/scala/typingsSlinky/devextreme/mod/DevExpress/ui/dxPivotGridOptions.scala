package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.anon.AllowFieldDragging
import typingsSlinky.devextreme.anon.ApplyChangesMode
import typingsSlinky.devextreme.anon.Area
import typingsSlinky.devextreme.anon.Cell
import typingsSlinky.devextreme.anon.CollapseAll
import typingsSlinky.devextreme.anon.ColumnFields
import typingsSlinky.devextreme.anon.ComponentDxPivotGrid
import typingsSlinky.devextreme.anon.CustomLoad
import typingsSlinky.devextreme.anon.FileNameFormat
import typingsSlinky.devextreme.anon.FileNameModel
import typingsSlinky.devextreme.anon.IgnoreExcelErrors
import typingsSlinky.devextreme.anon.SearchTimeout
import typingsSlinky.devextreme.anon.ShowIndicator
import typingsSlinky.devextreme.anon.UseNative
import typingsSlinky.devextreme.devextremeStrings.both
import typingsSlinky.devextreme.devextremeStrings.column
import typingsSlinky.devextreme.devextremeStrings.columns
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.row
import typingsSlinky.devextreme.devextremeStrings.rows
import typingsSlinky.devextreme.devextremeStrings.standard
import typingsSlinky.devextreme.devextremeStrings.tree
import typingsSlinky.devextreme.mod.DevExpress.data.PivotGridDataSource
import typingsSlinky.devextreme.mod.DevExpress.data.PivotGridDataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPivotGridOptions extends WidgetOptions[dxPivotGrid] {
  /** Allows an end-user to expand/collapse all header items within a header level. */
  var allowExpandAll: js.UndefOr[Boolean] = js.native
  /** Allows a user to filter fields by selecting or deselecting values in the popup menu. */
  var allowFiltering: js.UndefOr[Boolean] = js.native
  /** Allows an end-user to change sorting options. */
  var allowSorting: js.UndefOr[Boolean] = js.native
  /** Allows an end-user to sort columns by summary values. */
  var allowSortingBySummary: js.UndefOr[Boolean] = js.native
  /** Specifies the area to which data field headers must belong. */
  var dataFieldArea: js.UndefOr[column | row] = js.native
  /** Binds the widget to data. */
  var dataSource: js.UndefOr[js.Array[_] | PivotGridDataSource | PivotGridDataSourceOptions] = js.native
  /** Configures client-side exporting. */
  var export: js.UndefOr[IgnoreExcelErrors] = js.native
  /** The Field Chooser configuration options. */
  var fieldChooser: js.UndefOr[ApplyChangesMode] = js.native
  /** Configures the field panel. */
  var fieldPanel: js.UndefOr[AllowFieldDragging] = js.native
  /** Configures the header filter feature. */
  var headerFilter: js.UndefOr[SearchTimeout] = js.native
  /** Specifies whether or not to hide rows and columns with no data. */
  var hideEmptySummaryCells: js.UndefOr[Boolean] = js.native
  /** Specifies options configuring the load panel. */
  var loadPanel: js.UndefOr[ShowIndicator] = js.native
  /** A function that is executed when a pivot grid cell is clicked or tapped. */
  var onCellClick: js.UndefOr[js.Function1[/* e */ Area, _]] = js.native
  /** A function that is executed after a pivot grid cell is created. */
  var onCellPrepared: js.UndefOr[js.Function1[/* e */ Cell, _]] = js.native
  /** A function that is executed before the context menu is rendered. */
  var onContextMenuPreparing: js.UndefOr[js.Function1[/* e */ ColumnFields, _]] = js.native
  /** A function that is executed after data is exported. */
  var onExported: js.UndefOr[js.Function1[/* e */ ComponentDxPivotGrid, _]] = js.native
  /** A function that is executed before data is exported. */
  var onExporting: js.UndefOr[js.Function1[/* e */ FileNameModel, _]] = js.native
  /** A function that is executed before a file with exported data is saved to the user's local storage. */
  var onFileSaving: js.UndefOr[js.Function1[/* e */ FileNameFormat, _]] = js.native
  /** Specifies the layout of items in the row header. */
  var rowHeaderLayout: js.UndefOr[standard | tree] = js.native
  /** A configuration object specifying scrolling options. */
  var scrolling: js.UndefOr[UseNative] = js.native
  /** Specifies whether the outer borders of the grid are visible or not. */
  var showBorders: js.UndefOr[Boolean] = js.native
  /** Specifies whether to display the Grand Total column. */
  var showColumnGrandTotals: js.UndefOr[Boolean] = js.native
  /** Specifies whether to display the Total columns. */
  var showColumnTotals: js.UndefOr[Boolean] = js.native
  /** Specifies whether to display the Grand Total row. */
  var showRowGrandTotals: js.UndefOr[Boolean] = js.native
  /** Specifies whether to display the Total rows. Applies only if rowHeaderLayout is "standard". */
  var showRowTotals: js.UndefOr[Boolean] = js.native
  /** Specifies where to show the total rows or columns. Applies only if rowHeaderLayout is "standard". */
  var showTotalsPrior: js.UndefOr[both | columns | none | rows] = js.native
  /** A configuration object specifying options related to state storing. */
  var stateStoring: js.UndefOr[CustomLoad] = js.native
  /** Strings that can be changed or localized in the PivotGrid widget. */
  var texts: js.UndefOr[CollapseAll] = js.native
  /** Specifies whether long text in header items should be wrapped. */
  var wordWrapEnabled: js.UndefOr[Boolean] = js.native
}

object dxPivotGridOptions {
  @scala.inline
  def apply(): dxPivotGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPivotGridOptions]
  }
  @scala.inline
  implicit class dxPivotGridOptionsOps[Self <: dxPivotGridOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowExpandAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowExpandAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowExpandAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowExpandAll")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowFiltering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFiltering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFiltering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFiltering")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowSorting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSorting")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowSortingBySummary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSortingBySummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSortingBySummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSortingBySummary")(js.undefined)
        ret
    }
    @scala.inline
    def withDataFieldArea(value: column | row): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFieldArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataFieldArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFieldArea")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Array[_] | PivotGridDataSource | PivotGridDataSourceOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withExport(value: IgnoreExcelErrors): Self = {
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
    def withFieldChooser(value: ApplyChangesMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldChooser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldChooser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldChooser")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldPanel(value: AllowFieldDragging): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldPanel")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderFilter(value: SearchTimeout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withHideEmptySummaryCells(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideEmptySummaryCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideEmptySummaryCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideEmptySummaryCells")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadPanel(value: ShowIndicator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadPanel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellClick(value: /* e */ Area => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCellClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCellPrepared(value: /* e */ Cell => _): Self = {
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
    def withOnContextMenuPreparing(value: /* e */ ColumnFields => _): Self = {
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
    def withOnExported(value: /* e */ ComponentDxPivotGrid => _): Self = {
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
    def withOnExporting(value: /* e */ FileNameModel => _): Self = {
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
    def withOnFileSaving(value: /* e */ FileNameFormat => _): Self = {
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
    def withRowHeaderLayout(value: standard | tree): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeaderLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHeaderLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeaderLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withScrolling(value: UseNative): Self = {
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
    def withShowBorders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBorders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBorders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBorders")(js.undefined)
        ret
    }
    @scala.inline
    def withShowColumnGrandTotals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnGrandTotals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowColumnGrandTotals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnGrandTotals")(js.undefined)
        ret
    }
    @scala.inline
    def withShowColumnTotals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnTotals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowColumnTotals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnTotals")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRowGrandTotals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowGrandTotals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRowGrandTotals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowGrandTotals")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRowTotals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowTotals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRowTotals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowTotals")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTotalsPrior(value: both | columns | none | rows): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTotalsPrior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTotalsPrior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTotalsPrior")(js.undefined)
        ret
    }
    @scala.inline
    def withStateStoring(value: CustomLoad): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateStoring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateStoring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateStoring")(js.undefined)
        ret
    }
    @scala.inline
    def withTexts(value: CollapseAll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTexts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texts")(js.undefined)
        ret
    }
    @scala.inline
    def withWordWrapEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrapEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordWrapEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrapEnabled")(js.undefined)
        ret
    }
  }
  
}

