package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotOrganizationLevelsOptions extends js.Object {
  /**
    * (Highcharts) Can set `borderColor` on all nodes which lay on the same
    * level.
    */
  var borderColor: js.UndefOr[ColorString] = js.native
  /**
    * (Highcharts) Can set `borderWidth` on all nodes which lay on the same
    * level.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Can set `color` on all nodes which lay on the same level.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts) Can set `colorByPoint` on all nodes which lay on the same
    * level.
    */
  var colorByPoint: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Can set `dataLabels` on all points which lay on the same
    * level.
    */
  var dataLabels: js.UndefOr[SeriesSankeyDataLabelsOptionsObject] = js.native
  /**
    * (Highcharts) Decides which level takes effect from the options set in the
    * levels object.
    */
  var level: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Can set `linkOpacity` on all points which lay on the same
    * level.
    */
  var linkOpacity: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Can set `states` on all nodes and points which lay on the
    * same level.
    */
  var states: js.UndefOr[PointStatesOptionsObject] = js.native
}

object PlotOrganizationLevelsOptions {
  @scala.inline
  def apply(): PlotOrganizationLevelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotOrganizationLevelsOptions]
  }
  @scala.inline
  implicit class PlotOrganizationLevelsOptionsOps[Self <: PlotOrganizationLevelsOptions] (val x: Self) extends AnyVal {
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
    def withColorByPoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorByPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorByPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorByPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withDataLabels(value: SeriesSankeyDataLabelsOptionsObject): Self = {
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
    @scala.inline
    def withLinkOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withStates(value: PointStatesOptionsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("states")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("states")(js.undefined)
        ret
    }
  }
  
}

