package typingsSlinky.phonon.Phonon_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*** Options ***/
@js.native
trait PhononOptions extends js.Object {
  var i18n: js.UndefOr[PhononI18nOptions | Null] = js.native
  var navigator: js.UndefOr[PhononNavigatorOptions] = js.native
}

object PhononOptions {
  @scala.inline
  def apply(): PhononOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhononOptions]
  }
  @scala.inline
  implicit class PhononOptionsOps[Self <: PhononOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withI18n(value: PhononI18nOptions): Self = {
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
    def withI18nNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(null)
        ret
    }
    @scala.inline
    def withNavigator(value: PhononNavigatorOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigator")(js.undefined)
        ret
    }
  }
  
}

