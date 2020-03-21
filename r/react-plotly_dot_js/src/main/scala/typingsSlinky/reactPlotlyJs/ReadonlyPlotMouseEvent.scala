package typingsSlinky.reactPlotlyJs

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.plotlyJs.mod.PlotDatum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<plotly.js.plotly.js.PlotMouseEvent> */
trait ReadonlyPlotMouseEvent extends js.Object {
  val event: MouseEvent
  val points: js.Array[PlotDatum]
}

object ReadonlyPlotMouseEvent {
  @scala.inline
  def apply(event: MouseEvent, points: js.Array[PlotDatum]): ReadonlyPlotMouseEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadonlyPlotMouseEvent]
  }
}

