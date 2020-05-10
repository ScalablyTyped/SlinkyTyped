package typingsSlinky.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggered for every action before its starts.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.native
  /** Triggered for every action complete.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.native
  /** Gets or sets an active sheet index in the Spreadsheet. By defining this value, you can specify which sheet should be active in workbook.
    * @Default {1}
    */
  var activeSheetIndex: js.UndefOr[Double] = js.native
  /** Gets or sets a value that indicates whether to enable or disable auto rendering of cell type in the Spreadsheet.
    * @Default {false}
    */
  var allowAutoCellType: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable auto fill feature in the Spreadsheet.
    * @Default {true}
    */
  var allowAutoFill: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable auto sum feature in the Spreadsheet.
    * @Default {true}
    */
  var allowAutoSum: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable cell format feature in the Spreadsheet. By enabling this, you can customize styles and number formats.
    * @Default {true}
    */
  var allowCellFormatting: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable cell type feature in the Spreadsheet.
    * @Default {false}
    */
  var allowCellType: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable chart feature in the Spreadsheet. By enabling this feature, you can create and customize charts in Spreadsheet.
    * @Default {true}
    */
  var allowCharts: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable clear feature in the Spreadsheet.
    * @Default {true}
    */
  var allowClear: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable clipboard feature in the Spreadsheet. By enabling this feature, you can perform cut/copy and paste operations in
    * Spreadsheet.
    * @Default {true}
    */
  var allowClipboard: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable comment feature in the Spreadsheet. By enabling this, you can add/delete/modify comments in Spreadsheet.
    * @Default {true}
    */
  var allowComments: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable Conditional Format feature in the Spreadsheet. By enabling this, you can apply formatting to the selected range of
    * cells based on the provided conditions (Greater than, Less than, Equal, Between, Contains, etc.).
    * @Default {true}
    */
  var allowConditionalFormats: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable data validation feature in the Spreadsheet.
    * @Default {true}
    */
  var allowDataValidation: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable the delete action in the Spreadsheet. By enabling this feature, you can delete existing rows, columns, cells and
    * sheet.
    * @Default {true}
    */
  var allowDelete: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable drag and drop feature in the Spreadsheet.
    * @Default {true}
    */
  var allowDragAndDrop: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable the edit action in the Spreadsheet.
    * @Default {true}
    */
  var allowEditing: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable filtering feature in the Spreadsheet. Filtering can be used to limit the data displayed using required criteria.
    * @Default {true}
    */
  var allowFiltering: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable table feature in the Spreadsheet. By enabling this, you can render table in selected range.
    * @Default {true}
    */
  var allowFormatAsTable: js.UndefOr[Boolean] = js.native
  /** Get or sets a value that indicates whether to enable or disable format painter feature in the Spreadsheet. By enabling this feature, you can copy the format from the selected
    * range and apply it to another range.
    * @Default {true}
    */
  var allowFormatPainter: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable formula bar in the Spreadsheet.
    * @Default {true}
    */
  var allowFormulaBar: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable freeze pane support in Spreadsheet. By enabling this feature, you can use freeze top row, freeze first column and
    * freeze panes options.
    * @Default {true}
    */
  var allowFreezing: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable hyperlink feature in the Spreadsheet. By enabling this feature, you can add hyperlink which is used to easily
    * navigate to the cell reference from one sheet to another or a web page.
    * @Default {true}
    */
  var allowHyperlink: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable import feature in the Spreadsheet. By enabling this feature, you can open existing Spreadsheet documents.
    * @Default {true}
    */
  var allowImport: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable the insert action in the Spreadsheet. By enabling this feature, you can insert new rows, columns, cells and sheet.
    * @Default {true}
    */
  var allowInsert: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable keyboard navigation feature in the Spreadsheet.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable lock cell feature in the Spreadsheet.
    * @Default {true}
    */
  var allowLockCell: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable merge feature in the Spreadsheet.
    * @Default {true}
    */
  var allowMerging: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable overflow feature in the Spreadsheet.
    * @Default {true}
    */
  var allowOverflow: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable resizing feature in the Spreadsheet. By enabling this feature, you can change the column width and row height by
    * dragging its header boundaries.
    * @Default {true}
    */
  var allowResizing: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable find and replace feature in the Spreadsheet. By enabling this, you can easily find and replace a specific value in
    * the sheet or workbook. By using goto behavior, you can select and highlight all cells that contains specific data or data types.
    * @Default {true}
    */
  var allowSearching: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable selection in the Spreadsheet. By enabling this feature, selected items will be highlighted.
    * @Default {true}
    */
  var allowSelection: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable the sorting feature in the Spreadsheet.
    * @Default {true}
    */
  var allowSorting: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable the sparkline feature in the Spreadsheet.
    * @Default {false}
    */
  var allowSparkline: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable undo and redo feature in the Spreadsheet.
    * @Default {true}
    */
  var allowUndoRedo: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable wrap text feature in the Spreadsheet. By enabling this, cell content can wrap to the next line, if the cell
    * content exceeds the boundary of the cell.
    * @Default {true}
    */
  var allowWrap: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates to define the width of the activation panel in Spreadsheet.
    * @Default {300}
    */
  var apWidth: js.UndefOr[Double] = js.native
  /** Triggered when the auto fill operation begins.
    */
  var autoFillBegin: js.UndefOr[js.Function1[/* e */ AutoFillBeginEventArgs, Unit]] = js.native
  /** Triggered when the auto fill operation completes.
    */
  var autoFillComplete: js.UndefOr[js.Function1[/* e */ AutoFillCompleteEventArgs, Unit]] = js.native
  /** Gets or sets an object that indicates to customize the auto fill behavior in the Spreadsheet.
    */
  var autoFillSettings: js.UndefOr[AutoFillSettings] = js.native
  /** Triggered before the batch save.
    */
  var beforeBatchSave: js.UndefOr[js.Function1[/* e */ BeforeBatchSaveEventArgs, Unit]] = js.native
  /** Triggered before the cells to be formatted.
    */
  var beforeCellFormat: js.UndefOr[js.Function1[/* e */ BeforeCellFormatEventArgs, Unit]] = js.native
  /** Triggered before the cell selection.
    */
  var beforeCellSelect: js.UndefOr[js.Function1[/* e */ BeforeCellSelectEventArgs, Unit]] = js.native
  /** Triggered before the selected cells are dropped.
    */
  var beforeDrop: js.UndefOr[js.Function1[/* e */ BeforeDropEventArgs, Unit]] = js.native
  /** Triggered while start to edit the comment.
    */
  var beforeEditComment: js.UndefOr[js.Function1[/* e */ BeforeEditCommentEventArgs, Unit]] = js.native
  /** Triggered before the contextmenu is open.
    */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.native
  /** Triggered before the activation panel is open.
    */
  var beforePanelOpen: js.UndefOr[js.Function1[/* e */ BeforePanelOpenEventArgs, Unit]] = js.native
  /** Triggered when click on sheet cell.
    */
  var cellClick: js.UndefOr[js.Function1[/* e */ CellClickEventArgs, Unit]] = js.native
  /** Triggered when the cell is edited.
    */
  var cellEdit: js.UndefOr[js.Function1[/* e */ CellEditEventArgs, Unit]] = js.native
  /** Triggered while cell is formatting.
    */
  var cellFormatting: js.UndefOr[js.Function1[/* e */ CellFormattingEventArgs, Unit]] = js.native
  /** Triggered when mouse hover on cell in sheets.
    */
  var cellHover: js.UndefOr[js.Function1[/* e */ CellHoverEventArgs, Unit]] = js.native
  /** Triggered when save the edited cell.
    */
  var cellSave: js.UndefOr[js.Function1[/* e */ CellSaveEventArgs, Unit]] = js.native
  /** Triggered when the cell is selected.
    */
  var cellSelected: js.UndefOr[js.Function1[/* e */ CellSelectedEventArgs, Unit]] = js.native
  /** Gets or sets an object that indicates to customize the chart behavior in the Spreadsheet.
    */
  var chartSettings: js.UndefOr[ChartSettings] = js.native
  /** Gets or sets a value that defines the number of columns displayed in the sheet.
    * @Default {21}
    */
  var columnCount: js.UndefOr[Double] = js.native
  /** Gets or sets a value that indicates to define the common width for each column in the Spreadsheet.
    * @Default {64}
    */
  var columnWidth: js.UndefOr[Double] = js.native
  /** Triggered when click the contextmenu items.
    */
  var contextMenuClick: js.UndefOr[js.Function1[/* e */ ContextMenuClickEventArgs, Unit]] = js.native
  /** Gets or sets a value to add root CSS class for customizing Spreadsheet skins.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates custom formulas in Spreadsheet.
    * @Default {[]}
    */
  var customFormulas: js.UndefOr[js.Array[_]] = js.native
  /** Triggered when the selected cells are being dragged.
    */
  var drag: js.UndefOr[js.Function1[/* e */ DragEventArgs, Unit]] = js.native
  /** Triggered when you start to drag the picture or chart.
    */
  var dragShape: js.UndefOr[js.Function1[/* e */ DragShapeEventArgs, Unit]] = js.native
  /** Triggered when the selected cells are initiated to drag.
    */
  var dragStart: js.UndefOr[js.Function1[/* e */ DragStartEventArgs, Unit]] = js.native
  /** Triggered when the selected cells are dropped.
    */
  var drop: js.UndefOr[js.Function1[/* e */ DropEventArgs, Unit]] = js.native
  /** Triggered before the range editing starts.
    */
  var editRangeBegin: js.UndefOr[js.Function1[/* e */ EditRangeBeginEventArgs, Unit]] = js.native
  /** Triggered after range editing completes.
    */
  var editRangeComplete: js.UndefOr[js.Function1[/* e */ EditRangeCompleteEventArgs, Unit]] = js.native
  /** Gets or sets a value that indicates whether to enable or disable context menu in the Spreadsheet.
    * @Default {true}
    */
  var enableContextMenu: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable pivot table in the Spreadsheet.
    * @Default {false}
    */
  var enablePivotTable: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable touch support in the Spreadsheet.
    * @Default {true}
    */
  var enableTouch: js.UndefOr[Boolean] = js.native
  /** Gets or sets an object that indicates to customize the exporting behavior in Spreadsheet.
    */
  var exportSettings: js.UndefOr[ExportSettings] = js.native
  /** Gets or sets an object that indicates to customize the format behavior in the Spreadsheet.
    */
  var formatSettings: js.UndefOr[FormatSettings] = js.native
  /** Gets or sets an object that indicates to customize the import behavior in the Spreadsheet.
    */
  var importSettings: js.UndefOr[ImportSettings] = js.native
  /** Gets a value that indicates whether importing or not while loading the sheets in Spreadsheet.
    * @Default {false}
    */
  var isImport: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable or disable readonly support in the Spreadsheet.
    * @Default {false}
    */
  var isReadOnly: js.UndefOr[Boolean] = js.native
  /** Triggered when the key is pressed down.
    */
  var keyDown: js.UndefOr[js.Function1[/* e */ KeyDownEventArgs, Unit]] = js.native
  /** Triggered when the key is released.
    */
  var keyUp: js.UndefOr[js.Function1[/* e */ KeyUpEventArgs, Unit]] = js.native
  /** Triggered before the sheet is loaded.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  /** Triggered after the sheet is loaded.
    */
  var loadComplete: js.UndefOr[js.Function1[/* e */ LoadCompleteEventArgs, Unit]] = js.native
  /** Gets or sets a value that indicates whether to customizing the user interface (UI) as locale-specific in order to display regional data (i.e.) in a language and culture specific
    * to a particular country or region.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Triggered every click of the menu item.
    */
  var menuClick: js.UndefOr[js.Function1[/* e */ MenuClickEventArgs, Unit]] = js.native
  /** Gets or sets a value that indicates name manager in Spreadsheet.
    */
  var nameManager: js.UndefOr[js.Array[NameManager]] = js.native
  /** Triggered when a file is imported.
    */
  var onImport: js.UndefOr[js.Function1[/* e */ OnImportEventArgs, Unit]] = js.native
  /** Triggered when import sheet is failed to open.
    */
  var openFailure: js.UndefOr[js.Function1[/* e */ OpenFailureEventArgs, Unit]] = js.native
  /** Triggered when pager item is clicked in the Spreadsheet.
    */
  var pagerClick: js.UndefOr[js.Function1[/* e */ PagerClickEventArgs, Unit]] = js.native
  /** Gets or sets an object that indicates to customize the picture behavior in the Spreadsheet.
    */
  var pictureSettings: js.UndefOr[PictureSettings] = js.native
  /** Gets or sets an object that indicates to customize the print option in Spreadsheet.
    */
  var printSettings: js.UndefOr[PrintSettings] = js.native
  /** Triggered after end of resizing the chart, picture, row and column.
    */
  var resizeEnd: js.UndefOr[js.Function1[/* e */ ResizeEndEventArgs, Unit]] = js.native
  /** Triggered when you start resizing the chart, picture, row and column.
    */
  var resizeStart: js.UndefOr[js.Function1[/* e */ ResizeStartEventArgs, Unit]] = js.native
  /** Triggered when click on the ribbon.
    */
  var ribbonClick: js.UndefOr[js.Function1[/* e */ RibbonClickEventArgs, Unit]] = js.native
  /** Gets or sets an object that indicates to customize the ribbon settings in Spreadsheet.
    */
  var ribbonSettings: js.UndefOr[RibbonSettings] = js.native
  /** Gets or sets a value that indicates whether to define the number of rows to be displayed in the sheet.
    * @Default {20}
    */
  var rowCount: js.UndefOr[Double] = js.native
  /** Gets or sets a value that indicates to define the common height for each row in the sheet.
    * @Default {20}
    */
  var rowHeight: js.UndefOr[Double] = js.native
  /** Gets or sets an object that indicates to customize the scroll options in the Spreadsheet.
    */
  var scrollSettings: js.UndefOr[ScrollSettings] = js.native
  /** Gets or sets an object that indicates to customize the selection options in the Spreadsheet.
    */
  var selectionSettings: js.UndefOr[SelectionSettings] = js.native
  /** Gets or sets a value that indicates to define the number of sheets to be created at the initial load.
    * @Default {1}
    */
  var sheetCount: js.UndefOr[Double] = js.native
  /** Gets or sets an object that indicates to customize the sheet behavior in Spreadsheet.
    */
  var sheets: js.UndefOr[js.Array[Sheet]] = js.native
  /** Gets or sets a value that indicates whether to show or hide pager in the Spreadsheet.
    * @Default {true}
    */
  var showPager: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to show or hide ribbon in the Spreadsheet.
    * @Default {true}
    */
  var showRibbon: js.UndefOr[Boolean] = js.native
  /** Triggered when click the ribbon tab.
    */
  var tabClick: js.UndefOr[js.Function1[/* e */ TabClickEventArgs, Unit]] = js.native
  /** Triggered when select the ribbon tab.
    */
  var tabSelect: js.UndefOr[js.Function1[/* e */ TabSelectEventArgs, Unit]] = js.native
  /** This is used to set the number of undo-redo steps in the Spreadsheet.
    * @Default {20}
    */
  var undoRedoStep: js.UndefOr[Double] = js.native
  /** Define the username for the Spreadsheet which is displayed in comment.
    * @Default {User Name}
    */
  var userName: js.UndefOr[String] = js.native
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
    def withActiveSheetIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeSheetIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveSheetIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeSheetIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowAutoCellType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAutoCellType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAutoCellType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAutoCellType")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowAutoFill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAutoFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAutoFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAutoFill")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowAutoSum(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAutoSum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAutoSum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAutoSum")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowCellFormatting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCellFormatting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCellFormatting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCellFormatting")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowCellType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCellType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCellType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCellType")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowCharts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCharts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCharts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCharts")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowClear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowClear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowClear")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowClipboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowClipboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowClipboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowClipboard")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowComments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowComments")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowConditionalFormats(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowConditionalFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowConditionalFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowConditionalFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDataValidation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDataValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDataValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDataValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDelete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDelete")(js.undefined)
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
    def withAllowEditing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEditing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEditing")(js.undefined)
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
    def withAllowFormatAsTable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFormatAsTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFormatAsTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFormatAsTable")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowFormatPainter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFormatPainter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFormatPainter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFormatPainter")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowFormulaBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFormulaBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFormulaBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFormulaBar")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowFreezing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFreezing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFreezing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFreezing")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowHyperlink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHyperlink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowHyperlink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHyperlink")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowImport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowImport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowImport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowImport")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowInsert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInsert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInsert")(js.undefined)
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
    def withAllowLockCell(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLockCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowLockCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLockCell")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowMerging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMerging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMerging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMerging")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowOverflow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowOverflow")(js.undefined)
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
    def withAllowSparkline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSparkline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSparkline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSparkline")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowUndoRedo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUndoRedo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUndoRedo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUndoRedo")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowWrap")(js.undefined)
        ret
    }
    @scala.inline
    def withApWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFillBegin(value: /* e */ AutoFillBeginEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFillBegin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAutoFillBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFillBegin")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFillComplete(value: /* e */ AutoFillCompleteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFillComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAutoFillComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFillComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFillSettings(value: AutoFillSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFillSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFillSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFillSettings")(js.undefined)
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
    def withBeforeCellFormat(value: /* e */ BeforeCellFormatEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCellFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeCellFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCellFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeCellSelect(value: /* e */ BeforeCellSelectEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCellSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeCellSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeCellSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeDrop(value: /* e */ BeforeDropEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDrop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeEditComment(value: /* e */ BeforeEditCommentEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeEditComment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeEditComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeEditComment")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeOpen(value: /* e */ BeforeOpenEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforePanelOpen(value: /* e */ BeforePanelOpenEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePanelOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforePanelOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforePanelOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withCellClick(value: /* e */ CellClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellClick")(js.undefined)
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
    def withCellFormatting(value: /* e */ CellFormattingEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellFormatting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellFormatting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellFormatting")(js.undefined)
        ret
    }
    @scala.inline
    def withCellHover(value: /* e */ CellHoverEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellHover")(js.undefined)
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
    def withChartSettings(value: ChartSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChartSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnCount")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withContextMenuClick(value: /* e */ ContextMenuClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContextMenuClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuClick")(js.undefined)
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
    def withCustomFormulas(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFormulas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomFormulas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFormulas")(js.undefined)
        ret
    }
    @scala.inline
    def withDrag(value: /* e */ DragEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.undefined)
        ret
    }
    @scala.inline
    def withDragShape(value: /* e */ DragShapeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragShape")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragShape")(js.undefined)
        ret
    }
    @scala.inline
    def withDragStart(value: /* e */ DragStartEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withDrop(value: /* e */ DropEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.undefined)
        ret
    }
    @scala.inline
    def withEditRangeBegin(value: /* e */ EditRangeBeginEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editRangeBegin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEditRangeBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editRangeBegin")(js.undefined)
        ret
    }
    @scala.inline
    def withEditRangeComplete(value: /* e */ EditRangeCompleteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editRangeComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEditRangeComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editRangeComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableContextMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableContextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePivotTable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePivotTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePivotTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePivotTable")(js.undefined)
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
    def withExportSettings(value: ExportSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatSettings(value: FormatSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withImportSettings(value: ImportSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withIsImport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isImport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsImport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isImport")(js.undefined)
        ret
    }
    @scala.inline
    def withIsReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReadOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyDown(value: /* e */ KeyDownEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyUp(value: /* e */ KeyUpEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutKeyUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyUp")(js.undefined)
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
    def withLoadComplete(value: /* e */ LoadCompleteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoadComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadComplete")(js.undefined)
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
    def withMenuClick(value: /* e */ MenuClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMenuClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuClick")(js.undefined)
        ret
    }
    @scala.inline
    def withNameManager(value: js.Array[NameManager]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameManager")(js.undefined)
        ret
    }
    @scala.inline
    def withOnImport(value: /* e */ OnImportEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onImport")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnImport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onImport")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenFailure(value: /* e */ OpenFailureEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openFailure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOpenFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withPagerClick(value: /* e */ PagerClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPagerClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagerClick")(js.undefined)
        ret
    }
    @scala.inline
    def withPictureSettings(value: PictureSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pictureSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPictureSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pictureSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintSettings(value: PrintSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printSettings")(js.undefined)
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
    def withRibbonClick(value: /* e */ RibbonClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ribbonClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRibbonClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ribbonClick")(js.undefined)
        ret
    }
    @scala.inline
    def withRibbonSettings(value: RibbonSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ribbonSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRibbonSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ribbonSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(js.undefined)
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
    def withSheetCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSheets(value: js.Array[Sheet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheets")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPager(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPager")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRibbon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRibbon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRibbon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRibbon")(js.undefined)
        ret
    }
    @scala.inline
    def withTabClick(value: /* e */ TabClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTabClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabClick")(js.undefined)
        ret
    }
    @scala.inline
    def withTabSelect(value: /* e */ TabSelectEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTabSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withUndoRedoStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undoRedoStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUndoRedoStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undoRedoStep")(js.undefined)
        ret
    }
    @scala.inline
    def withUserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userName")(js.undefined)
        ret
    }
  }
  
}

