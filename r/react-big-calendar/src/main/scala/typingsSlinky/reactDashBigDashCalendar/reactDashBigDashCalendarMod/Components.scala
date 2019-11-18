package typingsSlinky.reactDashBigDashCalendar.reactDashBigDashCalendarMod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactDashBigDashCalendar.Anon_Date
import typingsSlinky.reactDashBigDashCalendar.Anon_DateHeader
import typingsSlinky.reactDashBigDashCalendar.Anon_Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Components[TEvent /* <: js.Object */] extends js.Object {
  var agenda: js.UndefOr[Anon_Date] = js.undefined
  var dateCellWrapper: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.undefined
  var day: js.UndefOr[Anon_Event] = js.undefined
  var event: js.UndefOr[ReactComponentClass[EventProps[TEvent]]] = js.undefined
  var eventContainerWrapper: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.undefined
  var eventWrapper: js.UndefOr[ReactComponentClass[EventWrapperProps[TEvent]]] = js.undefined
  /**
    * component used as a header for each column in the TimeGridHeader
    */
  var header: js.UndefOr[ReactComponentClass[HeaderProps]] = js.undefined
  var month: js.UndefOr[Anon_DateHeader] = js.undefined
  var resourceHeader: js.UndefOr[ReactComponentClass[ResourceHeaderProps]] = js.undefined
  var timeGutterHeader: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.undefined
  var timeGutterWrapper: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.undefined
  var timeSlotWrapper: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.undefined
  var toolbar: js.UndefOr[ReactComponentClass[ToolbarProps]] = js.undefined
  var week: js.UndefOr[Anon_Event] = js.undefined
}

object Components {
  @scala.inline
  def apply[TEvent /* <: js.Object */](
    agenda: Anon_Date = null,
    dateCellWrapper: ReactComponentClass[js.Object] | ReactElement = null,
    day: Anon_Event = null,
    event: ReactComponentClass[EventProps[TEvent]] = null,
    eventContainerWrapper: ReactComponentClass[js.Object] | ReactElement = null,
    eventWrapper: ReactComponentClass[EventWrapperProps[TEvent]] = null,
    header: ReactComponentClass[HeaderProps] = null,
    month: Anon_DateHeader = null,
    resourceHeader: ReactComponentClass[ResourceHeaderProps] = null,
    timeGutterHeader: ReactComponentClass[js.Object] | ReactElement = null,
    timeGutterWrapper: ReactComponentClass[js.Object] | ReactElement = null,
    timeSlotWrapper: ReactComponentClass[js.Object] | ReactElement = null,
    toolbar: ReactComponentClass[ToolbarProps] = null,
    week: Anon_Event = null
  ): Components[TEvent] = {
    val __obj = js.Dynamic.literal()
    if (agenda != null) __obj.updateDynamic("agenda")(agenda.asInstanceOf[js.Any])
    if (dateCellWrapper != null) __obj.updateDynamic("dateCellWrapper")(dateCellWrapper.asInstanceOf[js.Any])
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (eventContainerWrapper != null) __obj.updateDynamic("eventContainerWrapper")(eventContainerWrapper.asInstanceOf[js.Any])
    if (eventWrapper != null) __obj.updateDynamic("eventWrapper")(eventWrapper.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (resourceHeader != null) __obj.updateDynamic("resourceHeader")(resourceHeader.asInstanceOf[js.Any])
    if (timeGutterHeader != null) __obj.updateDynamic("timeGutterHeader")(timeGutterHeader.asInstanceOf[js.Any])
    if (timeGutterWrapper != null) __obj.updateDynamic("timeGutterWrapper")(timeGutterWrapper.asInstanceOf[js.Any])
    if (timeSlotWrapper != null) __obj.updateDynamic("timeSlotWrapper")(timeSlotWrapper.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (week != null) __obj.updateDynamic("week")(week.asInstanceOf[js.Any])
    __obj.asInstanceOf[Components[TEvent]]
  }
}

trait components extends js.Object {
  var dateCellWrapper: ReactComponentClass[js.Object]
  var eventWrapper: ReactComponentClass[Event]
}

object components {
  @scala.inline
  def apply(dateCellWrapper: ReactComponentClass[js.Object], eventWrapper: ReactComponentClass[Event]): components = {
    val __obj = js.Dynamic.literal(dateCellWrapper = dateCellWrapper.asInstanceOf[js.Any], eventWrapper = eventWrapper.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[components]
  }
}

