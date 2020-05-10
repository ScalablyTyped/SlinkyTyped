package typingsSlinky.reactBigCalendar.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactBigCalendar.AnonDate
import typingsSlinky.reactBigCalendar.AnonDateHeader
import typingsSlinky.reactBigCalendar.AnonEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Components_[TEvent /* <: js.Object */] extends js.Object {
  var agenda: js.UndefOr[AnonDate] = js.native
  var dateCellWrapper: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.native
  var day: js.UndefOr[AnonEvent] = js.native
  var event: js.UndefOr[ReactComponentClass[EventProps[TEvent]]] = js.native
  var eventContainerWrapper: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.native
  var eventWrapper: js.UndefOr[ReactComponentClass[EventWrapperProps[TEvent]]] = js.native
  /**
    * component used as a header for each column in the TimeGridHeader
    */
  var header: js.UndefOr[ReactComponentClass[HeaderProps]] = js.native
  var month: js.UndefOr[AnonDateHeader] = js.native
  var resourceHeader: js.UndefOr[ReactComponentClass[ResourceHeaderProps]] = js.native
  var timeGutterHeader: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.native
  var timeGutterWrapper: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.native
  var timeSlotWrapper: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.native
  var toolbar: js.UndefOr[ReactComponentClass[ToolbarProps]] = js.native
  var week: js.UndefOr[AnonEvent] = js.native
}

object Components_ {
  @scala.inline
  def apply[TEvent](): Components_[TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Components_[TEvent]]
  }
  @scala.inline
  implicit class Components_Ops[Self[tevent] <: Components_[tevent], TEvent] (val x: Self[TEvent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEvent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEvent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEvent] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEvent] with Other]
    @scala.inline
    def withAgenda(value: AnonDate): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agenda")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgenda: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agenda")(js.undefined)
        ret
    }
    @scala.inline
    def withDateCellWrapperComponent(value: ReactComponentClass[js.Object]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCellWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateCellWrapperComponentClass(value: ReactComponentClass[js.Object]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCellWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateCellWrapper(value: ReactComponentClass[js.Object] | ReactElement): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCellWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateCellWrapperReactElement(value: ReactElement): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCellWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateCellWrapperFunctionComponent(value: ReactComponentClass[js.Object]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCellWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateCellWrapper: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCellWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withDay(value: AnonEvent): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDay: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(js.undefined)
        ret
    }
    @scala.inline
    def withEventFunctionComponent(value: ReactComponentClass[EventProps[TEvent]]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventComponentClass(value: ReactComponentClass[EventProps[TEvent]]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: ReactComponentClass[EventProps[TEvent]]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withEventContainerWrapper(value: ReactComponentClass[js.Object] | ReactElement): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventContainerWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventContainerWrapperFunctionComponent(value: ReactComponentClass[js.Object]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventContainerWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventContainerWrapperComponentClass(value: ReactComponentClass[js.Object]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventContainerWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventContainerWrapperReactElement(value: ReactElement): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventContainerWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventContainerWrapperComponent(value: ReactComponentClass[js.Object]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventContainerWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventContainerWrapper: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventContainerWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withEventWrapperFunctionComponent(value: ReactComponentClass[EventWrapperProps[TEvent]]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventWrapperComponentClass(value: ReactComponentClass[EventWrapperProps[TEvent]]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventWrapper(value: ReactComponentClass[EventWrapperProps[TEvent]]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventWrapper: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderFunctionComponent(value: ReactComponentClass[HeaderProps]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderComponentClass(value: ReactComponentClass[HeaderProps]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: ReactComponentClass[HeaderProps]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withMonth(value: AnonDateHeader): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonth: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceHeaderFunctionComponent(value: ReactComponentClass[ResourceHeaderProps]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceHeaderComponentClass(value: ReactComponentClass[ResourceHeaderProps]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceHeader(value: ReactComponentClass[ResourceHeaderProps]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceHeader: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeGutterHeaderFunctionComponent(value: ReactComponentClass[js.Object]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeGutterHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeGutterHeaderComponentClass(value: ReactComponentClass[js.Object]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeGutterHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeGutterHeader(value: ReactComponentClass[js.Object] | ReactElement): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeGutterHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeGutterHeaderComponent(value: ReactComponentClass[js.Object]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeGutterHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeGutterHeaderReactElement(value: ReactElement): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeGutterHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeGutterHeader: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeGutterHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeGutterWrapperComponentClass(value: ReactComponentClass[js.Object]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeGutterWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeGutterWrapperComponent(value: ReactComponentClass[js.Object]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeGutterWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeGutterWrapperFunctionComponent(value: ReactComponentClass[js.Object]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeGutterWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeGutterWrapper(value: ReactComponentClass[js.Object] | ReactElement): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeGutterWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeGutterWrapperReactElement(value: ReactElement): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeGutterWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeGutterWrapper: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeGutterWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeSlotWrapperComponentClass(value: ReactComponentClass[js.Object]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSlotWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeSlotWrapper(value: ReactComponentClass[js.Object] | ReactElement): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSlotWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeSlotWrapperFunctionComponent(value: ReactComponentClass[js.Object]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSlotWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeSlotWrapperReactElement(value: ReactElement): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSlotWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeSlotWrapperComponent(value: ReactComponentClass[js.Object]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSlotWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeSlotWrapper: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSlotWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarFunctionComponent(value: ReactComponentClass[ToolbarProps]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolbarComponentClass(value: ReactComponentClass[ToolbarProps]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolbar(value: ReactComponentClass[ToolbarProps]): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withWeek(value: AnonEvent): Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeek: Self[TEvent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week")(js.undefined)
        ret
    }
  }
  
}

