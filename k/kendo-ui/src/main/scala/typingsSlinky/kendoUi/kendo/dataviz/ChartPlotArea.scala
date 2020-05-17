package typingsSlinky.kendoUi.kendo.dataviz

import typingsSlinky.kendoUi.kendo.Observable
import typingsSlinky.kendoUi.kendo.drawing.Group
import typingsSlinky.kendoUi.kendo.drawing.MultiPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartPlotArea extends Observable {
  var backgroundVisual: MultiPath = js.native
  var options: ChartPlotAreaOptions = js.native
  var visual: Group = js.native
}

