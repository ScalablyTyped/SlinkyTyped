package typingsSlinky.oracleOraclejet.ojgaugeMod

import typingsSlinky.oracleOraclejet.anon.LabelAndValue
import typingsSlinky.oracleOraclejet.ojdvtBaseMod.dvtBaseComponent
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dvtBaseGauge[SP /* <: dvtBaseGaugeSettableProperties */] extends dvtBaseComponent[SP] {
  @JSName("translations")
  var translations_dvtBaseGauge: LabelAndValue = js.native
  def setProperties(properties: dvtBaseGaugeSettablePropertiesLenient): Unit = js.native
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: LabelAndValue): Unit = js.native
}

