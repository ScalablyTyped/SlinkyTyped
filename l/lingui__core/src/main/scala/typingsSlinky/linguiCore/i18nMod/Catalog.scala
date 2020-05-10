package typingsSlinky.linguiCore.i18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Catalog extends js.Object {
  var languageData: js.UndefOr[LanguageData] = js.native
  var messages: Messages = js.native
}

object Catalog {
  @scala.inline
  def apply(messages: Messages): Catalog = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Catalog]
  }
  @scala.inline
  implicit class CatalogOps[Self <: Catalog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessages(value: Messages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguageData(value: LanguageData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageData")(js.undefined)
        ret
    }
  }
  
}

