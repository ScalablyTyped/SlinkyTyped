package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendNavigationOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The color for the active up or
    * down arrow in the legend page navigation.
    */
  var activeColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) How to animate the pages when
    * navigating up or down. A value of `true` applies the default navigation
    * given in the `chart.animation` option. Additional options can be given as
    * an object containing values for easing and duration.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel size of the up and
    * down arrows in the legend paging navigation.
    */
  var arrowSize: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to enable the legend
    * navigation. In most cases, disabling the navigation results in an
    * unwanted overflow.
    *
    * See also the adapt chart to legend plugin for a solution to extend the
    * chart height to make room for the legend, optionally in exported charts
    * only.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The color of the inactive up or
    * down arrow in the legend page navigation. .
    */
  var inactiveColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Text styles for the legend page
    * navigation.
    */
  var style: js.UndefOr[CSSObject] = js.native
}

object LegendNavigationOptions {
  @scala.inline
  def apply(): LegendNavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendNavigationOptions]
  }
  @scala.inline
  implicit class LegendNavigationOptionsOps[Self <: LegendNavigationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveColor(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimation(value: Boolean | AnimationOptionsObject): Self = {
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
    def withArrowSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowSize")(js.undefined)
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
    def withInactiveColor(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInactiveColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactiveColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

