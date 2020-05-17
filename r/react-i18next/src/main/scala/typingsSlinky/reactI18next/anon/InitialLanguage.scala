package typingsSlinky.reactI18next.anon

import typingsSlinky.i18next.mod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitialLanguage extends js.Object {
  var initialI18nStore: Resource = js.native
  var initialLanguage: String = js.native
}

object InitialLanguage {
  @scala.inline
  def apply(initialI18nStore: Resource, initialLanguage: String): InitialLanguage = {
    val __obj = js.Dynamic.literal(initialI18nStore = initialI18nStore.asInstanceOf[js.Any], initialLanguage = initialLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialLanguage]
  }
  @scala.inline
  implicit class InitialLanguageOps[Self <: InitialLanguage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialI18nStore(value: Resource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialI18nStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialLanguage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

