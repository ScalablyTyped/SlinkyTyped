package typingsSlinky.fullcalendar.inputTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.fullcalendar.fullcalendarStrings.ISO
import typingsSlinky.fullcalendar.fullcalendarStrings.`jquery-ui`
import typingsSlinky.fullcalendar.fullcalendarStrings.auto
import typingsSlinky.fullcalendar.fullcalendarStrings.bootstrap3
import typingsSlinky.fullcalendar.fullcalendarStrings.bootstrap4
import typingsSlinky.fullcalendar.fullcalendarStrings.day
import typingsSlinky.fullcalendar.fullcalendarStrings.local
import typingsSlinky.fullcalendar.fullcalendarStrings.parent
import typingsSlinky.fullcalendar.fullcalendarStrings.popover
import typingsSlinky.fullcalendar.fullcalendarStrings.standard
import typingsSlinky.fullcalendar.fullcalendarStrings.week
import typingsSlinky.fullcalendar.jqueryHooksMod.global.JQuery
import typingsSlinky.fullcalendar.viewMod.default
import typingsSlinky.moment.mod.Duration_
import typingsSlinky.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsInputBase extends js.Object {
  var allDayDefault: js.UndefOr[Boolean] = js.native
  var allDaySlot: js.UndefOr[Boolean] = js.native
  var allDayText: js.UndefOr[String] = js.native
  var aspectRatio: js.UndefOr[Double] = js.native
  var bootstrapFontAwesome: js.UndefOr[Boolean | ButtonIconsInput] = js.native
  var bootstrapGlyphicons: js.UndefOr[Boolean | ButtonIconsInput] = js.native
  var businessHours: js.UndefOr[Boolean | BusinessHoursInput | js.Array[BusinessHoursInput]] = js.native
  var buttonIcons: js.UndefOr[Boolean | ButtonIconsInput] = js.native
  var columnHeader: js.UndefOr[Boolean] = js.native
  var columnHeaderFormat: js.UndefOr[String] = js.native
  var columnHeaderHtml: js.UndefOr[String | (js.Function1[/* date */ MomentInput, String])] = js.native
  var columnHeaderText: js.UndefOr[String | (js.Function1[/* date */ MomentInput, String])] = js.native
  var contentHeight: js.UndefOr[Double | auto | js.Function0[Double]] = js.native
  var customButtons: js.UndefOr[StringDictionary[CustomButtonInput]] = js.native
  var dateAlignment: js.UndefOr[String] = js.native
  var dateIncrement: js.UndefOr[DurationInput] = js.native
  var dayClick: js.UndefOr[
    js.Function4[
      /* date */ Moment, 
      /* jsEvent */ MouseEvent, 
      /* view */ default, 
      /* resourceObj */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  var dayCount: js.UndefOr[Double] = js.native
  var dayNames: js.UndefOr[js.Array[String]] = js.native
  var dayNamesShort: js.UndefOr[js.Array[String]] = js.native
  var dayPopoverFormat: js.UndefOr[String] = js.native
  var dayRender: js.UndefOr[js.Function2[/* date */ Moment, /* cell */ JQuery, Unit]] = js.native
  var defaultDate: js.UndefOr[MomentInput] = js.native
  var defaultView: js.UndefOr[String] = js.native
  var displayEventEnd: js.UndefOr[Boolean] = js.native
  var displayEventTime: js.UndefOr[Boolean] = js.native
  var dragOpacity: js.UndefOr[Double] = js.native
  var dragRevertDuration: js.UndefOr[Double] = js.native
  var dragScroll: js.UndefOr[Boolean] = js.native
  var drop: js.UndefOr[js.Function3[/* date */ Moment, /* jsEvent */ MouseEvent, /* ui */ js.Any, Unit]] = js.native
  var dropAccept: js.UndefOr[String | (js.Function1[/* draggable */ js.Any, Boolean])] = js.native
  var droppable: js.UndefOr[Boolean] = js.native
  var duration: js.UndefOr[DurationInput] = js.native
  var editable: js.UndefOr[Boolean] = js.native
  var endParam: js.UndefOr[String] = js.native
  var eventAfterAllRender: js.UndefOr[js.Function1[/* view */ default, Unit]] = js.native
  var eventAfterRender: js.UndefOr[
    js.Function3[/* event */ EventObjectInput, /* element */ JQuery, /* view */ default, Unit]
  ] = js.native
  var eventAllow: js.UndefOr[
    js.Function2[/* dropInfo */ DropInfo, /* draggedEvent */ EventObjectInput, Boolean]
  ] = js.native
  var eventBackgroundColor: js.UndefOr[String] = js.native
  var eventBorderColor: js.UndefOr[String] = js.native
  var eventClick: js.UndefOr[
    js.Function3[
      /* event */ EventObjectInput, 
      /* jsEvent */ MouseEvent, 
      /* view */ default, 
      Boolean | Unit
    ]
  ] = js.native
  var eventColor: js.UndefOr[String] = js.native
  var eventConstraint: js.UndefOr[ConstraintInput] = js.native
  var eventDataTransform: js.UndefOr[js.Function1[/* eventData */ js.Any, EventObjectInput]] = js.native
  var eventDestroy: js.UndefOr[
    js.Function3[/* event */ EventObjectInput, /* element */ JQuery, /* view */ default, Unit]
  ] = js.native
  var eventDragStart: js.UndefOr[
    js.Function4[
      /* event */ EventObjectInput, 
      /* jsEvent */ MouseEvent, 
      /* ui */ js.Any, 
      /* view */ default, 
      Unit
    ]
  ] = js.native
  var eventDragStop: js.UndefOr[
    js.Function4[
      /* event */ EventObjectInput, 
      /* jsEvent */ MouseEvent, 
      /* ui */ js.Any, 
      /* view */ default, 
      Unit
    ]
  ] = js.native
  var eventDrop: js.UndefOr[
    js.Function6[
      /* event */ EventObjectInput, 
      /* delta */ Duration_, 
      /* revertFunc */ js.Function, 
      /* jsEvent */ Event, 
      /* ui */ js.Any, 
      /* view */ default, 
      Unit
    ]
  ] = js.native
  var eventDurationEditable: js.UndefOr[Boolean] = js.native
  var eventLimit: js.UndefOr[Boolean | Double] = js.native
  var eventLimitClick: js.UndefOr[
    popover | week | day | String | (js.Function2[/* cellinfo */ CellInfo, /* jsevent */ Event, Unit])
  ] = js.native
  var eventLimitText: js.UndefOr[String | (js.Function1[/* eventCnt */ Double, String])] = js.native
  var eventLongPressDelay: js.UndefOr[Double] = js.native
  var eventMouseout: js.UndefOr[
    js.Function3[/* event */ EventObjectInput, /* jsEvent */ MouseEvent, /* view */ default, Unit]
  ] = js.native
  var eventMouseover: js.UndefOr[
    js.Function3[/* event */ EventObjectInput, /* jsEvent */ MouseEvent, /* view */ default, Unit]
  ] = js.native
  var eventOrder: js.UndefOr[
    String | (js.Array[
      (js.Function2[/* a */ EventObjectInput, /* b */ EventObjectInput, Double]) | String
    ])
  ] = js.native
  var eventOverlap: js.UndefOr[
    Boolean | (js.Function2[/* stillEvent */ EventObjectInput, /* movingEvent */ EventObjectInput, Boolean])
  ] = js.native
  var eventReceive: js.UndefOr[js.Function1[/* event */ EventObjectInput, Unit]] = js.native
  var eventRender: js.UndefOr[
    js.Function3[/* event */ EventObjectInput, /* element */ JQuery, /* view */ default, Unit]
  ] = js.native
  var eventRenderWait: js.UndefOr[Double | Null] = js.native
  var eventResize: js.UndefOr[
    js.Function6[
      /* event */ EventObjectInput, 
      /* delta */ Duration_, 
      /* revertFunc */ js.Function, 
      /* jsEvent */ Event, 
      /* ui */ js.Any, 
      /* view */ default, 
      Unit
    ]
  ] = js.native
  var eventResizeStart: js.UndefOr[
    js.Function4[
      /* event */ EventObjectInput, 
      /* jsEvent */ MouseEvent, 
      /* ui */ js.Any, 
      /* view */ default, 
      Unit
    ]
  ] = js.native
  var eventResizeStop: js.UndefOr[
    js.Function4[
      /* event */ EventObjectInput, 
      /* jsEvent */ MouseEvent, 
      /* ui */ js.Any, 
      /* view */ default, 
      Unit
    ]
  ] = js.native
  var eventSources: js.UndefOr[js.Array[EventSourceInput]] = js.native
  var eventStartEditable: js.UndefOr[Boolean] = js.native
  var eventTextColor: js.UndefOr[String] = js.native
  var events: js.UndefOr[EventSourceInput] = js.native
  var firstDay: js.UndefOr[Double] = js.native
  var fixedWeekCount: js.UndefOr[Boolean] = js.native
  var footer: js.UndefOr[Boolean | ToolbarInput] = js.native
  var handleWindowResize: js.UndefOr[Boolean] = js.native
  var header: js.UndefOr[Boolean | ToolbarInput] = js.native
  var height: js.UndefOr[Double | auto | parent | js.Function0[Double]] = js.native
  var hiddenDays: js.UndefOr[js.Array[Double]] = js.native
  var isRTL: js.UndefOr[Boolean] = js.native
  var lazyFetching: js.UndefOr[Boolean] = js.native
  var listDayAltFormat: js.UndefOr[String | Boolean] = js.native
  var listDayFormat: js.UndefOr[String | Boolean] = js.native
  var loading: js.UndefOr[js.Function2[/* isLoading */ Boolean, /* view */ default, Unit]] = js.native
  var locale: js.UndefOr[String] = js.native
  var longPressDelay: js.UndefOr[Double] = js.native
  var maxTime: js.UndefOr[DurationInput] = js.native
  var minTime: js.UndefOr[DurationInput] = js.native
  var monthNames: js.UndefOr[js.Array[String]] = js.native
  var monthNamesShort: js.UndefOr[js.Array[String]] = js.native
  var navLinkDayClick: js.UndefOr[String | (js.Function2[/* date */ Moment, /* jsEvent */ Event, Unit])] = js.native
  var navLinkWeekClick: js.UndefOr[String | (js.Function2[/* weekStart */ js.Any, /* jsEvent */ Event, Unit])] = js.native
  var navLinks: js.UndefOr[Boolean] = js.native
  var nextDayThreshold: js.UndefOr[DurationInput] = js.native
  var noEventsMessage: js.UndefOr[String] = js.native
  var now: js.UndefOr[MomentInput | js.Function0[MomentInput]] = js.native
  var nowIndicator: js.UndefOr[Boolean] = js.native
  var scrollTime: js.UndefOr[DurationInput] = js.native
  var select: js.UndefOr[
    js.Function5[
      /* start */ Moment, 
      /* end */ Moment, 
      /* jsEvent */ MouseEvent, 
      /* view */ default, 
      /* resource */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  var selectAllow: js.UndefOr[js.Function1[/* selectInfo */ SelectInfo, Boolean]] = js.native
  var selectConstraint: js.UndefOr[ConstraintInput] = js.native
  var selectHelper: js.UndefOr[Boolean] = js.native
  var selectOverlap: js.UndefOr[Boolean | (js.Function1[/* event */ EventObjectInput, Boolean])] = js.native
  var selectable: js.UndefOr[Boolean] = js.native
  var showNonCurrentDates: js.UndefOr[Boolean] = js.native
  var slotDuration: js.UndefOr[DurationInput] = js.native
  var slotEventOverlap: js.UndefOr[Boolean] = js.native
  var slotLabelFormat: js.UndefOr[String] = js.native
  var slotLabelInterval: js.UndefOr[DurationInput] = js.native
  var snapDuration: js.UndefOr[DurationInput] = js.native
  var startParam: js.UndefOr[String] = js.native
  var themeButtonIcons: js.UndefOr[Boolean | ButtonIconsInput] = js.native
  var themeSystem: js.UndefOr[standard | bootstrap3 | bootstrap4 | `jquery-ui`] = js.native
  var timeFormat: js.UndefOr[String] = js.native
  var timezone: js.UndefOr[String | Boolean] = js.native
  var titleFormat: js.UndefOr[String] = js.native
  var unselect: js.UndefOr[js.Function2[/* view */ default, /* jsEvent */ Event, Unit]] = js.native
  var unselectAuto: js.UndefOr[Boolean] = js.native
  var unselectCancel: js.UndefOr[String] = js.native
  var validRange: js.UndefOr[RangeInput] = js.native
  var viewDestroy: js.UndefOr[js.Function2[/* view */ default, /* element */ JQuery, Unit]] = js.native
  var viewRender: js.UndefOr[js.Function2[/* view */ default, /* element */ JQuery, Unit]] = js.native
  var visibleRange: js.UndefOr[(js.Function1[/* currentDate */ Moment, RangeInput]) | RangeInput] = js.native
  var weekNumberCalculation: js.UndefOr[local | ISO | (js.Function1[/* m */ Moment, Double])] = js.native
  var weekNumberTitle: js.UndefOr[String] = js.native
  var weekNumbers: js.UndefOr[Boolean] = js.native
  var weekNumbersWithinDays: js.UndefOr[Boolean] = js.native
  var weekends: js.UndefOr[Boolean] = js.native
  var windowResize: js.UndefOr[js.Function1[/* view */ default, Unit]] = js.native
  var windowResizeDelay: js.UndefOr[Double] = js.native
}

object OptionsInputBase {
  @scala.inline
  def apply(): OptionsInputBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsInputBase]
  }
  @scala.inline
  implicit class OptionsInputBaseOps[Self <: OptionsInputBase] (val x: Self) extends AnyVal {
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
    def withBootstrapFontAwesome(value: Boolean | ButtonIconsInput): Self = {
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
    def withBootstrapGlyphicons(value: Boolean | ButtonIconsInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrapGlyphicons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBootstrapGlyphicons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrapGlyphicons")(js.undefined)
        ret
    }
    @scala.inline
    def withBusinessHours(value: Boolean | BusinessHoursInput | js.Array[BusinessHoursInput]): Self = {
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
    def withButtonIcons(value: Boolean | ButtonIconsInput): Self = {
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
    def withColumnHeaderFormat(value: String): Self = {
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
    def withColumnHeaderHtmlFunction1(value: /* date */ MomentInput => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderHtml")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColumnHeaderHtml(value: String | (js.Function1[/* date */ MomentInput, String])): Self = {
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
    def withColumnHeaderTextFunction1(value: /* date */ MomentInput => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaderText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColumnHeaderText(value: String | (js.Function1[/* date */ MomentInput, String])): Self = {
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
    def withCustomButtons(value: StringDictionary[CustomButtonInput]): Self = {
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
    def withDayClick(
      value: (/* date */ Moment, /* jsEvent */ MouseEvent, /* view */ default, /* resourceObj */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayClick")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutDayClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayClick")(js.undefined)
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
    def withDayNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayNames")(js.undefined)
        ret
    }
    @scala.inline
    def withDayNamesShort(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayNamesShort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayNamesShort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayNamesShort")(js.undefined)
        ret
    }
    @scala.inline
    def withDayPopoverFormat(value: String): Self = {
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
    def withDayRender(value: (/* date */ Moment, /* cell */ JQuery) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDayRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayRender")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultDate(value: MomentInput): Self = {
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
    def withDragOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragOpacity")(js.undefined)
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
    def withDrop(value: (/* date */ Moment, /* jsEvent */ MouseEvent, /* ui */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.undefined)
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
    def withEventAfterAllRender(value: /* view */ default => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventAfterAllRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEventAfterAllRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventAfterAllRender")(js.undefined)
        ret
    }
    @scala.inline
    def withEventAfterRender(value: (/* event */ EventObjectInput, /* element */ JQuery, /* view */ default) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventAfterRender")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutEventAfterRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventAfterRender")(js.undefined)
        ret
    }
    @scala.inline
    def withEventAllow(value: (/* dropInfo */ DropInfo, /* draggedEvent */ EventObjectInput) => Boolean): Self = {
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
    def withEventClick(
      value: (/* event */ EventObjectInput, /* jsEvent */ MouseEvent, /* view */ default) => Boolean | Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventClick")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutEventClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventClick")(js.undefined)
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
    def withEventConstraint(value: ConstraintInput): Self = {
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
    def withEventDataTransform(value: /* eventData */ js.Any => EventObjectInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDataTransform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEventDataTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDataTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withEventDestroy(value: (/* event */ EventObjectInput, /* element */ JQuery, /* view */ default) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDestroy")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutEventDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withEventDragStart(
      value: (/* event */ EventObjectInput, /* jsEvent */ MouseEvent, /* ui */ js.Any, /* view */ default) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDragStart")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutEventDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withEventDragStop(
      value: (/* event */ EventObjectInput, /* jsEvent */ MouseEvent, /* ui */ js.Any, /* view */ default) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDragStop")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutEventDragStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDragStop")(js.undefined)
        ret
    }
    @scala.inline
    def withEventDrop(
      value: (/* event */ EventObjectInput, /* delta */ Duration_, /* revertFunc */ js.Function, /* jsEvent */ Event, /* ui */ js.Any, /* view */ default) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDrop")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutEventDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDrop")(js.undefined)
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
    def withEventLimitClickFunction2(value: (/* cellinfo */ CellInfo, /* jsevent */ Event) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventLimitClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEventLimitClick(
      value: popover | week | day | String | (js.Function2[/* cellinfo */ CellInfo, /* jsevent */ Event, Unit])
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
    def withEventMouseout(value: (/* event */ EventObjectInput, /* jsEvent */ MouseEvent, /* view */ default) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventMouseout")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutEventMouseout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventMouseout")(js.undefined)
        ret
    }
    @scala.inline
    def withEventMouseover(value: (/* event */ EventObjectInput, /* jsEvent */ MouseEvent, /* view */ default) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventMouseover")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutEventMouseover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventMouseover")(js.undefined)
        ret
    }
    @scala.inline
    def withEventOrder(
      value: String | (js.Array[
          (js.Function2[/* a */ EventObjectInput, /* b */ EventObjectInput, Double]) | String
        ])
    ): Self = {
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
    def withEventOverlapFunction2(value: (/* stillEvent */ EventObjectInput, /* movingEvent */ EventObjectInput) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventOverlap")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEventOverlap(
      value: Boolean | (js.Function2[/* stillEvent */ EventObjectInput, /* movingEvent */ EventObjectInput, Boolean])
    ): Self = {
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
    def withEventReceive(value: /* event */ EventObjectInput => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventReceive")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEventReceive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventReceive")(js.undefined)
        ret
    }
    @scala.inline
    def withEventRender(value: (/* event */ EventObjectInput, /* element */ JQuery, /* view */ default) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventRender")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutEventRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventRender")(js.undefined)
        ret
    }
    @scala.inline
    def withEventRenderWait(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventRenderWait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventRenderWait: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventRenderWait")(js.undefined)
        ret
    }
    @scala.inline
    def withEventRenderWaitNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventRenderWait")(null)
        ret
    }
    @scala.inline
    def withEventResize(
      value: (/* event */ EventObjectInput, /* delta */ Duration_, /* revertFunc */ js.Function, /* jsEvent */ Event, /* ui */ js.Any, /* view */ default) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventResize")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutEventResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventResize")(js.undefined)
        ret
    }
    @scala.inline
    def withEventResizeStart(
      value: (/* event */ EventObjectInput, /* jsEvent */ MouseEvent, /* ui */ js.Any, /* view */ default) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventResizeStart")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutEventResizeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventResizeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withEventResizeStop(
      value: (/* event */ EventObjectInput, /* jsEvent */ MouseEvent, /* ui */ js.Any, /* view */ default) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventResizeStop")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutEventResizeStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventResizeStop")(js.undefined)
        ret
    }
    @scala.inline
    def withEventSources(value: js.Array[EventSourceInput]): Self = {
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
    def withEventsFunction4(
      value: (/* start */ Moment, /* end */ Moment, /* timezone */ String, /* callback */ js.Function1[/* events */ js.Array[EventObjectInput], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withEvents(value: EventSourceInput): Self = {
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
    def withFooter(value: Boolean | ToolbarInput): Self = {
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
    def withHeader(value: Boolean | ToolbarInput): Self = {
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
    def withIsRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRTL")(js.undefined)
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
    def withListDayAltFormat(value: String | Boolean): Self = {
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
    def withListDayFormat(value: String | Boolean): Self = {
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
    def withLoading(value: (/* isLoading */ Boolean, /* view */ default) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
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
    def withMonthNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthNames")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthNamesShort(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthNamesShort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthNamesShort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthNamesShort")(js.undefined)
        ret
    }
    @scala.inline
    def withNavLinkDayClickFunction2(value: (/* date */ Moment, /* jsEvent */ Event) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navLinkDayClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNavLinkDayClick(value: String | (js.Function2[/* date */ Moment, /* jsEvent */ Event, Unit])): Self = {
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
    def withNowFunction0(value: () => MomentInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("now")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNow(value: MomentInput | js.Function0[MomentInput]): Self = {
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
    def withSelect(
      value: (/* start */ Moment, /* end */ Moment, /* jsEvent */ MouseEvent, /* view */ default, /* resource */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAllow(value: /* selectInfo */ SelectInfo => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelectAllow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllow")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectConstraint(value: ConstraintInput): Self = {
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
    def withSelectHelper(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectHelper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectHelper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectHelper")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectOverlapFunction1(value: /* event */ EventObjectInput => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOverlap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectOverlap(value: Boolean | (js.Function1[/* event */ EventObjectInput, Boolean])): Self = {
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
    def withSlotLabelFormat(value: String): Self = {
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
    def withThemeButtonIcons(value: Boolean | ButtonIconsInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeButtonIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThemeButtonIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("themeButtonIcons")(js.undefined)
        ret
    }
    @scala.inline
    def withThemeSystem(value: standard | bootstrap3 | bootstrap4 | `jquery-ui`): Self = {
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
    def withTimeFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezone(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleFormat(value: String): Self = {
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
    def withUnselect(value: (/* view */ default, /* jsEvent */ Event) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUnselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselect")(js.undefined)
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
    def withValidRange(value: RangeInput): Self = {
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
    def withViewDestroy(value: (/* view */ default, /* element */ JQuery) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewDestroy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutViewDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withViewRender(value: (/* view */ default, /* element */ JQuery) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutViewRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewRender")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleRangeFunction1(value: /* currentDate */ Moment => RangeInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVisibleRange(value: (js.Function1[/* currentDate */ Moment, RangeInput]) | RangeInput): Self = {
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
    def withWeekNumberCalculationFunction1(value: /* m */ Moment => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekNumberCalculation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWeekNumberCalculation(value: local | ISO | (js.Function1[/* m */ Moment, Double])): Self = {
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
    def withWeekNumberTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekNumberTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekNumberTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekNumberTitle")(js.undefined)
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
    def withWindowResize(value: /* view */ default => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowResize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWindowResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowResize")(js.undefined)
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

