package typingsSlinky.atOracleOraclejet.ojconveyorbeltMod

import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.baseComponentSettableProperties
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.horizontal
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojConveyorBeltSettableProperties extends baseComponentSettableProperties {
  var contentParent: String | Null
  var orientation: horizontal | vertical
}

object ojConveyorBeltSettableProperties {
  @scala.inline
  def apply(orientation: horizontal | vertical, contentParent: String = null, translations: js.Object = null): ojConveyorBeltSettableProperties = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any])
    if (contentParent != null) __obj.updateDynamic("contentParent")(contentParent.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojConveyorBeltSettableProperties]
  }
}

