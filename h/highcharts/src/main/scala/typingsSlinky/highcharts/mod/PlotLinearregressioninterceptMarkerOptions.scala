package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotLinearregressioninterceptMarkerOptions extends js.Object {
  /**
    * (Highstock) Enable or disable the point marker. If `undefined`, the
    * markers are hidden when the data is dense, and shown for more widespread
    * data points.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) The threshold for how dense the point markers should be
    * before they are hidden, given that `enabled` is not defined. The number
    * indicates the horizontal distance between the two closest points in the
    * series, as multiples of the `marker.radius`. In other words, the default
    * value of 2 means points are hidden if overlapping horizontally.
    */
  var enabledThreshold: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The fill color of the point marker. When `undefined`, the
    * series' or point's color is used.
    */
  var fillColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highstock) Image markers only. Set the image width explicitly. When
    * using this option, a `width` must also be set.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The color of the point marker's outline. When `undefined`,
    * the series' or point's color is used.
    */
  var lineColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highstock) The width of the point marker's outline.
    */
  var lineWidth: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The radius of the point marker.
    */
  var radius: js.UndefOr[Double] = js.native
  /**
    * (Highstock) States for a single point marker.
    */
  var states: js.UndefOr[PlotLinearregressioninterceptMarkerStatesOptions] = js.native
  /**
    * (Highstock) A predefined shape or symbol for the marker. When undefined,
    * the symbol is pulled from options.symbols. Other possible values are
    * "circle", "square", "diamond", "triangle" and "triangle-down".
    *
    * Additionally, the URL to a graphic can be given on this form:
    * "url(graphic.png)". Note that for the image to be applied to exported
    * charts, its URL needs to be accessible by the export server.
    *
    * Custom callbacks for symbol path generation can also be added to
    * `Highcharts.SVGRenderer.prototype.symbols`. The callback is then used by
    * its method name, as shown in the demo.
    */
  var symbol: js.UndefOr[String] = js.native
  /**
    * (Highstock) Image markers only. Set the image width explicitly. When
    * using this option, a `height` must also be set.
    */
  var width: js.UndefOr[Double] = js.native
}

object PlotLinearregressioninterceptMarkerOptions {
  @scala.inline
  def apply(): PlotLinearregressioninterceptMarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotLinearregressioninterceptMarkerOptions]
  }
  @scala.inline
  implicit class PlotLinearregressioninterceptMarkerOptionsOps[Self <: PlotLinearregressioninterceptMarkerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withEnabledThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withFillColor(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(js.undefined)
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
    def withLineColor(value: ColorString | GradientColorObject | PatternObject): Self = {
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
    def withRadius(value: Double): Self = {
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
    def withStates(value: PlotLinearregressioninterceptMarkerStatesOptions): Self = {
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
    @scala.inline
    def withSymbol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
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

