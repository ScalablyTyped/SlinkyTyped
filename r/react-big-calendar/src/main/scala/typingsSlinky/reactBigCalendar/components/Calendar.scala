package typingsSlinky.reactBigCalendar.components

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.reactBigCalendar.AnonAction
import typingsSlinky.reactBigCalendar.AnonStart
import typingsSlinky.reactBigCalendar.AnonX
import typingsSlinky.reactBigCalendar.mod.CalendarProps
import typingsSlinky.reactBigCalendar.mod.Components_
import typingsSlinky.reactBigCalendar.mod.DateLocalizer
import typingsSlinky.reactBigCalendar.mod.DayLayoutAlgorithm
import typingsSlinky.reactBigCalendar.mod.Formats
import typingsSlinky.reactBigCalendar.mod.Messages
import typingsSlinky.reactBigCalendar.mod.NavigateAction
import typingsSlinky.reactBigCalendar.mod.View
import typingsSlinky.reactBigCalendar.mod.ViewsProps
import typingsSlinky.reactBigCalendar.mod.stringOrDate
import typingsSlinky.reactBigCalendar.reactBigCalendarStrings.ignoreEvents
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Calendar {
  @JSImport("react-big-calendar", "Calendar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[TEvent <: js.Object, TResource <: js.Object] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactBigCalendar.mod.Calendar[js.Any, js.Any]] {
    @scala.inline
    def allDayAccessorFunction1(value: TEvent => Boolean): this.type = set("allDayAccessor", js.Any.fromFunction1(value))
    @scala.inline
    def allDayAccessor(value: (/* keyof TEvent */ String) | (js.Function1[TEvent, Boolean])): this.type = set("allDayAccessor", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def components(value: Components_[TEvent]): this.type = set("components", value.asInstanceOf[js.Any])
    @scala.inline
    def culture(value: String): this.type = set("culture", value.asInstanceOf[js.Any])
    @scala.inline
    def dateDate(value: js.Date): this.type = set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def date(value: stringOrDate): this.type = set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def dayLayoutAlgorithm(value: DayLayoutAlgorithm): this.type = set("dayLayoutAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def dayPropGetter(
      value: (/* date */ js.Date, /* resourceId */ js.UndefOr[Double | String]) => HTMLAttributes[HTMLDivElement]
    ): this.type = set("dayPropGetter", js.Any.fromFunction2(value))
    @scala.inline
    def defaultDate(value: js.Date): this.type = set("defaultDate", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultView(value: View): this.type = set("defaultView", value.asInstanceOf[js.Any])
    @scala.inline
    def drilldownView(value: View): this.type = set("drilldownView", value.asInstanceOf[js.Any])
    @scala.inline
    def drilldownViewNull: this.type = set("drilldownView", null)
    @scala.inline
    def elementProps(value: HTMLAttributes[HTMLElement]): this.type = set("elementProps", value.asInstanceOf[js.Any])
    @scala.inline
    def endAccessorFunction1(value: TEvent => js.Date): this.type = set("endAccessor", js.Any.fromFunction1(value))
    @scala.inline
    def endAccessor(value: (/* keyof TEvent */ String) | (js.Function1[TEvent, js.Date])): this.type = set("endAccessor", value.asInstanceOf[js.Any])
    @scala.inline
    def eventPropGetter(
      value: (TEvent, /* start */ stringOrDate, /* end */ stringOrDate, /* isSelected */ Boolean) => HTMLAttributes[HTMLDivElement]
    ): this.type = set("eventPropGetter", js.Any.fromFunction4(value))
    @scala.inline
    def events(value: js.Array[TEvent]): this.type = set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def formats(value: Formats): this.type = set("formats", value.asInstanceOf[js.Any])
    @scala.inline
    def getDrilldownView(
      value: (/* targetDate */ js.Date, /* currentViewName */ View, /* configuredViewNames */ js.Array[View]) => Unit
    ): this.type = set("getDrilldownView", js.Any.fromFunction3(value))
    @scala.inline
    def getDrilldownViewNull: this.type = set("getDrilldownView", null)
    @scala.inline
    def getNow(value: () => js.Date): this.type = set("getNow", js.Any.fromFunction0(value))
    @scala.inline
    def length(value: Double): this.type = set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def longPressThreshold(value: Double): this.type = set("longPressThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def maxDate(value: js.Date): this.type = set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def max(value: stringOrDate): this.type = set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def messages(value: Messages): this.type = set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def minDate(value: js.Date): this.type = set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def min(value: stringOrDate): this.type = set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def onDoubleClickEvent(value: (TEvent, /* e */ SyntheticEvent[Event_, HTMLElement]) => Unit): this.type = set("onDoubleClickEvent", js.Any.fromFunction2(value))
    @scala.inline
    def onDrillDown(value: (/* date */ js.Date, /* view */ View) => Unit): this.type = set("onDrillDown", js.Any.fromFunction2(value))
    @scala.inline
    def onNavigate(value: (/* newDate */ js.Date, /* view */ View, /* action */ NavigateAction) => Unit): this.type = set("onNavigate", js.Any.fromFunction3(value))
    @scala.inline
    def onRangeChange(value: /* range */ js.Array[js.Date] | AnonStart => Unit): this.type = set("onRangeChange", js.Any.fromFunction1(value))
    @scala.inline
    def onSelectEvent(value: (TEvent, /* e */ SyntheticEvent[Event_, HTMLElement]) => Unit): this.type = set("onSelectEvent", js.Any.fromFunction2(value))
    @scala.inline
    def onSelectSlot(value: /* slotInfo */ AnonAction => Unit): this.type = set("onSelectSlot", js.Any.fromFunction1(value))
    @scala.inline
    def onSelecting(value: /* range */ AnonStart => js.UndefOr[Boolean | Null]): this.type = set("onSelecting", js.Any.fromFunction1(value))
    @scala.inline
    def onShowMore(value: (/* events */ js.Array[TEvent], /* date */ js.Date) => Unit): this.type = set("onShowMore", js.Any.fromFunction2(value))
    @scala.inline
    def onView(value: /* view */ View => Unit): this.type = set("onView", js.Any.fromFunction1(value))
    @scala.inline
    def popup(value: Boolean): this.type = set("popup", value.asInstanceOf[js.Any])
    @scala.inline
    def popupOffset(value: Double | AnonX): this.type = set("popupOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def resourceAccessorFunction1(value: TEvent => _): this.type = set("resourceAccessor", js.Any.fromFunction1(value))
    @scala.inline
    def resourceAccessor(value: (/* keyof TEvent */ String) | (js.Function1[TEvent, _])): this.type = set("resourceAccessor", value.asInstanceOf[js.Any])
    @scala.inline
    def resourceIdAccessorFunction1(value: TResource => _): this.type = set("resourceIdAccessor", js.Any.fromFunction1(value))
    @scala.inline
    def resourceIdAccessor(value: (/* keyof TResource */ String) | (js.Function1[TResource, _])): this.type = set("resourceIdAccessor", value.asInstanceOf[js.Any])
    @scala.inline
    def resourceTitleAccessorFunction1(value: TResource => _): this.type = set("resourceTitleAccessor", js.Any.fromFunction1(value))
    @scala.inline
    def resourceTitleAccessor(value: (/* keyof TResource */ String) | (js.Function1[TResource, _])): this.type = set("resourceTitleAccessor", value.asInstanceOf[js.Any])
    @scala.inline
    def resources(value: js.Array[TResource]): this.type = set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def rtl(value: Boolean): this.type = set("rtl", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollToTime(value: js.Date): this.type = set("scrollToTime", value.asInstanceOf[js.Any])
    @scala.inline
    def selectable(value: Boolean | ignoreEvents): this.type = set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def selected(value: js.Any): this.type = set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def showMultiDayTimes(value: Boolean): this.type = set("showMultiDayTimes", value.asInstanceOf[js.Any])
    @scala.inline
    def slotGroupPropGetter(value: () => HTMLAttributes[HTMLDivElement]): this.type = set("slotGroupPropGetter", js.Any.fromFunction0(value))
    @scala.inline
    def slotPropGetter(
      value: (/* date */ js.Date, /* resourceId */ js.UndefOr[Double | String]) => HTMLAttributes[HTMLDivElement]
    ): this.type = set("slotPropGetter", js.Any.fromFunction2(value))
    @scala.inline
    def startAccessorFunction1(value: TEvent => js.Date): this.type = set("startAccessor", js.Any.fromFunction1(value))
    @scala.inline
    def startAccessor(value: (/* keyof TEvent */ String) | (js.Function1[TEvent, js.Date])): this.type = set("startAccessor", value.asInstanceOf[js.Any])
    @scala.inline
    def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def timeslots(value: Double): this.type = set("timeslots", value.asInstanceOf[js.Any])
    @scala.inline
    def titleAccessorFunction1(value: TEvent => String): this.type = set("titleAccessor", js.Any.fromFunction1(value))
    @scala.inline
    def titleAccessor(value: (/* keyof TEvent */ String) | (js.Function1[TEvent, String])): this.type = set("titleAccessor", value.asInstanceOf[js.Any])
    @scala.inline
    def toolbar(value: Boolean): this.type = set("toolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltipAccessorFunction1(value: TEvent => String): this.type = set("tooltipAccessor", js.Any.fromFunction1(value))
    @scala.inline
    def tooltipAccessor(value: (/* keyof TEvent */ String) | (js.Function1[TEvent, String])): this.type = set("tooltipAccessor", value.asInstanceOf[js.Any])
    @scala.inline
    def view(value: View): this.type = set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def views(value: ViewsProps): this.type = set("views", value.asInstanceOf[js.Any])
  }
  
  def withProps[TEvent <: js.Object, TResource <: js.Object](p: CalendarProps[TEvent, TResource]): Builder[TEvent, TResource] = new Builder[TEvent, TResource](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[TEvent <: js.Object, TResource <: js.Object](localizer: DateLocalizer): Builder[TEvent, TResource] = {
    val __props = js.Dynamic.literal(localizer = localizer.asInstanceOf[js.Any])
    new Builder[TEvent, TResource](js.Array(this.component, __props.asInstanceOf[CalendarProps[TEvent, TResource]]))
  }
}

