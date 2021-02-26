package typingsSlinky.kendoUi.kendo.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.kendoUi.JQuery
import typingsSlinky.kendoUi.JQueryPromise
import typingsSlinky.kendoUi.kendo.data.DataSource
import typingsSlinky.kendoUi.kendo.data.TreeListDataSource
import typingsSlinky.kendoUi.kendo.data.TreeListModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeList extends Widget {
  
  def addRow(parentRow: String): Unit = js.native
  def addRow(parentRow: Element): Unit = js.native
  def addRow(parentRow: JQuery): Unit = js.native
  
  def autoFitColumn(column: String): Unit = js.native
  def autoFitColumn(column: js.Any): Unit = js.native
  def autoFitColumn(column: Double): Unit = js.native
  
  def cancelChanges(): Unit = js.native
  
  def cancelRow(): Unit = js.native
  
  def clearSelection(): Unit = js.native
  
  def closeCell(): Unit = js.native
  def closeCell(isCancel: Boolean): Unit = js.native
  
  def collapse(row: String): JQueryPromise[_] = js.native
  def collapse(row: Element): JQueryPromise[_] = js.native
  def collapse(row: JQuery): JQueryPromise[_] = js.native
  
  var columns: js.Any = js.native
  
  var content: JQuery = js.native
  
  def dataItem(row: String): TreeListModel = js.native
  def dataItem(row: Element): TreeListModel = js.native
  def dataItem(row: JQuery): TreeListModel = js.native
  
  var dataSource: DataSource = js.native
  
  def editCell(cell: JQuery): Unit = js.native
  
  def editRow(row: JQuery): Unit = js.native
  
  def expand(row: String): JQueryPromise[_] = js.native
  def expand(row: Element): JQueryPromise[_] = js.native
  def expand(row: JQuery): JQueryPromise[_] = js.native
  
  def hideColumn(column: String): Unit = js.native
  def hideColumn(column: Double): Unit = js.native
  
  def itemFor(model: js.Any): JQuery = js.native
  def itemFor(model: TreeListModel): JQuery = js.native
  
  def items(): js.Any = js.native
  
  def lockColumn(column: String): Unit = js.native
  def lockColumn(column: Double): Unit = js.native
  
  var lockedContent: JQuery = js.native
  
  var lockedHeader: JQuery = js.native
  
  var lockedTable: JQuery = js.native
  
  @JSName("options")
  var options_TreeList: TreeListOptions = js.native
  
  def refresh(): Unit = js.native
  
  def removeRow(row: String): Unit = js.native
  def removeRow(row: Element): Unit = js.native
  def removeRow(row: JQuery): Unit = js.native
  
  def reorderColumn(destIndex: Double, column: js.Any): Unit = js.native
  
  def saveAsExcel(): Unit = js.native
  
  def saveAsPDF(): JQueryPromise[_] = js.native
  
  def saveChanges(): Unit = js.native
  
  def saveRow(): Unit = js.native
  
  def select(): JQuery = js.native
  def select(rows: Element): Unit = js.native
  def select(rows: JQuery): Unit = js.native
  
  def setDataSource(dataSource: TreeListDataSource): Unit = js.native
  
  def showColumn(column: String): Unit = js.native
  def showColumn(column: Double): Unit = js.native
  
  var table: JQuery = js.native
  
  var tbody: JQuery = js.native
  
  var thead: JQuery = js.native
  
  def unlockColumn(column: String): Unit = js.native
  def unlockColumn(column: Double): Unit = js.native
  
  var wrapper: JQuery = js.native
}
