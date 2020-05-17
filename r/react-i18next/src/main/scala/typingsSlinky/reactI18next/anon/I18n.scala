package typingsSlinky.reactI18next.anon

import typingsSlinky.i18next.mod.TFunction
import typingsSlinky.i18next.mod.i18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait I18n extends js.Object {
  var i18n: typingsSlinky.i18next.mod.i18n = js.native
  var ready: Boolean = js.native
  var t: TFunction = js.native
}

object I18n {
  @scala.inline
  def apply(i18n: i18n, ready: Boolean, t: TFunction): I18n = {
    val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18n]
  }
  @scala.inline
  implicit class I18nOps[Self <: I18n] (val x: Self) extends AnyVal {
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
    def withReady(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withT(value: TFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

