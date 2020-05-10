package typingsSlinky.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggered before every success event of TreeGrid action.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.native
  /** Triggered for every TreeGrid action success event.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.native
  /** Enables or disables the option for column reordering
    * @Default {false}
    */
  var allowColumnReordering: js.UndefOr[Boolean] = js.native
  /** Enables or disables the ability to resize the column width interactively.
    * @Default {false}
    */
  var allowColumnResize: js.UndefOr[Boolean] = js.native
  /** Enables or disables the ability to drag and drop the row interactively to reorder the rows.
    * @Default {false}
    */
  var allowDragAndDrop: js.UndefOr[Boolean] = js.native
  /** Enables or disables the ability to filter the data on all the columns. Enabling this property will display a row with editor controls corresponding to each column. You can
    * restrict filtering on particular column by disabling this property directly on that column instance itself.
    * @Default {false}
    */
  var allowFiltering: js.UndefOr[Boolean] = js.native
  /** Enables or disables keyboard navigation.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
  /** Enables or disables the ability to sort the rows based on multiple columns/fields by clicking on each column header. Rows will be sorted recursively on clicking the column headers.
    * @Default {false}
    */
  var allowMultiSorting: js.UndefOr[Boolean] = js.native
  /** Enables/disables pagination of rows in TreeGrid
    * @Default {false}
    */
  var allowPaging: js.UndefOr[Boolean] = js.native
  /** Enables or disables the toolbar searching in TreeGrid.
    * @Default {false}
    */
  var allowSearching: js.UndefOr[Boolean] = js.native
  /** Enables or disables the ability to select a row interactively.
    * @Default {true}
    */
  var allowSelection: js.UndefOr[Boolean] = js.native
  /** Enables or disables the ability to sort the rows based on a single field/column by clicking on that column header. When enabled, rows can be sorted only by single field/column.
    * @Default {false}
    */
  var allowSorting: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether the Content will wrap to the next line if the content exceeds the boundary of the Column Cells.
    * @Default {false}
    */
  var allowTextWrap: js.UndefOr[Boolean] = js.native
  /** Specifies the id of the template that has to be applied for alternate rows.
    */
  var altRowTemplateID: js.UndefOr[String] = js.native
  /** Triggered before the printing initiated in TreeGrid.
    */
  var beforePrint: js.UndefOr[js.Function1[/* e */ BeforePrintEventArgs, Unit]] = js.native
  /** Triggered while enter the edit mode in the TreeGrid cell
    */
  var beginEdit: js.UndefOr[js.Function1[/* e */ BeginEditEventArgs, Unit]] = js.native
  /** Triggered after selected a cell
    */
  var cellSelected: js.UndefOr[js.Function1[/* e */ CellSelectedEventArgs, Unit]] = js.native
  /** Triggered before selecting a cell
    */
  var cellSelecting: js.UndefOr[js.Function1[/* e */ CellSelectingEventArgs, Unit]] = js.native
  /** Specifies the template for cell tooltip
    * @Default {null}
    */
  var cellTooltipTemplate: js.UndefOr[String] = js.native
  /** Specifies the mapping property path for sub tasks in datasource
    */
  var childMapping: js.UndefOr[String] = js.native
  /** Triggered after collapsed the TreeGrid record
    */
  var collapsed: js.UndefOr[js.Function1[/* e */ CollapsedEventArgs, Unit]] = js.native
  /** Enables or disables the expandable/collapsible footer summary row. By default expander icon for footer summary will be rendered in first column of first summary row.
    * @Default {false}
    */
  var collapsibleTotalSummary: js.UndefOr[Boolean] = js.native
  /** Triggered while collapsing the TreeGrid record
    */
  var collapsing: js.UndefOr[js.Function1[/* e */ CollapsingEventArgs, Unit]] = js.native
  /** To Specify the column fields to be displayed in the dialog while inserting a column using column menu.
    * @Default {[]}
    */
  var columnDialogFields: js.UndefOr[js.Array[_]] = js.native
  /** Triggered while dragging a column
    */
  var columnDrag: js.UndefOr[js.Function1[/* e */ ColumnDragEventArgs, Unit]] = js.native
  /** Triggered  when you start to drag a column
    */
  var columnDragStart: js.UndefOr[js.Function1[/* e */ ColumnDragStartEventArgs, Unit]] = js.native
  /** Triggered when a column is dropped
    */
  var columnDrop: js.UndefOr[js.Function1[/* e */ ColumnDropEventArgs, Unit]] = js.native
  /** Triggered when a column has been resized
    */
  var columnResizeEnd: js.UndefOr[js.Function1[/* e */ ColumnResizeEndEventArgs, Unit]] = js.native
  /** Specifies the settings for column resize
    */
  var columnResizeSettings: js.UndefOr[ColumnResizeSettings] = js.native
  /** Triggered while start to resize a column
    */
  var columnResizeStart: js.UndefOr[js.Function1[/* e */ ColumnResizeStartEventArgs, Unit]] = js.native
  /** Triggered after a column resized
    */
  var columnResized: js.UndefOr[js.Function1[/* e */ ColumnResizedEventArgs, Unit]] = js.native
  /** Option for adding columns; each column has the option to bind to a field in the dataSource.
    */
  var columns: js.UndefOr[js.Array[Column]] = js.native
  /** Defines the common width for all the columns in TreeGrid
    * @Default {150}
    */
  var commonWidth: js.UndefOr[Double] = js.native
  /** Triggered while Context Menu is rendered in TreeGrid control
    */
  var contextMenuOpen: js.UndefOr[js.Function1[/* e */ ContextMenuOpenEventArgs, Unit]] = js.native
  /** Options for displaying and customizing context menu items.
    */
  var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.native
  /** Triggered when TreeGrid is rendered completely
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Specify the CSS class for TreeGrid to achieve custom theme.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Specifies hierarchical or self-referential data to populate the TreeGrid.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Array[_]] = js.native
  /** Triggered while rendering details template in TreeGrid
    */
  var detailsDataBound: js.UndefOr[js.Function1[/* e */ DetailsDataBoundEventArgs, Unit]] = js.native
  /** Triggered when details template pop-up is hidden.
    */
  var detailsHidden: js.UndefOr[js.Function1[/* e */ DetailsHiddenEventArgs, Unit]] = js.native
  /** Specifies the row height of the details view
    * @Default {100}
    */
  var detailsRowHeight: js.UndefOr[Double] = js.native
  /** Triggered when details template pop-up is shown.
    */
  var detailsShown: js.UndefOr[js.Function1[/* e */ DetailsShownEventArgs, Unit]] = js.native
  /** Specifies the template for details view
    */
  var detailsTemplate: js.UndefOr[String] = js.native
  /** Options for displaying and customizing the tooltip. This tooltip will show the preview of the row that is being dragged.
    */
  var dragTooltip: js.UndefOr[DragTooltip] = js.native
  /** Options for enabling and configuring the editing related operations.
    */
  var editSettings: js.UndefOr[EditSettings] = js.native
  /** Specifies whether to render alternate rows in different background colors.
    * @Default {true}
    */
  var enableAltRow: js.UndefOr[Boolean] = js.native
  /** Specifies whether to load all the rows in collapsed state when the TreeGrid is rendered for the first time.
    * @Default {false}
    */
  var enableCollapseAll: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable load on demand approach, for rendering child records and page records.
    * @Default {false}
    */
  var enableLoadOnDemand: js.UndefOr[Boolean] = js.native
  /** Specifies whether to resize TreeGrid whenever window size changes.
    * @Default {false}
    */
  var enableResize: js.UndefOr[Boolean] = js.native
  /** Specifies whether to render only the visual elements that are visible in the UI. When you enable this property, it will reduce the loading time for loading large number of records.
    * @Default {false}
    */
  var enableVirtualization: js.UndefOr[Boolean] = js.native
  /** Triggered after saved the modified cellValue in TreeGrid
    */
  var endEdit: js.UndefOr[js.Function1[/* e */ EndEditEventArgs, Unit]] = js.native
  /** Specifies the mapping property path for the expand status of a record in data source.
    */
  var expandStateMapping: js.UndefOr[String] = js.native
  /** Triggered after expand the record
    */
  var expanded: js.UndefOr[js.Function1[/* e */ ExpandedEventArgs, Unit]] = js.native
  /** Triggered while expanding the TreeGrid record
    */
  var expanding: js.UndefOr[js.Function1[/* e */ ExpandingEventArgs, Unit]] = js.native
  /** Options for filtering and customizing filter actions.
    */
  var filterSettings: js.UndefOr[FilterSettings] = js.native
  /** Specifies whether to wrap the header text when it is overflown i.e., when it exceeds the header width.
    * @Default {ej.TreeGrid.HeaderTextOverflow.None}
    */
  var headerTextOverflow: js.UndefOr[HeaderTextOverflow | String] = js.native
  /** Specifies the name of the field in the dataSource, which contains the id of that row.
    */
  var idMapping: js.UndefOr[String] = js.native
  /** Enables or disables the responsiveness of TreeGrid
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Triggered while Treegrid is loaded
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  /** Specifies the localization information to customize the User Interface (UI) to support regional language and culture
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Specifies the options for customizing the pager.
    */
  var pageSettings: js.UndefOr[PageSettings] = js.native
  /** Specifies the name of the field in the dataSource, which contains the parent's id. This is necessary to form a parent-child hierarchy, if the dataSource contains self-referential
    * data.
    */
  var parentIdMapping: js.UndefOr[String] = js.native
  /** Enables or disables internal parsing of a row. When disabled this property, row will be displayed using the defined template without any internal event bindings.
    * @Default {true}
    */
  var parseRowTemplate: js.UndefOr[Boolean] = js.native
  /** Specifies ej.Query to select data from the dataSource. This property is applicable only when the dataSource is ej.DataManager.
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.native
  /** Triggered while rendering each cell in the TreeGrid
    */
  var queryCellInfo: js.UndefOr[js.Function1[/* e */ QueryCellInfoEventArgs, Unit]] = js.native
  /** Triggered while clicking a row, even when allowSelection property is disabled.
    */
  var recordClick: js.UndefOr[js.Function1[/* e */ RecordClickEventArgs, Unit]] = js.native
  /** Triggered during record double click action, even when allowSelection property is disabled.
    */
  var recordDoubleClick: js.UndefOr[js.Function1[/* e */ RecordDoubleClickEventArgs, Unit]] = js.native
  /** Triggered while rendering each row
    */
  var rowDataBound: js.UndefOr[js.Function1[/* e */ RowDataBoundEventArgs, Unit]] = js.native
  /** Triggered while dragging a row in TreeGrid control
    */
  var rowDrag: js.UndefOr[js.Function1[/* e */ RowDragEventArgs, Unit]] = js.native
  /** Triggered while start to drag row in TreeGrid control
    */
  var rowDragStart: js.UndefOr[js.Function1[/* e */ RowDragStartEventArgs, Unit]] = js.native
  /** Triggered while drop a row in TreeGrid control
    */
  var rowDragStop: js.UndefOr[js.Function1[/* e */ RowDragStopEventArgs, Unit]] = js.native
  /** Triggered before row drop action begins.
    */
  var rowDropActionBegin: js.UndefOr[js.Function1[/* e */ RowDropActionBeginEventArgs, Unit]] = js.native
  /** Specifies the height of a single row in tree grid. Also, we need to set same height in the CSS style with class name e-rowcell.
    * @Default {30}
    */
  var rowHeight: js.UndefOr[Double] = js.native
  /** Triggered after the row is selected.
    */
  var rowSelected: js.UndefOr[js.Function1[/* e */ RowSelectedEventArgs, Unit]] = js.native
  /** Triggered before the row is going to be selected.
    */
  var rowSelecting: js.UndefOr[js.Function1[/* e */ RowSelectingEventArgs, Unit]] = js.native
  /** Specifies the id of the template to be applied for all the rows.
    */
  var rowTemplateID: js.UndefOr[String] = js.native
  /** Specifies the toolbar searching customizations.
    */
  var searchSettings: js.UndefOr[SearchSettings] = js.native
  /** Specifies the selected cell information on rendering TreeGrid.
    */
  var selectedCellIndexes: js.UndefOr[js.Array[SelectedCellIndex]] = js.native
  /** Specifies the index of the selected row.
    * @Default {-1}
    */
  var selectedRowIndex: js.UndefOr[Double] = js.native
  /** Specifies the settings for row and cell selection.
    */
  var selectionSettings: js.UndefOr[SelectionSettings] = js.native
  /** Controls the visibility of the menu button, which is displayed on the column header. Clicking on this button will show a popup menu. When you choose Columns item from this popup,
    * a list box with column names will be shown, from which you can select/deselect a column name to control the visibility of the respective columns.
    * @Default {false}
    */
  var showColumnChooser: js.UndefOr[Boolean] = js.native
  /** Enables/disables the options for inserting , deleting and renaming  columns.
    * @Default {false}
    */
  var showColumnOptions: js.UndefOr[Boolean] = js.native
  /** Specifies the visibility of details view
    * @Default {false}
    */
  var showDetailsRow: js.UndefOr[Boolean] = js.native
  /** Specifies the visibility of the expander column which is used to expand or collapse the details view
    * @Default {false}
    */
  var showDetailsRowInfoColumn: js.UndefOr[Boolean] = js.native
  /** Specifies whether to show tooltip when mouse is hovered on the cell.
    * @Default {true}
    */
  var showGridCellTooltip: js.UndefOr[Boolean] = js.native
  /** Specifies whether to show tooltip for the cells, which has expander button.
    * @Default {true}
    */
  var showGridExpandCellTooltip: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates stacked header should be shown on TreeGrid layout when the property â€œstackedHeaderRowsâ€ is set.
    * @Default {false}
    */
  var showStackedHeader: js.UndefOr[Boolean] = js.native
  /** Specifies the visibility of summary row
    * @Default {false}
    */
  var showSummaryRow: js.UndefOr[Boolean] = js.native
  /** Specifies the visibility of total summary row for the corresponding summary column
    * @Default {false}
    */
  var showTotalSummary: js.UndefOr[Boolean] = js.native
  /** Options for setting width and height for TreeGrid.
    */
  var sizeSettings: js.UndefOr[SizeSettings] = js.native
  /** Options for sorting the rows.
    */
  var sortSettings: js.UndefOr[SortSettings] = js.native
  /** Gets or sets an object that indicates to managing the collection of stacked header rows for the TreeGrid.
    * @Default {[]}
    */
  var stackedHeaderRows: js.UndefOr[js.Array[StackedHeaderRow]] = js.native
  /** Specifies the summary row collection object to be displayed
    * @Default {[]}
    */
  var summaryRows: js.UndefOr[js.Array[SummaryRow]] = js.native
  /** Triggered when toolbar item is clicked in TreeGrid.
    */
  var toolbarClick: js.UndefOr[js.Function1[/* e */ ToolbarClickEventArgs, Unit]] = js.native
  /** Options for displaying and customizing the toolbar items.
    */
  var toolbarSettings: js.UndefOr[ToolbarSettings] = js.native
  /** Specifies the height of footer summary container.
    * @Default {90}
    */
  var totalSummaryHeight: js.UndefOr[Double] = js.native
  /** Specifies the index of the column that needs to have the expander button. By default, cells in the first column contain the expander button.
    * @Default {0}
    */
  var treeColumnIndex: js.UndefOr[Double] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionBegin(value: /* e */ ActionBeginEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionBegin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionBegin")(js.undefined)
        ret
    }
    @scala.inline
    def withActionComplete(value: /* e */ ActionCompleteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowColumnReordering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowColumnReordering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowColumnReordering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowColumnReordering")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowColumnResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowColumnResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowColumnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowColumnResize")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDragAndDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDragAndDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDragAndDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDragAndDrop")(js.undefined)
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
    def withAllowKeyboardNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowKeyboardNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowKeyboardNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowKeyboardNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowMultiSorting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMultiSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiSorting")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowPaging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPaging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowPaging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPaging")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowSearching(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSearching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSearching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSearching")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSelection")(js.undefined)
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
    def withAllowTextWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTextWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowTextWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTextWrap")(js.undefined)
        ret
    }
    @scala.inline
    def withAltRowTemplateID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altRowTemplateID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltRowTemplateID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altRowTemplateID")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforePrint(value: /* e */ BeforePrintEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePrint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforePrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePrint")(js.undefined)
        ret
    }
    @scala.inline
    def withBeginEdit(value: /* e */ BeginEditEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginEdit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeginEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withCellSelected(value: /* e */ CellSelectedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withCellSelecting(value: /* e */ CellSelectingEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSelecting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellSelecting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSelecting")(js.undefined)
        ret
    }
    @scala.inline
    def withCellTooltipTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTooltipTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellTooltipTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTooltipTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withChildMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsed(value: /* e */ CollapsedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsibleTotalSummary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsibleTotalSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsibleTotalSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsibleTotalSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsing(value: /* e */ CollapsingEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCollapsing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsing")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnDialogFields(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDialogFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnDialogFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDialogFields")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnDrag(value: /* e */ ColumnDragEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutColumnDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnDragStart(value: /* e */ ColumnDragStartEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutColumnDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnDrop(value: /* e */ ColumnDropEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDrop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutColumnDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnResizeEnd(value: /* e */ ColumnResizeEndEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnResizeEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutColumnResizeEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnResizeEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnResizeSettings(value: ColumnResizeSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnResizeSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnResizeSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnResizeSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnResizeStart(value: /* e */ ColumnResizeStartEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnResizeStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutColumnResizeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnResizeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnResized(value: /* e */ ColumnResizedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnResized")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutColumnResized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnResized")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[Column]): Self = {
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
    def withCommonWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommonWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withContextMenuOpen(value: /* e */ ContextMenuOpenEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContextMenuOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withContextMenuSettings(value: ContextMenuSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextMenuSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: /* e */ CreateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Array[_]): Self = {
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
    def withDetailsDataBound(value: /* e */ DetailsDataBoundEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailsDataBound")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDetailsDataBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailsDataBound")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailsHidden(value: /* e */ DetailsHiddenEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailsHidden")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDetailsHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailsHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailsRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailsRowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailsRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailsRowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailsShown(value: /* e */ DetailsShownEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailsShown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDetailsShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailsShown")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailsTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailsTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailsTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailsTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withDragTooltip(value: DragTooltip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withEditSettings(value: EditSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAltRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAltRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAltRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAltRow")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCollapseAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCollapseAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCollapseAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCollapseAll")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableLoadOnDemand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLoadOnDemand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLoadOnDemand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLoadOnDemand")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableResize")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableVirtualization(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableVirtualization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableVirtualization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableVirtualization")(js.undefined)
        ret
    }
    @scala.inline
    def withEndEdit(value: /* e */ EndEditEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endEdit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEndEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandStateMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandStateMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandStateMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandStateMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withExpanded(value: /* e */ ExpandedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(js.undefined)
        ret
    }
    @scala.inline
    def withExpanding(value: /* e */ ExpandingEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanding")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExpanding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanding")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterSettings(value: FilterSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTextOverflow(value: HeaderTextOverflow | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTextOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTextOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTextOverflow")(js.undefined)
        ret
    }
    @scala.inline
    def withIdMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withIsResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad(value: /* e */ LoadEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSettings(value: PageSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withParentIdMapping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentIdMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentIdMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentIdMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withParseRowTemplate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseRowTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParseRowTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseRowTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryCellInfo(value: /* e */ QueryCellInfoEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryCellInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutQueryCellInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryCellInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordClick(value: /* e */ RecordClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRecordClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordClick")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordDoubleClick(value: /* e */ RecordDoubleClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordDoubleClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRecordDoubleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordDoubleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDataBound(value: /* e */ RowDataBoundEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDataBound")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowDataBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDataBound")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDrag(value: /* e */ RowDragEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDragStart(value: /* e */ RowDragStartEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDragStop(value: /* e */ RowDragStopEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDragStop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowDragStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDragStop")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDropActionBegin(value: /* e */ RowDropActionBeginEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDropActionBegin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowDropActionBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDropActionBegin")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSelected(value: /* e */ RowSelectedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withRowSelecting(value: /* e */ RowSelectingEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelecting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowSelecting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowSelecting")(js.undefined)
        ret
    }
    @scala.inline
    def withRowTemplateID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowTemplateID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowTemplateID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowTemplateID")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchSettings(value: SearchSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedCellIndexes(value: js.Array[SelectedCellIndex]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedCellIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedCellIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedCellIndexes")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRowIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedRowIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRowIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionSettings(value: SelectionSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withShowColumnChooser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnChooser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowColumnChooser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnChooser")(js.undefined)
        ret
    }
    @scala.inline
    def withShowColumnOptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowColumnOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumnOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDetailsRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDetailsRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDetailsRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDetailsRow")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDetailsRowInfoColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDetailsRowInfoColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDetailsRowInfoColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDetailsRowInfoColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withShowGridCellTooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGridCellTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowGridCellTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGridCellTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withShowGridExpandCellTooltip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGridExpandCellTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowGridExpandCellTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showGridExpandCellTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withShowStackedHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showStackedHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowStackedHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showStackedHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSummaryRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSummaryRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSummaryRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSummaryRow")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTotalSummary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTotalSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTotalSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTotalSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeSettings(value: SizeSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSortSettings(value: SortSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withStackedHeaderRows(value: js.Array[StackedHeaderRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedHeaderRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackedHeaderRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackedHeaderRows")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryRows(value: js.Array[SummaryRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryRows")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarClick(value: /* e */ ToolbarClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToolbarClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarClick")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarSettings(value: ToolbarSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalSummaryHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSummaryHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalSummaryHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSummaryHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeColumnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeColumnIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeColumnIndex")(js.undefined)
        ret
    }
  }
  
}

