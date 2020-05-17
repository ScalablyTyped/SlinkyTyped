package typingsSlinky.antDesignProLayout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorWeak extends js.Object {
  var colorWeak: js.UndefOr[Boolean] = js.native
  var primaryColor: js.UndefOr[String] = js.native
}

object ColorWeak {
  @scala.inline
  def apply(): ColorWeak = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorWeak]
  }
  @scala.inline
  implicit class ColorWeakOps[Self <: ColorWeak] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorWeak(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorWeak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorWeak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorWeak")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryColor")(js.undefined)
        ret
    }
  }
  
}

