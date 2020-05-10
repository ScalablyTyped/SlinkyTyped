package typingsSlinky.reactPlotlyJs

import typingsSlinky.plotlyJs.mod.PlotDatum
import typingsSlinky.plotlyJs.mod.SelectionRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<plotly.js.plotly.js.PlotSelectionEvent> */
@js.native
trait ReadonlyPlotSelectionEven extends js.Object {
  val lassoPoints: js.UndefOr[SelectionRange] = js.native
  val points: js.Array[PlotDatum] = js.native
  val range: js.UndefOr[SelectionRange] = js.native
}

object ReadonlyPlotSelectionEven {
  @scala.inline
  def apply(points: js.Array[PlotDatum]): ReadonlyPlotSelectionEven = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyPlotSelectionEven]
  }
  @scala.inline
  implicit class ReadonlyPlotSelectionEvenOps[Self <: ReadonlyPlotSelectionEven] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPoints(value: js.Array[PlotDatum]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLassoPoints(value: SelectionRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lassoPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLassoPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lassoPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: SelectionRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
  }
  
}

