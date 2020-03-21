package typingsSlinky.reactBigCalendar.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
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

object Calendar
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactBigCalendar.mod.Calendar[js.Any, js.Any]] {
  @JSImport("react-big-calendar", "Calendar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply[TEvent /* <: js.Object */, TResource /* <: js.Object */](
    localizer: DateLocalizer,
    allDayAccessor: String | (js.Function1[TEvent, Boolean]) = null,
    components: Components_[TEvent] = null,
    culture: String = null,
    date: stringOrDate = null,
    dayLayoutAlgorithm: DayLayoutAlgorithm = null,
    dayPropGetter: (/* date */ js.Date, /* resourceId */ js.UndefOr[Double | String]) => HTMLAttributes[HTMLDivElement] = null,
    defaultDate: js.Date = null,
    defaultView: View = null,
    drilldownView: View = null,
    elementProps: HTMLAttributes[HTMLElement] = null,
    endAccessor: String | (js.Function1[TEvent, js.Date]) = null,
    eventPropGetter: (TEvent, /* start */ stringOrDate, /* end */ stringOrDate, /* isSelected */ Boolean) => HTMLAttributes[HTMLDivElement] = null,
    events: js.Array[TEvent] = null,
    formats: Formats = null,
    getDrilldownView: (/* targetDate */ js.Date, /* currentViewName */ View, /* configuredViewNames */ js.Array[View]) => Unit = null,
    getNow: () => js.Date = null,
    length: Int | Double = null,
    longPressThreshold: Int | Double = null,
    max: stringOrDate = null,
    messages: Messages = null,
    min: stringOrDate = null,
    onDoubleClickEvent: (TEvent, /* e */ SyntheticEvent[Event_, HTMLElement]) => Unit = null,
    onDrillDown: (/* date */ js.Date, /* view */ View) => Unit = null,
    onNavigate: (/* newDate */ js.Date, /* view */ View, /* action */ NavigateAction) => Unit = null,
    onRangeChange: /* range */ js.Array[js.Date] | AnonStart => Unit = null,
    onSelectEvent: (TEvent, /* e */ SyntheticEvent[Event_, HTMLElement]) => Unit = null,
    onSelectSlot: /* slotInfo */ AnonAction => Unit = null,
    onSelecting: /* range */ AnonStart => js.UndefOr[Boolean | Null] = null,
    onShowMore: (/* events */ js.Array[TEvent], /* date */ js.Date) => Unit = null,
    onView: /* view */ View => Unit = null,
    popup: js.UndefOr[Boolean] = js.undefined,
    popupOffset: Double | AnonX = null,
    resourceAccessor: String | (js.Function1[TEvent, _]) = null,
    resourceIdAccessor: String | (js.Function1[TResource, _]) = null,
    resourceTitleAccessor: String | (js.Function1[TResource, _]) = null,
    resources: js.Array[TResource] = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    scrollToTime: js.Date = null,
    selectable: Boolean | ignoreEvents = null,
    selected: js.Any = null,
    showMultiDayTimes: js.UndefOr[Boolean] = js.undefined,
    slotGroupPropGetter: () => HTMLAttributes[HTMLDivElement] = null,
    slotPropGetter: (/* date */ js.Date, /* resourceId */ js.UndefOr[Double | String]) => HTMLAttributes[HTMLDivElement] = null,
    startAccessor: String | (js.Function1[TEvent, js.Date]) = null,
    step: Int | Double = null,
    timeslots: Int | Double = null,
    titleAccessor: String | (js.Function1[TEvent, String]) = null,
    toolbar: js.UndefOr[Boolean] = js.undefined,
    tooltipAccessor: String | (js.Function1[TEvent, String]) = null,
    view: View = null,
    views: ViewsProps = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactBigCalendar.mod.Calendar[js.Any, js.Any]] = {
    val __obj = js.Dynamic.literal(localizer = localizer.asInstanceOf[js.Any])
    if (allDayAccessor != null) __obj.updateDynamic("allDayAccessor")(allDayAccessor.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (culture != null) __obj.updateDynamic("culture")(culture.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (dayLayoutAlgorithm != null) __obj.updateDynamic("dayLayoutAlgorithm")(dayLayoutAlgorithm.asInstanceOf[js.Any])
    if (dayPropGetter != null) __obj.updateDynamic("dayPropGetter")(js.Any.fromFunction2(dayPropGetter))
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (defaultView != null) __obj.updateDynamic("defaultView")(defaultView.asInstanceOf[js.Any])
    if (drilldownView != null) __obj.updateDynamic("drilldownView")(drilldownView.asInstanceOf[js.Any])
    if (elementProps != null) __obj.updateDynamic("elementProps")(elementProps.asInstanceOf[js.Any])
    if (endAccessor != null) __obj.updateDynamic("endAccessor")(endAccessor.asInstanceOf[js.Any])
    if (eventPropGetter != null) __obj.updateDynamic("eventPropGetter")(js.Any.fromFunction4(eventPropGetter))
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    if (getDrilldownView != null) __obj.updateDynamic("getDrilldownView")(js.Any.fromFunction3(getDrilldownView))
    if (getNow != null) __obj.updateDynamic("getNow")(js.Any.fromFunction0(getNow))
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (longPressThreshold != null) __obj.updateDynamic("longPressThreshold")(longPressThreshold.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onDoubleClickEvent != null) __obj.updateDynamic("onDoubleClickEvent")(js.Any.fromFunction2(onDoubleClickEvent))
    if (onDrillDown != null) __obj.updateDynamic("onDrillDown")(js.Any.fromFunction2(onDrillDown))
    if (onNavigate != null) __obj.updateDynamic("onNavigate")(js.Any.fromFunction3(onNavigate))
    if (onRangeChange != null) __obj.updateDynamic("onRangeChange")(js.Any.fromFunction1(onRangeChange))
    if (onSelectEvent != null) __obj.updateDynamic("onSelectEvent")(js.Any.fromFunction2(onSelectEvent))
    if (onSelectSlot != null) __obj.updateDynamic("onSelectSlot")(js.Any.fromFunction1(onSelectSlot))
    if (onSelecting != null) __obj.updateDynamic("onSelecting")(js.Any.fromFunction1(onSelecting))
    if (onShowMore != null) __obj.updateDynamic("onShowMore")(js.Any.fromFunction2(onShowMore))
    if (onView != null) __obj.updateDynamic("onView")(js.Any.fromFunction1(onView))
    if (!js.isUndefined(popup)) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    if (popupOffset != null) __obj.updateDynamic("popupOffset")(popupOffset.asInstanceOf[js.Any])
    if (resourceAccessor != null) __obj.updateDynamic("resourceAccessor")(resourceAccessor.asInstanceOf[js.Any])
    if (resourceIdAccessor != null) __obj.updateDynamic("resourceIdAccessor")(resourceIdAccessor.asInstanceOf[js.Any])
    if (resourceTitleAccessor != null) __obj.updateDynamic("resourceTitleAccessor")(resourceTitleAccessor.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    if (scrollToTime != null) __obj.updateDynamic("scrollToTime")(scrollToTime.asInstanceOf[js.Any])
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (!js.isUndefined(showMultiDayTimes)) __obj.updateDynamic("showMultiDayTimes")(showMultiDayTimes.asInstanceOf[js.Any])
    if (slotGroupPropGetter != null) __obj.updateDynamic("slotGroupPropGetter")(js.Any.fromFunction0(slotGroupPropGetter))
    if (slotPropGetter != null) __obj.updateDynamic("slotPropGetter")(js.Any.fromFunction2(slotPropGetter))
    if (startAccessor != null) __obj.updateDynamic("startAccessor")(startAccessor.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (timeslots != null) __obj.updateDynamic("timeslots")(timeslots.asInstanceOf[js.Any])
    if (titleAccessor != null) __obj.updateDynamic("titleAccessor")(titleAccessor.asInstanceOf[js.Any])
    if (!js.isUndefined(toolbar)) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (tooltipAccessor != null) __obj.updateDynamic("tooltipAccessor")(tooltipAccessor.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactBigCalendar.mod.Calendar[js.Any, js.Any]]]
  }
  type Props = CalendarProps[js.Any, js.Any]
}

