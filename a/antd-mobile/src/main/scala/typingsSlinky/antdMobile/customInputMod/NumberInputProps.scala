package typingsSlinky.antdMobile.customInputMod

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antdMobile.antdMobileStrings.left
import typingsSlinky.antdMobile.antdMobileStrings.right
import typingsSlinky.antdMobile.inputItemPropsTypeMod.InputEventHandler
import typingsSlinky.antdMobile.inputItemPropsTypeMod.InputKey
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberInputProps extends js.Object {
  var autoAdjustHeight: js.UndefOr[Boolean] = js.native
  var backspaceLabel: js.Any = js.native
  var cancelKeyboardLabel: js.Any = js.native
  var confirmLabel: js.Any = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var disabledKeys: js.UndefOr[js.Array[InputKey] | Null] = js.native
  var editable: js.UndefOr[Boolean] = js.native
  var keyboardPrefixCls: js.UndefOr[String] = js.native
  var maxLength: js.UndefOr[Double] = js.native
  var moneyKeyboardAlign: js.UndefOr[left | right | String] = js.native
  var moneyKeyboardHeader: js.UndefOr[TagMod[Any]] = js.native
  var moneyKeyboardWrapProps: js.UndefOr[js.Object] = js.native
  var onBlur: js.UndefOr[InputEventHandler] = js.native
  var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Unit]] = js.native
  var onFocus: js.UndefOr[InputEventHandler] = js.native
  var onVirtualKeyboardConfirm: js.UndefOr[InputEventHandler] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var `type`: js.UndefOr[String] = js.native
  var value: js.UndefOr[String] = js.native
}

object NumberInputProps {
  @scala.inline
  def apply(backspaceLabel: js.Any, cancelKeyboardLabel: js.Any, confirmLabel: js.Any): NumberInputProps = {
    val __obj = js.Dynamic.literal(backspaceLabel = backspaceLabel.asInstanceOf[js.Any], cancelKeyboardLabel = cancelKeyboardLabel.asInstanceOf[js.Any], confirmLabel = confirmLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberInputProps]
  }
  @scala.inline
  implicit class NumberInputPropsOps[Self <: NumberInputProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackspaceLabel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backspaceLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCancelKeyboardLabel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelKeyboardLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfirmLabel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoAdjustHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAdjustHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAdjustHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAdjustHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledKeys(value: js.Array[InputKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledKeysNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledKeys")(null)
        ret
    }
    @scala.inline
    def withEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardPrefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardPrefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMoneyKeyboardAlign(value: left | right | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moneyKeyboardAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoneyKeyboardAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moneyKeyboardAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withMoneyKeyboardHeaderReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moneyKeyboardHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoneyKeyboardHeader(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moneyKeyboardHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoneyKeyboardHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moneyKeyboardHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withMoneyKeyboardWrapProps(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moneyKeyboardWrapProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoneyKeyboardWrapProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moneyKeyboardWrapProps")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: /* value */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* e */ ChangeEvent[HTMLInputElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: /* value */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVirtualKeyboardConfirm(value: /* value */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVirtualKeyboardConfirm")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnVirtualKeyboardConfirm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVirtualKeyboardConfirm")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

