package typingsSlinky.kendoUi.kendo.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.kendoUi.JQuery
import typingsSlinky.kendoUi.JQueryPromise
import typingsSlinky.kendoUi.kendo.data.DataSource
import typingsSlinky.kendoUi.kendo.data.PivotDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.PivotGrid")
@js.native
class PivotGrid protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: PivotGridOptions) = this()
  var dataSource: DataSource = js.native
  @JSName("options")
  var options_PivotGrid: PivotGridOptions = js.native
  var wrapper: JQuery = js.native
  def cellInfo(columnIndex: Double, rowIndex: Double): js.Any = js.native
  def cellInfoByElement(cell: String): js.Any = js.native
  def cellInfoByElement(cell: JQuery): js.Any = js.native
  def cellInfoByElement(cell: typingsSlinky.std.Element): js.Any = js.native
  def refresh(): Unit = js.native
  def saveAsExcel(): Unit = js.native
  def saveAsPDF(): JQueryPromise[_] = js.native
  def setDataSource(dataSource: PivotDataSource): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.PivotGrid")
@js.native
object PivotGrid extends js.Object {
  var fn: PivotGrid = js.native
  def extend(proto: js.Object): PivotGrid = js.native
}

