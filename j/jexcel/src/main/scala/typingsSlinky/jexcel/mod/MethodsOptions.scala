package typingsSlinky.jexcel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Main options
// ----------------------------------------------------------------------
@js.native
trait MethodsOptions extends js.Object {
  /**
    * remove column by number
    * @param integer columnNumber - Which column should be excluded starting on zero
    * @param integer numOfColumns - number of columns to be excluded from the reference column	myTable.deleteColumn([integer], [integer]);
    */
  // tslint:disable-next-line ban-types
  var deleteColumn: js.UndefOr[js.Function] = js.native
  /**
    * remove row by number
    * @param integer rowNumber - Which row should be excluded starting on zero
    * @param integer numOfRows - number of lines to be excluded
    * myTable.deleteRow([integer], [integer]);
    */
  // tslint:disable-next-line ban-types
  var deleteRow: js.UndefOr[js.Function] = js.native
  /** Destroy all merged cells	myTable.destroyMerge(); */
  // tslint:disable-next-line ban-types
  var destroyMerged: js.UndefOr[js.Function] = js.native
  /**
    * get the current data as a CSV file
    * @param bool - true to download parsed formulas.
    * myTable.download([bool]);
    */
  // tslint:disable-next-line ban-types
  var download: js.UndefOr[js.Function] = js.native
  /**
    * Toggle table fullscreen mode
    * @param boolean fullscreen - define fullscreen status as true or false
    * myTable.fullscreen([bool]);
    */
  // tslint:disable-next-line ban-types
  var fullscreen: js.UndefOr[js.Function] = js.native
  /** get current cell DOM @param string columnName - str compatible with excel, or as object.	myTable.getCell([string]); */
  // tslint:disable-next-line ban-types
  var getCell: js.UndefOr[js.Function] = js.native
  /** Get the data from one column by number @param integer columnNumber - Column number	myTable.getColumnData([int]); */
  // tslint:disable-next-line ban-types
  var getColumnData: js.UndefOr[js.Function] = js.native
  /** get cell comments @param mixed - cell identification or null for the whole table.	myTable.getComments([string]); */
  // tslint:disable-next-line ban-types
  var getComments: js.UndefOr[js.Function] = js.native
  /** get table definitions	myTable.getConfig(); */
  // tslint:disable-next-line ban-types
  var getConfig: js.UndefOr[js.Function] = js.native
  /** Get the full or partial table data @param boolean onlyHighlighedCells - Get only highlighted cells	myTable.getData([bool]); */
  // tslint:disable-next-line ban-types
  var getData: js.UndefOr[js.Function] = js.native
  /** get the current header by column number @param integer columnNumber - Column number starting on zero	myTable.getHeader([integer]); */
  // tslint:disable-next-line ban-types
  var getHeader: js.UndefOr[js.Function] = js.native
  /** get all header titles	myTable.getHeaders(); */
  // tslint:disable-next-line ban-types
  var getHeaders: js.UndefOr[js.Function] = js.native
  /** get the current row height @param integer rowNumber - row number starting on zero	myTable.getHeight([integer]); */
  // tslint:disable-next-line ban-types
  var getHeight: js.UndefOr[js.Function] = js.native
  /** Get the full or partial table data in JSON format @param boolean onlyHighlighedCells - Get only highlighted cells	myTable.getData([bool]); */
  // tslint:disable-next-line ban-types
  var getJson: js.UndefOr[js.Function] = js.native
  /** get current cell DOM innerHTML @param string columnName - str compatible with excel, or as object.	myTable.getLabel([string]); */
  // tslint:disable-next-line ban-types
  var getLabel: js.UndefOr[js.Function] = js.native
  /** Get merged cells properties @param string columnName - Column name, such as A1.	myTable.getMerge([string]); */
  // tslint:disable-next-line ban-types
  var getMerge: js.UndefOr[js.Function] = js.native
  /** get the table or cell meta information @param mixed - cell identification or null for the whole table.	myTable.getMeta([string]); */
  // tslint:disable-next-line ban-types
  var getMeta: js.UndefOr[js.Function] = js.native
  /** Get the data from one row by number @param integer rowNumber - Row number	myTable.getRowData([int]); */
  // tslint:disable-next-line ban-types
  var getRowData: js.UndefOr[js.Function] = js.native
  /** Get the selected columns @param boolean asIds - Get the colNumbers or row DOM elements	myTable.getSelectedColumns([bool]); */
  // tslint:disable-next-line ban-types
  var getSelectedColumns: js.UndefOr[js.Function] = js.native
  /** Get the selected rows @param boolean asIds - Get the rowNumbers or row DOM elements	myTable.getSelectedRows([bool]); */
  // tslint:disable-next-line ban-types
  var getSelectedRows: js.UndefOr[js.Function] = js.native
  /** get table or cell style @param mixed - cell identification or null for the whole table.	myTable.getStyle([string])); */
  // tslint:disable-next-line ban-types
  var getStyle: js.UndefOr[js.Function] = js.native
  /** get current cell value @param mixed cellIdent - str compatible with excel, or as object.	myTable.getValue([string]); */
  // tslint:disable-next-line ban-types
  var getValue: js.UndefOr[js.Function] = js.native
  /** get value from coords @param integer x @param integer y myTable.getValueFromCoords([integer], [integer]); */
  // tslint:disable-next-line ban-types
  var getValueFromCoords: js.UndefOr[js.Function] = js.native
  /** get the current column width @param integer columnNumber - column number starting on zero	myTable.getWidth([integer]); */
  // tslint:disable-next-line ban-types
  var getWidth: js.UndefOr[js.Function] = js.native
  /** hide column by number	myTable.hideColumn([int]); */
  // tslint:disable-next-line ban-types
  var hideColumn: js.UndefOr[js.Function] = js.native
  /** hide column of index numbers	myTable.hideIndex(); */
  // tslint:disable-next-line ban-types
  var hideIndex: js.UndefOr[js.Function] = js.native
  /**
    * add a new column
    * @param mixed - num of columns to be added or data to be added in one single column
    * @param int columnNumber - number of columns to be created
    * @param boolean insertBefore
    * @param object properties - column properties
    * myTable.insertColumn([mixed], [integer], [boolean], [object]);
    */
  // tslint:disable-next-line ban-types
  var insertColumn: js.UndefOr[js.Function] = js.native
  /**
    * add a new row
    * @param mixed - number of blank lines to be insert or a single array with the data of the new row
    * @param integer rowNumber - reference row number
    * @param boolean insertBefore
    * myTable.insertRow([mixed], [integer], [boolean]);
    */
  // tslint:disable-next-line ban-types
  var insertRow: js.UndefOr[js.Function] = js.native
  /**
    * change the column position
    * @param integer columnPosition
    * @param integer newColumnPosition
    * myTable.moveColumn([integer], [integer]);
    */
  // tslint:disable-next-line ban-types
  var moveColumn: js.UndefOr[js.Function] = js.native
  /**
    * change the row position
    * @param integer rowPosition
    * @param integer newRowPosition
    * myTable.moveRow([integer], [integer]);
    */
  // tslint:disable-next-line ban-types
  var moveRow: js.UndefOr[js.Function] = js.native
  /**
    * reorder a column asc or desc
    * @param integer columnNumber - column number starting on zero
    * @param smallint sortType - One will order DESC, zero will order ASC, anything else will toggle the current order
    * myTable.orderBy([integer], [boolean]);
    */
  // tslint:disable-next-line ban-types
  var orderBy: js.UndefOr[js.Function] = js.native
  /** Go to page number- Valid only when pagination is true. @param integer - Go to page number	myTable.page([integer]); */
  // tslint:disable-next-line ban-types
  var page: js.UndefOr[js.Function] = js.native
  /** Redo changes	myTable.redo(); */
  // tslint:disable-next-line ban-types
  var redo: js.UndefOr[js.Function] = js.native
  /** Destroy merged by column name @param string columnName - Column name, such as A1.	myTable.removeMerge([string]); */
  // tslint:disable-next-line ban-types
  var removeMerge: js.UndefOr[js.Function] = js.native
  /** reset search table	myTable.resetSearch(); */
  // tslint:disable-next-line ban-types
  var resetSearch: js.UndefOr[js.Function] = js.native
  /** Reset the table selection @param boolean executeBlur - execute the blur from the table myTable.resetSelection([bool]); */
  // tslint:disable-next-line ban-types
  var resetSelection: js.UndefOr[js.Function] = js.native
  /** remove all style from a cell @param string columnName - Column name, example: A1, B3, etc	myTable.resetStyle([string]); */
  // tslint:disable-next-line ban-types
  var resetStyle: js.UndefOr[js.Function] = js.native
  /** search in the table, only if directive is enabled during inialization. @param string - Search for word	myTable.search([string]); */
  // tslint:disable-next-line ban-types
  var search: js.UndefOr[js.Function] = js.native
  /** Set the data from one column by number @param integer columnNumber - Column number @param array colData - Column data	myTable.setColumnData([int], [array]); */
  // tslint:disable-next-line ban-types
  var setColumnData: js.UndefOr[js.Function] = js.native
  /** set cell comments @param cell - cell identification @param text - comments	myTable.setComments([string], [string]); */
  // tslint:disable-next-line ban-types
  var setComments: js.UndefOr[js.Function] = js.native
  /** Set the table data @param json newData - New json data, null will reload what is in memory.	myTable.setData([json]); */
  // tslint:disable-next-line ban-types
  var setData: js.UndefOr[js.Function] = js.native
  /** change header by column @param integer columnNumber - column number starting on zero @param string columnTitle - New header title	myTable.setHeader([integer], [string]); */
  // tslint:disable-next-line ban-types
  var setHeader: js.UndefOr[js.Function] = js.native
  /** change row height @param integer rowNumber - row number starting on zero @param string newRowHeight- New row height	myTable.setHeight([integer], [integer]); */
  // tslint:disable-next-line ban-types
  var setHeight: js.UndefOr[js.Function] = js.native
  /**
    * Merge cells
    * @param string columnName - Column name, such as A1.
    * @param integer colspan - Number of columns
    * @param integer rowspan - Number of rows
    * myTable.setMerge([string], [int], [int]);
    */
  // tslint:disable-next-line ban-types
  var setMerge: js.UndefOr[js.Function] = js.native
  /** set the table or cell meta information @param mixed - json with whole table meta information.	myTable.setMeta[mixed]); */
  // tslint:disable-next-line ban-types
  var setMeta: js.UndefOr[js.Function] = js.native
  /**
    * Set the data from one row by number
    * @param integer rowNumber - Row number
    * @param array rowData - Row data
    * myTable.setRowData([int], [array]);
    */
  // tslint:disable-next-line ban-types
  var setRowData: js.UndefOr[js.Function] = js.native
  /**
    * set cell(s) CSS style
    * @param mixed - json with whole table style information or just one cell identification. Ex. A1.
    * @param k [optional]- CSS key
    * @param v [optional]- CSS value
    * myTable.setSyle([object], [string], [string]);
    */
  // tslint:disable-next-line ban-types
  var setStyle: js.UndefOr[js.Function] = js.native
  /**
    * change the cell value
    * @param mixed cellIdent - str compatible with excel, or as object.
    * @param string Value - new value for the cell
    * @param bool force - update readonly columns
    * myTable.setValue([string], [string], [bool]);
    */
  // tslint:disable-next-line ban-types
  var setValue: js.UndefOr[js.Function] = js.native
  /**
    * get value from coords
    * @param integer x
    * @param integer y
    * @param string Value - new value for the cell
    * @param bool force - update readonly columns
    * myTable.getValueFromCoords([integer], [integer], [string], [bool]);
    */
  // tslint:disable-next-line ban-types
  var setValueFromCoords: js.UndefOr[js.Function] = js.native
  /**
    * change column width
    * @param integer columnNumber - column number starting on zero
    * @param string newColumnWidth - New column width
    * myTable.setWidth([integer], [integer]);
    */
  // tslint:disable-next-line ban-types
  var setWidth: js.UndefOr[js.Function] = js.native
  /** show column by number	myTable.showIndex([int]); */
  // tslint:disable-next-line ban-types
  var showColumn: js.UndefOr[js.Function] = js.native
  /** show column of index numbers	myTable.showIndex(); */
  // tslint:disable-next-line ban-types
  var showIndex: js.UndefOr[js.Function] = js.native
  /** Undo last changes	myTable.undo(); */
  // tslint:disable-next-line ban-types
  var undo: js.UndefOr[js.Function] = js.native
  /**
    * select cells
    * @param object startCell - cell object
    * @param object endCell - cell object
    * @param boolean ignoreEvents - ignore onselection event
    * myTable.updateSelection([cell], [cell], true);
    */
  // tslint:disable-next-line ban-types
  var updateSelection: js.UndefOr[js.Function] = js.native
  /** select cells @param integer x1 @param integer y1 @param integer x2 @param integer y2	myTable.updateSelectionFromCoords([integer], [integer], [integer], [integer]); */
  // tslint:disable-next-line ban-types
  var updateSelectionFromCoords: js.UndefOr[js.Function] = js.native
  /** Which page showing on jExcel - Valid only when pagination is true.	myTable.whichPage(); */
  // tslint:disable-next-line ban-types
  var whichPage: js.UndefOr[js.Function] = js.native
}

