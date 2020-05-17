package typingsSlinky.kendoUi.kendo.dataviz.ui

import typingsSlinky.kendoUi.JQuery
import typingsSlinky.kendoUi.JQueryPromise
import typingsSlinky.kendoUi.kendo.data.DataSource
import typingsSlinky.kendoUi.kendo.dataviz.Navigator
import typingsSlinky.kendoUi.kendo.drawing.PDFOptions
import typingsSlinky.kendoUi.kendo.ui.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockChart extends Widget {
  var dataSource: DataSource = js.native
  var navigator: Navigator = js.native
  @JSName("options")
  var options_StockChart: StockChartOptions = js.native
  var wrapper: JQuery = js.native
  def exportImage(options: js.Any): JQueryPromise[_] = js.native
  def exportPDF(): JQueryPromise[_] = js.native
  def exportPDF(options: PDFOptions): JQueryPromise[_] = js.native
  def exportSVG(options: js.Any): JQueryPromise[_] = js.native
  def imageDataURL(): String = js.native
  def redraw(): Unit = js.native
  def refresh(): Unit = js.native
  def setDataSource(dataSource: DataSource): Unit = js.native
  def setOptions(options: js.Any): Unit = js.native
  def svg(): String = js.native
}

