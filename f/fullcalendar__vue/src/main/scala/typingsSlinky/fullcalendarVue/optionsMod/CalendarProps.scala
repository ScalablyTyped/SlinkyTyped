package typingsSlinky.fullcalendarVue.optionsMod

import org.scalajs.dom.raw.Event
import typingsSlinky.fullcalendarVue.anon.AllDay
import typingsSlinky.fullcalendarVue.fullcalendarVueStrings.ISO
import typingsSlinky.fullcalendarVue.fullcalendarVueStrings.auto
import typingsSlinky.fullcalendarVue.fullcalendarVueStrings.day
import typingsSlinky.fullcalendarVue.fullcalendarVueStrings.local
import typingsSlinky.fullcalendarVue.fullcalendarVueStrings.parent
import typingsSlinky.fullcalendarVue.fullcalendarVueStrings.popover
import typingsSlinky.fullcalendarVue.fullcalendarVueStrings.timeGridDay
import typingsSlinky.fullcalendarVue.fullcalendarVueStrings.timeGridWeek
import typingsSlinky.fullcalendarVue.fullcalendarVueStrings.week
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarProps extends js.Object {
  var allDayDefault: js.UndefOr[Boolean] = js.native
  var allDayHtml: js.UndefOr[String] = js.native
  var allDayMaintainDuration: js.UndefOr[Boolean] = js.native
  var allDaySlot: js.UndefOr[Boolean] = js.native
  var allDayText: js.UndefOr[String] = js.native
  var aspectRatio: js.UndefOr[Double] = js.native
  var bootstrapFontAwesome: js.UndefOr[BootstrapFontAwesome | Boolean] = js.native
  var businessHours: js.UndefOr[js.Any] = js.native
  var buttonIcons: js.UndefOr[ButtonIcons | Boolean] = js.native
  // compound OptionsInput...
  var buttonText: js.UndefOr[js.Any] = js.native
  var cmdFormatter: js.UndefOr[String] = js.native
  var columnHeader: js.UndefOr[Boolean] = js.native
  var columnHeaderFormat: js.UndefOr[FormatterInput] = js.native
  var columnHeaderHtml: js.UndefOr[String | (js.Function1[/* date */ DateInput, String])] = js.native
  var columnHeaderText: js.UndefOr[String | (js.Function1[/* date */ DateInput, String])] = js.native
  var contentHeight: js.UndefOr[Double | auto | js.Function0[Double]] = js.native
  var customButtons: js.UndefOr[CustomButtons] = js.native
  var dateAlignment: js.UndefOr[String] = js.native
  var dateIncrement: js.UndefOr[DurationInput] = js.native
  var datesAboveResources: js.UndefOr[js.Any] = js.native
  var datesDestroy: js.UndefOr[js.Any] = js.native
  // used to be emissions but are now props...
  var datesRender: js.UndefOr[js.Any] = js.native
  var dayCount: js.UndefOr[Double] = js.native
  var dayPopoverFormat: js.UndefOr[FormatterInput] = js.native
  var dayRender: js.UndefOr[js.Any] = js.native
  var defaultAllDayEventDuration: js.UndefOr[DurationInput] = js.native
  var defaultDate: js.UndefOr[DateInput] = js.native
  var defaultRangeSeparator: js.UndefOr[String] = js.native
  var defaultTimedEventDuration: js.UndefOr[DurationInput] = js.native
  var defaultView: js.UndefOr[String] = js.native
  var dir: js.UndefOr[direction] = js.native
  var displayEventEnd: js.UndefOr[Boolean] = js.native
  var displayEventTime: js.UndefOr[Boolean] = js.native
  var dragRevertDuration: js.UndefOr[Double] = js.native
  var dragScroll: js.UndefOr[Boolean] = js.native
  var dropAccept: js.UndefOr[String | (js.Function1[/* draggable */ js.Any, Boolean])] = js.native
  var droppable: js.UndefOr[Boolean] = js.native
  var duration: js.UndefOr[DurationInput] = js.native
  var editable: js.UndefOr[Boolean] = js.native
  var endParam: js.UndefOr[String] = js.native
  var eventAllow: js.UndefOr[AllowFunc] = js.native
  var eventBackgroundColor: js.UndefOr[String] = js.native
  var eventBorderColor: js.UndefOr[String] = js.native
  var eventClassName: js.UndefOr[js.Array[String] | String] = js.native
  var eventClassNames: js.UndefOr[js.Array[String] | String] = js.native
  var eventColor: js.UndefOr[String] = js.native
  var eventConstraint: js.UndefOr[js.Any] = js.native
  var eventDataTransform: js.UndefOr[js.Any] = js.native
  var eventDestroy: js.UndefOr[js.Any] = js.native
  var eventDragMinDistance: js.UndefOr[Double] = js.native
  var eventDurationEditable: js.UndefOr[Boolean] = js.native
  var eventLimit: js.UndefOr[Boolean | Double] = js.native
  var eventLimitClick: js.UndefOr[
    popover | week | day | timeGridWeek | timeGridDay | String | (js.Function1[/* arg */ AllDay, Unit])
  ] = js.native
  var eventLimitText: js.UndefOr[String | (js.Function1[/* eventCnt */ Double, String])] = js.native
  var eventLongPressDelay: js.UndefOr[Double] = js.native
  var eventOrder: js.UndefOr[String | (js.Array[(js.Function2[/* a */ _, /* b */ _, Double]) | String])] = js.native
  var eventOverlap: js.UndefOr[Boolean | OverlapFunc] = js.native
  var eventRender: js.UndefOr[js.Any] = js.native
  var eventResizableFromStart: js.UndefOr[Boolean] = js.native
  var eventSourceFailure: js.UndefOr[js.Any] = js.native
  var eventSourceSuccess: js.UndefOr[js.Any] = js.native
  var eventSources: js.UndefOr[js.Array[_]] = js.native
  var eventStartEditable: js.UndefOr[Boolean] = js.native
  var eventTextColor: js.UndefOr[String] = js.native
  var eventTimeFormat: js.UndefOr[FormatterInput] = js.native
  var events: js.UndefOr[js.Any] = js.native
  var filterResourcesWithEvents: js.UndefOr[js.Any] = js.native
  var firstDay: js.UndefOr[Double] = js.native
  var fixedWeekCount: js.UndefOr[Boolean] = js.native
  var footer: js.UndefOr[ToolbarInput | Boolean] = js.native
  var forceEventDuration: js.UndefOr[Boolean] = js.native
  var googleCalendarApiKey: js.UndefOr[js.Any] = js.native
  var handleWindowResize: js.UndefOr[Boolean] = js.native
  var header: js.UndefOr[ToolbarInput | Boolean] = js.native
  var height: js.UndefOr[Double | auto | parent | js.Function0[Double]] = js.native
  var hiddenDays: js.UndefOr[js.Array[Double]] = js.native
  var lazyFetching: js.UndefOr[Boolean] = js.native
  var listDayAltFormat: js.UndefOr[FormatterInput | Boolean] = js.native
  var listDayFormat: js.UndefOr[FormatterInput | Boolean] = js.native
  var locale: js.UndefOr[LocaleSingularArg] = js.native
  var locales: js.UndefOr[js.Array[RawLocale]] = js.native
  var longPressDelay: js.UndefOr[Double] = js.native
  var maxTime: js.UndefOr[DurationInput] = js.native
  var minTime: js.UndefOr[DurationInput] = js.native
  var navLinkDayClick: js.UndefOr[String | (js.Function2[/* date */ js.Date, /* jsEvent */ Event, Unit])] = js.native
  var navLinkWeekClick: js.UndefOr[String | (js.Function2[/* weekStart */ js.Any, /* jsEvent */ Event, Unit])] = js.native
  var navLinks: js.UndefOr[Boolean] = js.native
  var nextDayThreshold: js.UndefOr[DurationInput] = js.native
  var noEventsMessage: js.UndefOr[String] = js.native
  var now: js.UndefOr[DateInput | js.Function0[DateInput]] = js.native
  var nowIndicator: js.UndefOr[Boolean] = js.native
  var plugins: js.UndefOr[js.Any] = js.native
  var progressiveEventRendering: js.UndefOr[Boolean] = js.native
  var refetchResourcesOnNavigate: js.UndefOr[js.Any] = js.native
  var rerenderDelay: js.UndefOr[Double | Null] = js.native
  var resourceAreaWidth: js.UndefOr[js.Any] = js.native
  var resourceColumns: js.UndefOr[js.Any] = js.native
  var resourceGroupField: js.UndefOr[js.Any] = js.native
  var resourceGroupText: js.UndefOr[js.Any] = js.native
  var resourceLabelText: js.UndefOr[js.Any] = js.native
  var resourceOrder: js.UndefOr[js.Any] = js.native
  var resourceRender: js.UndefOr[js.Any] = js.native
  var resourceText: js.UndefOr[js.Any] = js.native
  var resources: js.UndefOr[js.Any] = js.native
  var resourcesInitiallyExpanded: js.UndefOr[js.Any] = js.native
  // scheduler...
  var schedulerLicenseKey: js.UndefOr[js.Any] = js.native
  var scrollTime: js.UndefOr[DurationInput] = js.native
  var selectAllow: js.UndefOr[AllowFunc] = js.native
  var selectConstraint: js.UndefOr[js.Any] = js.native
  var selectLongPressDelay: js.UndefOr[Double] = js.native
  var selectMinDistance: js.UndefOr[Double] = js.native
  var selectMirror: js.UndefOr[Boolean] = js.native
  var selectOverlap: js.UndefOr[Boolean | OverlapFunc] = js.native
  var selectable: js.UndefOr[Boolean] = js.native
  var showNonCurrentDates: js.UndefOr[Boolean] = js.native
  var slotDuration: js.UndefOr[DurationInput] = js.native
  var slotEventOverlap: js.UndefOr[Boolean] = js.native
  var slotLabelFormat: js.UndefOr[FormatterInput] = js.native
  var slotLabelInterval: js.UndefOr[DurationInput] = js.native
  var slotWidth: js.UndefOr[js.Any] = js.native
  var snapDuration: js.UndefOr[DurationInput] = js.native
  var startParam: js.UndefOr[String] = js.native
  var themeSystem: js.UndefOr[String] = js.native
  var timeGridEventMinHeight: js.UndefOr[Double] = js.native
  var timeZone: js.UndefOr[String | Boolean] = js.native
  var timeZoneParam: js.UndefOr[String] = js.native
  var titleFormat: js.UndefOr[FormatterInput] = js.native
  var titleRangeSeparator: js.UndefOr[String] = js.native
  var unselectAuto: js.UndefOr[Boolean] = js.native
  var unselectCancel: js.UndefOr[String] = js.native
  var validRange: js.UndefOr[DateRangeInput] = js.native
  var viewSkeletonDestroy: js.UndefOr[js.Any] = js.native
  var viewSkeletonRender: js.UndefOr[js.Any] = js.native
  var views: js.UndefOr[js.Any] = js.native
  var visibleRange: js.UndefOr[(js.Function1[/* currentDate */ js.Date, DateRangeInput]) | DateRangeInput] = js.native
  var weekLabel: js.UndefOr[String] = js.native
  var weekNumberCalculation: js.UndefOr[local | ISO | (js.Function1[/* m */ js.Date, Double])] = js.native
  var weekNumbers: js.UndefOr[Boolean] = js.native
  var weekNumbersWithinDays: js.UndefOr[Boolean] = js.native
  var weekends: js.UndefOr[Boolean] = js.native
  var windowResizeDelay: js.UndefOr[Double] = js.native
}

