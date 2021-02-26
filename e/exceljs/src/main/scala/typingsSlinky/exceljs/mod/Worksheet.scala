package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.anon.ImageId
import typingsSlinky.exceljs.anon.IncludeEmpty
import typingsSlinky.exceljs.anon.PartialHeaderFooter
import typingsSlinky.exceljs.anon.PartialPageSetup
import typingsSlinky.exceljs.anon.PartialWorksheetProtectio
import typingsSlinky.exceljs.anon.editAsstringundefinedhype
import typingsSlinky.exceljs.anon.editAsstringundefinedhypeEditAs
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Worksheet extends StObject {
  
  /**
  	 * A count of the number of columns that have values.
  	 */
  val actualColumnCount: Double = js.native
  
  /**
  	 * A count of the number of rows that have values. If a mid-document row is empty, it will not be included in the count.
  	 */
  val actualRowCount: Double = js.native
  
  /**
  	 * Using the image id from `Workbook.addImage`, set the background to the worksheet
  	 */
  def addBackgroundImage(imageId: Double): Unit = js.native
  
  /**
  	 * add conditionalFormattingOptions
  	 */
  def addConditionalFormatting(cf: ConditionalFormattingOptions): Unit = js.native
  
  /**
  	 * Using the image id from `Workbook.addImage`,
  	 * embed an image within the worksheet to cover a range
  	 */
  def addImage(imageId: Double, range: String): Unit = js.native
  def addImage(imageId: Double, range: editAsstringundefinedhype): Unit = js.native
  def addImage(imageId: Double, range: editAsstringundefinedhypeEditAs): Unit = js.native
  
  def addRow(data: js.Any): Row = js.native
  def addRow(data: js.Any, style: String): Row = js.native
  /**
  	 * Add a couple of Rows by key-value, after the last current row, using the column keys,
  	 * or add a row by contiguous Array (assign to columns A, B & C)
  	 */
  def addRow(data: js.Array[_]): Row = js.native
  def addRow(data: js.Array[_], style: String): Row = js.native
  
  /**
  	 * Add multiple rows by providing an array of arrays or key-value pairs
  	 */
  def addRows(rows: js.Array[_]): js.Array[Row] = js.native
  def addRows(rows: js.Array[_], style: String): js.Array[Row] = js.native
  
  /**
  	 * Add a new table and return a reference to it
  	 */
  def addTable(tableProperties: TableProperties): Table = js.native
  
  /**
  	 * Apply an auto filter to your worksheet.
  	 */
  var autoFilter: js.UndefOr[AutoFilter] = js.native
  
  /**
  	 * The total column size of the document. Equal to the maximum cell count from all of the rows
  	 */
  val columnCount: Double = js.native
  
  /**
  	 * Add column headers and define column keys and widths.
  	 *
  	 * Note: these column structures are a workbook-building convenience only,
  	 * apart from the column width, they will not be fully persisted.
  	 */
  var columns: js.Array[Column] = js.native
  
  def commit(): Unit = js.native
  
  def deleteColumnKey(key: String): Unit = js.native
  
  def destroy(): Unit = js.native
  
  val dimensions: Range = js.native
  
  /**
  	 * Duplicate rows and insert new rows
  	 */
  def duplicateRow(rowNum: Double, count: Double, insert: Boolean): Unit = js.native
  
  def eachColumnKey(callback: js.Function2[/* col */ Column, /* index */ Double, Unit]): Unit = js.native
  
  /**
  	 * Iterate over all rows that have values in a worksheet
  	 */
  def eachRow(callback: js.Function2[/* row */ Row, /* rowNumber */ Double, Unit]): Unit = js.native
  /**
  	 * Iterate over all rows (including empty rows) in a worksheet
  	 */
  def eachRow(opt: IncludeEmpty, callback: js.Function2[/* row */ Row, /* rowNumber */ Double, Unit]): Unit = js.native
  
  def fillFormula(range: String, formula: String): Unit = js.native
  def fillFormula(range: String, formula: String, results: js.Array[js.Array[Double] | Double]): Unit = js.native
  def fillFormula(
    range: String,
    formula: String,
    results: js.Function2[/* r */ Double, /* c */ Double, String | Double]
  ): Unit = js.native
  def fillFormula(range: Location, formula: String): Unit = js.native
  def fillFormula(range: Location, formula: String, results: js.Array[js.Array[Double] | Double]): Unit = js.native
  def fillFormula(
    range: Location,
    formula: String,
    results: js.Function2[/* r */ Double, /* c */ Double, String | Double]
  ): Unit = js.native
  def fillFormula(range: Range, formula: String): Unit = js.native
  def fillFormula(range: Range, formula: String, results: js.Array[js.Array[Double] | Double]): Unit = js.native
  def fillFormula(
    range: Range,
    formula: String,
    results: js.Function2[/* r */ Double, /* c */ Double, String | Double]
  ): Unit = js.native
  
  def findCell(r: String, c: String): js.UndefOr[Cell] = js.native
  def findCell(r: String, c: Double): js.UndefOr[Cell] = js.native
  def findCell(r: Double, c: String): js.UndefOr[Cell] = js.native
  /**
  	 * returns the cell at [r,c] or address given by r. If not found, return undefined
  	 */
  def findCell(r: Double, c: Double): js.UndefOr[Cell] = js.native
  
  /**
  	 * Tries to find and return row for row no, else undefined
  	 * 
  	 * @param row The 1-index row number
  	 */
  def findRow(row: Double): js.UndefOr[Row] = js.native
  
  /**
  	 * Tries to find and return rows for row no start and length, else undefined
  	 * 
  	 * @param start The 1-index starting row number
  	 * @param length The length of the expected array
  	 */
  def findRows(start: Double, length: Double): js.UndefOr[js.Array[Row]] = js.native
  
  def getBackgroundImageId(): String = js.native
  
  def getCell(r: String): Cell = js.native
  def getCell(r: String, c: String): Cell = js.native
  def getCell(r: String, c: Double): Cell = js.native
  /**
  	 * Get or create cell
  	 */
  def getCell(r: Double): Cell = js.native
  def getCell(r: Double, c: String): Cell = js.native
  def getCell(r: Double, c: Double): Cell = js.native
  
  def getColumn(indexOrKey: String): Column = js.native
  /**
  	 * Access an individual columns by key, letter and 1-based column number
  	 */
  def getColumn(indexOrKey: Double): Column = js.native
  
  def getColumnKey(key: String): Column = js.native
  
  def getImages(): js.Array[ImageId] = js.native
  
  /**
  	 * Get or create row by 1-based index
  	 */
  def getRow(index: Double): Row = js.native
  
  /**
  	 * Get or create rows by 1-based index
  	 */
  def getRows(start: Double, length: Double): js.Array[Row] = js.native
  
  /**
  	 * return all rows as sparse array
  	 */
  def getSheetValues(): js.Array[RowValues] = js.native
  
  /**
  	 * fetch table by name or id
  	 */
  def getTable(name: String): Table = js.native
  
  /**
  	 *  fetch table
  	 */
  def getTables(): js.Array[js.Tuple2[Table, Unit]] = js.native
  
  val hasMerges: Boolean = js.native
  
  /**
  	 * Worksheet Header and Footer
  	 */
  var headerFooter: PartialHeaderFooter = js.native
  
  val id: Double = js.native
  
  def insertRow(pos: Double, value: js.Any): Row = js.native
  def insertRow(pos: Double, value: js.Any, style: String): Row = js.native
  /**
  	 * Insert a Row by key-value, at the position (shifiting down all rows from position),
  	 * using the column keys, or add a row by contiguous Array (assign to columns A, B & C)
  	 */
  def insertRow(pos: Double, value: js.Array[_]): Row = js.native
  def insertRow(pos: Double, value: js.Array[_], style: String): Row = js.native
  
  /**
  	 * Insert multiple rows at position (shifiting down all rows from position)
  	 * by providing an array of arrays or key-value pairs
  	 */
  def insertRows(pos: Double, values: js.Array[_]): js.Array[Row] = js.native
  def insertRows(pos: Double, values: js.Array[_], style: String): js.Array[Row] = js.native
  
  /**
  	 * Get the last editable row in a worksheet (or undefined if there are none)
  	 */
  val lastRow: js.UndefOr[Row] = js.native
  
  /**
  	 * Merge cells, either:
  	 *
  	 * tlbr string, e.g. `'A4:B5'`
  	 *
  	 * tl string, br string, e.g. `'G10', 'H11'`
  	 *
  	 * t, l, b, r numbers, e.g. `10,11,12,13`
  	 */
  def mergeCells(): Unit = js.native
  def mergeCells(tl: String, br: String): Unit = js.native
  def mergeCells(tl: String, br: String, sheetName: String): Unit = js.native
  def mergeCells(top: Double, left: Double, bottom: Double, right: Double): Unit = js.native
  def mergeCells(top: Double, left: Double, bottom: Double, right: Double, sheetName: String): Unit = js.native
  def mergeCells(v: String): Unit = js.native
  def mergeCells(v: js.Tuple2[String, String]): Unit = js.native
  def mergeCells(v: js.Tuple3[String, String, String]): Unit = js.native
  def mergeCells(v: js.Tuple4[Double, Double, Double, Double]): Unit = js.native
  def mergeCells(v: js.Tuple5[Double, Double, Double, Double, String]): Unit = js.native
  def mergeCells(v: Location): Unit = js.native
  def mergeCells(v: Range): Unit = js.native
  
  def mergeCellsWithoutStyle(): Unit = js.native
  def mergeCellsWithoutStyle(tl: String, br: String): Unit = js.native
  def mergeCellsWithoutStyle(tl: String, br: String, sheetName: String): Unit = js.native
  def mergeCellsWithoutStyle(top: Double, left: Double, bottom: Double, right: Double): Unit = js.native
  def mergeCellsWithoutStyle(top: Double, left: Double, bottom: Double, right: Double, sheetName: String): Unit = js.native
  def mergeCellsWithoutStyle(v: String): Unit = js.native
  def mergeCellsWithoutStyle(v: js.Tuple2[String, String]): Unit = js.native
  def mergeCellsWithoutStyle(v: js.Tuple3[String, String, String]): Unit = js.native
  def mergeCellsWithoutStyle(v: js.Tuple4[Double, Double, Double, Double]): Unit = js.native
  def mergeCellsWithoutStyle(v: js.Tuple5[Double, Double, Double, Double, String]): Unit = js.native
  def mergeCellsWithoutStyle(v: Location): Unit = js.native
  def mergeCellsWithoutStyle(v: Range): Unit = js.native
  
  var model: WorksheetModel = js.native
  
  var name: String = js.native
  
  /**
  	 * Contains information related to how a worksheet is printed
  	 */
  var pageSetup: PartialPageSetup = js.native
  
  /**
  	 * Worksheet Properties
  	 */
  var properties: WorksheetProperties = js.native
  
  /**
  	 * Worksheet protection
  	 */
  def protect(password: String, options: PartialWorksheetProtectio): js.Promise[Unit] = js.native
  
  /**
  	 * delete conditionalFormattingOptions
  	 */
  def removeConditionalFormatting(filter: js.Any): Unit = js.native
  
  /**
  	 * delete table by name or id
  	 */
  def removeTable(name: String): Unit = js.native
  
  /**
  	 * The total row size of the document. Equal to the row number of the last row that has values.
  	 */
  val rowCount: Double = js.native
  
  def setColumnKey(key: String, value: Column): Unit = js.native
  
  /**
  	 * Cut one or more columns (columns to the right are shifted left)
  	 * and optionally insert more
  	 *
  	 * If column properties have been definde, they will be cut or moved accordingly
  	 *
  	 * Known Issue: If a splice causes any merged cells to move, the results may be unpredictable
  	 *
  	 * Also: If the worksheet has more rows than values in the colulmn inserts,
  	 * the rows will still be shifted as if the values existed
  	 */
  def spliceColumns(start: Double, count: Double, insert: js.Array[_]*): Unit = js.native
  
  /**
  	 * Cut one or more rows (rows below are shifted up)
  	 * and optionally insert more
  	 *
  	 * Known Issue: If a splice causes any merged cells to move, the results may be unpredictable
  	 */
  def spliceRows(start: Double, count: Double, insert: js.Array[_]*): Unit = js.native
  
  /**
  	 * Worksheet State
  	 */
  var state: WorksheetState = js.native
  
  /**
  	 * unmerging the cells breaks the style links
  	 */
  def unMergeCells(): Unit = js.native
  def unMergeCells(tl: String, br: String): Unit = js.native
  def unMergeCells(tl: String, br: String, sheetName: String): Unit = js.native
  def unMergeCells(top: Double, left: Double, bottom: Double, right: Double): Unit = js.native
  def unMergeCells(top: Double, left: Double, bottom: Double, right: Double, sheetName: String): Unit = js.native
  def unMergeCells(v: String): Unit = js.native
  def unMergeCells(v: js.Tuple2[String, String]): Unit = js.native
  def unMergeCells(v: js.Tuple3[String, String, String]): Unit = js.native
  def unMergeCells(v: js.Tuple4[Double, Double, Double, Double]): Unit = js.native
  def unMergeCells(v: js.Tuple5[Double, Double, Double, Double, String]): Unit = js.native
  def unMergeCells(v: Location): Unit = js.native
  def unMergeCells(v: Range): Unit = js.native
  
  def unprotect(): Unit = js.native
  
  /**
  	 * Open panes representing the sheet
  	 */
  var views: js.Array[Partial[WorksheetView]] = js.native
  
  val workbook: Workbook = js.native
}
