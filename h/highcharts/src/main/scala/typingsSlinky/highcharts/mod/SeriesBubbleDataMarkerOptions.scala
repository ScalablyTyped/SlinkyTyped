package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesBubbleDataMarkerOptions extends js.Object {
  /**
    * (Highcharts) Enable or disable the point marker. If `undefined`, the
    * markers are hidden when the data is dense, and shown for more widespread
    * data points.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) The fill color of the point marker. When `undefined`, the
    * series' or point's color is used.
    */
  var fillColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts) The color of the point marker's outline. When `undefined`,
    * the series' or point's color is used.
    */
  var lineColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts) The width of the point marker's outline.
    */
  var lineWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) States for a single point marker.
    */
  var states: js.UndefOr[SeriesBubbleDataMarkerStatesOptions] = js.native
  /**
    * (Highcharts) A predefined shape or symbol for the marker. When undefined,
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
}

object SeriesBubbleDataMarkerOptions {
  @scala.inline
  def apply(): SeriesBubbleDataMarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesBubbleDataMarkerOptions]
  }
  @scala.inline
  implicit class SeriesBubbleDataMarkerOptionsOps[Self <: SeriesBubbleDataMarkerOptions] (val x: Self) extends AnyVal {
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
    def withStates(value: SeriesBubbleDataMarkerStatesOptions): Self = {
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
  }
  
}

