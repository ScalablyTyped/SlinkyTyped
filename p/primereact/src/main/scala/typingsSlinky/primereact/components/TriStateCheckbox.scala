package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.componentsTooltipTooltipOptionsMod.TooltipOptions
import typingsSlinky.primereact.componentsTristatecheckboxTriStateCheckboxMod.TriStateCheckboxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TriStateCheckbox
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.tristatecheckboxMod.TriStateCheckbox] {
  @JSImport("primereact/tristatecheckbox", "TriStateCheckbox")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id, name, onChange */
  def apply(
    inputId: String = null,
    style: js.Object = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
    value: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.tristatecheckboxMod.TriStateCheckbox] = {
    val __obj = js.Dynamic.literal()
    if (inputId != null) __obj.updateDynamic("inputId")(inputId.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.tristatecheckboxMod.TriStateCheckbox] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.primereact.tristatecheckboxMod.TriStateCheckbox](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TriStateCheckboxProps
}

