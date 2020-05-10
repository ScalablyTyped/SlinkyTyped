package typingsSlinky.materialUiDatatables.mod

import typingsSlinky.materialUiDatatables.materialUiDatatablesStrings.filter
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTableProps extends js.Object {
  /**
    * The column structure.
    * ```let columns: Column[] = [{
    *      key: 'bookName',
    *      label: 'Book Name & Author',
    *      render: (__value: any, book: any) => book.name + ' by ' book.author
    *  },```
    */
  var columns: js.Array[Column] = js.native
  var count: Double = js.native
  /** The array of objects used as data for the table */
  var data: js.Array[_] = js.native
  /** If clicking away de-selects all */
  var deselectOnClickaway: Boolean = js.native
  /** Adds a select all button */
  var enableSelectAll: Boolean = js.native
  /** Filter hint text */
  var filterHintText: String = js.native
   // BUG https://github.com/Microsoft/TypeScript/issues/11465
  /** The current filter value */
  var filterValue: String = js.native
  /** If the footer should be fixed */
  var fixedFooter: Boolean = js.native
  /** If the header should be fixed */
  var fixedHeader: Boolean = js.native
  /** React Style object applied to footer toolbar */
  var footerToolbarStyle: CSSProperties = js.native
  /** 'default' or 'filter', filter mode shows a search box to reduce visible rows */
  var headerToolbarMode: typingsSlinky.materialUiDatatables.materialUiDatatablesStrings.default | filter | String = js.native
  /** The hight of the table */
  var height: js.Any = js.native
  /** If multiple table rows are select-able */
  var multiSelectable: Boolean = js.native
  var page: Double = js.native
  var rowSize: Double = js.native
  var rowSizeLabel: String = js.native
  var rowSizeList: js.Array[Double] = js.native
  /** If the table rows are select-able */
  var selectable: Boolean = js.native
  /** Show check-boxes for selected rows */
  var showCheckboxes: Boolean = js.native
  /** Shows a footer toolbar */
  var showFooterToolbar: Boolean = js.native
  /** Shows a header toolbar */
  var showHeaderToolbar: Boolean = js.native
  /** Show the icon to turn on the filtering feature */
  var showHeaderToolbarFilterIcon: Boolean = js.native
  /** Display a hover in the row under the mouse */
  var showRowHover: Boolean = js.native
  var showRowSizeControls: Boolean = js.native
  /** To display striped rows in the table */
  var stripedRows: Boolean = js.native
  /** React style object for the tbody tag */
  var tableBodyStyle: CSSProperties = js.native
  /** React style object for the th/td tag */
  var tableHeaderColumnStyle: CSSProperties = js.native
  /** React style object for the th tag */
  var tableHeaderStyle: CSSProperties = js.native
  /** React style object for the tr/td tag */
  var tableRowColumnStyle: CSSProperties = js.native
  /** React style object for the tr tag */
  var tableRowStyle: CSSProperties = js.native
  /** React style object for the table tag */
  var tableStyle: CSSProperties = js.native
  var tableWrapperStyle: CSSProperties = js.native
  /** Table title */
  var title: String = js.native
  /** React Style object for the title */
  var titleStyle: CSSProperties = js.native
  var toolbarIconRight: js.Any = js.native
  /** Callback when the cell is clicked. This callback is only active when selectable is false. */
  def onCellClick(rowIndex: Double, columnIndex: Double, row: js.Any, columnValue: js.Any, event: js.Any): Unit = js.native
  /** Similar to onCellClick, activated when the cell is double clicked. Fires even if rows are selectable. */
  def onCellDoubleClick(rowIndex: Double, columnIndex: Double, row: js.Any, columnValue: js.Any, event: js.Any): Unit = js.native
  /** Notification if the filter value changes */
  def onFilterValueChange(value: String): Unit = js.native
  def onNextPageClick(event: js.Any): Unit = js.native
  def onPreviousPageClick(event: js.Any): Unit = js.native
  def onRowSelection(selectedRows: js.Any): Unit = js.native
  def onRowSizeChange(index: Double, value: js.Any): Unit = js.native
  def onSortOrderChange(key: String, order: String): Unit = js.native
  /** Override the pagination display, ie. "1 - 5 of 11" Return any React node or string */
  def summaryLabelTemplate(start: Double, end: Double, count: Double): js.Any = js.native
}

