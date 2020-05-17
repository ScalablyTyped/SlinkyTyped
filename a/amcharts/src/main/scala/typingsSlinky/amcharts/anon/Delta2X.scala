package typingsSlinky.amcharts.anon

import typingsSlinky.amcharts.amChartMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delta2X extends js.Object {
  var chart: default = js.native
  var delta2X: js.UndefOr[Double] = js.native
  var delta2Y: js.UndefOr[Double] = js.native
  var deltaX: js.UndefOr[Double] = js.native
  var deltaY: js.UndefOr[Double] = js.native
  var end: js.UndefOr[Double] = js.native
  var finalX: js.UndefOr[Double] = js.native
  var finalY: js.UndefOr[Double] = js.native
  var index: js.UndefOr[Double] = js.native
  var initialX: js.UndefOr[Double] = js.native
  var initialY: js.UndefOr[Double] = js.native
  var mostCloseGraph: js.UndefOr[typingsSlinky.amcharts.amGraphMod.default] = js.native
  var start: js.UndefOr[Double] = js.native
  var target: js.UndefOr[this.type] = js.native
  var `type`: String = js.native
  var x: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double] = js.native
  var zooming: js.UndefOr[Boolean] = js.native
}

object Delta2X {
  @scala.inline
  def apply(chart: default, `type`: String): Delta2X = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delta2X]
  }
  @scala.inline
  implicit class Delta2XOps[Self <: Delta2X] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChart(value: default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelta2X(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delta2X")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelta2X: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delta2X")(js.undefined)
        ret
    }
    @scala.inline
    def withDelta2Y(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delta2Y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelta2Y: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delta2Y")(js.undefined)
        ret
    }
    @scala.inline
    def withDeltaX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeltaX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaX")(js.undefined)
        ret
    }
    @scala.inline
    def withDeltaY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeltaY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaY")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withFinalX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalX")(js.undefined)
        ret
    }
    @scala.inline
    def withFinalY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalY")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialX")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialY")(js.undefined)
        ret
    }
    @scala.inline
    def withMostCloseGraph(value: typingsSlinky.amcharts.amGraphMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mostCloseGraph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMostCloseGraph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mostCloseGraph")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: Delta2X): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
    @scala.inline
    def withZooming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zooming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZooming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zooming")(js.undefined)
        ret
    }
  }
  
}

