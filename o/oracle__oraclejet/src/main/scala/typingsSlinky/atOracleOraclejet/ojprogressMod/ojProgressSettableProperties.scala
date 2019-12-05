package typingsSlinky.atOracleOraclejet.ojprogressMod

import typingsSlinky.atOracleOraclejet.Anon_AriaIndeterminateProgressText
import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.baseComponentSettableProperties
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.bar
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.circle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojProgressSettableProperties extends baseComponentSettableProperties {
  var max: Double
  @JSName("translations")
  var translations_ojProgressSettableProperties: Anon_AriaIndeterminateProgressText
  var `type`: bar | circle
  var value: Double
}

object ojProgressSettableProperties {
  @scala.inline
  def apply(max: Double, translations: Anon_AriaIndeterminateProgressText, `type`: bar | circle, value: Double): ojProgressSettableProperties = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojProgressSettableProperties]
  }
}

