package typingsSlinky.antdMobile.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.input.tag
import typingsSlinky.antdMobile.antdMobileStrings.left
import typingsSlinky.antdMobile.antdMobileStrings.right
import typingsSlinky.antdMobile.customInputMod.NumberInputProps
import typingsSlinky.antdMobile.customInputMod.default
import typingsSlinky.antdMobile.inputItemPropsTypeMod.InputKey
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CustomInput
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd-mobile/lib/input-item/CustomInput", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled, placeholder, style, type */
  def apply(
    backspaceLabel: js.Any,
    cancelKeyboardLabel: js.Any,
    confirmLabel: js.Any,
    autoAdjustHeight: js.UndefOr[Boolean] = js.undefined,
    disabledKeys: js.Array[InputKey] = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    keyboardPrefixCls: String = null,
    maxLength: Int | Double = null,
    moneyKeyboardAlign: left | right | String = null,
    moneyKeyboardHeader: TagMod[Any] = null,
    moneyKeyboardWrapProps: js.Object = null,
    onBlur: /* value */ js.UndefOr[String] => Unit = null,
    onChange: /* e */ ChangeEvent[HTMLInputElement] => Unit = null,
    onFocus: /* value */ js.UndefOr[String] => Unit = null,
    onVirtualKeyboardConfirm: /* value */ js.UndefOr[String] => Unit = null,
    prefixCls: String = null,
    value: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(backspaceLabel = backspaceLabel.asInstanceOf[js.Any], cancelKeyboardLabel = cancelKeyboardLabel.asInstanceOf[js.Any], confirmLabel = confirmLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAdjustHeight)) __obj.updateDynamic("autoAdjustHeight")(autoAdjustHeight.asInstanceOf[js.Any])
    if (disabledKeys != null) __obj.updateDynamic("disabledKeys")(disabledKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (keyboardPrefixCls != null) __obj.updateDynamic("keyboardPrefixCls")(keyboardPrefixCls.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (moneyKeyboardAlign != null) __obj.updateDynamic("moneyKeyboardAlign")(moneyKeyboardAlign.asInstanceOf[js.Any])
    if (moneyKeyboardHeader != null) __obj.updateDynamic("moneyKeyboardHeader")(moneyKeyboardHeader.asInstanceOf[js.Any])
    if (moneyKeyboardWrapProps != null) __obj.updateDynamic("moneyKeyboardWrapProps")(moneyKeyboardWrapProps.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onVirtualKeyboardConfirm != null) __obj.updateDynamic("onVirtualKeyboardConfirm")(js.Any.fromFunction1(onVirtualKeyboardConfirm))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = NumberInputProps
}

