package typingsSlinky.atOracleOraclejet.ojtimeaxisMod

import typingsSlinky.atOracleOraclejet.Anon_ComponentNameLabelAndValue
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.days
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hours
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.minutes
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.months
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.off
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.on
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.quarters
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.seconds
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.weeks
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.years
import typingsSlinky.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponentSettableProperties
import typingsSlinky.atOracleOraclejet.ojtimeaxisMod.ojTimeAxis.Converters
import typingsSlinky.atOracleOraclejet.ojvalidationDashBaseMod.Converter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojTimeAxisSettableProperties extends dvtBaseComponentSettableProperties {
  var converter: Converters | Converter[String]
  var end: String
  var scale: seconds | minutes | hours | days | weeks | months | quarters | years
  var start: String
  @JSName("translations")
  var translations_ojTimeAxisSettableProperties: Anon_ComponentNameLabelAndValue
}

object ojTimeAxisSettableProperties {
  @scala.inline
  def apply(
    converter: Converters | Converter[String],
    end: String,
    scale: seconds | minutes | hours | days | weeks | months | quarters | years,
    start: String,
    trackResize: on | off,
    translations: Anon_ComponentNameLabelAndValue
  ): ojTimeAxisSettableProperties = {
    val __obj = js.Dynamic.literal(converter = converter.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojTimeAxisSettableProperties]
  }
}

