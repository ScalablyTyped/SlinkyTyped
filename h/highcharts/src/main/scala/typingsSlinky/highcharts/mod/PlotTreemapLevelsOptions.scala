package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotTreemapLevelsOptions extends js.Object {
  /**
    * (Highcharts) Can set a `borderColor` on all points which lies on the same
    * level.
    */
  var borderColor: js.UndefOr[ColorString] = js.native
  /**
    * (Highcharts) Set the dash style of the border of all the point which lies
    * on the level. See (see online documentation for example) for possible
    * options.
    */
  var borderDashStyle: js.UndefOr[DashStyleValue] = js.native
  /**
    * (Highcharts) Can set the borderWidth on all points which lies on the same
    * level.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Can set a color on all points which lies on the same level.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts) A configuration object to define how the color of a child
    * varies from the parent's color. The variation is distributed among the
    * children of node. For example when setting brightness, the brightness
    * change will range from the parent's original brightness on the first
    * child, to the amount set in the `to` setting on the last node. This
    * allows a gradient-like color scheme that sets children out from each
    * other while highlighting the grouping on treemaps and sectors on sunburst
    * charts.
    */
  var colorVariation: js.UndefOr[PlotTreemapLevelsColorVariationOptions] = js.native
  /**
    * (Highcharts) Can set the options of dataLabels on each point which lies
    * on the level. plotOptions.treemap.dataLabels for possible values.
    */
  var dataLabels: js.UndefOr[DataLabelsOptionsObject] = js.native
  /**
    * (Highcharts) Can set the layoutAlgorithm option on a specific level.
    */
  var layoutAlgorithm: js.UndefOr[OptionsLayoutAlgorithmValue] = js.native
  /**
    * (Highcharts) Can set the layoutStartingDirection option on a specific
    * level.
    */
  var layoutStartingDirection: js.UndefOr[OptionsLayoutStartingDirectionValue] = js.native
  /**
    * (Highcharts) Decides which level takes effect from the options set in the
    * levels object.
    */
  var level: js.UndefOr[Double] = js.native
}

object PlotTreemapLevelsOptions {
  @scala.inline
  def apply(): PlotTreemapLevelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreemapLevelsOptions]
  }
  @scala.inline
  implicit class PlotTreemapLevelsOptionsOps[Self <: PlotTreemapLevelsOptions] (val x: Self) extends AnyVal {
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
    def withBorderDashStyle(value: DashStyleValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderDashStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderDashStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderDashStyle")(js.undefined)
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
    def withColorVariation(value: PlotTreemapLevelsColorVariationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorVariation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorVariation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorVariation")(js.undefined)
        ret
    }
    @scala.inline
    def withDataLabels(value: DataLabelsOptionsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutAlgorithm(value: OptionsLayoutAlgorithmValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutStartingDirection(value: OptionsLayoutStartingDirectionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutStartingDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutStartingDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutStartingDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
  }
  
}

