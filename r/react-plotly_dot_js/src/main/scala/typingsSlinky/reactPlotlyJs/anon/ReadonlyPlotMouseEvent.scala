package typingsSlinky.reactPlotlyJs.anon

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.plotlyJs.mod.PlotDatum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<plotly.js.plotly.js.PlotMouseEvent> */
@js.native
trait ReadonlyPlotMouseEvent extends js.Object {
  val event: MouseEvent = js.native
  val points: js.Array[PlotDatum] = js.native
}

object ReadonlyPlotMouseEvent {
  @scala.inline
  def apply(event: MouseEvent, points: js.Array[PlotDatum]): ReadonlyPlotMouseEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyPlotMouseEvent]
  }
  @scala.inline
  implicit class ReadonlyPlotMouseEventOps[Self <: ReadonlyPlotMouseEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoints(value: js.Array[PlotDatum]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

