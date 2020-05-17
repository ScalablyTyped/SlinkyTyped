package typingsSlinky.reactBigCalendar.mod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.Props
import typingsSlinky.reactBigCalendar.anon.Action
import typingsSlinky.reactBigCalendar.anon.Start
import typingsSlinky.reactBigCalendar.anon.X
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.ignoreEvents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarProps[TEvent /* <: js.Object */, TResource /* <: js.Object */] extends Props[Calendar[TEvent, TResource]] {
  var allDayAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Boolean])] = js.native
  var className: js.UndefOr[String] = js.native
  var components: js.UndefOr[Components_[TEvent]] = js.native
  var culture: js.UndefOr[String] = js.native
  var date: js.UndefOr[stringOrDate] = js.native
  var dayLayoutAlgorithm: js.UndefOr[DayLayoutAlgorithm] = js.native
  var dayPropGetter: js.UndefOr[DayPropGetter] = js.native
  var defaultDate: js.UndefOr[js.Date] = js.native
  var defaultView: js.UndefOr[View] = js.native
  var drilldownView: js.UndefOr[View | Null] = js.native
  var elementProps: js.UndefOr[HTMLAttributes[HTMLElement]] = js.native
  var endAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, js.Date])] = js.native
  var eventPropGetter: js.UndefOr[EventPropGetter[TEvent]] = js.native
  var events: js.UndefOr[js.Array[TEvent]] = js.native
  var formats: js.UndefOr[Formats] = js.native
  var getDrilldownView: js.UndefOr[
    (js.Function3[
      /* targetDate */ js.Date, 
      /* currentViewName */ View, 
      /* configuredViewNames */ js.Array[View], 
      Unit
    ]) | Null
  ] = js.native
  var getNow: js.UndefOr[js.Function0[js.Date]] = js.native
  var length: js.UndefOr[Double] = js.native
  var localizer: DateLocalizer = js.native
  var longPressThreshold: js.UndefOr[Double] = js.native
  var max: js.UndefOr[stringOrDate] = js.native
  var messages: js.UndefOr[Messages] = js.native
  var min: js.UndefOr[stringOrDate] = js.native
  var onDoubleClickEvent: js.UndefOr[
    js.Function2[
      /* event */ TEvent, 
      /* e */ SyntheticEvent[org.scalajs.dom.raw.Event, HTMLElement], 
      Unit
    ]
  ] = js.native
  var onDrillDown: js.UndefOr[js.Function2[/* date */ js.Date, /* view */ View, Unit]] = js.native
  var onNavigate: js.UndefOr[
    js.Function3[/* newDate */ js.Date, /* view */ View, /* action */ NavigateAction, Unit]
  ] = js.native
  var onRangeChange: js.UndefOr[js.Function1[/* range */ js.Array[js.Date] | Start, Unit]] = js.native
  var onSelectEvent: js.UndefOr[
    js.Function2[
      /* event */ TEvent, 
      /* e */ SyntheticEvent[org.scalajs.dom.raw.Event, HTMLElement], 
      Unit
    ]
  ] = js.native
  var onSelectSlot: js.UndefOr[js.Function1[/* slotInfo */ Action, Unit]] = js.native
  var onSelecting: js.UndefOr[js.Function1[/* range */ Start, js.UndefOr[Boolean | Null]]] = js.native
  var onShowMore: js.UndefOr[js.Function2[/* events */ js.Array[TEvent], /* date */ js.Date, Unit]] = js.native
  var onView: js.UndefOr[js.Function1[/* view */ View, Unit]] = js.native
  var popup: js.UndefOr[Boolean] = js.native
  var popupOffset: js.UndefOr[Double | X] = js.native
  var resourceAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, _])] = js.native
  var resourceIdAccessor: js.UndefOr[(/* keyof TResource */ String) | (js.Function1[/* resource */ TResource, _])] = js.native
  var resourceTitleAccessor: js.UndefOr[(/* keyof TResource */ String) | (js.Function1[/* resource */ TResource, _])] = js.native
  var resources: js.UndefOr[js.Array[TResource]] = js.native
  var rtl: js.UndefOr[Boolean] = js.native
  var scrollToTime: js.UndefOr[js.Date] = js.native
  var selectable: js.UndefOr[Boolean | ignoreEvents] = js.native
  var selected: js.UndefOr[js.Any] = js.native
  var showMultiDayTimes: js.UndefOr[Boolean] = js.native
  var slotGroupPropGetter: js.UndefOr[SlotGroupPropGetter] = js.native
  var slotPropGetter: js.UndefOr[SlotPropGetter] = js.native
  var startAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, js.Date])] = js.native
  var step: js.UndefOr[Double] = js.native
  var timeslots: js.UndefOr[Double] = js.native
  var titleAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, String])] = js.native
  var toolbar: js.UndefOr[Boolean] = js.native
  var tooltipAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, String])] = js.native
  var view: js.UndefOr[View] = js.native
  var views: js.UndefOr[ViewsProps] = js.native
}

