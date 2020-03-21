package typingsSlinky.oracleOraclejet.ojgaugeMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.Anon8
import typingsSlinky.oracleOraclejet.AnonLabelAndValue
import typingsSlinky.oracleOraclejet.AnonText
import typingsSlinky.oracleOraclejet.AnonTextType
import typingsSlinky.oracleOraclejet.ojgaugeMod.ojLedGauge.Threshold
import typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`0`
import typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`180`
import typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`270`
import typingsSlinky.oracleOraclejet.oracleOraclejetNumbers.`90`
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.arrow
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.circle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.diamond
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.human
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.rectangle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.square
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.star
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.triangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojgauge.ojLedGaugeSettableProperties> */
trait ojLedGaugeSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var borderColor: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[AnonText] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var metricLabel: js.UndefOr[AnonTextType] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var rotation: js.UndefOr[`90` | `180` | `270` | `0`] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var thresholds: js.UndefOr[js.Array[Threshold]] = js.undefined
  var tooltip: js.UndefOr[Anon8] = js.undefined
  var trackResize: js.UndefOr[on | off] = js.undefined
  var translations: js.UndefOr[AnonLabelAndValue] = js.undefined
  var `type`: js.UndefOr[arrow | diamond | square | rectangle | triangle | star | human | circle] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
  var visualEffects: js.UndefOr[none | auto] = js.undefined
}

object ojLedGaugeSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    borderColor: String = null,
    color: String = null,
    label: AnonText = null,
    max: Int | Double = null,
    metricLabel: AnonTextType = null,
    min: Int | Double = null,
    rotation: `90` | `180` | `270` | `0` = null,
    size: Int | Double = null,
    svgClassName: String = null,
    svgStyle: js.Object = null,
    thresholds: js.Array[Threshold] = null,
    tooltip: Anon8 = null,
    trackResize: on | off = null,
    translations: AnonLabelAndValue = null,
    `type`: arrow | diamond | square | rectangle | triangle | star | human | circle = null,
    value: Int | Double = null,
    visualEffects: none | auto = null
  ): ojLedGaugeSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (metricLabel != null) __obj.updateDynamic("metricLabel")(metricLabel.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    if (thresholds != null) __obj.updateDynamic("thresholds")(thresholds.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (trackResize != null) __obj.updateDynamic("trackResize")(trackResize.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (visualEffects != null) __obj.updateDynamic("visualEffects")(visualEffects.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojLedGaugeSettablePropertiesLenient]
  }
}

