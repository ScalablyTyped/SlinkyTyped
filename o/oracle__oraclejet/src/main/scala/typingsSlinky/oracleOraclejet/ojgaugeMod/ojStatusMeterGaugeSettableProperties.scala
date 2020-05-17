package typingsSlinky.oracleOraclejet.ojgaugeMod

import typingsSlinky.oracleOraclejet.anon.BorderColorBorderRadius
import typingsSlinky.oracleOraclejet.anon.ConverterPosition
import typingsSlinky.oracleOraclejet.anon.LabelAndValue
import typingsSlinky.oracleOraclejet.anon.PositionStyle
import typingsSlinky.oracleOraclejet.anon.`10`
import typingsSlinky.oracleOraclejet.anon.`11`
import typingsSlinky.oracleOraclejet.ojgaugeMod.ojStatusMeterGauge.ReferenceLine
import typingsSlinky.oracleOraclejet.ojgaugeMod.ojStatusMeterGauge.Threshold
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.all
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.circular
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.currentOnly
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.horizontal
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.onIndicator
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojStatusMeterGaugeSettableProperties extends dvtBaseGaugeSettableProperties {
  var angleExtent: Double = js.native
  var animationDuration: js.UndefOr[Double] = js.native
  var animationOnDataChange: auto | none = js.native
  var animationOnDisplay: auto | none = js.native
  var borderColor: String = js.native
  var borderRadius: String = js.native
  var center: `10` = js.native
  var color: String = js.native
  var indicatorSize: Double = js.native
  var innerRadius: Double = js.native
  var label: PositionStyle = js.native
  var max: Double = js.native
  var metricLabel: ConverterPosition = js.native
  var min: Double = js.native
  var orientation: circular | vertical | horizontal = js.native
  var plotArea: BorderColorBorderRadius = js.native
  var readonly: Boolean = js.native
  var referenceLines: js.Array[ReferenceLine] = js.native
  var startAngle: Double = js.native
  var step: Double | Null = js.native
  var svgClassName: String = js.native
  var svgStyle: js.Object = js.native
  var thresholdDisplay: currentOnly | all | onIndicator = js.native
  var thresholds: js.Array[Threshold] = js.native
  var tooltip: `11` = js.native
  val transientValue: Double | Null = js.native
  var value: Double | Null = js.native
  var visualEffects: none | auto = js.native
}

object ojStatusMeterGaugeSettableProperties {
  @scala.inline
  def apply(
    angleExtent: Double,
    animationOnDataChange: auto | none,
    animationOnDisplay: auto | none,
    borderColor: String,
    borderRadius: String,
    center: `10`,
    color: String,
    indicatorSize: Double,
    innerRadius: Double,
    label: PositionStyle,
    max: Double,
    metricLabel: ConverterPosition,
    min: Double,
    orientation: circular | vertical | horizontal,
    plotArea: BorderColorBorderRadius,
    readonly: Boolean,
    referenceLines: js.Array[ReferenceLine],
    startAngle: Double,
    svgClassName: String,
    svgStyle: js.Object,
    thresholdDisplay: currentOnly | all | onIndicator,
    thresholds: js.Array[Threshold],
    tooltip: `11`,
    trackResize: on | off,
    translations: LabelAndValue,
    visualEffects: none | auto
  ): ojStatusMeterGaugeSettableProperties = {
    val __obj = js.Dynamic.literal(angleExtent = angleExtent.asInstanceOf[js.Any], animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], indicatorSize = indicatorSize.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], metricLabel = metricLabel.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], plotArea = plotArea.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], referenceLines = referenceLines.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], thresholdDisplay = thresholdDisplay.asInstanceOf[js.Any], thresholds = thresholds.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], visualEffects = visualEffects.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojStatusMeterGaugeSettableProperties]
  }
  @scala.inline
  implicit class ojStatusMeterGaugeSettablePropertiesOps[Self <: ojStatusMeterGaugeSettableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngleExtent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angleExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationOnDataChange(value: auto | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOnDataChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationOnDisplay(value: auto | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOnDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderRadius(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCenter(value: `10`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicatorSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: PositionStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetricLabel(value: ConverterPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: circular | vertical | horizontal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlotArea(value: BorderColorBorderRadius): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plotArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadonly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferenceLines(value: js.Array[ReferenceLine]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSvgClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSvgStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThresholdDisplay(value: currentOnly | all | onIndicator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholdDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThresholds(value: js.Array[Threshold]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltip(value: `11`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisualEffects(value: none | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualEffects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationDuration(value: Double): Self = {
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
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(null)
        ret
    }
    @scala.inline
    def withTransientValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transientValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransientValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transientValue")(null)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
  }
  
}

