package typingsSlinky.linguiReact

import typingsSlinky.linguiCore.mod.I18n_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonI18n extends js.Object {
  var i18n: I18n_ = js.native
  var i18nHash: js.UndefOr[String] = js.native
}

object AnonI18n {
  @scala.inline
  def apply(i18n: I18n_): AnonI18n = {
    val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonI18n]
  }
  @scala.inline
  implicit class AnonI18nOps[Self <: AnonI18n] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withI18n(value: I18n_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withI18nHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18nHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutI18nHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18nHash")(js.undefined)
        ret
    }
  }
  
}

