package typingsSlinky.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClear extends js.Object {
  var clear: Boolean = js.native
  var disabled: Boolean = js.native
  var disabledKeys: Null = js.native
  var editable: Boolean = js.native
  var error: Boolean = js.native
  var extra: String = js.native
  var labelNumber: Double = js.native
  var moneyKeyboardAlign: String = js.native
  var moneyKeyboardHeader: Null = js.native
  var onBlur: js.Function0[Unit] = js.native
  var onChange: js.Function0[Unit] = js.native
  var onErrorClick: js.Function0[Unit] = js.native
  var onExtraClick: js.Function0[Unit] = js.native
  var onFocus: js.Function0[Unit] = js.native
  var onVirtualKeyboardConfirm: js.Function0[Unit] = js.native
  var placeholder: String = js.native
  var prefixCls: String = js.native
  var prefixListCls: String = js.native
  var `type`: String = js.native
  var updatePlaceholder: Boolean = js.native
}

object AnonClear {
  @scala.inline
  def apply(
    clear: Boolean,
    disabled: Boolean,
    disabledKeys: Null,
    editable: Boolean,
    error: Boolean,
    extra: String,
    labelNumber: Double,
    moneyKeyboardAlign: String,
    moneyKeyboardHeader: Null,
    onBlur: () => Unit,
    onChange: () => Unit,
    onErrorClick: () => Unit,
    onExtraClick: () => Unit,
    onFocus: () => Unit,
    onVirtualKeyboardConfirm: () => Unit,
    placeholder: String,
    prefixCls: String,
    prefixListCls: String,
    `type`: String,
    updatePlaceholder: Boolean
  ): AnonClear = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], disabledKeys = disabledKeys.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], labelNumber = labelNumber.asInstanceOf[js.Any], moneyKeyboardAlign = moneyKeyboardAlign.asInstanceOf[js.Any], moneyKeyboardHeader = moneyKeyboardHeader.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onErrorClick = js.Any.fromFunction0(onErrorClick), onExtraClick = js.Any.fromFunction0(onExtraClick), onFocus = js.Any.fromFunction0(onFocus), onVirtualKeyboardConfirm = js.Any.fromFunction0(onVirtualKeyboardConfirm), placeholder = placeholder.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], prefixListCls = prefixListCls.asInstanceOf[js.Any], updatePlaceholder = updatePlaceholder.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClear]
  }
  @scala.inline
  implicit class AnonClearOps[Self <: AnonClear] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledKeys(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtra(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoneyKeyboardAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moneyKeyboardAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoneyKeyboardHeader(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moneyKeyboardHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnBlur(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnErrorClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrorClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnExtraClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExtraClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnVirtualKeyboardConfirm(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVirtualKeyboardConfirm")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixListCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixListCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatePlaceholder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

