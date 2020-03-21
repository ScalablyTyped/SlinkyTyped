package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.AnonValueBoolean
import typingsSlinky.primereact.inputSwitchMod.InputSwitchProps
import typingsSlinky.primereact.tooltipOptionsMod.TooltipOptions
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InputSwitch
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.primereactInputswitchMod.InputSwitch] {
  @JSImport("primereact/inputswitch", "InputSwitch")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: checked, className, disabled, id */
  def apply(
    ariaLabelledBy: String = null,
    offLabel: String = null,
    onBlur: /* event */ Event_ => Unit = null,
    onChange: /* e */ AnonValueBoolean => Unit = null,
    onFocus: /* event */ Event_ => Unit = null,
    onLabel: String = null,
    style: js.Object = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.primereactInputswitchMod.InputSwitch] = {
    val __obj = js.Dynamic.literal()
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy.asInstanceOf[js.Any])
    if (offLabel != null) __obj.updateDynamic("offLabel")(offLabel.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onLabel != null) __obj.updateDynamic("onLabel")(onLabel.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.primereactInputswitchMod.InputSwitch] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.primereact.primereactInputswitchMod.InputSwitch](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = InputSwitchProps
}

