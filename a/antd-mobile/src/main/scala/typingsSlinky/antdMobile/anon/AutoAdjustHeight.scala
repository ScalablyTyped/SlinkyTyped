package typingsSlinky.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoAdjustHeight extends js.Object {
  var autoAdjustHeight: Boolean = js.native
  var disabled: Boolean = js.native
  var editable: Boolean = js.native
  var keyboardPrefixCls: String = js.native
  var placeholder: String = js.native
  var prefixCls: String = js.native
  def onBlur(): Unit = js.native
  def onChange(): Unit = js.native
  def onFocus(): Unit = js.native
  def onVirtualKeyboardConfirm(): Unit = js.native
}

object AutoAdjustHeight {
  @scala.inline
  def apply(
    autoAdjustHeight: Boolean,
    disabled: Boolean,
    editable: Boolean,
    keyboardPrefixCls: String,
    onBlur: () => Unit,
    onChange: () => Unit,
    onFocus: () => Unit,
    onVirtualKeyboardConfirm: () => Unit,
    placeholder: String,
    prefixCls: String
  ): AutoAdjustHeight = {
    val __obj = js.Dynamic.literal(autoAdjustHeight = autoAdjustHeight.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], keyboardPrefixCls = keyboardPrefixCls.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onFocus = js.Any.fromFunction0(onFocus), onVirtualKeyboardConfirm = js.Any.fromFunction0(onVirtualKeyboardConfirm), placeholder = placeholder.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoAdjustHeight]
  }
  @scala.inline
  implicit class AutoAdjustHeightOps[Self <: AutoAdjustHeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoAdjustHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAdjustHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyboardPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardPrefixCls")(value.asInstanceOf[js.Any])
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
  }
  
}

