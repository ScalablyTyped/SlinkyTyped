package typingsSlinky.oracleOraclejet.ojmasonrylayoutMod

import typingsSlinky.oracleOraclejet.AnonLabelCut
import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojMasonryLayoutSettableProperties extends baseComponentSettableProperties {
  var reorderHandle: String | Null = js.native
  @JSName("translations")
  var translations_ojMasonryLayoutSettableProperties: AnonLabelCut = js.native
}

object ojMasonryLayoutSettableProperties {
  @scala.inline
  def apply(translations: AnonLabelCut): ojMasonryLayoutSettableProperties = {
    val __obj = js.Dynamic.literal(translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojMasonryLayoutSettableProperties]
  }
  @scala.inline
  implicit class ojMasonryLayoutSettablePropertiesOps[Self <: ojMasonryLayoutSettableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTranslations(value: AnonLabelCut): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReorderHandle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reorderHandle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReorderHandleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reorderHandle")(null)
        ret
    }
  }
  
}

