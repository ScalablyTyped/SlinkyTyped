package typingsSlinky.reactNativeMaterialKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconToggleStyle extends js.Object {
  var offColor: js.UndefOr[String] = js.native
  var onColor: js.UndefOr[String] = js.native
  var rippleColor: js.UndefOr[String] = js.native
}

object IconToggleStyle {
  @scala.inline
  def apply(): IconToggleStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconToggleStyle]
  }
  @scala.inline
  implicit class IconToggleStyleOps[Self <: IconToggleStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOffColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offColor")(js.undefined)
        ret
    }
    @scala.inline
    def withOnColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onColor")(js.undefined)
        ret
    }
    @scala.inline
    def withRippleColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRippleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleColor")(js.undefined)
        ret
    }
  }
  
}

