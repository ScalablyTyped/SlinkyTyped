package typingsSlinky.oracleOraclejet.ojgaugeMod

import typingsSlinky.oracleOraclejet.Anon10
import typingsSlinky.oracleOraclejet.Anon11
import typingsSlinky.oracleOraclejet.AnonBorderColorBorderRadius
import typingsSlinky.oracleOraclejet.AnonConverterPosition
import typingsSlinky.oracleOraclejet.AnonLabelAndValue
import typingsSlinky.oracleOraclejet.AnonPositionStyle
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

trait ojStatusMeterGaugeSettableProperties extends dvtBaseGaugeSettableProperties {
  var angleExtent: Double
  var animationDuration: js.UndefOr[Double] = js.undefined
  var animationOnDataChange: auto | none
  var animationOnDisplay: auto | none
  var borderColor: String
  var borderRadius: String
  var center: Anon10
  var color: String
  var indicatorSize: Double
  var innerRadius: Double
  var label: AnonPositionStyle
  var max: Double
  var metricLabel: AnonConverterPosition
  var min: Double
  var orientation: circular | vertical | horizontal
  var plotArea: AnonBorderColorBorderRadius
  var readonly: Boolean
  var referenceLines: js.Array[ReferenceLine]
  var startAngle: Double
  var step: Double | Null
  var svgClassName: String
  var svgStyle: js.Object
  var thresholdDisplay: currentOnly | all | onIndicator
  var thresholds: js.Array[Threshold]
  var tooltip: Anon11
  val transientValue: Double | Null
  var value: Double | Null
  var visualEffects: none | auto
}

object ojStatusMeterGaugeSettableProperties {
  @scala.inline
  def apply(
    angleExtent: Double,
    animationOnDataChange: auto | none,
    animationOnDisplay: auto | none,
    borderColor: String,
    borderRadius: String,
    center: Anon10,
    color: String,
    indicatorSize: Double,
    innerRadius: Double,
    label: AnonPositionStyle,
    max: Double,
    metricLabel: AnonConverterPosition,
    min: Double,
    orientation: circular | vertical | horizontal,
    plotArea: AnonBorderColorBorderRadius,
    readonly: Boolean,
    referenceLines: js.Array[ReferenceLine],
    startAngle: Double,
    svgClassName: String,
    svgStyle: js.Object,
    thresholdDisplay: currentOnly | all | onIndicator,
    thresholds: js.Array[Threshold],
    tooltip: Anon11,
    trackResize: on | off,
    translations: AnonLabelAndValue,
    visualEffects: none | auto,
    animationDuration: Int | Double = null,
    step: Int | Double = null,
    transientValue: Int | Double = null,
    value: Int | Double = null
  ): ojStatusMeterGaugeSettableProperties = {
    val __obj = js.Dynamic.literal(angleExtent = angleExtent.asInstanceOf[js.Any], animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], indicatorSize = indicatorSize.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], metricLabel = metricLabel.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], plotArea = plotArea.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], referenceLines = referenceLines.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], thresholdDisplay = thresholdDisplay.asInstanceOf[js.Any], thresholds = thresholds.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], visualEffects = visualEffects.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (transientValue != null) __obj.updateDynamic("transientValue")(transientValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojStatusMeterGaugeSettableProperties]
  }
}

