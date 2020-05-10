package typingsSlinky.fullcalendarVue.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonIcons extends js.Object {
  var next: js.UndefOr[String] = js.native
  var nextYear: js.UndefOr[String] = js.native
  var prev: js.UndefOr[String] = js.native
  var prevYear: js.UndefOr[String] = js.native
}

object ButtonIcons {
  @scala.inline
  def apply(): ButtonIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonIcons]
  }
  @scala.inline
  implicit class ButtonIconsOps[Self <: ButtonIcons] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.undefined)
        ret
    }
    @scala.inline
    def withNextYear(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextYear")(js.undefined)
        ret
    }
    @scala.inline
    def withPrev(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevYear(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevYear")(js.undefined)
        ret
    }
  }
  
}

