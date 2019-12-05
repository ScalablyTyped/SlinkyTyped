package typingsSlinky.atOracleOraclejet.ojbuttonMod

import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.baseComponentSettableProperties
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.all
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.full
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.half
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.icons
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.oneTabstop
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.outlined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojButtonsetManySettableProperties extends baseComponentSettableProperties {
  var chroming: full | half | outlined
  var disabled: Boolean
  var display: all | icons
  var focusManagement: oneTabstop | none
  var value: js.Array[_] | Null
}

object ojButtonsetManySettableProperties {
  @scala.inline
  def apply(
    chroming: full | half | outlined,
    disabled: Boolean,
    display: all | icons,
    focusManagement: oneTabstop | none,
    translations: js.Object = null,
    value: js.Array[_] = null
  ): ojButtonsetManySettableProperties = {
    val __obj = js.Dynamic.literal(chroming = chroming.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], focusManagement = focusManagement.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojButtonsetManySettableProperties]
  }
}

