package typingsSlinky.kendoUi.kendo.dataviz

import typingsSlinky.kendoUi.kendo.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartSeries extends Observable {
  
  def data(): js.Any = js.native
  def data(data: js.Any): Unit = js.native
  
  def findPoint(callback: js.Function): ChartPoint = js.native
  
  var options: ChartSeriesOptions = js.native
  
  def points(): js.Any = js.native
  def points(filter: js.Function): Unit = js.native
  
  def toggleHighlight(show: Boolean, filter: js.Any): Unit = js.native
  def toggleHighlight(show: Boolean, filter: js.Function): Unit = js.native
  
  def toggleVisibility(show: Boolean, filter: js.Function): Unit = js.native
}
