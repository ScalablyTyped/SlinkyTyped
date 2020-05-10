package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotBulletTargetOptions extends js.Object {
  /**
    * (Highcharts) The border color of the rectangle representing the target.
    * When not set, the point's border color is used.
    *
    * In styled mode, use class `highcharts-bullet-target` instead.
    */
  var borderColor: js.UndefOr[ColorString] = js.native
  /**
    * (Highcharts) The border width of the rectangle representing the target.
    *
    * In styled mode, use class `highcharts-bullet-target` instead.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) The color of the rectangle representing the target. When not
    * set, point's color (if set in point's options - `color`) or zone of the
    * target value (if `zones` or `negativeColor` are set) or the same color as
    * the point has is used.
    *
    * In styled mode, use class `highcharts-bullet-target` instead.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts) The height of the rectangle representing the target.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) The width of the rectangle representing the target. Could be
    * set as a pixel value or as a percentage of a column width.
    */
  var width: js.UndefOr[Double | String] = js.native
}

object PlotBulletTargetOptions {
  @scala.inline
  def apply(): PlotBulletTargetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotBulletTargetOptions]
  }
  @scala.inline
  implicit class PlotBulletTargetOptionsOps[Self <: PlotBulletTargetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderColor(value: ColorString): Self = {
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
    def withColor(value: ColorString | GradientColorObject | PatternObject): Self = {
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
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