object CalendarProps {
  @scala.inline
  def apply[TEvent, TResource](localizer: DateLocalizer): CalendarProps[TEvent, TResource] = {
    val __obj = js.Dynamic.literal(localizer = localizer.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarProps[TEvent, TResource]]
  }
  @scala.inline
  implicit class CalendarPropsOps[Self[tevent, tresource] <: CalendarProps[tevent, tresource], TEvent, TResource] (val x: Self[TEvent, TResource]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEvent, TResource] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEvent, TResource]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TEvent, TResource]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TEvent, TResource]) with Other]
    @scala.inline
    def withLocalizer(value: DateLocalizer): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllDayAccessorFunction1(value: /* event */ TEvent => Boolean): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDayAccessor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAllDayAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Boolean])): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDayAccessor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllDayAccessor: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDayAccessor")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withComponents(value: Components_[TEvent]): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponents: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(js.undefined)
        ret
    }
    @scala.inline
    def withCulture(value: String): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("culture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCulture: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("culture")(js.undefined)
        ret
    }
    @scala.inline
    def withDateDate(value: js.Date): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: stringOrDate): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withDayLayoutAlgorithm(value: DayLayoutAlgorithm): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayLayoutAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayLayoutAlgorithm: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayLayoutAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withDayPropGetter(
      value: (/* date */ js.Date, /* resourceId */ js.UndefOr[Double | String]) => HTMLAttributes[HTMLDivElement]
    ): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayPropGetter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDayPropGetter: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayPropGetter")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDate(value: js.Date): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDate: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultView(value: View): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultView: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultView")(js.undefined)
        ret
    }
    @scala.inline
    def withDrilldownView(value: View): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drilldownView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrilldownView: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drilldownView")(js.undefined)
        ret
    }
    @scala.inline
    def withDrilldownViewNull: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drilldownView")(null)
        ret
    }
    @scala.inline
    def withElementProps(value: HTMLAttributes[HTMLElement]): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementProps: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementProps")(js.undefined)
        ret
    }
    @scala.inline
    def withEndAccessorFunction1(value: /* event */ TEvent => js.Date): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAccessor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEndAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, js.Date])): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAccessor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndAccessor: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAccessor")(js.undefined)
        ret
    }
    @scala.inline
    def withEventPropGetter(
      value: (TEvent, /* start */ stringOrDate, /* end */ stringOrDate, /* isSelected */ Boolean) => HTMLAttributes[HTMLDivElement]
    ): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventPropGetter")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutEventPropGetter: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventPropGetter")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: js.Array[TEvent]): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withFormats(value: Formats): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormats: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDrilldownView(
      value: (/* targetDate */ js.Date, /* currentViewName */ View, /* configuredViewNames */ js.Array[View]) => Unit
    ): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDrilldownView")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGetDrilldownView: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDrilldownView")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDrilldownViewNull: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDrilldownView")(null)
        ret
    }
    @scala.inline
    def withGetNow(value: () => js.Date): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetNow: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNow")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: Double): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withLongPressThreshold(value: Double): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longPressThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongPressThreshold: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longPressThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDate(value: js.Date): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: stringOrDate): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMessages(value: Messages): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDate(value: js.Date): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: stringOrDate): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDoubleClickEvent(
      value: (/* event */ TEvent, /* e */ SyntheticEvent[org.scalajs.dom.raw.Event, HTMLElement]) => Unit
    ): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClickEvent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDoubleClickEvent: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDoubleClickEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrillDown(value: (/* date */ js.Date, /* view */ View) => Unit): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrillDown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDrillDown: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrillDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNavigate(value: (/* newDate */ js.Date, /* view */ View, /* action */ NavigateAction) => Unit): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNavigate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnNavigate: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNavigate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRangeChange(value: /* range */ js.Array[js.Date] | Start => Unit): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRangeChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRangeChange: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRangeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectEvent(
      value: (/* event */ TEvent, /* e */ SyntheticEvent[org.scalajs.dom.raw.Event, HTMLElement]) => Unit
    ): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectEvent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSelectEvent: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectSlot(value: /* slotInfo */ Action => Unit): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectSlot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectSlot: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectSlot")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelecting(value: /* range */ Start => js.UndefOr[Boolean | Null]): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelecting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelecting: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelecting")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShowMore(value: (/* events */ js.Array[TEvent], /* date */ js.Date) => Unit): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowMore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnShowMore: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowMore")(js.undefined)
        ret
    }
    @scala.inline
    def withOnView(value: /* view */ View => Unit): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnView: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onView")(js.undefined)
        ret
    }
    @scala.inline
    def withPopup(value: Boolean): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopup: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupOffset(value: Double | X): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupOffset: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceAccessorFunction1(value: /* event */ TEvent => _): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceAccessor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResourceAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, _])): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceAccessor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceAccessor: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceAccessor")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceIdAccessorFunction1(value: /* resource */ TResource => _): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceIdAccessor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResourceIdAccessor(value: (/* keyof TResource */ String) | (js.Function1[/* resource */ TResource, _])): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceIdAccessor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceIdAccessor: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceIdAccessor")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceTitleAccessorFunction1(value: /* resource */ TResource => _): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceTitleAccessor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResourceTitleAccessor(value: (/* keyof TResource */ String) | (js.Function1[/* resource */ TResource, _])): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceTitleAccessor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceTitleAccessor: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceTitleAccessor")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: js.Array[TResource]): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(js.undefined)
        ret
    }
    @scala.inline
    def withRtl(value: Boolean): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtl: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollToTime(value: js.Date): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollToTime: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectable(value: Boolean | ignoreEvents): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectable: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: js.Any): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMultiDayTimes(value: Boolean): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMultiDayTimes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMultiDayTimes: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMultiDayTimes")(js.undefined)
        ret
    }
    @scala.inline
    def withSlotGroupPropGetter(value: () => HTMLAttributes[HTMLDivElement]): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotGroupPropGetter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSlotGroupPropGetter: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotGroupPropGetter")(js.undefined)
        ret
    }
    @scala.inline
    def withSlotPropGetter(
      value: (/* date */ js.Date, /* resourceId */ js.UndefOr[Double | String]) => HTMLAttributes[HTMLDivElement]
    ): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotPropGetter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSlotPropGetter: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slotPropGetter")(js.undefined)
        ret
    }
    @scala.inline
    def withStartAccessorFunction1(value: /* event */ TEvent => js.Date): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAccessor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, js.Date])): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAccessor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartAccessor: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAccessor")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Double): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeslots(value: Double): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeslots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeslots: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeslots")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleAccessorFunction1(value: /* event */ TEvent => String): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAccessor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTitleAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, String])): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAccessor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleAccessor: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAccessor")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar(value: Boolean): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipAccessorFunction1(value: /* event */ TEvent => String): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipAccessor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTooltipAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, String])): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipAccessor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipAccessor: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipAccessor")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: View): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
    @scala.inline
    def withViews(value: ViewsProps): Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViews: Self[TEvent, TResource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(js.undefined)
        ret
    }
  }
  
}

