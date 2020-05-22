package typingsSlinky.oracleOraclejet.ojmenuMod

import typingsSlinky.oracleOraclejet.anon.AriaFocusSkipLink
import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import typingsSlinky.oracleOraclejet.ojmenuMod.ojMenu.OpenOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojMenuSettableProperties extends baseComponentSettableProperties {
  var disabled: Boolean
  var openOptions: OpenOptions
  @JSName("translations")
  var translations_ojMenuSettableProperties: AriaFocusSkipLink
}

object ojMenuSettableProperties {
  @scala.inline
  def apply(disabled: Boolean, openOptions: OpenOptions, translations: AriaFocusSkipLink): ojMenuSettableProperties = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], openOptions = openOptions.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojMenuSettableProperties]
  }
}

