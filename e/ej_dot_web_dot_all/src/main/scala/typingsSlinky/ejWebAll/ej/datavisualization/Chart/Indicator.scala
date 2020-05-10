package typingsSlinky.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Indicator extends js.Object {
  /** Specifies animation duration for indicator rendering.
    * @Default {null}
    */
  var animationDuration: js.UndefOr[Boolean] = js.native
  /** The dPeriod value for stochastic indicator.
    * @Default {3}
    */
  var dPeriod: js.UndefOr[Double] = js.native
  /** Enables/disables the animation.
    * @Default {false}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  /** Color of the technical indicator.
    * @Default {#00008B}
    */
  var fill: js.UndefOr[String] = js.native
  /** Options to customize the histogram in MACD indicator.
    */
  var histogram: js.UndefOr[IndicatorsHistogram] = js.native
  /** Specifies the k period in stochastic indicator.
    * @Default {3}
    */
  var kPeriod: js.UndefOr[Double] = js.native
  /** Specifies the long period in MACD indicator.
    * @Default {26}
    */
  var longPeriod: js.UndefOr[Double] = js.native
  /** Options to customize the lower line in indicators.
    */
  var lowerLine: js.UndefOr[IndicatorsLowerLine] = js.native
  /** Options to customize the MACD line.
    */
  var macdLine: js.UndefOr[IndicatorsMacdLine] = js.native
  /** Specifies the type of the MACD indicator.
    * @Default {line. See MACDType}
    */
  var macdType: js.UndefOr[String] = js.native
  /** Specifies period value in indicator.
    * @Default {14}
    */
  var period: js.UndefOr[Double] = js.native
  /** Options to customize the period line in indicators.
    */
  var periodLine: js.UndefOr[IndicatorsPeriodLine] = js.native
  /** Name of the series for which indicator has to be drawn.
    */
  var seriesName: js.UndefOr[String] = js.native
  /** Specifies the short period in MACD indicator.
    * @Default {13}
    */
  var shortPeriod: js.UndefOr[Double] = js.native
  /** Specifies the standard deviation value for Bollinger band indicator.
    * @Default {2}
    */
  var standardDeviations: js.UndefOr[Double] = js.native
  /** Options to customize the tooltip.
    */
  var tooltip: js.UndefOr[IndicatorsTooltip] = js.native
  /** Trigger value of MACD indicator.
    * @Default {9}
    */
  var trigger: js.UndefOr[Double] = js.native
  /** Specifies the type of indicator that has to be rendered.
    * @Default {sma. See IndicatorsType}
    */
  var `type`: js.UndefOr[String] = js.native
  /** Options to customize the upper line in indicators
    */
  var upperLine: js.UndefOr[IndicatorsUpperLine] = js.native
  /** Specifies the visibility of indicator.
    * @Default {visible}
    */
  var visibility: js.UndefOr[String] = js.native
  /** Width of the indicator line.
    * @Default {2}
    */
  var width: js.UndefOr[Double] = js.native
  /** Name of the horizontal axis used for indicator. Primary X axis is used when x axis name is not specified.
    */
  var xAxisName: js.UndefOr[String] = js.native
  /** Name of the vertical axis used for indicator. Primary Y axis is used when y axis name is not specified
    */
  var yAxisName: js.UndefOr[String] = js.native
}

object Indicator {
  @scala.inline
  def apply(): Indicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Indicator]
  }
  @scala.inline
  implicit class IndicatorOps[Self <: Indicator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationDuration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withDPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnimation")(js.undefined)
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
    def withHistogram(value: IndicatorsHistogram): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("histogram")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistogram: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("histogram")(js.undefined)
        ret
    }
    @scala.inline
    def withKPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withLongPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withLowerLine(value: IndicatorsLowerLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerLine")(js.undefined)
        ret
    }
    @scala.inline
    def withMacdLine(value: IndicatorsMacdLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macdLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMacdLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macdLine")(js.undefined)
        ret
    }
    @scala.inline
    def withMacdType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macdType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMacdType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("macdType")(js.undefined)
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
    def withPeriodLine(value: IndicatorsPeriodLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriodLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodLine")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesName")(js.undefined)
        ret
    }
    @scala.inline
    def withShortPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withStandardDeviations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardDeviations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandardDeviations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardDeviations")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: IndicatorsTooltip): Self = {
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
    def withTrigger(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.undefined)
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
    def withUpperLine(value: IndicatorsUpperLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpperLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperLine")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: String): Self = {
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
    @scala.inline
    def withXAxisName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisName")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisName")(js.undefined)
        ret
    }
  }
  
}

