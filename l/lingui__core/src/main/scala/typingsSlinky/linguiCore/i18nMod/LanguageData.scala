package typingsSlinky.linguiCore.i18nMod

import typingsSlinky.linguiCore.linguiCoreStrings.cardinal
import typingsSlinky.linguiCore.linguiCoreStrings.ordinal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageData extends js.Object {
  var plurals: js.UndefOr[
    js.Function2[/* n */ Double, /* pluralType */ js.UndefOr[cardinal | ordinal], String]
  ] = js.native
}

object LanguageData {
  @scala.inline
  def apply(): LanguageData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageData]
  }
  @scala.inline
  implicit class LanguageDataOps[Self <: LanguageData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlurals(value: (/* n */ Double, /* pluralType */ js.UndefOr[cardinal | ordinal]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plurals")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPlurals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plurals")(js.undefined)
        ret
    }
  }
  
}

