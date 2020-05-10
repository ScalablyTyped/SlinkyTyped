package typingsSlinky.momentJalaali.mod.momentAugmentingMod

import typingsSlinky.momentJalaali.momentJalaaliStrings.`persian-modern`
import typingsSlinky.momentJalaali.momentJalaaliStrings.persian
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadPersianOptions extends js.Object {
  /**
    * use dialect option to change usePersian dialect, available options are:
    *      persian: default dialect(امرداد، آدینه، ...)
    *      persian-modern: modern dialect(مرداد، جمعه، ...)
    */
  var dialect: js.UndefOr[persian | `persian-modern`] = js.native
  /**
    * Use persian digits as decribed by unicode
    */
  var usePersianDigits: js.UndefOr[Boolean] = js.native
}

object LoadPersianOptions {
  @scala.inline
  def apply(): LoadPersianOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadPersianOptions]
  }
  @scala.inline
  implicit class LoadPersianOptionsOps[Self <: LoadPersianOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDialect(value: persian | `persian-modern`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialect")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePersianDigits(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePersianDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePersianDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePersianDigits")(js.undefined)
        ret
    }
  }
  
}

