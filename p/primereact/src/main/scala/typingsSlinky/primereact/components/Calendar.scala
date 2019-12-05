package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.Anon_OriginalEventValueDate
import typingsSlinky.primereact.componentsCalendarCalendarMod.CalendarProps
import typingsSlinky.primereact.componentsCalendarCalendarMod.DateMetaData
import typingsSlinky.primereact.componentsCalendarCalendarMod.LocaleSettings
import typingsSlinky.primereact.componentsTooltipTooltipOptionsMod.TooltipOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Calendar
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.calendarMod.Calendar] {
  @JSImport("primereact/calendar", "Calendar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, id, name, onBlur, onChange, onFocus, onInput, onSelect, placeholder, required, value */
  def apply(
    appendTo: js.Any = null,
    autoZIndex: js.UndefOr[Boolean] = js.undefined,
    baseZIndex: Int | Double = null,
    clearButtonStyleClass: String = null,
    dateFormat: String = null,
    dateTemplate: /* dateMeta */ DateMetaData => TagMod[Any] = null,
    disabledDates: js.Array[js.Date] = null,
    disabledDays: js.Array[Double] = null,
    footerTemplate: () => TagMod[Any] = null,
    headerTemplate: () => TagMod[Any] = null,
    hideOnDateTimeSelect: js.UndefOr[Boolean] = js.undefined,
    hourFormat: String = null,
    icon: String = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    inputClassName: String = null,
    inputId: String = null,
    inputStyle: js.Object = null,
    locale: LocaleSettings = null,
    maxDate: js.Date = null,
    maxDateCount: Int | Double = null,
    minDate: js.Date = null,
    monthNavigator: js.UndefOr[Boolean] = js.undefined,
    numberOfMonths: Int | Double = null,
    onClearButtonClick: /* event */ Event => Unit = null,
    onTodayButtonClick: /* event */ Event => Unit = null,
    onViewDateChange: /* e */ Anon_OriginalEventValueDate => Unit = null,
    panelClassName: String = null,
    panelStyle: js.Object = null,
    readOnlyInput: js.UndefOr[Boolean] = js.undefined,
    selectOtherMonths: js.UndefOr[Boolean] = js.undefined,
    selectionMode: String = null,
    shortYearCutoff: String = null,
    showButtonBar: js.UndefOr[Boolean] = js.undefined,
    showIcon: js.UndefOr[Boolean] = js.undefined,
    showOnFocus: js.UndefOr[Boolean] = js.undefined,
    showOtherMonths: js.UndefOr[Boolean] = js.undefined,
    showSeconds: js.UndefOr[Boolean] = js.undefined,
    showTime: js.UndefOr[Boolean] = js.undefined,
    showWeek: js.UndefOr[Boolean] = js.undefined,
    stepHour: Int | Double = null,
    stepMinute: Int | Double = null,
    stepSecond: Int | Double = null,
    style: js.Object = null,
    tabIndex: String = null,
    timeOnly: js.UndefOr[Boolean] = js.undefined,
    todayButtonClassName: String = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
    touchUI: js.UndefOr[Boolean] = js.undefined,
    view: String = null,
    viewDate: js.Date = null,
    yearNavigator: js.UndefOr[Boolean] = js.undefined,
    yearRange: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.calendarMod.Calendar] = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (!js.isUndefined(autoZIndex)) __obj.updateDynamic("autoZIndex")(autoZIndex.asInstanceOf[js.Any])
    if (baseZIndex != null) __obj.updateDynamic("baseZIndex")(baseZIndex.asInstanceOf[js.Any])
    if (clearButtonStyleClass != null) __obj.updateDynamic("clearButtonStyleClass")(clearButtonStyleClass.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (dateTemplate != null) __obj.updateDynamic("dateTemplate")(js.Any.fromFunction1(dateTemplate))
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates.asInstanceOf[js.Any])
    if (disabledDays != null) __obj.updateDynamic("disabledDays")(disabledDays.asInstanceOf[js.Any])
    if (footerTemplate != null) __obj.updateDynamic("footerTemplate")(js.Any.fromFunction0(footerTemplate))
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(js.Any.fromFunction0(headerTemplate))
    if (!js.isUndefined(hideOnDateTimeSelect)) __obj.updateDynamic("hideOnDateTimeSelect")(hideOnDateTimeSelect.asInstanceOf[js.Any])
    if (hourFormat != null) __obj.updateDynamic("hourFormat")(hourFormat.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName.asInstanceOf[js.Any])
    if (inputId != null) __obj.updateDynamic("inputId")(inputId.asInstanceOf[js.Any])
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (maxDateCount != null) __obj.updateDynamic("maxDateCount")(maxDateCount.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (!js.isUndefined(monthNavigator)) __obj.updateDynamic("monthNavigator")(monthNavigator.asInstanceOf[js.Any])
    if (numberOfMonths != null) __obj.updateDynamic("numberOfMonths")(numberOfMonths.asInstanceOf[js.Any])
    if (onClearButtonClick != null) __obj.updateDynamic("onClearButtonClick")(js.Any.fromFunction1(onClearButtonClick))
    if (onTodayButtonClick != null) __obj.updateDynamic("onTodayButtonClick")(js.Any.fromFunction1(onTodayButtonClick))
    if (onViewDateChange != null) __obj.updateDynamic("onViewDateChange")(js.Any.fromFunction1(onViewDateChange))
    if (panelClassName != null) __obj.updateDynamic("panelClassName")(panelClassName.asInstanceOf[js.Any])
    if (panelStyle != null) __obj.updateDynamic("panelStyle")(panelStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnlyInput)) __obj.updateDynamic("readOnlyInput")(readOnlyInput.asInstanceOf[js.Any])
    if (!js.isUndefined(selectOtherMonths)) __obj.updateDynamic("selectOtherMonths")(selectOtherMonths.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (shortYearCutoff != null) __obj.updateDynamic("shortYearCutoff")(shortYearCutoff.asInstanceOf[js.Any])
    if (!js.isUndefined(showButtonBar)) __obj.updateDynamic("showButtonBar")(showButtonBar.asInstanceOf[js.Any])
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(showOnFocus)) __obj.updateDynamic("showOnFocus")(showOnFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(showOtherMonths)) __obj.updateDynamic("showOtherMonths")(showOtherMonths.asInstanceOf[js.Any])
    if (!js.isUndefined(showSeconds)) __obj.updateDynamic("showSeconds")(showSeconds.asInstanceOf[js.Any])
    if (!js.isUndefined(showTime)) __obj.updateDynamic("showTime")(showTime.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeek)) __obj.updateDynamic("showWeek")(showWeek.asInstanceOf[js.Any])
    if (stepHour != null) __obj.updateDynamic("stepHour")(stepHour.asInstanceOf[js.Any])
    if (stepMinute != null) __obj.updateDynamic("stepMinute")(stepMinute.asInstanceOf[js.Any])
    if (stepSecond != null) __obj.updateDynamic("stepSecond")(stepSecond.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(timeOnly)) __obj.updateDynamic("timeOnly")(timeOnly.asInstanceOf[js.Any])
    if (todayButtonClassName != null) __obj.updateDynamic("todayButtonClassName")(todayButtonClassName.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(touchUI)) __obj.updateDynamic("touchUI")(touchUI.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (viewDate != null) __obj.updateDynamic("viewDate")(viewDate.asInstanceOf[js.Any])
    if (!js.isUndefined(yearNavigator)) __obj.updateDynamic("yearNavigator")(yearNavigator.asInstanceOf[js.Any])
    if (yearRange != null) __obj.updateDynamic("yearRange")(yearRange.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CalendarProps
}

