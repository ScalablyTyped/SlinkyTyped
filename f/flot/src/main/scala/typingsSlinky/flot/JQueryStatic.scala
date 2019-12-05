package typingsSlinky.flot

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.flot.jquery.flot.dataSeries
import typingsSlinky.flot.jquery.flot.plotOptions
import typingsSlinky.flot.jquery.flot.plotStatic
import typingsSlinky.jquery.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  @JSName("plot")
  var plot_Original: plotStatic = js.native
  def plot(placeholder: JQuery[HTMLElement], data: js.Array[_ | dataSeries]): typingsSlinky.flot.jquery.flot.plot = js.native
  def plot(placeholder: JQuery[HTMLElement], data: js.Array[_ | dataSeries], options: plotOptions): typingsSlinky.flot.jquery.flot.plot = js.native
}

