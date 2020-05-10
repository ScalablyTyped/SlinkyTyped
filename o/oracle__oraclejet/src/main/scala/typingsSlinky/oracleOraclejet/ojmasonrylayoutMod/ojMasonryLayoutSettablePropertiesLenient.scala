package typingsSlinky.oracleOraclejet.ojmasonrylayoutMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.AnonLabelCut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojmasonrylayout.ojMasonryLayoutSettableProperties> */
@js.native
trait ojMasonryLayoutSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var reorderHandle: js.UndefOr[String] = js.native
  var translations: js.UndefOr[AnonLabelCut] = js.native
}

object ojMasonryLayoutSettablePropertiesLenient {
  @scala.inline
  def apply(): ojMasonryLayoutSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojMasonryLayoutSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojMasonryLayoutSettablePropertiesLenientOps[Self <: ojMasonryLayoutSettablePropertiesLenient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReorderHandle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reorderHandle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReorderHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reorderHandle")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslations(value: AnonLabelCut): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(js.undefined)
        ret
    }
  }
  
}

