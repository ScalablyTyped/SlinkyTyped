package typingsSlinky.atOracleOraclejet.ojbuttonMod

import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.all
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.full
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.half
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.icons
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.outlined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojMenuButtonSettableProperties extends ojButtonSettableProperties

object ojMenuButtonSettableProperties {
  @scala.inline
  def apply(
    chroming: full | half | outlined,
    disabled: Boolean,
    display: all | icons,
    translations: js.Object = null
  ): ojMenuButtonSettableProperties = {
    val __obj = js.Dynamic.literal(chroming = chroming.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojMenuButtonSettableProperties]
  }
}

