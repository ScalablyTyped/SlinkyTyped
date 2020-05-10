package typingsSlinky.jqueryHandsontable.Handsontable

import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.std.HTMLTableDataCellElement
import typingsSlinky.std.HTMLTableHeaderCellElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Callback fired after reset cell's meta.
    */
  var afterCellMetaReset: js.UndefOr[js.Function] = js.native
  /**
    * Callback fired after one or more cells is changed. Its main use case is to save the input. Parameters:
    *   - changes is a 2D array containing information about each of the edited cells [ [row, prop, oldVal, newVal], ... ].
    *   - source is one of the strings: "alter", "empty", "edit", "populateFromArray", "loadData", "autofill", "paste".
    * Note: for performance reasons, the changes array is null for "loadData" source.
    */
  var afterChange: js.UndefOr[js.Function2[/* changes */ js.Array[_], /* source */ String, Unit]] = js.native
  /**
    * Callback is fired after changing column placement.
    */
  var afterColumnMove: js.UndefOr[js.Function2[/* oldIndex */ Double, /* newIndex */ Double, Unit]] = js.native
  /**
    * Callback is fired after changing column size.
    */
  var afterColumnResize: js.UndefOr[js.Function2[/* col */ Double, /* size */ Double, Unit]] = js.native
  /**
    * Callback fired after sorting the table. The column argument is a relative (displayed) index of a column that is about to be sorted. To get the absolute column index, just add the current column offset. You can get the offset by using colOffset() method.
    */
  var afterColumnSort: js.UndefOr[js.Function2[/* column */ Double, /* order */ Boolean, Unit]] = js.native
  /**
    * Callback fired if copyRowsLimit or copyColumnsLimit was reached.
    */
  var afterCopyLimit: js.UndefOr[
    js.Function4[
      /* selectedRowsCount */ Double, 
      /* selectedColsCount */ Double, 
      /* copyRowsLimit */ Double, 
      /* copyColsLimit */ Double, 
      Unit
    ]
  ] = js.native
  /**
    * Callback is fired when a new column is created. Parameters:
    *   - index represents the index of first newly created column in the data source array.
    *   - amount number of newly created columns in the data source array.
    */
  var afterCreateCol: js.UndefOr[js.Function2[/* index */ Double, /* amount */ Double, Unit]] = js.native
  /**
    * Callback is fired when a new row is created. Parameters:
    *   - index represents the index of first newly created row in the data source array.
    *   - amount number of newly created rows in the data source array.
    */
  var afterCreateRow: js.UndefOr[js.Function2[/* index */ Double, /* amount */ Double, Unit]] = js.native
  /**
    * Event called when current cell is deselected.
    */
  var afterDeselect: js.UndefOr[js.Function] = js.native
  /**
    * Callback fired after destroing Handsontable instance.
    */
  var afterDestroy: js.UndefOr[js.Function] = js.native
  /**
    * Callback fired after getting cell settings.
    */
  var afterGetCellMeta: js.UndefOr[
    js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ js.Object, Unit]
  ] = js.native
  /**
    * Callback fired after getting info about column header.
    */
  var afterGetColHeader: js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]] = js.native
  /**
    * Callback fired after calculating column width.
    */
  var afterGetColWidth: js.UndefOr[js.Function2[/* col */ Double, /* response */ js.Object, Unit]] = js.native
  /**
    * Callback fired after Handsontable instance is initiated.
    */
  var afterInit: js.UndefOr[js.Function] = js.native
  /**
    * Callback fired after new data is loaded (by loadData method) into the data source array.
    */
  var afterLoadData: js.UndefOr[js.Function] = js.native
  /**
    * Callback fired after.
    */
  var afterOnCellCornerMouseDown: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  /**
    * Callback fired after clicking on a cell or row/column header.
    * In case the row/column header was clicked, the index is negative. For example clicking on the row header of cell (0, 0) results with afterOnCellMouseDown called with coords {row: 0, col: -1}.
    */
  var afterOnCellMouseDown: js.UndefOr[
    js.Function3[
      /* event */ MouseEvent, 
      /* coords */ CellPosition, 
      /* TD */ HTMLTableDataCellElement, 
      Unit
    ]
  ] = js.native
  /**
    * Callback fired after hovering a cell or row/column header with the mouse cursor.
    * In case the row/column header was hovered, the index is negative. For example clicking on the row header of cell (0, 0) results with afterOnCellMouseOver called with coords {row: 0, col: -1}.
    */
  var afterOnCellMouseOver: js.UndefOr[
    js.Function3[
      /* event */ MouseEvent, 
      /* coords */ CellPosition, 
      /* TD */ HTMLTableDataCellElement, 
      Unit
    ]
  ] = js.native
  /**
    * Callback is fired when one or more columns are removed. Parameters:
    *   - index is an index of starter column.
    *   - amount is an anount of removed columns.
    */
  var afterRemoveCol: js.UndefOr[js.Function2[/* index */ Double, /* amount */ Double, Unit]] = js.native
  /**
    * Callback is fired when one or more rows are removed. Parameters:
    *   - index is an index of starter row.
    *   - amount is an anount of removed rows.
    */
  var afterRemoveRow: js.UndefOr[js.Function2[/* index */ Double, /* amount */ Double, Unit]] = js.native
  /**
    * Callback fired after Handsontable table is rendered. Parameters:
    *   - isForced is true if rendering was triggered by a change of settings or data; or false if rendering was triggered by scrolling or moving selection.
    */
  var afterRender: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]] = js.native
  var afterRenderer: js.UndefOr[
    js.Function6[
      /* TD */ HTMLTableDataCellElement, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String, 
      /* value */ String, 
      /* cellProperties */ js.Object, 
      Unit
    ]
  ] = js.native
  var afterScrollHorizontally: js.UndefOr[js.Function] = js.native
  var afterScrollVertically: js.UndefOr[js.Function] = js.native
  /**
    * Callback fired while one or more cells are being selected (on mouse move). Parameters:
    *   - r selection start row
    *   - c selection start column
    *   - r2 selection end row
    *   - c2 selection end column
    */
  var afterSelection: js.UndefOr[
    js.Function4[/* r */ Double, /* c */ Double, /* r2 */ Double, /* c2 */ Double, Unit]
  ] = js.native
  /**
    * The same as above, but data source object property name is used instead of the column number.
    */
  var afterSelectionByProp: js.UndefOr[
    js.Function4[/* r */ Double, /* p */ String, /* r2 */ Double, /* p2 */ String, Unit]
  ] = js.native
  /**
    * Callback fired while one or more cells are being selected (on mouse up). Parameters:
    *   - r selection start row
    *   - c selection start column
    *   - r2 selection end row
    *   - c2 selection end column
    */
  var afterSelectionEnd: js.UndefOr[
    js.Function4[/* r */ Double, /* c */ Double, /* r2 */ Double, /* c2 */ Double, Unit]
  ] = js.native
  /**
    * The same as above, but data source object property name is used instead of the column number.
    */
  var afterSelectionEndByProp: js.UndefOr[
    js.Function4[/* r */ Double, /* p */ String, /* r2 */ Double, /* p2 */ String, Unit]
  ] = js.native
  var afterSetCellMeta: js.UndefOr[js.Function] = js.native
  var afterUpdateSettings: js.UndefOr[js.Function] = js.native
  /**
    * A plugin hook executed after validator function, only if validator function is defined. Validation result is the first parameter. This can be used to determinate if validation passed successfully or not. You can cancel current change by returning false.
    */
  var afterValidate: js.UndefOr[
    js.Function5[
      /* isValid */ Boolean, 
      /* value */ js.Any, 
      /* row */ Double, 
      /* prop */ String, 
      /* source */ String, 
      Boolean
    ]
  ] = js.native
  /**
    * Setting to true enables the autoColumnSize plugin, which makes sure each column gets enough space to show its content.
    */
  var autoColumnSize: js.UndefOr[Boolean | js.Object] = js.native
  /**
    * Autocomplete definitions.
    * @see demo/autocomplete.html for examples and definitions.
    */
  var autoComplete: js.UndefOr[js.Array[_]] = js.native
  /**
    * If true, pressing ENTER or down arrow in the last row will move to first row in next column.
    */
  var autoWrapCol: js.UndefOr[Boolean] = js.native
  /**
    * If true, pressing TAB or right arrow in the last column will move to first column in next row.
    */
  var autoWrapRow: js.UndefOr[Boolean] = js.native
  /**
    * Parameters:
    *   - start is an object containing information about first filled cell: { row : 2, col : 0 }.
    *   - end is an object containing information about last filled cell: { row : 4, col : 1 }.
    *   - data is an 2D array containing information about fill pattern: [ ["1", "Ted"], ["1", "John"] ].
    */
  var beforeAutofill: js.UndefOr[
    js.Function3[
      /* start */ CellPosition, 
      /* end */ CellPosition, 
      /* data */ js.Array[js.Array[String]], 
      Unit
    ]
  ] = js.native
  /**
    * Callback fired before one or more cells is changed. Its main purpose is to alter changes silently before input. Parameters:
    *   - changes is a 2D array containing information about each of the edited cells [ [row, prop, oldVal, newVal], ... ].
    *     - To disregard a single change, set changes[i] to null or remove it from array using changes.splice(i, 1).
    *     - To alter a single change, overwrite the desired value to changes[i][3].
    *     - To cancel all edit, return false from the callback or set array length to 0 (changes.length = 0).
    *   - source is the name of a source of changes.
    */
  var beforeChange: js.UndefOr[js.Function2[/* changes */ js.Array[js.Array[_]], /* source */ String, Unit]] = js.native
  var beforeChangeRender: js.UndefOr[js.Function] = js.native
  /**
    * Callback fired before sorting the table. The column argument is a relative (displayed) index of a column that is about to be sorted. To get the absolute column index, just add the current column offset. You can get the offset by using colOffset() method.
    */
  var beforeColumnSort: js.UndefOr[js.Function2[/* column */ Double, /* order */ Boolean, Unit]] = js.native
  /**
    * Callback fired before getting cell settings.
    */
  var beforeGetCellMeta: js.UndefOr[
    js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ js.Object, Unit]
  ] = js.native
  /**
    * Callback fired before Handsontable instance is initiated.
    * Note: this can be set only by global PluginHooks instance.
    */
  var beforeInit: js.UndefOr[js.Function] = js.native
  /**
    * Callback fired before Walkontable instance is initiated.
    */
  var beforeInitWalkontable: js.UndefOr[js.Function] = js.native
  /**
    * Callback fired before keydown event is handled. It can be used to overwrite default key bindings. Caution - in your beforeKeyDown handler you need to call event.stopImmediatePropagation() to prevent default key behavior.
    */
  var beforeKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.native
  /**
    * Callback is fired when one or more columns are about to be removed. Parameters:
    *   - index is an index of starter column.
    *   - amount is an anount of columns to be removed.
    */
  var beforeRemoveCol: js.UndefOr[js.Function2[/* index */ Double, /* amount */ Double, Unit]] = js.native
  /**
    * Callback is fired when one or more rows are about to be removed. Parameters:
    *   - index is an index of starter row.
    *   - amount is an anount of rows to be removed.
    */
  var beforeRemoveRow: js.UndefOr[js.Function2[/* index */ Double, /* amount */ Double, Unit]] = js.native
  /**
    * Callback fired before Handsontable table is rendered. Parameters:
    *   - isForced is true if rendering was triggered by a change of settings or data; or false if rendering was triggered by scrolling or moving selection.
    */
  var beforeRender: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]] = js.native
  /**
    * Callback fired before setting single value from the data source array.
    */
  var beforeSet: js.UndefOr[js.Function1[/* v */ js.Object, Unit]] = js.native
  /**
    * Callback fired before setting range is ended. Parameters:
    *   - coords is WalkontableCellCoords array
    */
  var beforeSetRangeEnd: js.UndefOr[js.Function1[/* coords */ js.Array[_], Unit]] = js.native
  /**
    * A plugin hook executed before validator function, only if validator function is defined. This can be used to manipulate value of changed cell before it is applied to the validator function. NOTICE: this will not affect values of changes. This will change value ONLY for validation!
    */
  var beforeValidate: js.UndefOr[
    js.Function4[/* value */ js.Any, /* row */ Double, /* prop */ String, /* source */ String, Unit]
  ] = js.native
  /**
    * Defines the cell properties for given row, col, prop coordinates.
    * See Cells section below for more detailed explanation.
    */
  var cells: js.UndefOr[js.Function3[/* row */ Double, /* col */ Double, /* prop */ String, Unit]] = js.native
  /**
    * Setting true or false will enable or disable the default column headers (A, B, C). You can also define an array ['One', 'Two', 'Three', ...] or a function to define the headers. If a function is set the index of the column is passed as a parameter.
    */
  var colHeaders: js.UndefOr[js.Any] = js.native
  /**
    * Defines column widths in pixels. Accepts number, string (that will be converted to number), array of numbers (if you want to define column width separately for each column) or a function (if you want to set column width dynamically on each render).
    */
  var colWidths: js.UndefOr[js.Any] = js.native
  /**
    * Turn on Column sorting.
    */
  var columnSorting: js.UndefOr[Boolean] = js.native
  /**
    * Defines the cell properties and data binding for certain columns. Notice: Using this option sets a fixed number of columns (options startCols, minCols, maxCols will be ignored).
    * @see https://github.com/handsontable/jquery-handsontable/wiki/Options below for more detailed explanation.
    * @see http://handsontable.com/demo/datasources.html for examples
    */
  var columns: js.UndefOr[js.Array[_]] = js.native
  /**
    * Defines if the right-click context menu should be enabled. Context menu allows to create new row or column at any place in the grid.
    * Possible values: true (to enable basic options), false (to disable completely) or array of any available strings: ["row_above", "row_below", "col_left", "col_right", "remove_row", "remove_col", "undo", "redo", "sep1", "sep2", "sep3"].
    * @see http://handsontable.com/demo/contextmenu.html for examples.
    */
  var contextMenu: js.UndefOr[js.Any] = js.native
  /**
    * Maximum number of columns than can be copied to clipboard using CTRL+C.
    */
  var copyColsLimit: js.UndefOr[Double] = js.native
  /**
    * Setting to true enables the copyPaste plugin, which enables the copying and pasting to the clipboard.
    */
  var copyPaste: js.UndefOr[Boolean] = js.native
  /**
    * Maximum number of rows than can be copied to clipboard using CTRL+C.
    */
  var copyRowsLimit: js.UndefOr[Double] = js.native
  /**
    * Class name for all visible columns in current selection.
    */
  var currentColClassName: js.UndefOr[String] = js.native
  /**
    * Class name for all visible rows in current selection.
    */
  var currentRowClassName: js.UndefOr[String] = js.native
  /**
    * Initial data source that will be bound to the data grid by reference (editing data grid alters the data source. See Understanding binding as reference.
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * Defines the structure of a new row when data source is an object.
    * @see http://handsontable.com/demo/datasources.html for examples.
    */
  var dataSchema: js.UndefOr[js.Any] = js.native
  /**
    * Setting to true enables the debug mode, currently used to test the correctness of the row and column header fixed positioning on a layer above the master table.
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * If true, ENTER begins editing mode (like Google Docs). If false, ENTER moves to next row (like Excel) and adds new row if necessary. TAB adds new column if necessary.
    */
  var enterBeginsEditing: js.UndefOr[Boolean] = js.native
  /**
    * Defines cursor move after ENTER is pressed (SHIFT+ENTER uses negative vector). Can be an object or a function that returns an object. The event argument passed to the function is a jQuery.Event object received after a ENTER key has been pressed. This event object can be used to check whether user pressed ENTER or SHIFT + ENTER.
    */
  var enterMoves: js.UndefOr[js.Any] = js.native
  /**
    * Enables the fill handle (drag-down and copy-down) functionality, which shows the small rectangle in bottom right corner of the selected area, that let's you expand values to the adjacent cells.
    * Possible values: true (to enable in all directions), "vertical" or "horizontal" (to enable in one direction), false (to disable completely). Setting to true enables the fillHandle plugin, which,
    */
  var fillHandle: js.UndefOr[js.Any] = js.native
  /**
    * Allows to specify the number of columns fixed (aka freezed) on the left side of the table.
    */
  var fixedColumnsLeft: js.UndefOr[Double] = js.native
  /**
    * Allows to specify the number of rows fixed (aka freezed) on the top of the table.
    */
  var fixedRowsTop: js.UndefOr[Double] = js.native
  /**
    * Setting to true enables selecting just a fragment of the text within a single cell or between adjacent cells.
    */
  var fragmentSelection: js.UndefOr[Boolean] = js.native
  /**
    * Height of the grid. Can be a number or a function that returns a number.
    */
  var height: js.UndefOr[js.Any] = js.native
  /**
    * CSS class name for cells that did not pass validation.
    */
  var invalidCellClassName: js.UndefOr[String] = js.native
  /**
    * Lets you overwrite the default isEmptyCol method.
    */
  var isEmptyCol: js.UndefOr[js.Function1[/* col */ Double, Boolean]] = js.native
  /**
    * Lets you overwrite the default isEmptyRow method.
    */
  var isEmptyRow: js.UndefOr[js.Function1[/* row */ Double, Boolean]] = js.native
  /**
    * Turn on Manual column move, if set to a boolean or define initial column order, if set to an array of column indexes.
    */
  var manualColumnMove: js.UndefOr[js.Any] = js.native
  /**
    * Turn on Manual column resize, if set to a boolean or define initial column resized widths, if set to an array of numbers.
    */
  var manualColumnResize: js.UndefOr[js.Any] = js.native
  /**
    * Turns on Manual row move, if set to a boolean or define initial row order, if set to an array of row indexes.
    */
  var manualRowMove: js.UndefOr[Boolean] = js.native
  /**
    * Setting to true enables the manualRowResize plugin, which allows to resize the row height with your mouse.
    */
  var manualRowResize: js.UndefOr[Boolean] = js.native
  /**
    * Maximum number of columns.
    */
  var maxCols: js.UndefOr[Double] = js.native
  /**
    * Maximum number of rows.
    */
  var maxRows: js.UndefOr[Double] = js.native
  /**
    * Setting to true or array enables the mergeCells plugin, which enables the merging of the cells. (see demo). You can provide the merged cells on the pageload if you feed the mergeCells option with an array.
    */
  var mergeCells: js.UndefOr[js.Any] = js.native
  /**
    * Minimum number of columns. At least that many of columns will be created during initialization.
    */
  var minCols: js.UndefOr[Double] = js.native
  /**
    * Minimum number of rows. At least that many of rows will be created during initialization.
    */
  var minRows: js.UndefOr[Double] = js.native
  /**
    * When set to 1 (or more), Handsontable will add a new column at the end of grid if there are no more empty columns.
    */
  var minSpareCols: js.UndefOr[Double] = js.native
  /**
    * When set to 1 (or more), Handsontable will add a new row at the end of grid if there are no more empty rows.
    */
  var minSpareRows: js.UndefOr[Double] = js.native
  /**
    * Callback fired after column modify.
    */
  var modifyCol: js.UndefOr[js.Function1[/* col */ Double, Unit]] = js.native
  /**
    * Callback fired after modify column's width.
    */
  var modifyColWidth: js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]] = js.native
  /**
    * Callback fired after row modify.
    */
  var modifyRow: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.native
  /**
    * Callback fired after modify hight of row.
    */
  var modifyRowHeight: js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]] = js.native
  /**
    * If true, selection of multiple cells using keyboard or mouse is allowed.
    */
  var multiSelect: js.UndefOr[Boolean] = js.native
  /**
    * CSS class name cells configured with wordWrap: false.
    */
  var noWordWrapClassName: js.UndefOr[String] = js.native
  /**
    * Setting to true enables the observeChanges plugin, which automatically renders the table when a change in the data source is observed.
    */
  var observeChanges: js.UndefOr[Boolean] = js.native
  /**
    * When set to true, the table is rerendered when it is detected that it was made visible in DOM.
    */
  var observeDOMVisibility: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated! Now event is called beforeChange.
    */
  var onBeforeChange: js.UndefOr[js.Function2[/* changes */ js.Array[_], /* source */ String, Unit]] = js.native
  /**
    * Deprecated! Now event is called afterChange.
    */
  var onChange: js.UndefOr[js.Function2[/* changes */ js.Array[_], /* source */ String, Unit]] = js.native
  /**
    * Deprecated! Now event is called afterCopyLimit.
    */
  var onCopyLimit: js.UndefOr[
    js.Function4[
      /* selectedRowsCount */ Double, 
      /* selectedColsCount */ Double, 
      /* copyRowsLimit */ Double, 
      /* copyColsLimit */ Double, 
      Unit
    ]
  ] = js.native
  /**
    * Deprecated! Now event is called afterSelection.
    */
  var onSelection: js.UndefOr[
    js.Function4[/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double, Unit]
  ] = js.native
  /**
    * Deprecated! Now event is called afterSelectionByProp.
    */
  var onSelectionByProp: js.UndefOr[
    js.Function4[/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double, Unit]
  ] = js.native
  /**
    * Deprecated! Now event is called afterSelectionEnd.
    */
  var onSelectionEnd: js.UndefOr[
    js.Function4[/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double, Unit]
  ] = js.native
  /**
    * Deprecated! Now event is called afterSelectionEndByProp.
    */
  var onSelectionEndByProp: js.UndefOr[
    js.Function4[/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double, Unit]
  ] = js.native
  /**
    * If true, mouse click outside the grid will deselect the current selection.
    */
  var outsideClickDeselects: js.UndefOr[Boolean] = js.native
  /**
    * Defines paste (CTRL+V) behavior. Default value "overwrite" will paste clipboard value over current selection.
    * When set to "shift_down", clipboard data will be pasted in place of current selection, while all selected cells are moved down.
    * When set to "shift_right", clipboard data will be pasted in place of current selection, while all selected cells are moved right.
    */
  var pasteMode: js.UndefOr[String] = js.native
  /**
    * Turn on saving the state of column sorting, columns positions and columns sizes in local storage. For more information see How to save data localy.
    */
  var persistentState: js.UndefOr[Boolean] = js.native
  /**
    * When set to an non-empty string, displayed as the cell content for empty cells.
    */
  var placeholder: js.UndefOr[js.Any] = js.native
  /**
    * CSS class name for cells that have a placeholder in use.
    */
  var placeholderCellClassName: js.UndefOr[String] = js.native
  /**
    * CSS class name for read-only cells.
    */
  var readOnlyCellClassName: js.UndefOr[String] = js.native
  /**
    * Setting true or false will enable or disable the default row headers (1, 2, 3). You can also define an array ['One', 'Two', 'Three', ...] or a function to define the headers. If a function is set the index of the rowis passed as a parameter.
    */
  var rowHeaders: js.UndefOr[js.Any] = js.native
  /**
    * Setting to true enables the search plugin (see demo).
    */
  var search: js.UndefOr[Boolean] = js.native
  /**
    * Initial number of rows. Notice: This option only has effect in Handsontable constructor and only if data option is not provided.
    */
  var startCols: js.UndefOr[Double] = js.native
  /**
    * Initial number of rows. Notice: This option only has effect in Handsontable constructor and only if data option is not provided.
    */
  var startRows: js.UndefOr[Double] = js.native
  /**
    * Column stretching mode. Possible values: "none", "last", "all".
    */
  var stretchH: js.UndefOr[String] = js.native
  /**
    * Defines cursor move after TAB is pressed (SHIFT+TAB uses negative vector). Can be an object or a function that returns an object. The event argument passed to the function is a jQuery.Event object received after a TAB key has been pressed. This event object can be used to check whether user pressed TAB or SHIFT + TAB.
    */
  var tabMoves: js.UndefOr[js.Any] = js.native
  /**
    * If true, undo/redo functionality is enabled.
    */
  var undo: js.UndefOr[Boolean] = js.native
  /**
    * Width of the grid. Can be a number or a function that returns a number.
    */
  var width: js.UndefOr[js.Any] = js.native
  /**
    * Setting to true word wrapping of the cell text content that does not fit in the fixed column width.
    */
  var wordWrap: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterCellMetaReset(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCellMetaReset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterCellMetaReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCellMetaReset")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterChange(value: (/* changes */ js.Array[_], /* source */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterChange")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterColumnMove(value: (/* oldIndex */ Double, /* newIndex */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterColumnMove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterColumnMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterColumnMove")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterColumnResize(value: (/* col */ Double, /* size */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterColumnResize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterColumnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterColumnResize")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterColumnSort(value: (/* column */ Double, /* order */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterColumnSort")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterColumnSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterColumnSort")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterCopyLimit(
      value: (/* selectedRowsCount */ Double, /* selectedColsCount */ Double, /* copyRowsLimit */ Double, /* copyColsLimit */ Double) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCopyLimit")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAfterCopyLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCopyLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterCreateCol(value: (/* index */ Double, /* amount */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCreateCol")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterCreateCol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCreateCol")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterCreateRow(value: (/* index */ Double, /* amount */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCreateRow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterCreateRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCreateRow")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterDeselect(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDeselect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterDeselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDeselect")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterDestroy(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDestroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterGetCellMeta(value: (/* row */ Double, /* col */ Double, /* cellProperties */ js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterGetCellMeta")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterGetCellMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterGetCellMeta")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterGetColHeader(value: (/* col */ Double, /* TH */ HTMLTableHeaderCellElement) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterGetColHeader")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterGetColHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterGetColHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterGetColWidth(value: (/* col */ Double, /* response */ js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterGetColWidth")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterGetColWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterGetColWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterInit(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInit")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterLoadData(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLoadData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterLoadData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLoadData")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterOnCellCornerMouseDown(value: /* event */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOnCellCornerMouseDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterOnCellCornerMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOnCellCornerMouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterOnCellMouseDown(
      value: (/* event */ MouseEvent, /* coords */ CellPosition, /* TD */ HTMLTableDataCellElement) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOnCellMouseDown")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterOnCellMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOnCellMouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterOnCellMouseOver(
      value: (/* event */ MouseEvent, /* coords */ CellPosition, /* TD */ HTMLTableDataCellElement) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOnCellMouseOver")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAfterOnCellMouseOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOnCellMouseOver")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterRemoveCol(value: (/* index */ Double, /* amount */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRemoveCol")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterRemoveCol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRemoveCol")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterRemoveRow(value: (/* index */ Double, /* amount */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRemoveRow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterRemoveRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRemoveRow")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterRender(value: /* isForced */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRender")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterRenderer(
      value: (/* TD */ HTMLTableDataCellElement, /* row */ Double, /* col */ Double, /* prop */ String, /* value */ String, /* cellProperties */ js.Object) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRenderer")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutAfterRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterScrollHorizontally(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterScrollHorizontally")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterScrollHorizontally: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterScrollHorizontally")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterScrollVertically(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterScrollVertically")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterScrollVertically: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterScrollVertically")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterSelection(value: (/* r */ Double, /* c */ Double, /* r2 */ Double, /* c2 */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSelection")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAfterSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterSelectionByProp(value: (/* r */ Double, /* p */ String, /* r2 */ Double, /* p2 */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSelectionByProp")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAfterSelectionByProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSelectionByProp")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterSelectionEnd(value: (/* r */ Double, /* c */ Double, /* r2 */ Double, /* c2 */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSelectionEnd")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAfterSelectionEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSelectionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterSelectionEndByProp(value: (/* r */ Double, /* p */ String, /* r2 */ Double, /* p2 */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSelectionEndByProp")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAfterSelectionEndByProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSelectionEndByProp")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterSetCellMeta(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSetCellMeta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterSetCellMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSetCellMeta")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterUpdateSettings(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUpdateSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterUpdateSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUpdateSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterValidate(
      value: (/* isValid */ Boolean, /* value */ js.Any, /* row */ Double, /* prop */ String, /* source */ String) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterValidate")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutAfterValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterValidate")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoColumnSize(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoColumnSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoColumnSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoColumnSize")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoComplete(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoWrapCol(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWrapCol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoWrapCol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWrapCol")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoWrapRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWrapRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoWrapRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWrapRow")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeAutofill(
      value: (/* start */ CellPosition, /* end */ CellPosition, /* data */ js.Array[js.Array[String]]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAutofill")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeAutofill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAutofill")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeChange(value: (/* changes */ js.Array[js.Array[_]], /* source */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeChangeRender(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeChangeRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeChangeRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeChangeRender")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeColumnSort(value: (/* column */ Double, /* order */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeColumnSort")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeColumnSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeColumnSort")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeGetCellMeta(value: (/* row */ Double, /* col */ Double, /* cellProperties */ js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeGetCellMeta")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutBeforeGetCellMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeGetCellMeta")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeInit(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInit")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeInitWalkontable(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInitWalkontable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeInitWalkontable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInitWalkontable")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeKeyDown(value: /* event */ KeyboardEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeRemoveCol(value: (/* index */ Double, /* amount */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRemoveCol")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeRemoveCol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRemoveCol")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeRemoveRow(value: (/* index */ Double, /* amount */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRemoveRow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeRemoveRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRemoveRow")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeRender(value: /* isForced */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRender")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSet(value: /* v */ js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSet")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSetRangeEnd(value: /* coords */ js.Array[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSetRangeEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeSetRangeEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSetRangeEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeValidate(value: (/* value */ js.Any, /* row */ Double, /* prop */ String, /* source */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeValidate")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutBeforeValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeValidate")(js.undefined)
        ret
    }
    @scala.inline
    def withCells(value: (/* row */ Double, /* col */ Double, /* prop */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cells")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cells")(js.undefined)
        ret
    }
    @scala.inline
    def withColHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withColWidths(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colWidths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColWidths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colWidths")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnSorting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnSorting")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[_]): Self = {
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
    def withContextMenu(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyColsLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyColsLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyColsLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyColsLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyPaste(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyPaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyRowsLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyRowsLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyRowsLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyRowsLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentColClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentColClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentColClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentColClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentRowClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRowClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentRowClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentRowClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSchema(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSchema")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterBeginsEditing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterBeginsEditing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterBeginsEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterBeginsEditing")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterMoves(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterMoves")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterMoves: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterMoves")(js.undefined)
        ret
    }
    @scala.inline
    def withFillHandle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillHandle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillHandle")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedColumnsLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedColumnsLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedColumnsLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedColumnsLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedRowsTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedRowsTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedRowsTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedRowsTop")(js.undefined)
        ret
    }
    @scala.inline
    def withFragmentSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragmentSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidCellClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidCellClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidCellClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidCellClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEmptyCol(value: /* col */ Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmptyCol")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsEmptyCol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmptyCol")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEmptyRow(value: /* row */ Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmptyRow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsEmptyRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmptyRow")(js.undefined)
        ret
    }
    @scala.inline
    def withManualColumnMove(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualColumnMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualColumnMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualColumnMove")(js.undefined)
        ret
    }
    @scala.inline
    def withManualColumnResize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualColumnResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualColumnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualColumnResize")(js.undefined)
        ret
    }
    @scala.inline
    def withManualRowMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualRowMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualRowMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualRowMove")(js.undefined)
        ret
    }
    @scala.inline
    def withManualRowResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualRowResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualRowResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualRowResize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxCols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCols")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRows")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeCells(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeCells")(js.undefined)
        ret
    }
    @scala.inline
    def withMinCols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinCols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCols")(js.undefined)
        ret
    }
    @scala.inline
    def withMinRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRows")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSpareCols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSpareCols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSpareCols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSpareCols")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSpareRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSpareRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSpareRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSpareRows")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyCol(value: /* col */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyCol")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutModifyCol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyCol")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyColWidth(value: (/* width */ Double, /* col */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyColWidth")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModifyColWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyColWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyRow(value: /* row */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyRow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutModifyRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyRow")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyRowHeight(value: (/* height */ Double, /* row */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyRowHeight")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutModifyRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyRowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withNoWordWrapClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noWordWrapClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoWordWrapClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noWordWrapClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withObserveChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observeChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObserveChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observeChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withObserveDOMVisibility(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observeDOMVisibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObserveDOMVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observeDOMVisibility")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeChange(value: (/* changes */ js.Array[_], /* source */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: (/* changes */ js.Array[_], /* source */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCopyLimit(
      value: (/* selectedRowsCount */ Double, /* selectedColsCount */ Double, /* copyRowsLimit */ Double, /* copyColsLimit */ Double) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopyLimit")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnCopyLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCopyLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelection(value: (/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelection")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectionByProp(value: (/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionByProp")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnSelectionByProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionByProp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectionEnd(value: (/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionEnd")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnSelectionEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectionEndByProp(value: (/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionEndByProp")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnSelectionEndByProp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionEndByProp")(js.undefined)
        ret
    }
    @scala.inline
    def withOutsideClickDeselects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outsideClickDeselects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutsideClickDeselects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outsideClickDeselects")(js.undefined)
        ret
    }
    @scala.inline
    def withPasteMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasteMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteMode")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistentState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistentState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentState")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderCellClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderCellClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderCellClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderCellClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnlyCellClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnlyCellClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnlyCellClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnlyCellClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withRowHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
    @scala.inline
    def withStartCols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startCols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartCols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startCols")(js.undefined)
        ret
    }
    @scala.inline
    def withStartRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRows")(js.undefined)
        ret
    }
    @scala.inline
    def withStretchH(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretchH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStretchH: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stretchH")(js.undefined)
        ret
    }
    @scala.inline
    def withTabMoves(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabMoves")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabMoves: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabMoves")(js.undefined)
        ret
    }
    @scala.inline
    def withUndo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUndo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undo")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWordWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrap")(js.undefined)
        ret
    }
  }
  
}

