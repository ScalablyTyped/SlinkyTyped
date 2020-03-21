package typingsSlinky.oracleOraclejet.ojmasonrylayoutMod

import typingsSlinky.oracleOraclejet.AnonLabelCut
import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojMasonryLayoutSettableProperties extends baseComponentSettableProperties {
  var reorderHandle: String | Null
  @JSName("translations")
  var translations_ojMasonryLayoutSettableProperties: AnonLabelCut
}

object ojMasonryLayoutSettableProperties {
  @scala.inline
  def apply(translations: AnonLabelCut, reorderHandle: String = null): ojMasonryLayoutSettableProperties = {
    val __obj = js.Dynamic.literal(translations = translations.asInstanceOf[js.Any])
    if (reorderHandle != null) __obj.updateDynamic("reorderHandle")(reorderHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojMasonryLayoutSettableProperties]
  }
}

