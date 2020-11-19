package typingsSlinky.kendoUi.kendo.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.kendoUi.JQuery
import typingsSlinky.kendoUi.JQueryPromise
import typingsSlinky.kendoUi.kendo.data.DataSource
import typingsSlinky.kendoUi.kendo.data.PivotDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotGrid extends Widget {
  
  def cellInfo(columnIndex: Double, rowIndex: Double): js.Any = js.native
  
  def cellInfoByElement(cell: String): js.Any = js.native
  def cellInfoByElement(cell: JQuery): js.Any = js.native
  def cellInfoByElement(cell: Element): js.Any = js.native
  
  var dataSource: DataSource = js.native
  
  @JSName("options")
  var options_PivotGrid: PivotGridOptions = js.native
  
  def refresh(): Unit = js.native
  
  def saveAsExcel(): Unit = js.native
  
  def saveAsPDF(): JQueryPromise[_] = js.native
  
  def setDataSource(dataSource: PivotDataSource): Unit = js.native
  
  var wrapper: JQuery = js.native
}
