package typingsSlinky.oracleOraclejet.ojprogressMod

import typingsSlinky.oracleOraclejet.anon.AriaIndeterminateProgressText
import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.bar
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.circle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojProgressSettableProperties extends baseComponentSettableProperties {
  var max: Double
  @JSName("translations")
  var translations_ojProgressSettableProperties: AriaIndeterminateProgressText
  var `type`: bar | circle
  var value: Double
}

object ojProgressSettableProperties {
  @scala.inline
  def apply(max: Double, translations: AriaIndeterminateProgressText, `type`: bar | circle, value: Double): ojProgressSettableProperties = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojProgressSettableProperties]
  }
}