object DataTableProps {
  @scala.inline
  def apply(
    columns: js.Array[Column],
    count: Double,
    data: js.Array[_],
    deselectOnClickaway: Boolean,
    enableSelectAll: Boolean,
    filterHintText: String,
    filterValue: String,
    fixedFooter: Boolean,
    fixedHeader: Boolean,
    footerToolbarStyle: CSSProperties,
    headerToolbarMode: typingsSlinky.materialUiDatatables.materialUiDatatablesStrings.default | filter | String,
    height: js.Any,
    multiSelectable: Boolean,
    onCellClick: (Double, Double, js.Any, js.Any, js.Any) => Unit,
    onCellDoubleClick: (Double, Double, js.Any, js.Any, js.Any) => Unit,
    onFilterValueChange: String => Unit,
    onNextPageClick: js.Any => Unit,
    onPreviousPageClick: js.Any => Unit,
    onRowSelection: js.Any => Unit,
    onRowSizeChange: (Double, js.Any) => Unit,
    onSortOrderChange: (String, String) => Unit,
    page: Double,
    rowSize: Double,
    rowSizeLabel: String,
    rowSizeList: js.Array[Double],
    selectable: Boolean,
    showCheckboxes: Boolean,
    showFooterToolbar: Boolean,
    showHeaderToolbar: Boolean,
    showHeaderToolbarFilterIcon: Boolean,
    showRowHover: Boolean,
    showRowSizeControls: Boolean,
    stripedRows: Boolean,
    summaryLabelTemplate: (Double, Double, Double) => js.Any,
    tableBodyStyle: CSSProperties,
    tableHeaderColumnStyle: CSSProperties,
    tableHeaderStyle: CSSProperties,
    tableRowColumnStyle: CSSProperties,
    tableRowStyle: CSSProperties,
    tableStyle: CSSProperties,
    tableWrapperStyle: CSSProperties,
    title: String,
    titleStyle: CSSProperties,
    toolbarIconRight: js.Any
  ): DataTableProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], deselectOnClickaway = deselectOnClickaway.asInstanceOf[js.Any], enableSelectAll = enableSelectAll.asInstanceOf[js.Any], filterHintText = filterHintText.asInstanceOf[js.Any], filterValue = filterValue.asInstanceOf[js.Any], fixedFooter = fixedFooter.asInstanceOf[js.Any], fixedHeader = fixedHeader.asInstanceOf[js.Any], footerToolbarStyle = footerToolbarStyle.asInstanceOf[js.Any], headerToolbarMode = headerToolbarMode.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], multiSelectable = multiSelectable.asInstanceOf[js.Any], onCellClick = js.Any.fromFunction5(onCellClick), onCellDoubleClick = js.Any.fromFunction5(onCellDoubleClick), onFilterValueChange = js.Any.fromFunction1(onFilterValueChange), onNextPageClick = js.Any.fromFunction1(onNextPageClick), onPreviousPageClick = js.Any.fromFunction1(onPreviousPageClick), onRowSelection = js.Any.fromFunction1(onRowSelection), onRowSizeChange = js.Any.fromFunction2(onRowSizeChange), onSortOrderChange = js.Any.fromFunction2(onSortOrderChange), page = page.asInstanceOf[js.Any], rowSize = rowSize.asInstanceOf[js.Any], rowSizeLabel = rowSizeLabel.asInstanceOf[js.Any], rowSizeList = rowSizeList.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], showCheckboxes = showCheckboxes.asInstanceOf[js.Any], showFooterToolbar = showFooterToolbar.asInstanceOf[js.Any], showHeaderToolbar = showHeaderToolbar.asInstanceOf[js.Any], showHeaderToolbarFilterIcon = showHeaderToolbarFilterIcon.asInstanceOf[js.Any], showRowHover = showRowHover.asInstanceOf[js.Any], showRowSizeControls = showRowSizeControls.asInstanceOf[js.Any], stripedRows = stripedRows.asInstanceOf[js.Any], summaryLabelTemplate = js.Any.fromFunction3(summaryLabelTemplate), tableBodyStyle = tableBodyStyle.asInstanceOf[js.Any], tableHeaderColumnStyle = tableHeaderColumnStyle.asInstanceOf[js.Any], tableHeaderStyle = tableHeaderStyle.asInstanceOf[js.Any], tableRowColumnStyle = tableRowColumnStyle.asInstanceOf[js.Any], tableRowStyle = tableRowStyle.asInstanceOf[js.Any], tableStyle = tableStyle.asInstanceOf[js.Any], tableWrapperStyle = tableWrapperStyle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleStyle = titleStyle.asInstanceOf[js.Any], toolbarIconRight = toolbarIconRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableProps]
  }
  @scala.inline
  implicit class DataTablePropsOps[Self <: DataTableProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[Column]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeselectOnClickaway(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectOnClickaway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableSelectAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSelectAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterHintText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterHintText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixedFooter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFixedHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooterToolbarStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerToolbarStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderToolbarMode(value: typingsSlinky.materialUiDatatables.materialUiDatatablesStrings.default | filter | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerToolbarMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiSelectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnCellClick(value: (Double, Double, js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellClick")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withOnCellDoubleClick(value: (Double, Double, js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCellDoubleClick")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withOnFilterValueChange(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilterValueChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnNextPageClick(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNextPageClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnPreviousPageClick(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreviousPageClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnRowSelection(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowSelection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnRowSizeChange(value: (Double, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRowSizeChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnSortOrderChange(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSortOrderChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowSizeLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSizeLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowSizeList(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSizeList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowCheckboxes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCheckboxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowFooterToolbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFooterToolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowHeaderToolbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeaderToolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowHeaderToolbarFilterIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeaderToolbarFilterIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowRowHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowRowSizeControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRowSizeControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStripedRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSummaryLabelTemplate(value: (Double, Double, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryLabelTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTableBodyStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBodyStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableHeaderColumnStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeaderColumnStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableHeaderStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeaderStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableRowColumnStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRowColumnStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableRowStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRowStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableWrapperStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableWrapperStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolbarIconRight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarIconRight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

