package typingsSlinky.antdDashMobileDashRn.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.bankCard
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.center
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.digit
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.left
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.number
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.password
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.phone
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.text
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.top
import typingsSlinky.antdDashMobileDashRn.libInputDashItemIndexDotNativeMod.InputItemProps
import typingsSlinky.reactDashNative.reactDashNativeMod.GestureResponderEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InputItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnMod.InputItem] {
  @JSImport("antd-mobile-rn", "InputItem")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled, name, onBlur, onChange, onFocus, placeholder */
  def apply(
    clear: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    extra: TagMod[Any] = null,
    labelNumber: Int | Double = null,
    labelPosition: left | top = null,
    last: js.UndefOr[Boolean] = js.undefined,
    locale: js.Object = null,
    maxLength: Int | Double = null,
    onErrorClick: /* event */ GestureResponderEvent => Unit = null,
    onExtraClick: /* event */ GestureResponderEvent => Unit = null,
    onVirtualKeyboardConfirm: /* value */ js.UndefOr[String] => Unit = null,
    styles: js.Any = null,
    textAlign: left | center = null,
    `type`: text | bankCard | phone | password | number | digit = null,
    updatePlaceholder: js.UndefOr[Boolean] = js.undefined,
    value: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnMod.InputItem] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clear)) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (labelNumber != null) __obj.updateDynamic("labelNumber")(labelNumber.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (onErrorClick != null) __obj.updateDynamic("onErrorClick")(js.Any.fromFunction1(onErrorClick))
    if (onExtraClick != null) __obj.updateDynamic("onExtraClick")(js.Any.fromFunction1(onExtraClick))
    if (onVirtualKeyboardConfirm != null) __obj.updateDynamic("onVirtualKeyboardConfirm")(js.Any.fromFunction1(onVirtualKeyboardConfirm))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(updatePlaceholder)) __obj.updateDynamic("updatePlaceholder")(updatePlaceholder.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnMod.InputItem] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnMod.InputItem](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = InputItemProps
}

