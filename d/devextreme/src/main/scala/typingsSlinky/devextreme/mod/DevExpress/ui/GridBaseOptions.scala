package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.AnonAllowDropInsideItem
import typingsSlinky.devextreme.AnonAllowedPageSizes
import typingsSlinky.devextreme.AnonApplyFilter
import typingsSlinky.devextreme.AnonAscendingText
import typingsSlinky.devextreme.AnonBrokenRules
import typingsSlinky.devextreme.AnonCancelComponent
import typingsSlinky.devextreme.AnonComponentData
import typingsSlinky.devextreme.AnonCurrentDeselectedRowKeys
import typingsSlinky.devextreme.AnonCustomLoad
import typingsSlinky.devextreme.AnonCustomizeText
import typingsSlinky.devextreme.AnonDataElement
import typingsSlinky.devextreme.AnonEditOnKeyPress
import typingsSlinky.devextreme.AnonElementKey
import typingsSlinky.devextreme.AnonEmptyPanelText
import typingsSlinky.devextreme.AnonEnabled
import typingsSlinky.devextreme.AnonError
import typingsSlinky.devextreme.AnonFormOptions
import typingsSlinky.devextreme.AnonHandled
import typingsSlinky.devextreme.AnonHeight
import typingsSlinky.devextreme.AnonHighlightCaseSensitive
import typingsSlinky.devextreme.AnonIndicatorSrc
import typingsSlinky.devextreme.AnonKey
import typingsSlinky.devextreme.AnonNewData
import typingsSlinky.devextreme.AnonPromise
import typingsSlinky.devextreme.AnonToolbarOptions
import typingsSlinky.devextreme.devextremeStrings.auto
import typingsSlinky.devextreme.devextremeStrings.nextColumn
import typingsSlinky.devextreme.devextremeStrings.widget
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridBaseOptions[T] extends WidgetOptions[T] {
  /** Specifies whether a user can reorder columns. */
  var allowColumnReordering: js.UndefOr[Boolean] = js.native
  /** Specifies whether a user can resize columns. */
  var allowColumnResizing: js.UndefOr[Boolean] = js.native
  /** Automatically scrolls to the focused row when the focusedRowKey is changed. */
  var autoNavigateToFocusedRow: js.UndefOr[Boolean] = js.native
  /** Specifies whether data should be cached. */
  var cacheEnabled: js.UndefOr[Boolean] = js.native
  /** Enables a hint that appears when a user hovers the mouse pointer over a cell with truncated content. */
  var cellHintEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies whether columns should adjust their widths to the content. */
  var columnAutoWidth: js.UndefOr[Boolean] = js.native
  /** Configures the column chooser. */
  var columnChooser: js.UndefOr[AnonEmptyPanelText] = js.native
  /** Configures column fixing. */
  var columnFixing: js.UndefOr[AnonEnabled] = js.native
  /** Specifies whether the widget should hide columns to adapt to the screen or container size. Ignored if allowColumnResizing is true and columnResizingMode is "widget". */
  var columnHidingEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies the minimum width of columns. */
  var columnMinWidth: js.UndefOr[Double] = js.native
  /** Specifies how the widget resizes columns. Applies only if allowColumnResizing is true. */
  var columnResizingMode: js.UndefOr[nextColumn | widget] = js.native
  /** Specifies the width for all data columns. Has a lower priority than the column.width option. */
  var columnWidth: js.UndefOr[Double] = js.native
  /** Overridden. */
  var columns: js.UndefOr[js.Array[GridBaseColumn | String]] = js.native
  /** Binds the widget to data. */
  var dataSource: js.UndefOr[String | js.Array[_] | DataSource | DataSourceOptions] = js.native
  /** Specifies the format in which date-time values should be sent to the server. Use it only if you do not specify the dataSource at design time. */
  var dateSerializationFormat: js.UndefOr[String] = js.native
  /** Overriden. */
  var editing: js.UndefOr[GridBaseEditing] = js.native
  /** Indicates whether to show the error row. */
  var errorRowEnabled: js.UndefOr[Boolean] = js.native
  /** Configures the integrated filter builder. */
  var filterBuilder: js.UndefOr[dxFilterBuilderOptions] = js.native
  /** Configures the popup in which the integrated filter builder is shown. */
  var filterBuilderPopup: js.UndefOr[dxPopupOptions[dxPopup]] = js.native
  /** Configures the filter panel. */
  var filterPanel: js.UndefOr[AnonCustomizeText[T]] = js.native
  /** Configures the filter row. */
  var filterRow: js.UndefOr[AnonApplyFilter] = js.native
  /** Specifies whether to synchronize the filter row, header filter, and filter builder. The synchronized filter expression is stored in the filterValue option. */
  var filterSyncEnabled: js.UndefOr[Boolean | auto] = js.native
  /** Specifies a filter expression. */
  var filterValue: js.UndefOr[String | js.Array[_] | js.Function] = js.native
  /** Specifies the index of the column focused initially or currently in the data row area. */
  var focusedColumnIndex: js.UndefOr[Double] = js.native
  /** Specifies whether the focused row feature is enabled. */
  var focusedRowEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies the initially or currently focused grid row's index. Use it when focusedRowEnabled is true. */
  var focusedRowIndex: js.UndefOr[Double] = js.native
  /** Specifies initially or currently focused grid row's key. Use it when focusedRowEnabled is true. */
  var focusedRowKey: js.UndefOr[js.Any] = js.native
  /** Configures the header filter feature. */
  var headerFilter: js.UndefOr[AnonHeight] = js.native
  /** Specifies whether to highlight rows and cells with edited data. repaintChangesOnly should be true. */
  var highlightChanges: js.UndefOr[Boolean] = js.native
  /** Configures keyboard navigation. */
  var keyboardNavigation: js.UndefOr[AnonEditOnKeyPress] = js.native
  /** Configures the load panel. */
  var loadPanel: js.UndefOr[AnonIndicatorSrc] = js.native
  /** Specifies text shown when the widget does not display any data. */
  var noDataText: js.UndefOr[String] = js.native
  /** A function that is executed before an adaptive detail row is rendered. */
  var onAdaptiveDetailRowPreparing: js.UndefOr[js.Function1[/* e */ AnonFormOptions[T], _]] = js.native
  /** A function that is executed when an error occurs in the data source. */
  var onDataErrorOccurred: js.UndefOr[js.Function1[/* e */ AnonError[T], _]] = js.native
  /** A function that is executed before a new row is added to the widget. */
  var onInitNewRow: js.UndefOr[js.Function1[/* e */ AnonPromise[T], _]] = js.native
  /** A function that is executed when the widget is in focus and a key has been pressed down. */
  var onKeyDown: js.UndefOr[js.Function1[/* e */ AnonHandled[T], _]] = js.native
  /** A function that is executed after a row is collapsed. */
  var onRowCollapsed: js.UndefOr[js.Function1[/* e */ AnonKey[T], _]] = js.native
  /** A function that is executed before a row is collapsed. */
  var onRowCollapsing: js.UndefOr[js.Function1[/* e */ AnonCancelComponent[T], _]] = js.native
  /** A function that is executed after a row is expanded. */
  var onRowExpanded: js.UndefOr[js.Function1[/* e */ AnonKey[T], _]] = js.native
  /** A function that is executed before a row is expanded. */
  var onRowExpanding: js.UndefOr[js.Function1[/* e */ AnonCancelComponent[T], _]] = js.native
  /** A function that is executed after a new row has been inserted into the data source. */
  var onRowInserted: js.UndefOr[js.Function1[/* e */ AnonComponentData[T], _]] = js.native
  /** A function that is executed before a new row is inserted into the data source. */
  var onRowInserting: js.UndefOr[js.Function1[/* e */ AnonDataElement[T], _]] = js.native
  /** A function that is executed after a row has been removed from the data source. */
  var onRowRemoved: js.UndefOr[js.Function1[/* e */ AnonComponentData[T], _]] = js.native
  /** A function that is executed before a row is removed from the data source. */
  var onRowRemoving: js.UndefOr[js.Function1[/* e */ AnonElementKey[T], _]] = js.native
  /** A function that is executed after a row has been updated in the data source. */
  var onRowUpdated: js.UndefOr[js.Function1[/* e */ AnonComponentData[T], _]] = js.native
  /** A function that is executed before a row is updated in the data source. */
  var onRowUpdating: js.UndefOr[js.Function1[/* e */ AnonNewData[T], _]] = js.native
  /** A function that is executed after cells in a row are validated against validation rules. */
  var onRowValidating: js.UndefOr[js.Function1[/* e */ AnonBrokenRules[T], _]] = js.native
  /** A function that is executed after selecting a row or clearing its selection. */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ AnonCurrentDeselectedRowKeys[T], _]] = js.native
  /** A function that is executed before the toolbar is created. */
  var onToolbarPreparing: js.UndefOr[js.Function1[/* e */ AnonToolbarOptions[T], _]] = js.native
  /** Configures the pager. */
  var pager: js.UndefOr[AnonAllowedPageSizes] = js.native
  /** Configures paging. */
  var paging: js.UndefOr[GridBasePaging] = js.native
  /** Specifies whether to render the filter row, command columns, and columns with showEditorAlways set to true after other elements. */
  var renderAsync: js.UndefOr[Boolean] = js.native
  /** Specifies whether to repaint only those cells whose data changed. */
  var repaintChangesOnly: js.UndefOr[Boolean] = js.native
  /** Specifies whether rows should be shaded differently. */
  var rowAlternationEnabled: js.UndefOr[Boolean] = js.native
  /** Configures row reordering using drag and drop gestures. */
  var rowDragging: js.UndefOr[AnonAllowDropInsideItem] = js.native
  /** Overridden. A configuration object specifying scrolling options. */
  var scrolling: js.UndefOr[GridBaseScrolling] = js.native
  /** Configures the search panel. */
  var searchPanel: js.UndefOr[AnonHighlightCaseSensitive] = js.native
  /** Allows you to select rows or determine which rows are selected. */
  var selectedRowKeys: js.UndefOr[js.Array[_]] = js.native
  /** Overridden. */
  var selection: js.UndefOr[GridBaseSelection] = js.native
  /** Specifies whether the outer borders of the widget are visible. */
  var showBorders: js.UndefOr[Boolean] = js.native
  /** Specifies whether column headers are visible. */
  var showColumnHeaders: js.UndefOr[Boolean] = js.native
  /** Specifies whether vertical lines that separate one column from another are visible. */
  var showColumnLines: js.UndefOr[Boolean] = js.native
  /** Specifies whether horizontal lines that separate one row from another are visible. */
  var showRowLines: js.UndefOr[Boolean] = js.native
  /** Configures runtime sorting. */
  var sorting: js.UndefOr[AnonAscendingText] = js.native
  /** Configures state storing. */
  var stateStoring: js.UndefOr[AnonCustomLoad] = js.native
  /** Specifies whether to enable two-way data binding. */
  var twoWayBindingEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies whether text that does not fit into a column should be wrapped. */
  var wordWrapEnabled: js.UndefOr[Boolean] = js.native
}

