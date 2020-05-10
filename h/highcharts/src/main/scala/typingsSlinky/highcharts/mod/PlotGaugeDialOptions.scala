package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotGaugeDialOptions extends js.Object {
  /**
    * (Highcharts) The background or fill color of the gauge's dial.
    */
  var backgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts) The length of the dial's base part, relative to the total
    * radius or length of the dial.
    */
  var baseLength: js.UndefOr[String] = js.native
  /**
    * (Highcharts) The pixel width of the base of the gauge dial. The base is
    * the part closest to the pivot, defined by baseLength.
    */
  var baseWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) The border color or stroke of the gauge's dial. By default,
    * the borderWidth is 0, so this must be set in addition to a custom border
    * color.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts) The width of the gauge dial border in pixels.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) The radius or length of the dial, in percentages relative to
    * the radius of the gauge itself.
    */
  var radius: js.UndefOr[String] = js.native
  /**
    * (Highcharts) The length of the dial's rear end, the part that extends out
    * on the other side of the pivot. Relative to the dial's length.
    */
  var rearLength: js.UndefOr[String] = js.native
  /**
    * (Highcharts) The width of the top of the dial, closest to the perimeter.
    * The pivot narrows in from the base to the top.
    */
  var topWidth: js.UndefOr[Double] = js.native
}

object PlotGaugeDialOptions {
  @scala.inline
  def apply(): PlotGaugeDialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotGaugeDialOptions]
  }
  @scala.inline
  implicit class PlotGaugeDialOptionsOps[Self <: PlotGaugeDialOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: ColorString | GradientColorObject | PatternObject): Self = {
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
    def withBaseLength(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseLength")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = {
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
    def withRadius(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
    @scala.inline
    def withRearLength(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rearLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRearLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rearLength")(js.undefined)
        ret
    }
    @scala.inline
    def withTopWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topWidth")(js.undefined)
        ret
    }
  }
  
}

