package typingsSlinky.kendoUi.kendo.dataviz.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.kendoUi.JQuery
import typingsSlinky.kendoUi.JQueryPromise
import typingsSlinky.kendoUi.kendo.data.DataSource
import typingsSlinky.kendoUi.kendo.drawing.PDFOptions
import typingsSlinky.kendoUi.kendo.ui.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.ui.Sparkline")
@js.native
class Sparkline protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: SparklineOptions) = this()
  var dataSource: DataSource = js.native
  @JSName("options")
  var options_Sparkline: SparklineOptions = js.native
  var wrapper: JQuery = js.native
  def exportImage(options: js.Any): JQueryPromise[_] = js.native
  def exportPDF(): JQueryPromise[_] = js.native
  def exportPDF(options: PDFOptions): JQueryPromise[_] = js.native
  def exportSVG(options: js.Any): JQueryPromise[_] = js.native
  def imageDataURL(): String = js.native
  def refresh(): Unit = js.native
  def setDataSource(dataSource: DataSource): Unit = js.native
  def setOptions(options: js.Any): Unit = js.native
  def svg(): String = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.ui.Sparkline")
@js.native
object Sparkline extends js.Object {
  var fn: Sparkline = js.native
  def extend(proto: js.Object): Sparkline = js.native
}

