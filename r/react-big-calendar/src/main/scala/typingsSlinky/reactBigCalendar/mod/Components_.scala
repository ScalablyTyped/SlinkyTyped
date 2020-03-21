package typingsSlinky.reactBigCalendar.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactBigCalendar.AnonDate
import typingsSlinky.reactBigCalendar.AnonDateHeader
import typingsSlinky.reactBigCalendar.AnonEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Components_[TEvent /* <: js.Object */] extends js.Object {
  var agenda: js.UndefOr[AnonDate] = js.undefined
  var dateCellWrapper: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.undefined
  var day: js.UndefOr[AnonEvent] = js.undefined
  var event: js.UndefOr[ReactComponentClass[EventProps[TEvent]]] = js.undefined
  var eventContainerWrapper: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.undefined
  var eventWrapper: js.UndefOr[ReactComponentClass[EventWrapperProps[TEvent]]] = js.undefined
  /**
    * component used as a header for each column in the TimeGridHeader
    */
  var header: js.UndefOr[ReactComponentClass[HeaderProps]] = js.undefined
  var month: js.UndefOr[AnonDateHeader] = js.undefined
  var resourceHeader: js.UndefOr[ReactComponentClass[ResourceHeaderProps]] = js.undefined
  var timeGutterHeader: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.undefined
  var timeGutterWrapper: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.undefined
  var timeSlotWrapper: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.undefined
  var toolbar: js.UndefOr[ReactComponentClass[ToolbarProps]] = js.undefined
  var week: js.UndefOr[AnonEvent] = js.undefined
}

object Components_ {
  @scala.inline
  def apply[TEvent /* <: js.Object */](
    agenda: AnonDate = null,
    dateCellWrapper: ReactComponentClass[js.Object] | ReactElement = null,
    day: AnonEvent = null,
    event: ReactComponentClass[EventProps[TEvent]] = null,
    eventContainerWrapper: ReactComponentClass[js.Object] | ReactElement = null,
    eventWrapper: ReactComponentClass[EventWrapperProps[TEvent]] = null,
    header: ReactComponentClass[HeaderProps] = null,
    month: AnonDateHeader = null,
    resourceHeader: ReactComponentClass[ResourceHeaderProps] = null,
    timeGutterHeader: ReactComponentClass[js.Object] | ReactElement = null,
    timeGutterWrapper: ReactComponentClass[js.Object] | ReactElement = null,
    timeSlotWrapper: ReactComponentClass[js.Object] | ReactElement = null,
    toolbar: ReactComponentClass[ToolbarProps] = null,
    week: AnonEvent = null
  ): Components_[TEvent] = {
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
    __obj.asInstanceOf[Components_[TEvent]]
  }
}

