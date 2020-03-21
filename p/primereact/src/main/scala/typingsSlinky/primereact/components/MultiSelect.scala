package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.AnonValue
import typingsSlinky.primereact.multiSelectMod.MultiSelectProps
import typingsSlinky.primereact.tooltipOptionsMod.TooltipOptions
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MultiSelect
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.primereactMultiselectMod.MultiSelect] {
  @JSImport("primereact/multiselect", "MultiSelect")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, id, placeholder */
  def apply(
    appendTo: HTMLElement = null,
    ariaLabelledBy: String = null,
    dataKey: String = null,
    filter: js.UndefOr[Boolean] = js.undefined,
    fixedPlaceholder: js.UndefOr[Boolean] = js.undefined,
    itemTemplate: /* item */ js.Any => js.UndefOr[ReactElement] = null,
    maxSelectedLabels: Int | Double = null,
    onBlur: /* event */ Event_ => Unit = null,
    onChange: /* e */ AnonValue => Unit = null,
    onFocus: /* event */ Event_ => Unit = null,
    optionLabel: String = null,
    options: js.Array[_] = null,
    scrollHeight: String = null,
    selectedItemTemplate: /* value */ js.Any => js.UndefOr[ReactElement] = null,
    selectedItemsLabel: String = null,
    style: js.Object = null,
    tabIndex: js.UndefOr[Boolean] = js.undefined,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
    value: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.primereactMultiselectMod.MultiSelect] = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy.asInstanceOf[js.Any])
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedPlaceholder)) __obj.updateDynamic("fixedPlaceholder")(fixedPlaceholder.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(js.Any.fromFunction1(itemTemplate))
    if (maxSelectedLabels != null) __obj.updateDynamic("maxSelectedLabels")(maxSelectedLabels.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (optionLabel != null) __obj.updateDynamic("optionLabel")(optionLabel.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (scrollHeight != null) __obj.updateDynamic("scrollHeight")(scrollHeight.asInstanceOf[js.Any])
    if (selectedItemTemplate != null) __obj.updateDynamic("selectedItemTemplate")(js.Any.fromFunction1(selectedItemTemplate))
    if (selectedItemsLabel != null) __obj.updateDynamic("selectedItemsLabel")(selectedItemsLabel.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.primereactMultiselectMod.MultiSelect] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.primereact.primereactMultiselectMod.MultiSelect](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = MultiSelectProps
}

