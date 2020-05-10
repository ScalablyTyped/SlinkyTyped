package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotSunburstLevelsOptions extends js.Object {
  /**
    * (Highcharts) Can set a `borderColor` on all points which lies on the same
    * level.
    */
  var borderColor: js.UndefOr[ColorString] = js.native
  /**
    * (Highcharts) Can set a `borderDashStyle` on all points which lies on the
    * same level.
    */
  var borderDashStyle: js.UndefOr[DashStyleValue] = js.native
  /**
    * (Highcharts) Can set a `borderWidth` on all points which lies on the same
    * level.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Can set a `color` on all points which lies on the same
    * level.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts) Can set a `colorVariation` on all points which lies on the
    * same level.
    */
  var colorVariation: js.UndefOr[PlotSunburstLevelsColorVariationOptions] = js.native
  /**
    * (Highcharts) Can set `dataLabels` on all points which lies on the same
    * level.
    */
  var dataLabels: js.UndefOr[SeriesSunburstDataLabelsOptionsObject] = js.native
  /**
    * (Highcharts) Can set a `levelSize` on all points which lies on the same
    * level.
    */
  var levelSize: js.UndefOr[js.Object] = js.native
  /**
    * (Highcharts) Can set a `rotation` on all points which lies on the same
    * level.
    */
  var rotation: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Can set a `rotationMode` on all points which lies on the
    * same level.
    */
  var rotationMode: js.UndefOr[String] = js.native
}

object PlotSunburstLevelsOptions {
  @scala.inline
  def apply(): PlotSunburstLevelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSunburstLevelsOptions]
  }
  @scala.inline
  implicit class PlotSunburstLevelsOptionsOps[Self <: PlotSunburstLevelsOptions] (val x: Self) extends AnyVal {
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
    def withColorVariation(value: PlotSunburstLevelsColorVariationOptions): Self = {
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
    def withDataLabels(value: SeriesSunburstDataLabelsOptionsObject): Self = {
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
    def withLevelSize(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevelSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelSize")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withRotationMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotationMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationMode")(js.undefined)
        ret
    }
  }
  
}

