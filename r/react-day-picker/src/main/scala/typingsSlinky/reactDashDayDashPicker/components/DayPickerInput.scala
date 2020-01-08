package typingsSlinky.reactDashDayDashPicker.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.div.tag
import typingsSlinky.reactDashDayDashPicker.typesCommonMod.DayModifiers
import typingsSlinky.reactDashDayDashPicker.typesCommonMod.InputClassNames
import typingsSlinky.reactDashDayDashPicker.typesPropsMod.DayPickerInputProps
import typingsSlinky.reactDashDayDashPicker.typesPropsMod.DayPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DayPickerInput
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashDayDashPicker.typesDayPickerInputMod.DayPickerInput
    ] {
  @JSImport("react-day-picker/types/DayPickerInput", "DayPickerInput")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onBlur, onChange, onClick, onFocus, onKeyUp, placeholder, value */
  def apply(
    classNames: InputClassNames = null,
    clickUnselectsDay: js.UndefOr[Boolean] = js.undefined,
    component: js.Any = null,
    dayPickerProps: DayPickerProps = null,
    format: String | js.Array[String] = null,
    formatDate: (/* date */ js.Date, /* format */ String, /* locale */ String) => String = null,
    hideOnDayClick: js.UndefOr[Boolean] = js.undefined,
    inputProps: js.Object = null,
    keepFocus: js.UndefOr[Boolean] = js.undefined,
    onDayChange: (/* day */ js.Date, /* DayModifiers */ DayModifiers, /* dayPickerInput */ typingsSlinky.reactDashDayDashPicker.typesDayPickerInputMod.DayPickerInput) => Unit = null,
    onDayPickerHide: () => Unit = null,
    onDayPickerShow: () => Unit = null,
    overlayComponent: js.Any = null,
    parseDate: (/* str */ String, /* format */ String, /* locale */ String) => js.Date | Unit = null,
    showOverlay: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashDayDashPicker.typesDayPickerInputMod.DayPickerInput
  ] = {
    val __obj = js.Dynamic.literal()
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    if (!js.isUndefined(clickUnselectsDay)) __obj.updateDynamic("clickUnselectsDay")(clickUnselectsDay.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (dayPickerProps != null) __obj.updateDynamic("dayPickerProps")(dayPickerProps.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formatDate != null) __obj.updateDynamic("formatDate")(js.Any.fromFunction3(formatDate))
    if (!js.isUndefined(hideOnDayClick)) __obj.updateDynamic("hideOnDayClick")(hideOnDayClick.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (!js.isUndefined(keepFocus)) __obj.updateDynamic("keepFocus")(keepFocus.asInstanceOf[js.Any])
    if (onDayChange != null) __obj.updateDynamic("onDayChange")(js.Any.fromFunction3(onDayChange))
    if (onDayPickerHide != null) __obj.updateDynamic("onDayPickerHide")(js.Any.fromFunction0(onDayPickerHide))
    if (onDayPickerShow != null) __obj.updateDynamic("onDayPickerShow")(js.Any.fromFunction0(onDayPickerShow))
    if (overlayComponent != null) __obj.updateDynamic("overlayComponent")(overlayComponent.asInstanceOf[js.Any])
    if (parseDate != null) __obj.updateDynamic("parseDate")(js.Any.fromFunction3(parseDate))
    if (!js.isUndefined(showOverlay)) __obj.updateDynamic("showOverlay")(showOverlay.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashDayDashPicker.typesDayPickerInputMod.DayPickerInput
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.div.tag.type, 
  typingsSlinky.reactDashDayDashPicker.typesDayPickerInputMod.DayPickerInput](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DayPickerInputProps
}

