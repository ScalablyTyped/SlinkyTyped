package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotLineStatesSelectOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Animation setting for hovering the graph in
    * line-type series.
    */
  var animation: js.UndefOr[PlotLineStatesSelectAnimationOptions] = js.native
  /**
    * (Highmaps) The border color of the point in this state.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highmaps) The border width of the point in this state
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * (Highmaps) The color of the shape in this state.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock) Enable separate styles for the hovered series to
    * visualize that the user hovers either the series itself or the legend.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock) Options for the halo appearing around the hovered
    * point in line-type series as well as outside the hovered slice in pie
    * charts. By default the halo is filled by the current point or series
    * color with an opacity of 0.25\. The halo can be disabled by setting the
    * `halo` option to `null`.
    *
    * In styled mode, the halo is styled with the `.highcharts-halo` class,
    * with colors inherited from `.highcharts-color-{n}`.
    */
  var halo: js.UndefOr[PlotLineStatesSelectHaloOptions | Null] = js.native
  /**
    * (Highcharts, Highstock) Pixel width of the graph line. By default this
    * property is undefined, and the `lineWidthPlus` property dictates how much
    * to increase the linewidth from normal state.
    */
  var lineWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock) The additional line width for the graph of a
    * hovered series.
    */
  var lineWidthPlus: js.UndefOr[Double] = js.native
}

object PlotLineStatesSelectOptions {
  @scala.inline
  def apply(): PlotLineStatesSelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotLineStatesSelectOptions]
  }
  @scala.inline
  implicit class PlotLineStatesSelectOptionsOps[Self <: PlotLineStatesSelectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: PlotLineStatesSelectAnimationOptions): Self = {
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
    @scala.inline
    def withHalo(value: PlotLineStatesSelectHaloOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHalo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halo")(js.undefined)
        ret
    }
    @scala.inline
    def withHaloNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halo")(null)
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
    def withLineWidthPlus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidthPlus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineWidthPlus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidthPlus")(js.undefined)
        ret
    }
  }
  
}

