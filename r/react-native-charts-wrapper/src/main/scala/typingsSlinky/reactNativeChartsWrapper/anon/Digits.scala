package typingsSlinky.reactNativeChartsWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Digits extends js.Object {
  var digits: js.UndefOr[Double] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var markerColor: js.UndefOr[typingsSlinky.reactNativeChartsWrapper.mod.Color] = js.native
  var textColor: js.UndefOr[typingsSlinky.reactNativeChartsWrapper.mod.Color] = js.native
  var textSize: js.UndefOr[Double] = js.native
}

object Digits {
  @scala.inline
  def apply(): Digits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Digits]
  }
  @scala.inline
  implicit class DigitsOps[Self <: Digits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digits")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerColor(value: typingsSlinky.reactNativeChartsWrapper.mod.Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextColor(value: typingsSlinky.reactNativeChartsWrapper.mod.Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSize")(js.undefined)
        ret
    }
  }
  
}

