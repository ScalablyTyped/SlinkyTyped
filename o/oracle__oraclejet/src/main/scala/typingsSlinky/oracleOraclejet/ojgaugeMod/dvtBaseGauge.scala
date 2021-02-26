package typingsSlinky.oracleOraclejet.ojgaugeMod

import typingsSlinky.oracleOraclejet.anon.LabelAndValue
import typingsSlinky.oracleOraclejet.ojdvtBaseMod.dvtBaseComponent
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.translations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dvtBaseGauge[SP /* <: dvtBaseGaugeSettableProperties */] extends dvtBaseComponent[SP] {
  
  def setProperties(properties: dvtBaseGaugeSettablePropertiesLenient): Unit = js.native
  
  @JSName("setProperty")
  def setProperty_translations(property: translations, value: LabelAndValue): Unit = js.native
  
  @JSName("translations")
  var translations_dvtBaseGauge: LabelAndValue = js.native
}