object GridBaseOptions {
  @scala.inline
  def apply[T](): GridBaseOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridBaseOptions[T]]
  }
  @scala.inline
  implicit class GridBaseOptionsOps[Self[t] <: GridBaseOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAllowColumnReordering(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowColumnReordering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowColumnReordering: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowColumnReordering")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowColumnResizing(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowColumnResizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowColumnResizing: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowColumnResizing")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoNavigateToFocusedRow(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoNavigateToFocusedRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoNavigateToFocusedRow: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoNavigateToFocusedRow")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheEnabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheEnabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCellHintEnabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHintEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellHintEnabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHintEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnAutoWidth(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnAutoWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnAutoWidth: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnAutoWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnChooser(value: AnonEmptyPanelText): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnChooser: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnChooser")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnFixing(value: AnonEnabled): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFixing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnFixing: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnFixing")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnHidingEnabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHidingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnHidingEnabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHidingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnMinWidth(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnMinWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnMinWidth: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnMinWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnResizingMode(value: nextColumn | widget): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnResizingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnResizingMode: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnResizingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnWidth(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnWidth: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[GridBaseColumn | String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: String | js.Array[_] | DataSource | DataSourceOptions): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDateSerializationFormat(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateSerializationFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateSerializationFormat: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateSerializationFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withEditing(value: GridBaseEditing): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditing: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editing")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorRowEnabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorRowEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorRowEnabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorRowEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterBuilder(value: dxFilterBuilderOptions): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterBuilder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterBuilder: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterBuilder")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterBuilderPopup(value: dxPopupOptions[dxPopup]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterBuilderPopup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterBuilderPopup: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterBuilderPopup")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterPanel(value: AnonCustomizeText[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterPanel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPanel")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterRow(value: AnonApplyFilter): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterRow: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterRow")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterSyncEnabled(value: Boolean | auto): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterSyncEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterSyncEnabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterSyncEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterValue(value: String | js.Array[_] | js.Function): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterValue")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusedColumnIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedColumnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusedColumnIndex: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedColumnIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusedRowEnabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedRowEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusedRowEnabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedRowEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusedRowIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedRowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusedRowIndex: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedRowIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusedRowKey(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedRowKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusedRowKey: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedRowKey")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderFilter(value: AnonHeight): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderFilter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightChanges(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightChanges: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardNavigation(value: AnonEditOnKeyPress): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardNavigation: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadPanel(value: AnonIndicatorSrc): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadPanel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadPanel")(js.undefined)
        ret
    }
    @scala.inline
    def withNoDataText(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDataText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoDataText: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDataText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAdaptiveDetailRowPreparing(value: /* e */ AnonFormOptions[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdaptiveDetailRowPreparing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAdaptiveDetailRowPreparing: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAdaptiveDetailRowPreparing")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDataErrorOccurred(value: /* e */ AnonError[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDataErrorOccurred")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDataErrorOccurred: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDataErrorOccurred")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInitNewRow(value: /* e */ AnonPromise[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitNewRow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInitNewRow: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitNewRow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDown(value: /* e */ AnonHandled[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDown: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowCollapsed(value: /* e */ AnonKey[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowCollapsed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowCollapsed: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowCollapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowCollapsing(value: /* e */ AnonCancelComponent[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowCollapsing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowCollapsing: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowCollapsing")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowExpanded(value: /* e */ AnonKey[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowExpanded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowExpanded: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowExpanding(value: /* e */ AnonCancelComponent[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowExpanding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowExpanding: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowExpanding")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowInserted(value: /* e */ AnonComponentData[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowInserted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowInserted: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowInserted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowInserting(value: /* e */ AnonDataElement[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowInserting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowInserting: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowInserting")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowRemoved(value: /* e */ AnonComponentData[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowRemoved")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowRemoved: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowRemoved")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowRemoving(value: /* e */ AnonElementKey[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowRemoving")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowRemoving: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowRemoving")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowUpdated(value: /* e */ AnonComponentData[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowUpdated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowUpdated: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowUpdating(value: /* e */ AnonNewData[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowUpdating")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowUpdating: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowUpdating")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRowValidating(value: /* e */ AnonBrokenRules[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowValidating")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRowValidating: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowValidating")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectionChanged(value: /* e */ AnonCurrentDeselectedRowKeys[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectionChanged: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnToolbarPreparing(value: /* e */ AnonToolbarOptions[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToolbarPreparing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnToolbarPreparing: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToolbarPreparing")(js.undefined)
        ret
    }
    @scala.inline
    def withPager(value: AnonAllowedPageSizes): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPager: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pager")(js.undefined)
        ret
    }
    @scala.inline
    def withPaging(value: GridBasePaging): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaging: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paging")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderAsync(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAsync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderAsync: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAsync")(js.undefined)
        ret
    }
    @scala.inline
    def withRepaintChangesOnly(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repaintChangesOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepaintChangesOnly: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repaintChangesOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withRowAlternationEnabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowAlternationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowAlternationEnabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowAlternationEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDragging(value: AnonAllowDropInsideItem): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowDragging: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDragging")(js.undefined)
        ret
    }
    @scala.inline
    def withScrolling(value: GridBaseScrolling): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrolling: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchPanel(value: AnonHighlightCaseSensitive): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchPanel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPanel")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedRowKeys(value: js.Array[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRowKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedRowKeys: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRowKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withSelection(value: GridBaseSelection): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.undefined)
        ret
    }
    @scala.inline
    def withShowBorders(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBorders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBorders: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBorders")(js.undefined)
        ret
    }
    @scala.inline
    def withShowColumnHeaders(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowColumnHeaders: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withShowColumnLines(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowColumnLines: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnLines")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRowLines(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRowLines: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowLines")(js.undefined)
        ret
    }
    @scala.inline
    def withSorting(value: AnonAscendingText): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSorting: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorting")(js.undefined)
        ret
    }
    @scala.inline
    def withStateStoring(value: AnonCustomLoad): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateStoring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateStoring: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateStoring")(js.undefined)
        ret
    }
    @scala.inline
    def withTwoWayBindingEnabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twoWayBindingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTwoWayBindingEnabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twoWayBindingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withWordWrapEnabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrapEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordWrapEnabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrapEnabled")(js.undefined)
        ret
    }
  }
  
}

