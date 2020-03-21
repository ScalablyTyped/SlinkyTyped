package typingsSlinky.oracleOraclejet.ojtimeaxisMod

import typingsSlinky.oracleOraclejet.AnonLabelAndValue
import typingsSlinky.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
import typingsSlinky.oracleOraclejet.ojtimeaxisMod.ojTimeAxis.Converters
import typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.days
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hours
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.minutes
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.months
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.quarters
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.seconds
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.weeks
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojTimeAxisSettableProperties extends dvtBaseComponentSettableProperties {
  var converter: Converters | Converter[String]
  var end: String
  var scale: seconds | minutes | hours | days | weeks | months | quarters | years
  var start: String
  @JSName("translations")
  var translations_ojTimeAxisSettableProperties: AnonLabelAndValue
}

object ojTimeAxisSettableProperties {
  @scala.inline
  def apply(
    converter: Converters | Converter[String],
    end: String,
    scale: seconds | minutes | hours | days | weeks | months | quarters | years,
    start: String,
    trackResize: on | off,
    translations: AnonLabelAndValue
  ): ojTimeAxisSettableProperties = {
    val __obj = js.Dynamic.literal(converter = converter.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojTimeAxisSettableProperties]
  }
}

