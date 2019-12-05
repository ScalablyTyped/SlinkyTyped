package typingsSlinky.kendoDashUi.kendo.dataviz

import typingsSlinky.kendoDashUi.kendo.Observable
import typingsSlinky.kendoDashUi.kendo.drawing.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.ChartPoint")
@js.native
class ChartPoint () extends Observable {
  var category: String | js.Date | Double = js.native
  var dataItem: js.Any = js.native
  var options: ChartPointOptions = js.native
  var percentage: Double = js.native
  var runningTotal: Double = js.native
  var total: Double = js.native
  var value: Double = js.native
  var visual: Element = js.native
}

