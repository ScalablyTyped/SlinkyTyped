package typingsSlinky.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnBlur extends js.Object {
  var disabled: Boolean = js.native
  var placeholder: String = js.native
  var prefixCls: String = js.native
  var showCancelButton: Boolean = js.native
  def onBlur(): Unit = js.native
  def onChange(): Unit = js.native
  def onClear(): Unit = js.native
  def onFocus(): Unit = js.native
  def onSubmit(): Unit = js.native
}

object OnBlur {
  @scala.inline
  def apply(
    disabled: Boolean,
    onBlur: () => Unit,
    onChange: () => Unit,
    onClear: () => Unit,
    onFocus: () => Unit,
    onSubmit: () => Unit,
    placeholder: String,
    prefixCls: String,
    showCancelButton: Boolean
  ): OnBlur = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onClear = js.Any.fromFunction0(onClear), onFocus = js.Any.fromFunction0(onFocus), onSubmit = js.Any.fromFunction0(onSubmit), placeholder = placeholder.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], showCancelButton = showCancelButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBlur]
  }
  @scala.inline
  implicit class OnBlurOps[Self <: OnBlur] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
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
    def withOnClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnSubmit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.Any.fromFunction0(value))
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
    def withShowCancelButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCancelButton")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

