package typingsSlinky.kendoUi.kendo.dataviz

import typingsSlinky.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartSeries extends Observable {
  var options: ChartSeriesOptions = js.native
  def data(): js.Any = js.native
  def data(data: js.Any): Unit = js.native
  def findPoint(callback: js.Function): ChartPoint = js.native
  def points(): js.Any = js.native
  def points(filter: js.Function): Unit = js.native
  def toggleHighlight(show: Boolean, filter: js.Any): Unit = js.native
  def toggleHighlight(show: Boolean, filter: js.Function): Unit = js.native
  def toggleVisibility(show: Boolean, filter: js.Function): Unit = js.native
}

