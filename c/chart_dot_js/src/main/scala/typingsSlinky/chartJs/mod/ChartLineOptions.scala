package typingsSlinky.chartJs.mod

import org.scalajs.dom.raw.CanvasGradient
import org.scalajs.dom.raw.CanvasPattern
import typingsSlinky.chartJs.chartJsStrings.bottom
import typingsSlinky.chartJs.chartJsStrings.default
import typingsSlinky.chartJs.chartJsStrings.monotone
import typingsSlinky.chartJs.chartJsStrings.top
import typingsSlinky.chartJs.chartJsStrings.zero
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartLineOptions extends js.Object {
  var backgroundColor: js.UndefOr[ChartColor] = js.native
  var borderCapStyle: js.UndefOr[String] = js.native
  var borderColor: js.UndefOr[ChartColor] = js.native
  var borderDash: js.UndefOr[js.Array[_]] = js.native
  var borderDashOffset: js.UndefOr[Double] = js.native
  var borderJoinStyle: js.UndefOr[String] = js.native
  var borderWidth: js.UndefOr[Double] = js.native
  var capBezierPoints: js.UndefOr[Boolean] = js.native
  var cubicInterpolationMode: js.UndefOr[default | monotone] = js.native
  var fill: js.UndefOr[zero | top | bottom | Boolean] = js.native
  var stepped: js.UndefOr[Boolean] = js.native
  var tension: js.UndefOr[Double] = js.native
}

object ChartLineOptions {
  @scala.inline
  def apply(): ChartLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLineOptions]
  }
  @scala.inline
  implicit class ChartLineOptionsOps[Self <: ChartLineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColorCanvasPattern(value: CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundColorCanvasGradient(value: CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundColor(value: ChartColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderCapStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderCapStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderCapStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderCapStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderColorCanvasPattern(value: CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderColorCanvasGradient(value: CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderColor(value: ChartColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderDash(value: js.Array[_]): Self = {
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
    def withBorderJoinStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderJoinStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderJoinStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderJoinStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCapBezierPoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capBezierPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapBezierPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capBezierPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withCubicInterpolationMode(value: default | monotone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cubicInterpolationMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCubicInterpolationMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cubicInterpolationMode")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: zero | top | bottom | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withStepped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepped")(js.undefined)
        ret
    }
    @scala.inline
    def withTension(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tension")(js.undefined)
        ret
    }
  }
  
}

