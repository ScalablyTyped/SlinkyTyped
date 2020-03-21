package typingsSlinky.highcharts.highstockMod

import typingsSlinky.highcharts.mod.ChartCallbackFunction
import typingsSlinky.highcharts.mod.HTMLDOMElement
import typingsSlinky.highcharts.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts/highstock", "chart")
@js.native
object chart extends js.Object {
  def apply(options: Options): typingsSlinky.highcharts.mod.Chart_ = js.native
  def apply(options: Options, callback: ChartCallbackFunction): typingsSlinky.highcharts.mod.Chart_ = js.native
  def apply(renderTo: String, options: Options): typingsSlinky.highcharts.mod.Chart_ = js.native
  def apply(renderTo: String, options: Options, callback: ChartCallbackFunction): typingsSlinky.highcharts.mod.Chart_ = js.native
  def apply(renderTo: HTMLDOMElement, options: Options): typingsSlinky.highcharts.mod.Chart_ = js.native
  def apply(renderTo: HTMLDOMElement, options: Options, callback: ChartCallbackFunction): typingsSlinky.highcharts.mod.Chart_ = js.native
}

