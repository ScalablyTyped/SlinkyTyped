package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YAxisResizeOptions extends js.Object {
  /**
    * (Highstock) Contains two arrays of axes that are controlled by control
    * line of the axis.
    */
  var controlledAxis: js.UndefOr[YAxisResizeControlledAxisOptions] = js.native
  /**
    * (Highstock) Cursor style for the control line.
    *
    * In styled mode use class `highcharts-axis-resizer` instead.
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * (Highstock) Enable or disable resize by drag for the axis.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) Color of the control line.
    *
    * In styled mode use class `highcharts-axis-resizer` instead.
    */
  var lineColor: js.UndefOr[ColorString] = js.native
  /**
    * (Highstock) Dash style of the control line.
    *
    * In styled mode use class `highcharts-axis-resizer` instead.
    */
  var lineDashStyle: js.UndefOr[String] = js.native
  /**
    * (Highstock) Width of the control line.
    *
    * In styled mode use class `highcharts-axis-resizer` instead.
    */
  var lineWidth: js.UndefOr[Double] = js.native
  /**
    * (Highstock) Horizontal offset of the control line.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * (Highstock) Vertical offset of the control line.
    */
  var y: js.UndefOr[Double] = js.native
}

object YAxisResizeOptions {
  @scala.inline
  def apply(): YAxisResizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YAxisResizeOptions]
  }
  @scala.inline
  implicit class YAxisResizeOptionsOps[Self <: YAxisResizeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControlledAxis(value: YAxisResizeControlledAxisOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlledAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlledAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlledAxis")(js.undefined)
        ret
    }
    @scala.inline
    def withCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLineColor(value: ColorString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLineDashStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDashStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineDashStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDashStyle")(js.undefined)
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
  }
  
}

