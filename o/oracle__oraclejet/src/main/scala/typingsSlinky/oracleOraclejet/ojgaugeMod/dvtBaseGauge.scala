package typingsSlinky.oracleOraclejet.ojgaugeMod

import typingsSlinky.oracleOraclejet.AnonLabelAndValue
import typingsSlinky.oracleOraclejet.ojdvtBaseMod.dvtBaseComponent
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dvtBaseGauge[SP /* <: dvtBaseGaugeSettableProperties */] extends dvtBaseComponent[SP] {
  @JSName("translations")
  var translations_dvtBaseGauge: AnonLabelAndValue = js.native
  def setProperties(properties: dvtBaseGaugeSettablePropertiesLenient): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: AnonLabelAndValue): Unit = js.native
}

