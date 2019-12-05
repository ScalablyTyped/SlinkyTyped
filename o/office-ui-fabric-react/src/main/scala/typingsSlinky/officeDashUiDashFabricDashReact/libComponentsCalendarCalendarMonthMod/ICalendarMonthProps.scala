package typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCalendarCalendarMonthMod

import typingsSlinky.atUifabricUtilities.libCreateRefMod.IRefObject
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCalendarCalendarDotTypesMod.ICalendarFormatDateCallbacks
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCalendarCalendarDotTypesMod.ICalendarIconStrings
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCalendarCalendarDotTypesMod.ICalendarStrings
import typingsSlinky.react.reactMod.ClassAttributes
import typingsSlinky.react.reactMod.Key
import typingsSlinky.react.reactMod.LegacyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarMonthProps extends ClassAttributes[CalendarMonth] {
  var componentRef: js.UndefOr[IRefObject[ICalendarMonth]] = js.undefined
  var dateTimeFormatter: ICalendarFormatDateCallbacks
  var highlightCurrentMonth: Boolean
  var highlightSelectedMonth: Boolean
  var maxDate: js.UndefOr[js.Date] = js.undefined
  var minDate: js.UndefOr[js.Date] = js.undefined
  var navigatedDate: js.Date
  var navigationIcons: ICalendarIconStrings
  var onHeaderSelect: js.UndefOr[js.Function1[/* focus */ Boolean, Unit]] = js.undefined
  var selectedDate: js.Date
  var strings: ICalendarStrings
  var today: js.UndefOr[js.Date] = js.undefined
  var yearPickerHidden: js.UndefOr[Boolean] = js.undefined
  def onNavigateDate(date: js.Date, focusOnNavigatedDay: Boolean): Unit
}

object ICalendarMonthProps {
  @scala.inline
  def apply(
    dateTimeFormatter: ICalendarFormatDateCallbacks,
    highlightCurrentMonth: Boolean,
    highlightSelectedMonth: Boolean,
    navigatedDate: js.Date,
    navigationIcons: ICalendarIconStrings,
    onNavigateDate: (js.Date, Boolean) => Unit,
    selectedDate: js.Date,
    strings: ICalendarStrings,
    componentRef: IRefObject[ICalendarMonth] = null,
    key: Key = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    onHeaderSelect: /* focus */ Boolean => Unit = null,
    ref: LegacyRef[CalendarMonth] = null,
    today: js.Date = null,
    yearPickerHidden: js.UndefOr[Boolean] = js.undefined
  ): ICalendarMonthProps = {
    val __obj = js.Dynamic.literal(dateTimeFormatter = dateTimeFormatter.asInstanceOf[js.Any], highlightCurrentMonth = highlightCurrentMonth.asInstanceOf[js.Any], highlightSelectedMonth = highlightSelectedMonth.asInstanceOf[js.Any], navigatedDate = navigatedDate.asInstanceOf[js.Any], navigationIcons = navigationIcons.asInstanceOf[js.Any], onNavigateDate = js.Any.fromFunction2(onNavigateDate), selectedDate = selectedDate.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (onHeaderSelect != null) __obj.updateDynamic("onHeaderSelect")(js.Any.fromFunction1(onHeaderSelect))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (today != null) __obj.updateDynamic("today")(today.asInstanceOf[js.Any])
    if (!js.isUndefined(yearPickerHidden)) __obj.updateDynamic("yearPickerHidden")(yearPickerHidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarMonthProps]
  }
}

