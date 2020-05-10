package typingsSlinky.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotSelectionEvent extends js.Object {
  var lassoPoints: js.UndefOr[SelectionRange] = js.native
  var points: js.Array[PlotDatum] = js.native
  var range: js.UndefOr[SelectionRange] = js.native
}

object PlotSelectionEvent {
  @scala.inline
  def apply(points: js.Array[PlotDatum]): PlotSelectionEvent = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotSelectionEvent]
  }
  @scala.inline
  implicit class PlotSelectionEventOps[Self <: PlotSelectionEvent] (val x: Self) extends AnyVal {
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

