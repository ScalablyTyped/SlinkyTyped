package typingsSlinky.reactNativeChartsWrapper.mod

import typingsSlinky.reactNativeChartsWrapper.AnonAngle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineRadarConfig extends js.Object {
  var drawFilled: js.UndefOr[Boolean] = js.native
  var fillAlpha: js.UndefOr[Double] = js.native
  var fillColor: js.UndefOr[Color] = js.native
  var fillGradient: js.UndefOr[AnonAngle] = js.native
  var lineWidth: js.UndefOr[Double] = js.native
}

object LineRadarConfig {
  @scala.inline
  def apply(): LineRadarConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineRadarConfig]
  }
  @scala.inline
  implicit class LineRadarConfigOps[Self <: LineRadarConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrawFilled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawFilled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawFilled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawFilled")(js.undefined)
        ret
    }
    @scala.inline
    def withFillAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withFillColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFillGradient(value: AnonAngle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillGradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillGradient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillGradient")(js.undefined)
        ret
    }
    @scala.inline
    def withLineWidth(value: Double): Self = {
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
  }
  
}

