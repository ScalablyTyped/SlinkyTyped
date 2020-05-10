package typingsSlinky.reactNativeMaterialKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioStyle extends js.Object {
  var borderOffColor: js.UndefOr[String] = js.native
  var borderOnColor: js.UndefOr[String] = js.native
  var extraRippleRadius: js.UndefOr[Double] = js.native
  var fillColor: js.UndefOr[String] = js.native
  var rippleColor: js.UndefOr[String] = js.native
}

object RadioStyle {
  @scala.inline
  def apply(): RadioStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioStyle]
  }
  @scala.inline
  implicit class RadioStyleOps[Self <: RadioStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderOffColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderOffColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderOffColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderOffColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderOnColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderOnColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderOnColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderOnColor")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraRippleRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraRippleRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraRippleRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraRippleRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withFillColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(js.undefined)
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

