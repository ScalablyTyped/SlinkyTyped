package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.componentsInputswitchInputSwitchMod.InputSwitchProps
import typingsSlinky.primereact.componentsTooltipTooltipOptionsMod.TooltipOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InputSwitch
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.inputswitchMod.InputSwitch] {
  @JSImport("primereact/inputswitch", "InputSwitch")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: checked, className, disabled, id, onBlur, onChange, onFocus */
  def apply(
    offLabel: String = null,
    onLabel: String = null,
    style: js.Object = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.inputswitchMod.InputSwitch] = {
    val __obj = js.Dynamic.literal()
    if (offLabel != null) __obj.updateDynamic("offLabel")(offLabel.asInstanceOf[js.Any])
    if (onLabel != null) __obj.updateDynamic("onLabel")(onLabel.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.inputswitchMod.InputSwitch] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.primereact.inputswitchMod.InputSwitch](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = InputSwitchProps
}

