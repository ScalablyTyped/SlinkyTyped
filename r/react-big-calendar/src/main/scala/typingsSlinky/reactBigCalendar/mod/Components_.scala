package typingsSlinky.reactBigCalendar.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactBigCalendar.anon.Date
import typingsSlinky.reactBigCalendar.anon.DateHeader
import typingsSlinky.reactBigCalendar.anon.Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Components_[TEvent /* <: js.Object */, TResource /* <: js.Object */] extends js.Object {
  
  var agenda: js.UndefOr[Date[TEvent]] = js.native
  
  var dateCellWrapper: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  
  var day: js.UndefOr[Header[TEvent]] = js.native
  
  var event: js.UndefOr[ReactComponentClass[EventProps[TEvent]]] = js.native
  
  var eventContainerWrapper: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  
  var eventWrapper: js.UndefOr[ReactComponentClass[EventWrapperProps[TEvent]]] = js.native
  
  /**
    * component used as a header for each column in the TimeGridHeader
    */
  var header: js.UndefOr[ReactComponentClass[HeaderProps]] = js.native
  
  var month: js.UndefOr[DateHeader[TEvent]] = js.native
  
  var resourceHeader: js.UndefOr[ReactComponentClass[ResourceHeaderProps]] = js.native
  
  var timeGutterHeader: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  
  var timeGutterWrapper: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  
  var timeSlotWrapper: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  
  var toolbar: js.UndefOr[ReactComponentClass[ToolbarProps[TEvent, TResource]]] = js.native
  
  var week: js.UndefOr[Header[TEvent]] = js.native
}
object Components_ {
  
  @scala.inline
  def apply[TEvent /* <: js.Object */, TResource /* <: js.Object */](): Components_[TEvent, TResource] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Components_[TEvent, TResource]]
  }
  
  @scala.inline
  implicit class Components_Ops[Self <: Components_[_, _], TEvent /* <: js.Object */, TResource /* <: js.Object */] (val x: Self with (Components_[TEvent, TResource])) extends AnyVal {
    
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
    def setAgenda(value: Date[TEvent]): Self = this.set("agenda", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgenda: Self = this.set("agenda", js.undefined)
    
    @scala.inline
    def setDateCellWrapperFunctionComponent(value: ReactComponentClass[js.Object]): Self = this.set("dateCellWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateCellWrapperComponentClass(value: ReactComponentClass[js.Object]): Self = this.set("dateCellWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateCellWrapper(value: ReactComponentClass[js.Object]): Self = this.set("dateCellWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateCellWrapper: Self = this.set("dateCellWrapper", js.undefined)
    
    @scala.inline
    def setDay(value: Header[TEvent]): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    
    @scala.inline
    def setEventFunctionComponent(value: ReactComponentClass[EventProps[TEvent]]): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventComponentClass(value: ReactComponentClass[EventProps[TEvent]]): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: ReactComponentClass[EventProps[TEvent]]): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setEventContainerWrapperFunctionComponent(value: ReactComponentClass[js.Object]): Self = this.set("eventContainerWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventContainerWrapperComponentClass(value: ReactComponentClass[js.Object]): Self = this.set("eventContainerWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventContainerWrapper(value: ReactComponentClass[js.Object]): Self = this.set("eventContainerWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventContainerWrapper: Self = this.set("eventContainerWrapper", js.undefined)
    
    @scala.inline
    def setEventWrapperFunctionComponent(value: ReactComponentClass[EventWrapperProps[TEvent]]): Self = this.set("eventWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventWrapperComponentClass(value: ReactComponentClass[EventWrapperProps[TEvent]]): Self = this.set("eventWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventWrapper(value: ReactComponentClass[EventWrapperProps[TEvent]]): Self = this.set("eventWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventWrapper: Self = this.set("eventWrapper", js.undefined)
    
    @scala.inline
    def setHeaderFunctionComponent(value: ReactComponentClass[HeaderProps]): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderComponentClass(value: ReactComponentClass[HeaderProps]): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: ReactComponentClass[HeaderProps]): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setMonth(value: DateHeader[TEvent]): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    
    @scala.inline
    def setResourceHeaderFunctionComponent(value: ReactComponentClass[ResourceHeaderProps]): Self = this.set("resourceHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceHeaderComponentClass(value: ReactComponentClass[ResourceHeaderProps]): Self = this.set("resourceHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceHeader(value: ReactComponentClass[ResourceHeaderProps]): Self = this.set("resourceHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceHeader: Self = this.set("resourceHeader", js.undefined)
    
    @scala.inline
    def setTimeGutterHeaderFunctionComponent(value: ReactComponentClass[js.Object]): Self = this.set("timeGutterHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeGutterHeaderComponentClass(value: ReactComponentClass[js.Object]): Self = this.set("timeGutterHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeGutterHeader(value: ReactComponentClass[js.Object]): Self = this.set("timeGutterHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeGutterHeader: Self = this.set("timeGutterHeader", js.undefined)
    
    @scala.inline
    def setTimeGutterWrapperFunctionComponent(value: ReactComponentClass[js.Object]): Self = this.set("timeGutterWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeGutterWrapperComponentClass(value: ReactComponentClass[js.Object]): Self = this.set("timeGutterWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeGutterWrapper(value: ReactComponentClass[js.Object]): Self = this.set("timeGutterWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeGutterWrapper: Self = this.set("timeGutterWrapper", js.undefined)
    
    @scala.inline
    def setTimeSlotWrapperFunctionComponent(value: ReactComponentClass[js.Object]): Self = this.set("timeSlotWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSlotWrapperComponentClass(value: ReactComponentClass[js.Object]): Self = this.set("timeSlotWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSlotWrapper(value: ReactComponentClass[js.Object]): Self = this.set("timeSlotWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSlotWrapper: Self = this.set("timeSlotWrapper", js.undefined)
    
    @scala.inline
    def setToolbarFunctionComponent(value: ReactComponentClass[ToolbarProps[TEvent, TResource]]): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarComponentClass(value: ReactComponentClass[ToolbarProps[TEvent, TResource]]): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbar(value: ReactComponentClass[ToolbarProps[TEvent, TResource]]): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    
    @scala.inline
    def setWeek(value: Header[TEvent]): Self = this.set("week", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeek: Self = this.set("week", js.undefined)
  }
}
