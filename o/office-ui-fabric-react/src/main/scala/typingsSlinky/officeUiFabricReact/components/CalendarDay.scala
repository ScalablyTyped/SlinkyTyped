package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.calendarDayMod.ICalendarDay
import typingsSlinky.officeUiFabricReact.calendarDayMod.ICalendarDayProps
import typingsSlinky.officeUiFabricReact.calendarTypesMod.ICalendarFormatDateCallbacks
import typingsSlinky.officeUiFabricReact.calendarTypesMod.ICalendarIconStrings
import typingsSlinky.officeUiFabricReact.calendarTypesMod.ICalendarStrings
import typingsSlinky.officeUiFabricReact.dateValuesMod.DateRangeType
import typingsSlinky.officeUiFabricReact.dateValuesMod.DayOfWeek
import typingsSlinky.officeUiFabricReact.dateValuesMod.FirstWeekOfYear
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CalendarDay
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.officeUiFabricReact.calendarDayMod.CalendarDay] {
  @JSImport("office-ui-fabric-react/lib/components/Calendar/CalendarDay", "CalendarDay")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    autoNavigateOnSelection: Boolean,
    dateRangeType: DateRangeType,
    dateTimeFormatter: ICalendarFormatDateCallbacks,
    firstDayOfWeek: DayOfWeek,
    firstWeekOfYear: FirstWeekOfYear,
    navigatedDate: js.Date,
    navigationIcons: ICalendarIconStrings,
    onNavigateDate: (js.Date, Boolean) => Unit,
    onSelectDate: (js.Date, js.UndefOr[js.Array[js.Date]]) => Unit,
    selectedDate: js.Date,
    strings: ICalendarStrings,
    allFocusable: js.UndefOr[Boolean] = js.undefined,
    componentRef: IRefObject[ICalendarDay] = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    onDismiss: () => Unit = null,
    onHeaderSelect: /* focus */ Boolean => Unit = null,
    restrictedDates: js.Array[js.Date] = null,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    showSixWeeksByDefault: js.UndefOr[Boolean] = js.undefined,
    showWeekNumbers: js.UndefOr[Boolean] = js.undefined,
    today: js.Date = null,
    workWeekDays: js.Array[DayOfWeek] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.calendarDayMod.CalendarDay] = {
    val __obj = js.Dynamic.literal(autoNavigateOnSelection = autoNavigateOnSelection.asInstanceOf[js.Any], dateRangeType = dateRangeType.asInstanceOf[js.Any], dateTimeFormatter = dateTimeFormatter.asInstanceOf[js.Any], firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], firstWeekOfYear = firstWeekOfYear.asInstanceOf[js.Any], navigatedDate = navigatedDate.asInstanceOf[js.Any], navigationIcons = navigationIcons.asInstanceOf[js.Any], onNavigateDate = js.Any.fromFunction2(onNavigateDate), onSelectDate = js.Any.fromFunction2(onSelectDate), selectedDate = selectedDate.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    if (!js.isUndefined(allFocusable)) __obj.updateDynamic("allFocusable")(allFocusable.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onHeaderSelect != null) __obj.updateDynamic("onHeaderSelect")(js.Any.fromFunction1(onHeaderSelect))
    if (restrictedDates != null) __obj.updateDynamic("restrictedDates")(restrictedDates.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showSixWeeksByDefault)) __obj.updateDynamic("showSixWeeksByDefault")(showSixWeeksByDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeekNumbers)) __obj.updateDynamic("showWeekNumbers")(showWeekNumbers.asInstanceOf[js.Any])
    if (today != null) __obj.updateDynamic("today")(today.asInstanceOf[js.Any])
    if (workWeekDays != null) __obj.updateDynamic("workWeekDays")(workWeekDays.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ICalendarDayProps
}

