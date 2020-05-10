package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrilldownOptions extends js.Object {
  /**
    * (Highcharts, Highmaps) Additional styles to apply to the X axis label for
    * a point that has drilldown data. By default it is underlined and blue to
    * invite to interaction.
    *
    * In styled mode, active label styles can be set with the
    * `.highcharts-drilldown-axis-label` class.
    */
  var activeAxisLabelStyle: js.UndefOr[CSSObject] = js.native
  /**
    * (Highcharts, Highmaps) Additional styles to apply to the data label of a
    * point that has drilldown data. By default it is underlined and blue to
    * invite to interaction.
    *
    * In styled mode, active data label styles can be applied with the
    * `.highcharts-drilldown-data-label` class.
    */
  var activeDataLabelStyle: js.UndefOr[CSSObject | DrilldownActiveDataLabelStyleOptions] = js.native
  /**
    * (Highcharts) When this option is false, clicking a single point will
    * drill down all points in the same category, equivalent to clicking the X
    * axis label.
    */
  var allowPointDrilldown: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highmaps) Set the animation for all drilldown animations.
    * Animation of a drilldown occurs when drilling between a column point and
    * a column series, or a pie slice and a full pie series. Drilldown can
    * still be used between series and points of different types, but animation
    * will not occur.
    *
    * The animation can either be set as a boolean or a configuration object.
    * If `true`, it will use the 'swing' jQuery easing and a duration of 500
    * ms. If used as a configuration object, the following properties are
    * supported:
    *
    * - `duration`: The duration of the animation in milliseconds.
    *
    * - `easing`: A string reference to an easing function set on the `Math`
    * object. See the easing demo.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.native
  /**
    * (Highcharts, Highmaps) Options for the drill up button that appears when
    * drilling down on a series. The text for the button is defined in
    * lang.drillUpText.
    */
  var drillUpButton: js.UndefOr[DrilldownDrillUpButtonOptions] = js.native
  /**
    * (Highcharts, Highmaps) An array of series configurations for the drill
    * down. Each series configuration uses the same syntax as the series option
    * set. These drilldown series are hidden by default. The drilldown series
    * is linked to the parent series' point by its `id`.
    */
  var series: js.UndefOr[js.Array[SeriesOptionsType]] = js.native
}

object DrilldownOptions {
  @scala.inline
  def apply(): DrilldownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrilldownOptions]
  }
  @scala.inline
  implicit class DrilldownOptionsOps[Self <: DrilldownOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveAxisLabelStyle(value: CSSObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeAxisLabelStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveAxisLabelStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeAxisLabelStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveDataLabelStyle(value: CSSObject | DrilldownActiveDataLabelStyleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeDataLabelStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveDataLabelStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeDataLabelStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowPointDrilldown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPointDrilldown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowPointDrilldown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPointDrilldown")(js.undefined)
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
    def withDrillUpButton(value: DrilldownDrillUpButtonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillUpButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrillUpButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillUpButton")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: js.Array[SeriesOptionsType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(js.undefined)
        ret
    }
  }
  
}

