package typingsSlinky.atMaterialDashUiCore.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLSelectElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atMaterialDashUiCore.Anon_Node
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.filled
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.outlined
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreStrings.standard
import typingsSlinky.atMaterialDashUiCore.nativeSelectNativeSelectInputMod.NativeSelectInputProps
import typingsSlinky.atMaterialDashUiCore.nativeSelectNativeSelectInputMod.default
import typingsSlinky.react.reactMod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NativeSelectInput
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@material-ui/core/NativeSelect/NativeSelectInput", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled, name, value */
  def apply(
    IconComponent: ReactComponentClass[_] = null,
    inputRef: /* ref */ HTMLSelectElement | Anon_Node => Unit = null,
    onChange: (/* event */ ChangeEvent[HTMLSelectElement], /* child */ TagMod[Any]) => Unit = null,
    variant: standard | outlined | filled = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (IconComponent != null) __obj.updateDynamic("IconComponent")(IconComponent.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1(inputRef))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.atMaterialDashUiCore.nativeSelectNativeSelectInputMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = NativeSelectInputProps
}

