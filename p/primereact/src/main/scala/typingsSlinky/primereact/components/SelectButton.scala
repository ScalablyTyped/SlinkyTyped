package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.componentsSelectbuttonSelectButtonMod.SelectButtonProps
import typingsSlinky.primereact.componentsTooltipTooltipOptionsMod.TooltipOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SelectButton
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.selectbuttonMod.SelectButton] {
  @JSImport("primereact/selectbutton", "SelectButton")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, id, multiple, onChange */
  def apply(
    dataKey: String = null,
    optionLabel: String = null,
    options: js.Array[_] = null,
    style: js.Object = null,
    tabIndex: String = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
    value: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.selectbuttonMod.SelectButton] = {
    val __obj = js.Dynamic.literal()
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
    if (optionLabel != null) __obj.updateDynamic("optionLabel")(optionLabel.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.selectbuttonMod.SelectButton] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.primereact.selectbuttonMod.SelectButton](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SelectButtonProps
}

