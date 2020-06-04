package typingsSlinky.reactBigCalendar.mod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.Props
import typingsSlinky.reactBigCalendar.anon.Accessors
import typingsSlinky.reactBigCalendar.anon.Action
import typingsSlinky.reactBigCalendar.anon.Start
import typingsSlinky.reactBigCalendar.anon.X
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.ignoreEvents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarProps[TEvent /* <: js.Object */, TResource /* <: js.Object */] extends Props[Calendar[TEvent, TResource]] {
  var allDayAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Boolean])] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var components: js.UndefOr[Components_[TEvent]] = js.undefined
  var culture: js.UndefOr[String] = js.undefined
  var date: js.UndefOr[stringOrDate] = js.undefined
  var dayLayoutAlgorithm: js.UndefOr[DayLayoutAlgorithm | DayLayoutFunction[TEvent]] = js.undefined
  var dayPropGetter: js.UndefOr[DayPropGetter] = js.undefined
  var defaultDate: js.UndefOr[js.Date] = js.undefined
  var defaultView: js.UndefOr[View] = js.undefined
  var drilldownView: js.UndefOr[View | Null] = js.undefined
  var elementProps: js.UndefOr[HTMLAttributes[HTMLElement]] = js.undefined
  var endAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, js.Date])] = js.undefined
  var eventPropGetter: js.UndefOr[EventPropGetter[TEvent]] = js.undefined
  var events: js.UndefOr[js.Array[TEvent]] = js.undefined
  var formats: js.UndefOr[Formats] = js.undefined
  var getDrilldownView: js.UndefOr[
    (js.Function3[
      /* targetDate */ js.Date, 
      /* currentViewName */ View, 
      /* configuredViewNames */ js.Array[View], 
      Unit
    ]) | Null
  ] = js.undefined
  var getNow: js.UndefOr[js.Function0[js.Date]] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var localizer: DateLocalizer
  var longPressThreshold: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[stringOrDate] = js.undefined
  var messages: js.UndefOr[Messages] = js.undefined
  var min: js.UndefOr[stringOrDate] = js.undefined
  var onDoubleClickEvent: js.UndefOr[
    js.Function2[
      /* event */ TEvent, 
      /* e */ SyntheticEvent[org.scalajs.dom.raw.Event, HTMLElement], 
      Unit
    ]
  ] = js.undefined
  var onDrillDown: js.UndefOr[js.Function2[/* date */ js.Date, /* view */ View, Unit]] = js.undefined
  var onNavigate: js.UndefOr[
    js.Function3[/* newDate */ js.Date, /* view */ View, /* action */ NavigateAction, Unit]
  ] = js.undefined
  var onRangeChange: js.UndefOr[js.Function1[/* range */ js.Array[js.Date] | Start, Unit]] = js.undefined
  var onSelectEvent: js.UndefOr[
    js.Function2[
      /* event */ TEvent, 
      /* e */ SyntheticEvent[org.scalajs.dom.raw.Event, HTMLElement], 
      Unit
    ]
  ] = js.undefined
  var onSelectSlot: js.UndefOr[js.Function1[/* slotInfo */ Action, Unit]] = js.undefined
  var onSelecting: js.UndefOr[js.Function1[/* range */ Start, js.UndefOr[Boolean | Null]]] = js.undefined
  var onShowMore: js.UndefOr[js.Function2[/* events */ js.Array[TEvent], /* date */ js.Date, Unit]] = js.undefined
  var onView: js.UndefOr[js.Function1[/* view */ View, Unit]] = js.undefined
  var popup: js.UndefOr[Boolean] = js.undefined
  var popupOffset: js.UndefOr[Double | X] = js.undefined
  var resourceAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, _])] = js.undefined
  var resourceIdAccessor: js.UndefOr[(/* keyof TResource */ String) | (js.Function1[/* resource */ TResource, _])] = js.undefined
  var resourceTitleAccessor: js.UndefOr[(/* keyof TResource */ String) | (js.Function1[/* resource */ TResource, _])] = js.undefined
  var resources: js.UndefOr[js.Array[TResource]] = js.undefined
  var rtl: js.UndefOr[Boolean] = js.undefined
  var scrollToTime: js.UndefOr[js.Date] = js.undefined
  var selectable: js.UndefOr[Boolean | ignoreEvents] = js.undefined
  var selected: js.UndefOr[js.Any] = js.undefined
  var showMultiDayTimes: js.UndefOr[Boolean] = js.undefined
  var slotGroupPropGetter: js.UndefOr[SlotGroupPropGetter] = js.undefined
  var slotPropGetter: js.UndefOr[SlotPropGetter] = js.undefined
  var startAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, js.Date])] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var timeslots: js.UndefOr[Double] = js.undefined
  var titleAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, String])] = js.undefined
  var toolbar: js.UndefOr[Boolean] = js.undefined
  var tooltipAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, String])] = js.undefined
  var view: js.UndefOr[View] = js.undefined
  var views: js.UndefOr[ViewsProps] = js.undefined
}

