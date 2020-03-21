package typingsSlinky.oracleOraclejet.ojtoolbarMod

import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.full
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.half
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.outlined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojToolbarSettableProperties extends baseComponentSettableProperties {
  var chroming: full | half | outlined
}

object ojToolbarSettableProperties {
  @scala.inline
  def apply(chroming: full | half | outlined, translations: js.Object = null): ojToolbarSettableProperties = {
    val __obj = js.Dynamic.literal(chroming = chroming.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojToolbarSettableProperties]
  }
}

