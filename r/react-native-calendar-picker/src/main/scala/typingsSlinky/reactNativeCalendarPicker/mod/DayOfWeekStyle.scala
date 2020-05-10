package typingsSlinky.reactNativeCalendarPicker.mod

import typingsSlinky.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in '0' | '1' | '2' | '3' | '4' | '5' | '6' ]:? react-native.react-native.TextStyle} */
@js.native
trait DayOfWeekStyle extends js.Object {
  var `0`: js.UndefOr[TextStyle] = js.native
  var `1`: js.UndefOr[TextStyle] = js.native
  var `2`: js.UndefOr[TextStyle] = js.native
  var `3`: js.UndefOr[TextStyle] = js.native
  var `4`: js.UndefOr[TextStyle] = js.native
  var `5`: js.UndefOr[TextStyle] = js.native
  var `6`: js.UndefOr[TextStyle] = js.native
}

object DayOfWeekStyle {
  @scala.inline
  def apply(): DayOfWeekStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayOfWeekStyle]
  }
  @scala.inline
  implicit class DayOfWeekStyleOps[Self <: DayOfWeekStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with0(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without0: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("0")(js.undefined)
        ret
    }
    @scala.inline
    def with1(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1")(js.undefined)
        ret
    }
    @scala.inline
    def with2(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("2")(js.undefined)
        ret
    }
    @scala.inline
    def with3(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("3")(js.undefined)
        ret
    }
    @scala.inline
    def with4(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("4")(js.undefined)
        ret
    }
    @scala.inline
    def with5(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("5")(js.undefined)
        ret
    }
    @scala.inline
    def with6(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without6: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("6")(js.undefined)
        ret
    }
  }
  
}

