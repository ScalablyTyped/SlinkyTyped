package typingsSlinky.kendoDashUi.kendo.dataviz.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.kendoDashUi.JQuery
import typingsSlinky.kendoDashUi.JQueryPromise
import typingsSlinky.kendoDashUi.kendo.data.DataSource
import typingsSlinky.kendoDashUi.kendo.dataviz.Navigator
import typingsSlinky.kendoDashUi.kendo.drawing.PDFOptions
import typingsSlinky.kendoDashUi.kendo.ui.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.ui.StockChart")
@js.native
class StockChart protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: StockChartOptions) = this()
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

/* static members */
@JSGlobal("kendo.dataviz.ui.StockChart")
@js.native
object StockChart extends js.Object {
  var fn: StockChart = js.native
  def extend(proto: js.Object): StockChart = js.native
}