object MethodsOptions {
  @scala.inline
  def apply(): MethodsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MethodsOptions]
  }
  @scala.inline
  implicit class MethodsOptionsOps[Self <: MethodsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteColumn(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteRow(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRow")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroyMerged(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyMerged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestroyMerged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyMerged")(js.undefined)
        ret
    }
    @scala.inline
    def withDownload(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(js.undefined)
        ret
    }
    @scala.inline
    def withFullscreen(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCell(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCell")(js.undefined)
        ret
    }
    @scala.inline
    def withGetColumnData(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumnData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetColumnData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumnData")(js.undefined)
        ret
    }
    @scala.inline
    def withGetComments(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComments")(js.undefined)
        ret
    }
    @scala.inline
    def withGetConfig(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withGetData(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getData")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHeader(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHeaders(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHeight(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withGetJson(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getJson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getJson")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLabel(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMerge(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMerge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetMerge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMerge")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMeta(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMeta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMeta")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRowData(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetRowData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowData")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSelectedColumns(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetSelectedColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSelectedRows(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetSelectedRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectedRows")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStyle(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withGetValue(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGetValueFromCoords(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValueFromCoords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetValueFromCoords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValueFromCoords")(js.undefined)
        ret
    }
    @scala.inline
    def withGetWidth(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withHideColumn(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withHideIndex(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertColumn(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertRow(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertRow")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveColumn(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveRow(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveRow")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderBy(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withRedo(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redo")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveMerge(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMerge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveMerge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeMerge")(js.undefined)
        ret
    }
    @scala.inline
    def withResetSearch(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withResetSelection(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withResetStyle(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: js.Function): Self = {
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
    def withSetColumnData(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setColumnData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetColumnData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setColumnData")(js.undefined)
        ret
    }
    @scala.inline
    def withSetComments(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setComments")(js.undefined)
        ret
    }
    @scala.inline
    def withSetData(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setData")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHeader(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHeight(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMerge(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMerge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetMerge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMerge")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMeta(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMeta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMeta")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRowData(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRowData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetRowData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRowData")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStyle(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSetValue(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSetValueFromCoords(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValueFromCoords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetValueFromCoords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValueFromCoords")(js.undefined)
        ret
    }
    @scala.inline
    def withSetWidth(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withShowColumn(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withShowIndex(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withUndo(value: js.Function): Self = {
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
    def withUpdateSelection(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateSelectionFromCoords(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSelectionFromCoords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateSelectionFromCoords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSelectionFromCoords")(js.undefined)
        ret
    }
    @scala.inline
    def withWhichPage(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whichPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhichPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whichPage")(js.undefined)
        ret
    }
  }
  
}

