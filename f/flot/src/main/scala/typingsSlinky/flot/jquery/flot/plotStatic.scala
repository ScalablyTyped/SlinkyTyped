package typingsSlinky.flot.jquery.flot

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait plotStatic extends js.Object {
  var plugins: js.Array[plugin] = js.native
  def apply(placeholder: JQuery[HTMLElement], data: js.Array[_ | dataSeries]): plot = js.native
  def apply(placeholder: JQuery[HTMLElement], data: js.Array[_ | dataSeries], options: plotOptions): plot = js.native
}

