package typingsSlinky.chartJs.mod

import org.scalajs.dom.raw.CanvasGradient
import org.scalajs.dom.raw.CanvasPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridLineOptions extends js.Object {
  var borderDash: js.UndefOr[js.Array[Double]] = js.native
  var borderDashOffset: js.UndefOr[Double] = js.native
  var circular: js.UndefOr[Boolean] = js.native
  var color: js.UndefOr[ChartColor] = js.native
  var display: js.UndefOr[Boolean] = js.native
  var drawBorder: js.UndefOr[Boolean] = js.native
  var drawOnChartArea: js.UndefOr[Boolean] = js.native
  var drawTicks: js.UndefOr[Boolean] = js.native
  var lineWidth: js.UndefOr[Double | js.Array[Double]] = js.native
  var offsetGridLines: js.UndefOr[Boolean] = js.native
  var tickMarkLength: js.UndefOr[Double] = js.native
  var z: js.UndefOr[Double] = js.native
  var zeroLineBorderDash: js.UndefOr[js.Array[Double]] = js.native
  var zeroLineBorderDashOffset: js.UndefOr[Double] = js.native
  var zeroLineColor: js.UndefOr[ChartColor] = js.native
  var zeroLineWidth: js.UndefOr[Double] = js.native
}

object GridLineOptions {
  @scala.inline
  def apply(): GridLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridLineOptions]
  }
  @scala.inline
  implicit class GridLineOptionsOps[Self <: GridLineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderDash(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderDash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderDash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderDash")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderDashOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderDashOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderDashOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderDashOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withCircular(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircular: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circular")(js.undefined)
        ret
    }
    @scala.inline
    def withColorCanvasPattern(value: CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorCanvasGradient(value: CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: ChartColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
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
    def withDrawBorder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawBorder")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawOnChartArea(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawOnChartArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawOnChartArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawOnChartArea")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawTicks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawTicks")(js.undefined)
        ret
    }
    @scala.inline
    def withLineWidth(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetGridLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetGridLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetGridLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetGridLines")(js.undefined)
        ret
    }
    @scala.inline
    def withTickMarkLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickMarkLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickMarkLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickMarkLength")(js.undefined)
        ret
    }
    @scala.inline
    def withZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(js.undefined)
        ret
    }
    @scala.inline
    def withZeroLineBorderDash(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroLineBorderDash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZeroLineBorderDash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroLineBorderDash")(js.undefined)
        ret
    }
    @scala.inline
    def withZeroLineBorderDashOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroLineBorderDashOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZeroLineBorderDashOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroLineBorderDashOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withZeroLineColorCanvasPattern(value: CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZeroLineColorCanvasGradient(value: CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZeroLineColor(value: ChartColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZeroLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroLineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withZeroLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroLineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZeroLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroLineWidth")(js.undefined)
        ret
    }
  }
  
}

