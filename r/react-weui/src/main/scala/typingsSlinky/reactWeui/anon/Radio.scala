package typingsSlinky.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Radio extends js.Object {
  var checkbox: Boolean = js.native
  var radio: Boolean = js.native
  var select: Boolean = js.native
  var selectPos: js.Any = js.native
  var switch: Boolean = js.native
  var vcode: Boolean = js.native
  var warn: Boolean = js.native
}

object Radio {
  @scala.inline
  def apply(
    checkbox: Boolean,
    radio: Boolean,
    select: Boolean,
    selectPos: js.Any,
    switch: Boolean,
    vcode: Boolean,
    warn: Boolean
  ): Radio = {
    val __obj = js.Dynamic.literal(checkbox = checkbox.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectPos = selectPos.asInstanceOf[js.Any], switch = switch.asInstanceOf[js.Any], vcode = vcode.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Radio]
  }
  @scala.inline
  implicit class RadioOps[Self <: Radio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectPos(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwitch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVcode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

