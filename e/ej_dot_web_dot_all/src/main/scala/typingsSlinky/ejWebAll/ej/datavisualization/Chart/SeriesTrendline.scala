package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesTrendline extends js.Object {
  /** Past trends of the current series.
    * @Default {0}
    */
  var backwardForecast: js.UndefOr[Double] = js.native
  /** Pattern of dashes and gaps used to stroke the trendline.
    */
  var dashArray: js.UndefOr[String] = js.native
  /** Fill color of the trendlines.
    * @Default {#0000FF}
    */
  var fill: js.UndefOr[String] = js.native
  /** Future trends of the current series.
    * @Default {0}
    */
  var forwardForecast: js.UndefOr[Double] = js.native
  /** Specifies the trendline intercept value
    * @Default {null}
    */
  var intercept: js.UndefOr[Double] = js.native
  /** Name for the trendlines that is to be displayed in legend text.
    * @Default {Trendline}
    */
  var name: js.UndefOr[String] = js.native
  /** Opacity of the trendline.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Specifies the moving average starting period  value.
    * @Default {2}
    */
  var period: js.UndefOr[Double] = js.native
  /** Specifies the order of polynomial trendlines.
    * @Default {0}
    */
  var polynomialOrder: js.UndefOr[Double] = js.native
  /** Options for customizing the trendline tooltip
    */
  var tooltip: js.UndefOr[SeriesTrendlinesTooltip] = js.native
  /** Specifies the type of trendline for the series.
    * @Default {linear. See TrendlinesType}
    */
  var `type`: js.UndefOr[String] = js.native
  /** Show/hides the trendline.
    */
  var visibility: js.UndefOr[Boolean] = js.native
  /** Show/hides the trendline legend.
    * @Default {visible}
    */
  var visibleOnLegend: js.UndefOr[String] = js.native
  /** Width of the trendlines.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.native
}

object SeriesTrendline {
  @scala.inline
  def apply(): SeriesTrendline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesTrendline]
  }
  @scala.inline
  implicit class SeriesTrendlineOps[Self <: SeriesTrendline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackwardForecast(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backwardForecast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackwardForecast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backwardForecast")(js.undefined)
        ret
    }
    @scala.inline
    def withDashArray(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashArray")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withForwardForecast(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardForecast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardForecast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardForecast")(js.undefined)
        ret
    }
    @scala.inline
    def withIntercept(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intercept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntercept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intercept")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(js.undefined)
        ret
    }
    @scala.inline
    def withPolynomialOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polynomialOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolynomialOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polynomialOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: SeriesTrendlinesTooltip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleOnLegend(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleOnLegend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleOnLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleOnLegend")(js.undefined)
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

