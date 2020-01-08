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

object SelectInput
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@material-ui/core/Select/SelectInput", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoFocus, disabled, name, onBlur, onFocus, open, readOnly, tabIndex */
  def apply(
    autoWidth: Boolean,
    multiple: Boolean,
    native: Boolean,
    value: String | Double | Boolean | (js.Array[String | Double | Boolean]),
    IconComponent: ReactComponentClass[_] = null,
    MenuProps: PartialMenuProps = null,
    SelectDisplayProps: HTMLAttributes[HTMLDivElement] = null,
    inputRef: /* ref */ HTMLSelectElement | Anon_NodeValue => Unit = null,
    onChange: (/* event */ ChangeEvent[HTMLSelectElement], /* child */ TagMod[Any]) => Unit = null,
    onClose: /* event */ ChangeEvent[js.Object] => Unit = null,
    onOpen: /* event */ ChangeEvent[js.Object] => Unit = null,
    renderValue: /* value */ String | Double | Boolean | (js.Array[String | Double | Boolean]) => TagMod[Any] = null,
    variant: standard | outlined | filled = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(autoWidth = autoWidth.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (IconComponent != null) __obj.updateDynamic("IconComponent")(IconComponent.asInstanceOf[js.Any])
    if (MenuProps != null) __obj.updateDynamic("MenuProps")(MenuProps.asInstanceOf[js.Any])
    if (SelectDisplayProps != null) __obj.updateDynamic("SelectDisplayProps")(SelectDisplayProps.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1(inputRef))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    if (renderValue != null) __obj.updateDynamic("renderValue")(js.Any.fromFunction1(renderValue))
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SelectInputProps
}

