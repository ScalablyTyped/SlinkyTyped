package typingsSlinky.kendoUi.kendo.dataviz

import typingsSlinky.kendoUi.kendo.Observable
import typingsSlinky.kendoUi.kendo.drawing.Group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartPane extends Observable {
  var chartsVisual: Group = js.native
  var options: ChartPaneOptions = js.native
  var visual: Group = js.native
  def findAxisByName(name: String): ChartAxis = js.native
  def series(): js.Any = js.native
}

