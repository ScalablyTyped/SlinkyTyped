package typingsSlinky.antdDashMobile.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.antdDashMobile.antdDashMobileStrings.bankCard
import typingsSlinky.antdDashMobile.antdDashMobileStrings.center
import typingsSlinky.antdDashMobile.antdDashMobileStrings.digit
import typingsSlinky.antdDashMobile.antdDashMobileStrings.left
import typingsSlinky.antdDashMobile.antdDashMobileStrings.money
import typingsSlinky.antdDashMobile.antdDashMobileStrings.number
import typingsSlinky.antdDashMobile.antdDashMobileStrings.password
import typingsSlinky.antdDashMobile.antdDashMobileStrings.phone
import typingsSlinky.antdDashMobile.antdDashMobileStrings.text
import typingsSlinky.antdDashMobile.antdDashMobileStrings.top
import typingsSlinky.antdDashMobile.libInputDashItemMod.InputItemProps
import typingsSlinky.antdDashMobile.libInputDashItemPropsTypeMod.InputKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_InputItemProps455901056[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: className, disabled, name, onBlur, onChange, onFocus, placeholder */
  def apply(
    autoAdjustHeight: js.UndefOr[Boolean] = js.undefined,
    clear: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String = null,
    disabledKeys: js.Array[InputKey] = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    extra: TagMod[Any] = null,
    labelNumber: Int | Double = null,
    labelPosition: left | top = null,
    locale: js.Object = null,
    maxLength: Int | Double = null,
    moneyKeyboardAlign: String = null,
    moneyKeyboardHeader: TagMod[Any] = null,
    moneyKeyboardWrapProps: js.Object = null,
    onErrorClick: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onExtraClick: SyntheticMouseEvent[HTMLDivElement] => Unit = null,
    onVirtualKeyboardConfirm: /* value */ js.UndefOr[String] => Unit = null,
    prefixCls: String = null,
    prefixListCls: String = null,
    textAlign: left | center = null,
    `type`: text | bankCard | phone | password | number | digit | money = null,
    updatePlaceholder: js.UndefOr[Boolean] = js.undefined,
    value: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoAdjustHeight)) __obj.updateDynamic("autoAdjustHeight")(autoAdjustHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(clear)) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (disabledKeys != null) __obj.updateDynamic("disabledKeys")(disabledKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (labelNumber != null) __obj.updateDynamic("labelNumber")(labelNumber.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (moneyKeyboardAlign != null) __obj.updateDynamic("moneyKeyboardAlign")(moneyKeyboardAlign.asInstanceOf[js.Any])
    if (moneyKeyboardHeader != null) __obj.updateDynamic("moneyKeyboardHeader")(moneyKeyboardHeader.asInstanceOf[js.Any])
    if (moneyKeyboardWrapProps != null) __obj.updateDynamic("moneyKeyboardWrapProps")(moneyKeyboardWrapProps.asInstanceOf[js.Any])
    if (onErrorClick != null) __obj.updateDynamic("onErrorClick")(js.Any.fromFunction1(onErrorClick))
    if (onExtraClick != null) __obj.updateDynamic("onExtraClick")(js.Any.fromFunction1(onExtraClick))
    if (onVirtualKeyboardConfirm != null) __obj.updateDynamic("onVirtualKeyboardConfirm")(js.Any.fromFunction1(onVirtualKeyboardConfirm))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (prefixListCls != null) __obj.updateDynamic("prefixListCls")(prefixListCls.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(updatePlaceholder)) __obj.updateDynamic("updatePlaceholder")(updatePlaceholder.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = InputItemProps
}

