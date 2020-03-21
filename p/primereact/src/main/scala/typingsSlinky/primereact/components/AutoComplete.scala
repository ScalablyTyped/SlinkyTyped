package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.AnonOriginalEvent
import typingsSlinky.primereact.AnonValue
import typingsSlinky.primereact.autocompleteAutoCompleteMod.AutoCompleteProps
import typingsSlinky.primereact.tooltipOptionsMod.TooltipOptions
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AutoComplete
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.autocompleteMod.AutoComplete] {
  @JSImport("primereact/autocomplete", "AutoComplete")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoFocus, className, disabled, id, multiple, name, placeholder, size, type */
  def apply(
    appendTo: js.Any = null,
    ariaLabelledBy: String = null,
    completeMethod: /* e */ AnonOriginalEvent => Unit = null,
    delay: Int | Double = null,
    dropdown: js.UndefOr[Boolean] = js.undefined,
    dropdownMode: String = null,
    field: String = null,
    inputClassName: String = null,
    inputId: String = null,
    inputStyle: js.Object = null,
    itemTemplate: /* data */ js.Any => js.UndefOr[ReactElement] = null,
    maxlength: Int | Double = null,
    minLength: Int | Double = null,
    onBlur: /* event */ Event_ => Unit = null,
    onChange: /* e */ AnonValue => Unit = null,
    onClear: /* event */ Event_ => Unit = null,
    onClick: /* event */ Event_ => Unit = null,
    onContextMenu: /* event */ Event_ => Unit = null,
    onDblClick: /* event */ Event_ => Unit = null,
    onDropdownClick: /* e */ AnonOriginalEvent => Unit = null,
    onFocus: /* event */ Event_ => Unit = null,
    onKeyPress: /* event */ Event_ => Unit = null,
    onKeyUp: /* event */ Event_ => Unit = null,
    onMouseDown: /* event */ Event_ => Unit = null,
    onSelect: /* e */ AnonValue => Unit = null,
    onUnselect: /* e */ AnonValue => Unit = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    scrollHeight: String = null,
    selectedItemTemplate: /* data */ js.Any => js.UndefOr[ReactElement] = null,
    style: js.Object = null,
    suggestions: js.Array[_] = null,
    tabindex: Int | Double = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
    value: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.autocompleteMod.AutoComplete] = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy.asInstanceOf[js.Any])
    if (completeMethod != null) __obj.updateDynamic("completeMethod")(js.Any.fromFunction1(completeMethod))
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(dropdown)) __obj.updateDynamic("dropdown")(dropdown.asInstanceOf[js.Any])
    if (dropdownMode != null) __obj.updateDynamic("dropdownMode")(dropdownMode.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName.asInstanceOf[js.Any])
    if (inputId != null) __obj.updateDynamic("inputId")(inputId.asInstanceOf[js.Any])
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(js.Any.fromFunction1(itemTemplate))
    if (maxlength != null) __obj.updateDynamic("maxlength")(maxlength.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClear != null) __obj.updateDynamic("onClear")(js.Any.fromFunction1(onClear))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onDblClick != null) __obj.updateDynamic("onDblClick")(js.Any.fromFunction1(onDblClick))
    if (onDropdownClick != null) __obj.updateDynamic("onDropdownClick")(js.Any.fromFunction1(onDropdownClick))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onUnselect != null) __obj.updateDynamic("onUnselect")(js.Any.fromFunction1(onUnselect))
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (scrollHeight != null) __obj.updateDynamic("scrollHeight")(scrollHeight.asInstanceOf[js.Any])
    if (selectedItemTemplate != null) __obj.updateDynamic("selectedItemTemplate")(js.Any.fromFunction1(selectedItemTemplate))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    if (tabindex != null) __obj.updateDynamic("tabindex")(tabindex.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.autocompleteMod.AutoComplete] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.primereact.autocompleteMod.AutoComplete](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = AutoCompleteProps
}