object CalendarProps {
  @scala.inline
  def apply[/* <: js.Object */ TEvent, /* <: js.Object */ TResource](localizer: DateLocalizer): CalendarProps[TEvent, TResource] = {
    val __obj = js.Dynamic.literal(localizer = localizer.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarProps[TEvent, TResource]]
  }
  @scala.inline
  implicit class CalendarPropsOps[Self <: CalendarProps[_, _], /* <: js.Object */ TEvent, /* <: js.Object */ TResource] (val x: Self with (CalendarProps[TEvent, TResource])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLocalizer(value: DateLocalizer): Self = this.set("localizer", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllDayAccessorFunction1(value: /* event */ TEvent => Boolean): Self = this.set("allDayAccessor", js.Any.fromFunction1(value))
    @scala.inline
    def setAllDayAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Boolean])): Self = this.set("allDayAccessor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllDayAccessor: Self = this.set("allDayAccessor", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setComponents(value: Components_[TEvent]): Self = this.set("components", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    @scala.inline
    def setCulture(value: String): Self = this.set("culture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCulture: Self = this.set("culture", js.undefined)
    @scala.inline
    def setDateDate(value: js.Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: stringOrDate): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDayLayoutAlgorithmFunction1(value: /* _ */ Accessors[TEvent] => js.Array[typingsSlinky.reactBigCalendar.anon.Event[TEvent]]): Self = this.set("dayLayoutAlgorithm", js.Any.fromFunction1(value))
    @scala.inline
    def setDayLayoutAlgorithm(value: DayLayoutAlgorithm | DayLayoutFunction[TEvent]): Self = this.set("dayLayoutAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayLayoutAlgorithm: Self = this.set("dayLayoutAlgorithm", js.undefined)
    @scala.inline
    def setDayPropGetter(
      value: (/* date */ js.Date, /* resourceId */ js.UndefOr[Double | String]) => HTMLAttributes[HTMLDivElement]
    ): Self = this.set("dayPropGetter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDayPropGetter: Self = this.set("dayPropGetter", js.undefined)
    @scala.inline
    def setDefaultDate(value: js.Date): Self = this.set("defaultDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultDate: Self = this.set("defaultDate", js.undefined)
    @scala.inline
    def setDefaultView(value: View): Self = this.set("defaultView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultView: Self = this.set("defaultView", js.undefined)
    @scala.inline
    def setDrilldownView(value: View): Self = this.set("drilldownView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrilldownView: Self = this.set("drilldownView", js.undefined)
    @scala.inline
    def setDrilldownViewNull: Self = this.set("drilldownView", null)
    @scala.inline
    def setElementProps(value: HTMLAttributes[HTMLElement]): Self = this.set("elementProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementProps: Self = this.set("elementProps", js.undefined)
    @scala.inline
    def setEndAccessorFunction1(value: /* event */ TEvent => js.Date): Self = this.set("endAccessor", js.Any.fromFunction1(value))
    @scala.inline
    def setEndAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, js.Date])): Self = this.set("endAccessor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndAccessor: Self = this.set("endAccessor", js.undefined)
    @scala.inline
    def setEventPropGetter(
      value: (TEvent, /* start */ stringOrDate, /* end */ stringOrDate, /* isSelected */ Boolean) => HTMLAttributes[HTMLDivElement]
    ): Self = this.set("eventPropGetter", js.Any.fromFunction4(value))
    @scala.inline
    def deleteEventPropGetter: Self = this.set("eventPropGetter", js.undefined)
    @scala.inline
    def setEvents(value: js.Array[TEvent]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setFormats(value: Formats): Self = this.set("formats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormats: Self = this.set("formats", js.undefined)
    @scala.inline
    def setGetDrilldownView(
      value: (/* targetDate */ js.Date, /* currentViewName */ View, /* configuredViewNames */ js.Array[View]) => Unit
    ): Self = this.set("getDrilldownView", js.Any.fromFunction3(value))
    @scala.inline
    def deleteGetDrilldownView: Self = this.set("getDrilldownView", js.undefined)
    @scala.inline
    def setGetDrilldownViewNull: Self = this.set("getDrilldownView", null)
    @scala.inline
    def setGetNow(value: () => js.Date): Self = this.set("getNow", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetNow: Self = this.set("getNow", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setLongPressThreshold(value: Double): Self = this.set("longPressThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongPressThreshold: Self = this.set("longPressThreshold", js.undefined)
    @scala.inline
    def setMaxDate(value: js.Date): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: stringOrDate): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMessages(value: Messages): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setMinDate(value: js.Date): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: stringOrDate): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setOnDoubleClickEvent(
      value: (/* event */ TEvent, /* e */ SyntheticEvent[org.scalajs.dom.raw.Event, HTMLElement]) => Unit
    ): Self = this.set("onDoubleClickEvent", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnDoubleClickEvent: Self = this.set("onDoubleClickEvent", js.undefined)
    @scala.inline
    def setOnDrillDown(value: (/* date */ js.Date, /* view */ View) => Unit): Self = this.set("onDrillDown", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnDrillDown: Self = this.set("onDrillDown", js.undefined)
    @scala.inline
    def setOnNavigate(value: (/* newDate */ js.Date, /* view */ View, /* action */ NavigateAction) => Unit): Self = this.set("onNavigate", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnNavigate: Self = this.set("onNavigate", js.undefined)
    @scala.inline
    def setOnRangeChange(value: /* range */ js.Array[js.Date] | Start => Unit): Self = this.set("onRangeChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRangeChange: Self = this.set("onRangeChange", js.undefined)
    @scala.inline
    def setOnSelectEvent(
      value: (/* event */ TEvent, /* e */ SyntheticEvent[org.scalajs.dom.raw.Event, HTMLElement]) => Unit
    ): Self = this.set("onSelectEvent", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSelectEvent: Self = this.set("onSelectEvent", js.undefined)
    @scala.inline
    def setOnSelectSlot(value: /* slotInfo */ Action => Unit): Self = this.set("onSelectSlot", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelectSlot: Self = this.set("onSelectSlot", js.undefined)
    @scala.inline
    def setOnSelecting(value: /* range */ Start => js.UndefOr[Boolean | Null]): Self = this.set("onSelecting", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelecting: Self = this.set("onSelecting", js.undefined)
    @scala.inline
    def setOnShowMore(value: (/* events */ js.Array[TEvent], /* date */ js.Date) => Unit): Self = this.set("onShowMore", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnShowMore: Self = this.set("onShowMore", js.undefined)
    @scala.inline
    def setOnView(value: /* view */ View => Unit): Self = this.set("onView", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnView: Self = this.set("onView", js.undefined)
    @scala.inline
    def setPopup(value: Boolean): Self = this.set("popup", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopup: Self = this.set("popup", js.undefined)
    @scala.inline
    def setPopupOffset(value: Double | X): Self = this.set("popupOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupOffset: Self = this.set("popupOffset", js.undefined)
    @scala.inline
    def setResourceAccessorFunction1(value: /* event */ TEvent => _): Self = this.set("resourceAccessor", js.Any.fromFunction1(value))
    @scala.inline
    def setResourceAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, _])): Self = this.set("resourceAccessor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceAccessor: Self = this.set("resourceAccessor", js.undefined)
    @scala.inline
    def setResourceIdAccessorFunction1(value: /* resource */ TResource => _): Self = this.set("resourceIdAccessor", js.Any.fromFunction1(value))
    @scala.inline
    def setResourceIdAccessor(value: (/* keyof TResource */ String) | (js.Function1[/* resource */ TResource, _])): Self = this.set("resourceIdAccessor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceIdAccessor: Self = this.set("resourceIdAccessor", js.undefined)
    @scala.inline
    def setResourceTitleAccessorFunction1(value: /* resource */ TResource => _): Self = this.set("resourceTitleAccessor", js.Any.fromFunction1(value))
    @scala.inline
    def setResourceTitleAccessor(value: (/* keyof TResource */ String) | (js.Function1[/* resource */ TResource, _])): Self = this.set("resourceTitleAccessor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceTitleAccessor: Self = this.set("resourceTitleAccessor", js.undefined)
    @scala.inline
    def setResources(value: js.Array[TResource]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    @scala.inline
    def setScrollToTime(value: js.Date): Self = this.set("scrollToTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollToTime: Self = this.set("scrollToTime", js.undefined)
    @scala.inline
    def setSelectable(value: Boolean | ignoreEvents): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    @scala.inline
    def setSelected(value: js.Any): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setShowMultiDayTimes(value: Boolean): Self = this.set("showMultiDayTimes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMultiDayTimes: Self = this.set("showMultiDayTimes", js.undefined)
    @scala.inline
    def setSlotGroupPropGetter(value: () => HTMLAttributes[HTMLDivElement]): Self = this.set("slotGroupPropGetter", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSlotGroupPropGetter: Self = this.set("slotGroupPropGetter", js.undefined)
    @scala.inline
    def setSlotPropGetter(
      value: (/* date */ js.Date, /* resourceId */ js.UndefOr[Double | String]) => HTMLAttributes[HTMLDivElement]
    ): Self = this.set("slotPropGetter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSlotPropGetter: Self = this.set("slotPropGetter", js.undefined)
    @scala.inline
    def setStartAccessorFunction1(value: /* event */ TEvent => js.Date): Self = this.set("startAccessor", js.Any.fromFunction1(value))
    @scala.inline
    def setStartAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, js.Date])): Self = this.set("startAccessor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartAccessor: Self = this.set("startAccessor", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setTimeslots(value: Double): Self = this.set("timeslots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeslots: Self = this.set("timeslots", js.undefined)
    @scala.inline
    def setTitleAccessorFunction1(value: /* event */ TEvent => String): Self = this.set("titleAccessor", js.Any.fromFunction1(value))
    @scala.inline
    def setTitleAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, String])): Self = this.set("titleAccessor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleAccessor: Self = this.set("titleAccessor", js.undefined)
    @scala.inline
    def setToolbar(value: Boolean): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    @scala.inline
    def setTooltipAccessorFunction1(value: /* event */ TEvent => String): Self = this.set("tooltipAccessor", js.Any.fromFunction1(value))
    @scala.inline
    def setTooltipAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, String])): Self = this.set("tooltipAccessor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipAccessor: Self = this.set("tooltipAccessor", js.undefined)
    @scala.inline
    def setView(value: View): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    @scala.inline
    def setViews(value: ViewsProps): Self = this.set("views", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
  }
  
}

