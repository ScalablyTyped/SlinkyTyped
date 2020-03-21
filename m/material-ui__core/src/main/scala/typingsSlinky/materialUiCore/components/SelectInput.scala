package typingsSlinky.materialUiCore.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSelectElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.SyntheticFocusEvent
import slinky.web.html.select.tag
import typingsSlinky.materialUiCore.AnonValue
import typingsSlinky.materialUiCore.PartialMenuProps
import typingsSlinky.materialUiCore.materialUiCoreStrings.filled
import typingsSlinky.materialUiCore.materialUiCoreStrings.outlined
import typingsSlinky.materialUiCore.materialUiCoreStrings.standard
import typingsSlinky.materialUiCore.selectInputMod.SelectInputProps
import typingsSlinky.materialUiCore.selectInputMod.default
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SelectInput
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@material-ui/core/Select/SelectInput", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled, name, tabIndex */
  def apply(
    autoWidth: Boolean,
    multiple: Boolean,
    native: Boolean,
    value: String | Double | Boolean | (js.Array[String | Double | Boolean]),
    IconComponent: ReactComponentClass[_] = null,
    MenuProps: PartialMenuProps = null,
    SelectDisplayProps: HTMLAttributes[HTMLDivElement] = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    inputRef: /* ref */ HTMLSelectElement | AnonValue => Unit = null,
    onBlur: SyntheticFocusEvent[_] => Unit = null,
    onChange: (/* event */ ChangeEvent[HTMLSelectElement], /* child */ TagMod[Any]) => Unit = null,
    onClose: /* event */ ChangeEvent[js.Object] => Unit = null,
    onFocus: SyntheticFocusEvent[_] => Unit = null,
    onOpen: /* event */ ChangeEvent[js.Object] => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    renderValue: /* value */ String | Double | Boolean | (js.Array[String | Double | Boolean]) => TagMod[Any] = null,
    variant: standard | outlined | filled = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(autoWidth = autoWidth.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (IconComponent != null) __obj.updateDynamic("IconComponent")(IconComponent.asInstanceOf[js.Any])
    if (MenuProps != null) __obj.updateDynamic("MenuProps")(MenuProps.asInstanceOf[js.Any])
    if (SelectDisplayProps != null) __obj.updateDynamic("SelectDisplayProps")(SelectDisplayProps.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1(inputRef))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (renderValue != null) __obj.updateDynamic("renderValue")(js.Any.fromFunction1(renderValue))
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SelectInputProps
}

