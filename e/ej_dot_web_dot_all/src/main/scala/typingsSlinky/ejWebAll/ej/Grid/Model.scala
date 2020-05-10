package typingsSlinky.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggered for every grid action before its starts.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.native
  /** Triggered for every grid action success event.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.native
  /** Triggered for every grid action server failure event.
    */
  var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, Unit]] = js.native
  /** Gets or sets a value that indicates whether to customizing cell based on our needs.
    * @Default {false}
    */
  var allowCellMerging: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable dynamic filtering behavior on grid. Filtering can be used to limit the records displayed using required criteria and this can
    * be further customized through â€œfilterSettingsâ€ property
    * @Default {false}
    */
  var allowFiltering: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable dynamic grouping behavior. Grouping can be done by drag on drop desired columns to gridâ€™s GroupDropArea. This can be
    * further customized through â€œgroupSettingsâ€ property.
    * @Default {false}
    */
  var allowGrouping: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable keyboard support for performing grid actions. selectionType â€“ Gets or sets a value that indicates whether to enable single
    * row or multiple rows selection behavior in grid. Multiple selection can be done through by holding CTRL and clicking the grid rows
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable multi columns sorting behavior in grid. Sort multiple columns by holding CTRL and click on the corresponding column header.
    * @Default {false}
    */
  var allowMultiSorting: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable the multiple exporting behavior on grid data.
    * @Default {false}
    */
  var allowMultipleExporting: js.UndefOr[Boolean] = js.native
  /** This specifies the grid to show the paginated data. Also enables pager control at the bottom of grid for dynamic navigation through data source. Paging can be further customized
    * through â€œpageSettingsâ€ property.
    * @Default {false}
    */
  var allowPaging: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable the columns reordering behavior in the grid. Reordering can be done through by drag and drop the particular column from one
    * index to another index within the grid.
    * @Default {false}
    */
  var allowReordering: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether the column is non resizable. Column width is set automatically based on the content or header text which is large.
    * @Default {false}
    */
  var allowResizeToFit: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable dynamic resizable of columns. Resize the width of the columns by simply click and move the particular column header line
    * @Default {false}
    */
  var allowResizing: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable the rows reordering in Grid and drag &amp; drop rows between multiple Grid.
    * @Default {false}
    */
  var allowRowDragAndDrop: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable the scrollbar in the grid and view the records by scroll through the grid manually
    * @Default {false}
    */
  var allowScrolling: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable dynamic searching behavior in grid. Currently search box can be enabled through â€œtoolbarSettingsâ€
    * @Default {false}
    */
  var allowSearching: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether user can select rows on grid. On enabling feature, selected row will be highlighted.
    * @Default {true}
    */
  var allowSelection: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable the dynamic sorting behavior on grid data. Sorting can be done through clicking on particular column header.
    * @Default {false}
    */
  var allowSorting: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether the Content will wrap to the next line if the content exceeds the boundary of the Column Cells.
    * @Default {false}
    */
  var allowTextWrap: js.UndefOr[Boolean] = js.native
  /** Triggered when record batch add.
    */
  var batchAdd: js.UndefOr[js.Function1[/* e */ BatchAddEventArgs, Unit]] = js.native
  /** Triggered when record batch delete.
    */
  var batchDelete: js.UndefOr[js.Function1[/* e */ BatchDeleteEventArgs, Unit]] = js.native
  /** Triggered before the batch add.
    */
  var beforeBatchAdd: js.UndefOr[js.Function1[/* e */ BeforeBatchAddEventArgs, Unit]] = js.native
  /** Triggered before the batch delete.
    */
  var beforeBatchDelete: js.UndefOr[js.Function1[/* e */ BeforeBatchDeleteEventArgs, Unit]] = js.native
  /** Triggered before the batch save.
    */
  var beforeBatchSave: js.UndefOr[js.Function1[/* e */ BeforeBatchSaveEventArgs, Unit]] = js.native
  /** Triggered before the print.
    */
  var beforePrint: js.UndefOr[js.Function1[/* e */ BeforePrintEventArgs, Unit]] = js.native
  /** Triggered before row drop in the grid
    */
  var beforeRowDrop: js.UndefOr[js.Function1[/* e */ BeforeRowDropEventArgs, Unit]] = js.native
  /** Triggered before the record is going to be edited.
    */
  var beginEdit: js.UndefOr[js.Function1[/* e */ BeginEditEventArgs, Unit]] = js.native
  /** Triggered after the cell is deselected.
    */
  var cellDeselected: js.UndefOr[js.Function1[/* e */ CellDeselectedEventArgs, Unit]] = js.native
  /** Triggered before the cell is going to be deselected.
    */
  var cellDeselecting: js.UndefOr[js.Function1[/* e */ CellDeselectingEventArgs, Unit]] = js.native
  /** Triggered when record cell edit.
    */
  var cellEdit: js.UndefOr[js.Function1[/* e */ CellEditEventArgs, Unit]] = js.native
  /** Triggered when record cell save.
    */
  var cellSave: js.UndefOr[js.Function1[/* e */ CellSaveEventArgs, Unit]] = js.native
  /** Triggered after the cell is selected.
    */
  var cellSelected: js.UndefOr[js.Function1[/* e */ CellSelectedEventArgs, Unit]] = js.native
  /** Triggered before the cell is going to be selected.
    */
  var cellSelecting: js.UndefOr[js.Function1[/* e */ CellSelectingEventArgs, Unit]] = js.native
  /** This specifies the grid to add the grid control inside the grid row of the parent with expand/collapse options
    * @Default {null}
    */
  var childGrid: js.UndefOr[js.Any] = js.native
  /** Triggered after the column is deselected.
    */
  var columnDeselected: js.UndefOr[js.Function1[/* e */ ColumnDeselectedEventArgs, Unit]] = js.native
  /** Triggered before the column is going to be deselected.
    */
  var columnDeselecting: js.UndefOr[js.Function1[/* e */ ColumnDeselectingEventArgs, Unit]] = js.native
  /** Triggered when the column is being dragged.
    */
  var columnDrag: js.UndefOr[js.Function1[/* e */ ColumnDragEventArgs, Unit]] = js.native
  /** Triggered when column dragging begins.
    */
  var columnDragStart: js.UndefOr[js.Function1[/* e */ ColumnDragStartEventArgs, Unit]] = js.native
  /** Triggered when the column is dropped.
    */
  var columnDrop: js.UndefOr[js.Function1[/* e */ ColumnDropEventArgs, Unit]] = js.native
  /** Used to enable or disable static width settings for column. If the columnLayout is set as fixed, then column width will be static.
    * @Default {ej.Grid.ColumnLayout.Auto}
    */
  var columnLayout: js.UndefOr[ColumnLayout | String] = js.native
  /** Triggered after the column is selected.
    */
  var columnSelected: js.UndefOr[js.Function1[/* e */ ColumnSelectedEventArgs, Unit]] = js.native
  /** Triggered before the column is going to be selected.
    */
  var columnSelecting: js.UndefOr[js.Function1[/* e */ ColumnSelectingEventArgs, Unit]] = js.native
  /** Gets or sets an object that indicates to render the grid with specified columns
    * @Default {[]}
    */
  var columns: js.UndefOr[js.Array[Column]] = js.native
  /** Gets or sets a value that indicates to define common width for all the columns in the grid.
    */
  var commonWidth: js.UndefOr[Double] = js.native
  /** Triggered when context menu item is clicked
    */
  var contextClick: js.UndefOr[js.Function1[/* e */ ContextClickEventArgs, Unit]] = js.native
  /** Gets or sets an object that indicates whether to customize the context menu behavior of the grid.
    */
  var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.native
  /** Triggered before the context menu is opened.
    */
  var contextOpen: js.UndefOr[js.Function1[/* e */ ContextOpenEventArgs, Unit]] = js.native
  /** Triggered when the grid is rendered completely.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Gets or sets a value that indicates to render the grid with custom theme.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Triggered when the grid is bound with data during initial rendering.
    */
  var dataBound: js.UndefOr[js.Function1[/* e */ DataBoundEventArgs, Unit]] = js.native
  /** Gets or sets the data to render the grid with records
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /** Triggered when grid going to destroy.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Triggered when detail template row is clicked to collapse.
    */
  var detailsCollapse: js.UndefOr[js.Function1[/* e */ DetailsCollapseEventArgs, Unit]] = js.native
  /** Triggered detail template row is initialized.
    */
  var detailsDataBound: js.UndefOr[js.Function1[/* e */ DetailsDataBoundEventArgs, Unit]] = js.native
  /** Triggered when detail template row is clicked to expand.
    */
  var detailsExpand: js.UndefOr[js.Function1[/* e */ DetailsExpandEventArgs, Unit]] = js.native
  /** Default Value:
    * @Default {null}
    */
  var detailsTemplate: js.UndefOr[String] = js.native
  /** Gets or sets an object that indicates whether to customize the editing behavior of the grid.
    */
  var editSettings: js.UndefOr[EditSettings] = js.native
  /** Gets or sets a value that indicates whether to enable the alternative rows differentiation in the grid records based on corresponding theme.
    * @Default {true}
    */
  var enableAltRow: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable the save action in the grid through row selection
    * @Default {true}
    */
  var enableAutoSaveOnSelectionChange: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable mouse over effect on the corresponding column header cell of the grid
    * @Default {false}
    */
  var enableHeaderHover: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to persist the grid model state in page using applicable medium i.e., HTML5 localStorage or cookies
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  /** Align content in the grid control from right to left by setting the property as true.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether the grid rows has to be rendered as detail view in mobile mode
    * @Default {false}
    */
  var enableResponsiveRow: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable mouse over effect on corresponding grid row.
    * @Default {true}
    */
  var enableRowHover: js.UndefOr[Boolean] = js.native
  /** It sets a value that indicates whether to enable toolbar items, when allowEditing, allowAdding and allowDeleting property set as false in the grid.
    * @Default {false}
    */
  var enableToolbarItems: js.UndefOr[Boolean] = js.native
  /** To Disable the mouse swipe property as false.
    * @Default {true}
    */
  var enableTouch: js.UndefOr[Boolean] = js.native
  /** Triggered after the record is added.
    */
  var endAdd: js.UndefOr[js.Function1[/* e */ EndAddEventArgs, Unit]] = js.native
  /** Triggered after the record is deleted.
    */
  var endDelete: js.UndefOr[js.Function1[/* e */ EndDeleteEventArgs, Unit]] = js.native
  /** Triggered after the record is edited.
    */
  var endEdit: js.UndefOr[js.Function1[/* e */ EndEditEventArgs, Unit]] = js.native
  /** Act as mapper for the excel exporting URL.
    * @Default {ExportToExcel}
    */
  var exportToExcelAction: js.UndefOr[String] = js.native
  /** Act as mapper for the PDF exporting URL.
    * @Default {ExportToPdf}
    */
  var exportToPdfAction: js.UndefOr[String] = js.native
  /** Act as mapper for the Word exporting URL.
    * @Default {ExportToWord}
    */
  var exportToWordAction: js.UndefOr[String] = js.native
  /** Gets or sets an object that indicates whether to customize the filtering behavior of the grid
    */
  var filterSettings: js.UndefOr[FilterSettings] = js.native
  /** Gets or sets a value that indicates to enable the visibility of the grid lines.
    * @Default {ej.Grid.GridLines.Both}
    */
  var gridLines: js.UndefOr[GridLines | String] = js.native
  /** Gets or sets an object that indicates whether to customize the grouping behavior of the grid.
    */
  var groupSettings: js.UndefOr[GroupSettings] = js.native
  /** Gets or sets a value that indicates whether the grid design has be to made responsive.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** This specifies to change the key in keyboard interaction to grid control
    * @Default {null}
    */
  var keySettings: js.UndefOr[js.Any] = js.native
  /** Triggered initial load.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  /** Gets or sets a value that indicates whether to customizing the user interface (UI) as locale-specific in order to display regional data i.e. in a language and culture specific to
    * a particular country or region.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Triggered every time a request is made to access particular cell information, element and data.
    */
  var mergeCellInfo: js.UndefOr[js.Function1[/* e */ MergeCellInfoEventArgs, Unit]] = js.native
  /** Triggered every time a request is made to access particular header cell information, element and data.
    */
  var mergeHeaderCellInfo: js.UndefOr[js.Function1[/* e */ MergeHeaderCellInfoEventArgs, Unit]] = js.native
  /** Gets or sets a value that indicates whether to set the minimum width of the responsive grid while isResponsive property is true and enableResponsiveRow property is set as false.
    * @Default {0}
    */
  var minWidth: js.UndefOr[Double] = js.native
  /** Gets or sets an object that indicates whether to modify the pager default configuration.
    */
  var pageSettings: js.UndefOr[PageSettings] = js.native
  /** Query the dataSource from the table for Grid.
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.native
  /** Triggered every time a request is made to access particular cell information, element and data.
    */
  var queryCellInfo: js.UndefOr[js.Function1[/* e */ QueryCellInfoEventArgs, Unit]] = js.native
  /** Triggered when record is clicked.
    */
  var recordClick: js.UndefOr[js.Function1[/* e */ RecordClickEventArgs, Unit]] = js.native
  /** Triggered when record is double clicked.
    */
  var recordDoubleClick: js.UndefOr[js.Function1[/* e */ RecordDoubleClickEventArgs, Unit]] = js.native
  /** Triggered when column resize end.
    */
  var resizeEnd: js.UndefOr[js.Function1[/* e */ ResizeEndEventArgs, Unit]] = js.native
  /** Gets or sets an object that indicates whether to modify the resizing behavior.
    */
  var resizeSettings: js.UndefOr[ResizeSettings] = js.native
  /** Triggered when column resize start.
    */
  var resizeStart: js.UndefOr[js.Function1[/* e */ ResizeStartEventArgs, Unit]] = js.native
  /** Triggered after column resized.
    */
  var resized: js.UndefOr[js.Function1[/* e */ ResizedEventArgs, Unit]] = js.native
  /** Triggered when right clicked on grid element.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.native
  /** Triggered every time a request is made to access row information, element and data.
    */
  var rowDataBound: js.UndefOr[js.Function1[/* e */ RowDataBoundEventArgs, Unit]] = js.native
  /** Triggered after the row is deselected.
    */
  var rowDeselected: js.UndefOr[js.Function1[/* e */ RowDeselectedEventArgs, Unit]] = js.native
  /** Triggered before the row is going to be deselected.
    */
  var rowDeselecting: js.UndefOr[js.Function1[/* e */ RowDeselectingEventArgs, Unit]] = js.native
  /** Triggered when the row is being dragged.
    */
  var rowDrag: js.UndefOr[js.Function1[/* e */ RowDragEventArgs, Unit]] = js.native
  /** Triggered when row dragging begins.
    */
  var rowDragStart: js.UndefOr[js.Function1[/* e */ RowDragStartEventArgs, Unit]] = js.native
  /** Triggered when the row is dropped.
    */
  var rowDrop: js.UndefOr[js.Function1[/* e */ RowDropEventArgs, Unit]] = js.native
  /** Gets or sets an object that indicates whether to customize the drag and drop behavior of the grid rows
    */
  var rowDropSettings: js.UndefOr[RowDropSettings] = js.native
  /** Triggered while hover the grid row.
    */
  var rowHover: js.UndefOr[js.Function1[/* e */ RowHoverEventArgs, Unit]] = js.native
  /** Triggered after the row is selected.
    */
  var rowSelected: js.UndefOr[js.Function1[/* e */ RowSelectedEventArgs, Unit]] = js.native
  /** Triggered before the row is going to be selected.
    */
  var rowSelecting: js.UndefOr[js.Function1[/* e */ RowSelectingEventArgs, Unit]] = js.native
  /** Gets or sets a value that indicates to render the grid with template rows. The template row must be a table row. That table row must have the JavaScript render binding format
    * ({{:columnName}}) then the grid data source binds the data to the corresponding table row of the template.
    * @Default {null}
    */
  var rowTemplate: js.UndefOr[String] = js.native
  /** Gets or sets an object that indicates whether to customize the scrolling behavior of the grid.
    */
  var scrollSettings: js.UndefOr[ScrollSettings] = js.native
  /** Gets or sets an object that indicates whether to customize the searching behavior of the grid
    */
  var searchSettings: js.UndefOr[SearchSettings] = js.native
  /** Gets a value that display the array of selected records in the Grid.
    * @Default {null}
    */
  var selectedRecords: js.UndefOr[js.Array[_]] = js.native
  /** Gets or sets a value that indicates to select the row while initializing the grid
    * @Default {-1}
    */
  var selectedRowIndex: js.UndefOr[Double] = js.native
  /** Gets or sets a value that indicates the selected rows in grid
    * @Default {[]}
    */
  var selectedRowIndices: js.UndefOr[js.Array[_]] = js.native
  /** This property is used to configure the selection behavior of the grid.
    */
  var selectionSettings: js.UndefOr[SelectionSettings] = js.native
  /** The row selection behavior of grid. Accepting types are &quot;single&quot; and &quot;multiple&quot;.
    * @Default {ej.Grid.SelectionType.Single}
    */
  var selectionType: js.UndefOr[SelectionType | String] = js.native
  /** Default Value:
    * @Default {false}
    */
  var showColumnChooser: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates stacked header should be shown on grid layout when the property â€œstackedHeaderRowsâ€ is set.
    * @Default {false}
    */
  var showStackedHeader: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates summary rows should be shown on grid layout when the property â€œsummaryRowsâ€ is set
    * @Default {false}
    */
  var showSummary: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to customize the sorting behavior of the grid.
    */
  var sortSettings: js.UndefOr[SortSettings] = js.native
  /** Gets or sets an object that indicates to managing the collection of stacked header rows for the grid.
    * @Default {[]}
    */
  var stackedHeaderRows: js.UndefOr[js.Array[StackedHeaderRow]] = js.native
  /** Gets or sets an object that indicates to managing the collection of summary rows for the grid.
    * @Default {[]}
    */
  var summaryRows: js.UndefOr[js.Array[SummaryRow]] = js.native
  /** Triggered when refresh the template column elements in the Grid.
    */
  var templateRefresh: js.UndefOr[js.Function1[/* e */ TemplateRefreshEventArgs, Unit]] = js.native
  /** Gets or sets an object that indicates whether to auto wrap the grid header or content or both
    */
  var textWrapSettings: js.UndefOr[TextWrapSettings] = js.native
  /** Triggered when toolbar item is clicked in grid.
    */
  var toolbarClick: js.UndefOr[js.Function1[/* e */ ToolbarClickEventArgs, Unit]] = js.native
  /** Gets or sets an object that indicates whether to enable the toolbar in the grid and add toolbar items
    */
  var toolbarSettings: js.UndefOr[ToolbarSettings] = js.native
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
    def withActionFailure(value: /* e */ ActionFailureEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionFailure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutActionFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowCellMerging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCellMerging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCellMerging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCellMerging")(js.undefined)
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
    def withAllowMultipleExporting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultipleExporting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMultipleExporting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultipleExporting")(js.undefined)
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
    def withAllowReordering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowReordering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowReordering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowReordering")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowResizeToFit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowResizeToFit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowResizeToFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowResizeToFit")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowResizing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowResizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowResizing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowResizing")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowRowDragAndDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRowDragAndDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowRowDragAndDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRowDragAndDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowScrolling")(js.undefined)
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
    def withBatchAdd(value: /* e */ BatchAddEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchAdd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBatchAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withBatchDelete(value: /* e */ BatchDeleteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchDelete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBatchDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeBatchAdd(value: /* e */ BeforeBatchAddEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBatchAdd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeBatchAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBatchAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeBatchDelete(value: /* e */ BeforeBatchDeleteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBatchDelete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeBatchDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBatchDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeBatchSave(value: /* e */ BeforeBatchSaveEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBatchSave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeBatchSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeBatchSave")(js.undefined)
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
    def withBeforeRowDrop(value: /* e */ BeforeRowDropEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRowDrop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeRowDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRowDrop")(js.undefined)
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
    def withCellDeselected(value: /* e */ CellDeselectedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellDeselected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellDeselected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellDeselected")(js.undefined)
        ret
    }
    @scala.inline
    def withCellDeselecting(value: /* e */ CellDeselectingEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellDeselecting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellDeselecting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellDeselecting")(js.undefined)
        ret
    }
    @scala.inline
    def withCellEdit(value: /* e */ CellEditEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEdit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withCellSave(value: /* e */ CellSaveEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellSave")(js.undefined)
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
    def withChildGrid(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnDeselected(value: /* e */ ColumnDeselectedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDeselected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutColumnDeselected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDeselected")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnDeselecting(value: /* e */ ColumnDeselectingEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDeselecting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutColumnDeselecting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnDeselecting")(js.undefined)
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
    def withColumnLayout(value: ColumnLayout | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnSelected(value: /* e */ ColumnSelectedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutColumnSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnSelecting(value: /* e */ ColumnSelectingEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSelecting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutColumnSelecting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSelecting")(js.undefined)
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
    def withContextClick(value: /* e */ ContextClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContextClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextClick")(js.undefined)
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
    def withContextOpen(value: /* e */ ContextOpenEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContextOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextOpen")(js.undefined)
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
    def withDataBound(value: /* e */ DataBoundEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDataBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBound")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: js.Any): Self = {
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
    def withDestroy(value: /* e */ DestroyEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailsCollapse(value: /* e */ DetailsCollapseEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailsCollapse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDetailsCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailsCollapse")(js.undefined)
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
    def withDetailsExpand(value: /* e */ DetailsExpandEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailsExpand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDetailsExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailsExpand")(js.undefined)
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
    def withEnableAutoSaveOnSelectionChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoSaveOnSelectionChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAutoSaveOnSelectionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoSaveOnSelectionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableHeaderHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHeaderHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableHeaderHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHeaderHover")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePersistence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePersistence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePersistence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePersistence")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableResponsiveRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableResponsiveRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableResponsiveRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableResponsiveRow")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRowHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRowHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRowHover")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableToolbarItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableToolbarItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableToolbarItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableToolbarItems")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTouch")(js.undefined)
        ret
    }
    @scala.inline
    def withEndAdd(value: /* e */ EndAddEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAdd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEndAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDelete(value: /* e */ EndDeleteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDelete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEndDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDelete")(js.undefined)
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
    def withExportToExcelAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportToExcelAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportToExcelAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportToExcelAction")(js.undefined)
        ret
    }
    @scala.inline
    def withExportToPdfAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportToPdfAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportToPdfAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportToPdfAction")(js.undefined)
        ret
    }
    @scala.inline
    def withExportToWordAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportToWordAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportToWordAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportToWordAction")(js.undefined)
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
    def withGridLines(value: GridLines | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLines")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupSettings(value: GroupSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSettings")(js.undefined)
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
    def withKeySettings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeySettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keySettings")(js.undefined)
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
    def withMergeCellInfo(value: /* e */ MergeCellInfoEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeCellInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMergeCellInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeCellInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeHeaderCellInfo(value: /* e */ MergeHeaderCellInfoEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeHeaderCellInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMergeHeaderCellInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeHeaderCellInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
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
    def withResizeEnd(value: /* e */ ResizeEndEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResizeEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeSettings(value: ResizeSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeStart(value: /* e */ ResizeStartEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResizeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withResized(value: /* e */ ResizedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resized")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resized")(js.undefined)
        ret
    }
    @scala.inline
    def withRightClick(value: /* e */ RightClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRightClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightClick")(js.undefined)
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
    def withRowDeselected(value: /* e */ RowDeselectedEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDeselected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowDeselected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDeselected")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDeselecting(value: /* e */ RowDeselectingEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDeselecting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowDeselecting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDeselecting")(js.undefined)
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
    def withRowDrop(value: /* e */ RowDropEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDrop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withRowDropSettings(value: RowDropSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDropSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowDropSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowDropSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHover(value: /* e */ RowHoverEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRowHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHover")(js.undefined)
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
    def withRowTemplate(value: String): Self = {
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
    def withScrollSettings(value: ScrollSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollSettings")(js.undefined)
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
    def withSelectedRecords(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRecords")(js.undefined)
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
    def withSelectedRowIndices(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRowIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedRowIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRowIndices")(js.undefined)
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
    def withSelectionType(value: SelectionType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionType")(js.undefined)
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
    def withShowSummary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSummary")(js.undefined)
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
    def withTemplateRefresh(value: /* e */ TemplateRefreshEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateRefresh")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTemplateRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withTextWrapSettings(value: TextWrapSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textWrapSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextWrapSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textWrapSettings")(js.undefined)
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
  }
  
}

