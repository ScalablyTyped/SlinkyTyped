package typingsSlinky.atOracleOraclejet.ojgaugeMod

import typingsSlinky.atOracleOraclejet.Anon_AutoBillionConverterMillionNone
import typingsSlinky.atOracleOraclejet.Anon_ComponentNameLabelAndValue
import typingsSlinky.atOracleOraclejet.Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext
import typingsSlinky.atOracleOraclejet.Anon_Style
import typingsSlinky.atOracleOraclejet.atOracleOraclejetNumbers.`0`
import typingsSlinky.atOracleOraclejet.atOracleOraclejetNumbers.`180`
import typingsSlinky.atOracleOraclejet.atOracleOraclejetNumbers.`270`
import typingsSlinky.atOracleOraclejet.atOracleOraclejetNumbers.`90`
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.arrow
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.auto
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.circle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.diamond
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.human
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.off
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.on
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.rectangle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.square
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.star
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.triangle
import typingsSlinky.atOracleOraclejet.ojgaugeMod.ojLedGauge.Threshold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojLedGaugeSettableProperties extends dvtBaseGaugeSettableProperties {
  var borderColor: String
  var color: String
  var label: Anon_Style
  var max: Double
  var metricLabel: Anon_AutoBillionConverterMillionNone
  var min: Double
  var rotation: `90` | `180` | `270` | `0`
  var size: Double
  var svgClassName: String
  var svgStyle: js.Object
  var thresholds: js.Array[Threshold]
  var tooltip: Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext
  var `type`: arrow | diamond | square | rectangle | triangle | star | human | circle
  var value: Double | Null
  var visualEffects: none | auto
}

object ojLedGaugeSettableProperties {
  @scala.inline
  def apply(
    borderColor: String,
    color: String,
    label: Anon_Style,
    max: Double,
    metricLabel: Anon_AutoBillionConverterMillionNone,
    min: Double,
    rotation: `90` | `180` | `270` | `0`,
    size: Double,
    svgClassName: String,
    svgStyle: js.Object,
    thresholds: js.Array[Threshold],
    tooltip: Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext,
    trackResize: on | off,
    translations: Anon_ComponentNameLabelAndValue,
    `type`: arrow | diamond | square | rectangle | triangle | star | human | circle,
    visualEffects: none | auto,
    value: Int | Double = null
  ): ojLedGaugeSettableProperties = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], metricLabel = metricLabel.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], thresholds = thresholds.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], visualEffects = visualEffects.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojLedGaugeSettableProperties]
  }
}

