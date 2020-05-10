package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotBulletStatesHoverOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Animation setting for hovering the graph in
    * line-type series.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject | PlotBulletStatesHoverAnimationOptions] = js.native
  /**
    * (Highcharts, Gantt) A specific border color for the hovered point.
    * Defaults to inherit the normal state border color.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highmaps) The border width of the point in this state
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) How much to brighten the point on
    * interaction. Requires the main color to be defined in hex or rgb(a)
    * format.
    *
    * In styled mode, the hover brightening is by default replaced with a
    * fill-opacity set in the `.highcharts-point:hover` rule.
    */
  var brightness: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Gantt) A specific color for the hovered point.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Enable separate styles for the hovered
    * series to visualize that the user hovers either the series itself or the
    * legend.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object PlotBulletStatesHoverOptions {
  @scala.inline
  def apply(): PlotBulletStatesHoverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotBulletStatesHoverOptions]
  }
  @scala.inline
  implicit class PlotBulletStatesHoverOptionsOps[Self <: PlotBulletStatesHoverOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: Boolean | AnimationOptionsObject | PlotBulletStatesHoverAnimationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
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
    def withBrightness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrightness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightness")(js.undefined)
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
  }
  
}

