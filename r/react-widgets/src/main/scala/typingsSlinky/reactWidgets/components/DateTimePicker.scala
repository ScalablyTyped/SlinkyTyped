package typingsSlinky.reactWidgets.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.html.`*`.tag
import typingsSlinky.reactWidgets.dateTimePickerMod.DateTimePickerMessages
import typingsSlinky.reactWidgets.dateTimePickerMod.DateTimePickerProps
import typingsSlinky.reactWidgets.dateTimePickerMod.Open
import typingsSlinky.reactWidgets.mod.DateTimePicker.^
import typingsSlinky.reactWidgets.reactWidgetsStrings.century
import typingsSlinky.reactWidgets.reactWidgetsStrings.decade
import typingsSlinky.reactWidgets.reactWidgetsStrings.month
import typingsSlinky.reactWidgets.reactWidgetsStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DateTimePicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-widgets", "DateTimePicker")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoFocus, id, name, placeholder */
  def apply(
    calendar: js.UndefOr[Boolean] = js.undefined,
    containerClassName: String = null,
    culture: String = null,
    currentDate: js.Date = null,
    date: js.UndefOr[Boolean] = js.undefined,
    dateIcon: ReactElement = null,
    defaultCurrentDate: js.Date = null,
    defaultOpen: Open = null,
    defaultValue: js.Date = null,
    disabled: Boolean | js.Array[_] = null,
    dropUp: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    editFormat: String = null,
    finalView: month | year | decade | century = null,
    format: String = null,
    initialView: month | year | decade | century = null,
    inputProps: js.Object = null,
    isRtl: js.UndefOr[Boolean] = js.undefined,
    max: js.Date = null,
    messages: DateTimePickerMessages = null,
    min: js.Date = null,
    onBlur: () => Unit = null,
    onChange: (/* date */ js.UndefOr[js.Date], /* dateStr */ js.UndefOr[String]) => Unit = null,
    onCurrentDateChange: /* date */ js.UndefOr[js.Date] => Unit = null,
    onFocus: () => Unit = null,
    onKeyDown: /* event */ SyntheticKeyboardEvent[_] => Unit = null,
    onKeyPress: /* event */ SyntheticKeyboardEvent[_] => Unit = null,
    onSelect: /* date */ js.UndefOr[js.Date] => Unit = null,
    onToggle: /* isOpen */ Open => Unit = null,
    open: Open = null,
    parse: (js.Function1[/* str */ String, js.Date]) | js.Array[String] | String = null,
    popupTransition: ReactComponentClass[_] | String = null,
    readOnly: Boolean | js.Array[_] = null,
    step: Double | Boolean = null,
    time: js.UndefOr[Boolean] = js.undefined,
    timeComponent: ReactComponentClass[_] | String = null,
    timeFormat: String = null,
    timeIcon: ReactElement = null,
    value: js.Date = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(calendar)) __obj.updateDynamic("calendar")(calendar.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (culture != null) __obj.updateDynamic("culture")(culture.asInstanceOf[js.Any])
    if (currentDate != null) __obj.updateDynamic("currentDate")(currentDate.asInstanceOf[js.Any])
    if (!js.isUndefined(date)) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (dateIcon != null) __obj.updateDynamic("dateIcon")(dateIcon.asInstanceOf[js.Any])
    if (defaultCurrentDate != null) __obj.updateDynamic("defaultCurrentDate")(defaultCurrentDate.asInstanceOf[js.Any])
    if (defaultOpen != null) __obj.updateDynamic("defaultOpen")(defaultOpen.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(dropUp)) __obj.updateDynamic("dropUp")(dropUp.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (editFormat != null) __obj.updateDynamic("editFormat")(editFormat.asInstanceOf[js.Any])
    if (finalView != null) __obj.updateDynamic("finalView")(finalView.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (initialView != null) __obj.updateDynamic("initialView")(initialView.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (!js.isUndefined(isRtl)) __obj.updateDynamic("isRtl")(isRtl.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onCurrentDateChange != null) __obj.updateDynamic("onCurrentDateChange")(js.Any.fromFunction1(onCurrentDateChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1(onToggle))
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (popupTransition != null) __obj.updateDynamic("popupTransition")(popupTransition.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (timeComponent != null) __obj.updateDynamic("timeComponent")(timeComponent.asInstanceOf[js.Any])
    if (timeFormat != null) __obj.updateDynamic("timeFormat")(timeFormat.asInstanceOf[js.Any])
    if (timeIcon != null) __obj.updateDynamic("timeIcon")(timeIcon.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ^] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactWidgets.mod.DateTimePicker.^](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DateTimePickerProps
}

