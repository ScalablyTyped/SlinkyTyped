package typingsSlinky.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartScales extends js.Object {
  var display: js.UndefOr[Boolean] = js.native
  var gridLines: js.UndefOr[GridLineOptions] = js.native
  var position: js.UndefOr[PositionType | String] = js.native
  var scaleLabel: js.UndefOr[ScaleTitleOptions] = js.native
  var ticks: js.UndefOr[TickOptions] = js.native
  var `type`: js.UndefOr[ScaleType | String] = js.native
  var xAxes: js.UndefOr[js.Array[ChartXAxe]] = js.native
  var yAxes: js.UndefOr[js.Array[ChartYAxe]] = js.native
}

object ChartScales {
  @scala.inline
  def apply(): ChartScales = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartScales]
  }
  @scala.inline
  implicit class ChartScalesOps[Self <: ChartScales] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
    @scala.inline
    def withGridLines(value: GridLineOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLines")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: PositionType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleLabel(value: ScaleTitleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withTicks(value: TickOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ScaleType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withXAxes(value: js.Array[ChartXAxe]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxes")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxes(value: js.Array[ChartYAxe]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxes")(js.undefined)
        ret
    }
  }
  
}

