package typingsSlinky.meteorUniverseI18n.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranslaterOptions extends js.Object {
  var _locale: js.UndefOr[String] = js.native
  var _purify: js.UndefOr[Boolean] = js.native
}

object TranslaterOptions {
  @scala.inline
  def apply(): TranslaterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranslaterOptions]
  }
  @scala.inline
  implicit class TranslaterOptionsOps[Self <: TranslaterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_locale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_locale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_locale")(js.undefined)
        ret
    }
    @scala.inline
    def with_purify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_purify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_purify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_purify")(js.undefined)
        ret
    }
  }
  
}

