package typingsSlinky.atMaterialDashUiCore.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSelectElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atMaterialDashUiCore.Anon_NodeValue
import typingsSlinky.atMaterialDashUiCore.PartialMenuProps
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.filled
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.outlined
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.standard
import typingsSlinky.atMaterialDashUiCore.selectSelectInputMod.SelectInputProps
import typingsSlinky.atMaterialDashUiCore.selectSelectInputMod.default
import typingsSlinky.react.reactMod.ChangeEvent
import typingsSlinky.react.reactMod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: autoFocus, disabled, multiple, name, onBlur, onFocus, open, readOnly, tabIndex, value */
object SelectInput
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.atMaterialDashUiCore.selectSelectInputMod.default].asInstanceOf[String | js.Object]
  def apply(
    autoWidth: Boolean,
    native: Boolean,
    IconComponent: ReactComponentClass[_] = null,
    MenuProps: PartialMenuProps = null,
    SelectDisplayProps: HTMLAttributes[HTMLDivElement] = null,
    inputRef: /* ref */ HTMLSelectElement | Anon_NodeValue => Unit = null,
    onChange: (/* event */ ChangeEvent[HTMLSelectElement], /* child */ TagMod[Any]) => Unit = null,
    onClose: /* event */ ChangeEvent[js.Object] => Unit = null,
    onOpen: /* event */ ChangeEvent[js.Object] => Unit = null,
    renderValue: /* value */ String | Double | Boolean | (js.Array[String | Double | Boolean]) => TagMod[Any] = null,
    variant: standard | outlined | filled = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(autoWidth = autoWidth.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    if (IconComponent != null) __obj.updateDynamic("IconComponent")(IconComponent.asInstanceOf[js.Any])
    if (MenuProps != null) __obj.updateDynamic("MenuProps")(MenuProps.asInstanceOf[js.Any])
    if (SelectDisplayProps != null) __obj.updateDynamic("SelectDisplayProps")(SelectDisplayProps.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1(inputRef))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    if (renderValue != null) __obj.updateDynamic("renderValue")(js.Any.fromFunction1(renderValue))
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SelectInputProps
}

