package typingsSlinky.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadialLinearScale extends js.Object {
  var angleLines: js.UndefOr[AngleLineOptions] = js.native
  var animate: js.UndefOr[Boolean] = js.native
  var display: js.UndefOr[Boolean] = js.native
  var gridLines: js.UndefOr[GridLineOptions] = js.native
  var pointLabels: js.UndefOr[PointLabelOptions] = js.native
  var position: js.UndefOr[PositionType] = js.native
  var ticks: js.UndefOr[LinearTickOptions] = js.native
}

object RadialLinearScale {
  @scala.inline
  def apply(): RadialLinearScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadialLinearScale]
  }
  @scala.inline
  implicit class RadialLinearScaleOps[Self <: RadialLinearScale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngleLines(value: AngleLineOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angleLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngleLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angleLines")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
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
    def withPointLabels(value: PointLabelOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: PositionType): Self = {
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
    def withTicks(value: LinearTickOptions): Self = {
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
  }
  
}

