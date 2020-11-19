package typingsSlinky.kendoUi.kendo.spreadsheet

import typingsSlinky.kendoUi.kendo.Observable
import typingsSlinky.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sheet extends Observable {
  
  def batch(callback: js.Function, changeEventArgs: js.Any): Unit = js.native
  
  def clearFilter(indexes: js.Any): Unit = js.native
  def clearFilter(indexes: Double): Unit = js.native
  
  def columnWidth(): Unit = js.native
  def columnWidth(index: Double): Unit = js.native
  def columnWidth(index: Double, width: Double): Unit = js.native
  
  def deleteColumn(index: Double): Unit = js.native
  
  def deleteRow(index: Double): Unit = js.native
  
  def fromJSON(data: js.Any): Unit = js.native
  
  def frozenColumns(): Unit = js.native
  def frozenColumns(count: Double): Unit = js.native
  @JSName("frozenColumns")
  def frozenColumns_Double(): Double = js.native
  
  def frozenRows(): Unit = js.native
  def frozenRows(count: Double): Unit = js.native
  @JSName("frozenRows")
  def frozenRows_Double(): Double = js.native
  
  def hideColumn(index: Double): Unit = js.native
  
  def hideRow(index: Double): Unit = js.native
  
  def insertColumn(index: Double): Unit = js.native
  
  def insertRow(index: Double): Unit = js.native
  
  var options: SheetOptions = js.native
  
  def range(ref: String): Range = js.native
  def range(rowIndex: Double, columnIndex: Double): Range = js.native
  def range(rowIndex: Double, columnIndex: Double, rowCount: js.UndefOr[scala.Nothing], columnCount: Double): Range = js.native
  def range(rowIndex: Double, columnIndex: Double, rowCount: Double): Range = js.native
  def range(rowIndex: Double, columnIndex: Double, rowCount: Double, columnCount: Double): Range = js.native
  
  def rowHeight(): Unit = js.native
  def rowHeight(index: Double): Unit = js.native
  def rowHeight(index: Double, width: Double): Unit = js.native
  
  def selection(): Range = js.native
  
  def setDataSource(dataSource: DataSource): Unit = js.native
  def setDataSource(dataSource: DataSource, columns: js.Any): Unit = js.native
  
  def showGridLines(): Unit = js.native
  def showGridLines(showGridLines: Boolean): Unit = js.native
  @JSName("showGridLines")
  def showGridLines_Boolean(): Boolean = js.native
  
  def toJSON(): Unit = js.native
  
  def unhideColumn(index: Double): Unit = js.native
  
  def unhideRow(index: Double): Unit = js.native
}
