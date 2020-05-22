package typingsSlinky.oracleOraclejet.ojmasonrylayoutMod

import typingsSlinky.oracleOraclejet.anon.LabelCut
import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojMasonryLayoutSettableProperties extends baseComponentSettableProperties {
  var reorderHandle: String | Null
  @JSName("translations")
  var translations_ojMasonryLayoutSettableProperties: LabelCut
}

object ojMasonryLayoutSettableProperties {
  @scala.inline
  def apply(translations: LabelCut, reorderHandle: String = null): ojMasonryLayoutSettableProperties = {
    val __obj = js.Dynamic.literal(translations = translations.asInstanceOf[js.Any], reorderHandle = reorderHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojMasonryLayoutSettableProperties]
  }
}