object CalendarProps {
  @scala.inline
  def apply(): CalendarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarProps]
  }
  @scala.inline
  implicit class CalendarPropsOps[Self <: CalendarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllDayDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDayDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllDayDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDayDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withAllDayHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDayHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllDayHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDayHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withAllDayMaintainDuration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDayMaintainDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllDayMaintainDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDayMaintainDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withAllDaySlot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDaySlot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllDaySlot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDaySlot")(js.undefined)
        ret
    }
    @scala.inline
    def withAllDayText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDayText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllDayText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDayText")(js.undefined)
        ret
    }
    @scala.inline
    def withAspectRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withBootstrapFontAwesome(value: BootstrapFontAwesome | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrapFontAwesome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBootstrapFontAwesome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrapFontAwesome")(js.undefined)
        ret
    }
    @scala.inline
    def withBusinessHours(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusinessHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessHours")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonIcons(value: ButtonIcons | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonIcons")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonText(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonText")(js.undefined)
        ret
    }
    @scala.inline
    def withCmdFormatter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmdFormatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCmdFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmdFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnHeaderFormatFunction1(value: /* arg */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColumnHeaderFormat(value: FormatterInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnHeaderFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnHeaderHtmlFunction1(value: /* date */ DateInput => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderHtml")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColumnHeaderHtml(value: String | (js.Function1[/* date */ DateInput, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnHeaderHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnHeaderTextFunction1(value: /* date */ DateInput => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColumnHeaderText(value: String | (js.Function1[/* date */ DateInput, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnHeaderText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderText")(js.undefined)
        ret
    }
    @scala.inline
    def withContentHeightFunction0(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContentHeight(value: Double | auto | js.Function0[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomButtons(value: CustomButtons): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withDateAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withDateIncrement(value: DurationInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateIncrement")(js.undefined)
        ret
    }
    @scala.inline
    def withDatesAboveResources(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datesAboveResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatesAboveResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datesAboveResources")(js.undefined)
        ret
    }
    @scala.inline
    def withDatesDestroy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datesDestroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatesDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datesDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withDatesRender(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datesRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatesRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datesRender")(js.undefined)
        ret
    }
    @scala.inline
    def withDayCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayCount")(js.undefined)
        ret
    }
    @scala.inline
    def withDayPopoverFormatFunction1(value: /* arg */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayPopoverFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDayPopoverFormat(value: FormatterInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayPopoverFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayPopoverFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayPopoverFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDayRender(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayRender")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultAllDayEventDuration(value: DurationInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAllDayEventDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultAllDayEventDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAllDayEventDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultDate(value: DateInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRangeSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRangeSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRangeSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRangeSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultTimedEventDuration(value: DurationInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTimedEventDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTimedEventDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTimedEventDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultView(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultView")(js.undefined)
        ret
    }
    @scala.inline
    def withDir(value: direction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayEventEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayEventEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayEventEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayEventEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayEventTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayEventTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayEventTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayEventTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDragRevertDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragRevertDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragRevertDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragRevertDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withDragScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withDropAcceptFunction1(value: /* draggable */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropAccept")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDropAccept(value: String | (js.Function1[/* draggable */ js.Any, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropAccept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropAccept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropAccept")(js.undefined)
        ret
    }
    @scala.inline
    def withDroppable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("droppable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDroppable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("droppable")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: DurationInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.undefined)
        ret
    }
    @scala.inline
    def withEndParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endParam")(js.undefined)
        ret
    }
    @scala.inline
    def withEventAllow(value: (/* span */ js.Any, /* movingEvent */ js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventAllow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEventAllow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventAllow")(js.undefined)
        ret
    }
    @scala.inline
    def withEventBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withEventBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withEventClassName(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withEventClassNames(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventClassNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventClassNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventClassNames")(js.undefined)
        ret
    }
    @scala.inline
    def withEventColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventColor")(js.undefined)
        ret
    }
    @scala.inline
    def withEventConstraint(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventConstraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventConstraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventConstraint")(js.undefined)
        ret
    }
    @scala.inline
    def withEventDataTransform(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDataTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventDataTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDataTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withEventDestroy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDestroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withEventDragMinDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDragMinDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventDragMinDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDragMinDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withEventDurationEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDurationEditable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventDurationEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDurationEditable")(js.undefined)
        ret
    }
    @scala.inline
    def withEventLimit(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withEventLimitClickFunction1(value: /* arg */ AllDay => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventLimitClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEventLimitClick(
      value: popover | week | day | timeGridWeek | timeGridDay | String | (js.Function1[/* arg */ AllDay, Unit])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventLimitClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventLimitClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventLimitClick")(js.undefined)
        ret
    }
    @scala.inline
    def withEventLimitTextFunction1(value: /* eventCnt */ Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventLimitText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEventLimitText(value: String | (js.Function1[/* eventCnt */ Double, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventLimitText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventLimitText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventLimitText")(js.undefined)
        ret
    }
    @scala.inline
    def withEventLongPressDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventLongPressDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventLongPressDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventLongPressDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withEventOrder(value: String | (js.Array[(js.Function2[/* a */ _, /* b */ _, Double]) | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withEventOverlapFunction2(value: (/* stillEvent */ js.Any, /* movingEvent */ js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventOverlap")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEventOverlap(value: Boolean | OverlapFunc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventOverlap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventOverlap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventOverlap")(js.undefined)
        ret
    }
    @scala.inline
    def withEventRender(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventRender")(js.undefined)
        ret
    }
    @scala.inline
    def withEventResizableFromStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventResizableFromStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventResizableFromStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventResizableFromStart")(js.undefined)
        ret
    }
    @scala.inline
    def withEventSourceFailure(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSourceFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventSourceFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSourceFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withEventSourceSuccess(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSourceSuccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventSourceSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSourceSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withEventSources(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventSources")(js.undefined)
        ret
    }
    @scala.inline
    def withEventStartEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventStartEditable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventStartEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventStartEditable")(js.undefined)
        ret
    }
    @scala.inline
    def withEventTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withEventTimeFormatFunction1(value: /* arg */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTimeFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEventTimeFormat(value: FormatterInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTimeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTimeFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTimeFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterResourcesWithEvents(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterResourcesWithEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterResourcesWithEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterResourcesWithEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDay")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedWeekCount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedWeekCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedWeekCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedWeekCount")(js.undefined)
        ret
    }
    @scala.inline
    def withFooter(value: ToolbarInput | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withForceEventDuration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceEventDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceEventDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceEventDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogleCalendarApiKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleCalendarApiKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleCalendarApiKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleCalendarApiKey")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleWindowResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleWindowResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleWindowResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleWindowResize")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: ToolbarInput | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withHeightFunction0(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeight(value: Double | auto | parent | js.Function0[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenDays(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenDays")(js.undefined)
        ret
    }
    @scala.inline
    def withLazyFetching(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyFetching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazyFetching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyFetching")(js.undefined)
        ret
    }
    @scala.inline
    def withListDayAltFormatFunction1(value: /* arg */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDayAltFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListDayAltFormat(value: FormatterInput | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDayAltFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListDayAltFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDayAltFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withListDayFormatFunction1(value: /* arg */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDayFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListDayFormat(value: FormatterInput | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDayFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListDayFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listDayFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: LocaleSingularArg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withLocales(value: js.Array[RawLocale]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locales")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocales: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locales")(js.undefined)
        ret
    }
    @scala.inline
    def withLongPressDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longPressDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongPressDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longPressDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTime(value: DurationInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMinTime(value: DurationInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTime")(js.undefined)
        ret
    }
    @scala.inline
    def withNavLinkDayClickFunction2(value: (/* date */ js.Date, /* jsEvent */ Event) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navLinkDayClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNavLinkDayClick(value: String | (js.Function2[/* date */ js.Date, /* jsEvent */ Event, Unit])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navLinkDayClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavLinkDayClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navLinkDayClick")(js.undefined)
        ret
    }
    @scala.inline
    def withNavLinkWeekClickFunction2(value: (/* weekStart */ js.Any, /* jsEvent */ Event) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navLinkWeekClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNavLinkWeekClick(value: String | (js.Function2[/* weekStart */ js.Any, /* jsEvent */ Event, Unit])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navLinkWeekClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavLinkWeekClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navLinkWeekClick")(js.undefined)
        ret
    }
    @scala.inline
    def withNavLinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withNextDayThreshold(value: DurationInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextDayThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextDayThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextDayThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withNoEventsMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEventsMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoEventsMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noEventsMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withNowDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("now")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNowFunction0(value: () => DateInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("now")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNow(value: DateInput | js.Function0[DateInput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("now")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("now")(js.undefined)
        ret
    }
    @scala.inline
    def withNowIndicator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nowIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNowIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nowIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressiveEventRendering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressiveEventRendering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressiveEventRendering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressiveEventRendering")(js.undefined)
        ret
    }
    @scala.inline
    def withRefetchResourcesOnNavigate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetchResourcesOnNavigate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefetchResourcesOnNavigate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetchResourcesOnNavigate")(js.undefined)
        ret
    }
    @scala.inline
    def withRerenderDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rerenderDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRerenderDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rerenderDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withRerenderDelayNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rerenderDelay")(null)
        ret
    }
    @scala.inline
    def withResourceAreaWidth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceAreaWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceAreaWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceAreaWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceColumns(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceGroupField(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceGroupField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceGroupField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceGroupField")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceGroupText(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceGroupText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceGroupText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceGroupText")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceLabelText(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceLabelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceLabelText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceLabelText")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceOrder(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceRender(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceRender")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceText(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceText")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(js.undefined)
        ret
    }
    @scala.inline
    def withResourcesInitiallyExpanded(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourcesInitiallyExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourcesInitiallyExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourcesInitiallyExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withSchedulerLicenseKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedulerLicenseKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchedulerLicenseKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedulerLicenseKey")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollTime(value: DurationInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAllow(value: (/* span */ js.Any, /* movingEvent */ js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSelectAllow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllow")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectConstraint(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectConstraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectConstraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectConstraint")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectLongPressDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectLongPressDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectLongPressDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectLongPressDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectMinDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectMinDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectMinDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectMinDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectMirror(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectMirror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectMirror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectMirror")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectOverlapFunction2(value: (/* stillEvent */ js.Any, /* movingEvent */ js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOverlap")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSelectOverlap(value: Boolean | OverlapFunc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOverlap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectOverlap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOverlap")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNonCurrentDates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNonCurrentDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNonCurrentDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNonCurrentDates")(js.undefined)
        ret
    }
    @scala.inline
    def withSlotDuration(value: DurationInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlotDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withSlotEventOverlap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotEventOverlap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlotEventOverlap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotEventOverlap")(js.undefined)
        ret
    }
    @scala.inline
    def withSlotLabelFormatFunction1(value: /* arg */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotLabelFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSlotLabelFormat(value: FormatterInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotLabelFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlotLabelFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotLabelFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withSlotLabelInterval(value: DurationInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotLabelInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlotLabelInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotLabelInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withSlotWidth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlotWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapDuration(value: DurationInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withStartParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startParam")(js.undefined)
        ret
    }
    @scala.inline
    def withThemeSystem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThemeSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeSystem")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeGridEventMinHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeGridEventMinHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeGridEventMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeGridEventMinHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeZone(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeZoneParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZoneParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZoneParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZoneParam")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleFormatFunction1(value: /* arg */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTitleFormat(value: FormatterInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleRangeSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleRangeSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleRangeSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleRangeSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withUnselectAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectAuto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnselectAuto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectAuto")(js.undefined)
        ret
    }
    @scala.inline
    def withUnselectCancel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnselectCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withValidRange(value: DateRangeInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validRange")(js.undefined)
        ret
    }
    @scala.inline
    def withViewSkeletonDestroy(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewSkeletonDestroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewSkeletonDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewSkeletonDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withViewSkeletonRender(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewSkeletonRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewSkeletonRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewSkeletonRender")(js.undefined)
        ret
    }
    @scala.inline
    def withViews(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleRangeFunction1(value: /* currentDate */ js.Date => DateRangeInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVisibleRange(value: (js.Function1[/* currentDate */ js.Date, DateRangeInput]) | DateRangeInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleRange")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekNumberCalculationFunction1(value: /* m */ js.Date => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekNumberCalculation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWeekNumberCalculation(value: local | ISO | (js.Function1[/* m */ js.Date, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekNumberCalculation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekNumberCalculation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekNumberCalculation")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekNumbers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekNumbersWithinDays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekNumbersWithinDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekNumbersWithinDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekNumbersWithinDays")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekends(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekends: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekends")(js.undefined)
        ret
    }
    @scala.inline
    def withWindowResizeDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowResizeDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowResizeDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowResizeDelay")(js.undefined)
        ret
    }
  }
  
}

