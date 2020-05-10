package typingsSlinky.reactI18next.mod

import typingsSlinky.i18next.mod.i18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseTranslationOptions extends js.Object {
  var i18n: js.UndefOr[typingsSlinky.i18next.mod.i18n] = js.native
  var useSuspense: js.UndefOr[Boolean] = js.native
}

object UseTranslationOptions {
  @scala.inline
  def apply(): UseTranslationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseTranslationOptions]
  }
  @scala.inline
  implicit class UseTranslationOptionsOps[Self <: UseTranslationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withI18n(value: i18n): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutI18n: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(js.undefined)
        ret
    }
    @scala.inline
    def withUseSuspense(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSuspense")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSuspense: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSuspense")(js.undefined)
        ret
    }
  }
  
}

