package typingsSlinky.flot

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.flot.jquery.flot.dataSeries
import typingsSlinky.flot.jquery.flot.plotOptions
import typingsSlinky.flot.jquery.flot.plotStatic
import typingsSlinky.jquery.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends StObject {
  
  def plot(placeholder: JQuery[HTMLElement], data: js.Array[_ | dataSeries]): typingsSlinky.flot.jquery.flot.plot = js.native
  def plot(placeholder: JQuery[HTMLElement], data: js.Array[_ | dataSeries], options: plotOptions): typingsSlinky.flot.jquery.flot.plot = js.native
  @JSName("plot")
  var plot_Original: plotStatic = js.native
}
