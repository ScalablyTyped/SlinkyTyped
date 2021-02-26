package typingsSlinky.reactBigCalendar.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactBigCalendar.anon.Date
import typingsSlinky.reactBigCalendar.anon.DateHeader
import typingsSlinky.reactBigCalendar.anon.Header
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Components_[TEvent /* <: js.Object */, TResource /* <: js.Object */] extends StObject {
  
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
  implicit class Components_MutableBuilder[Self <: Components_[_, _], TEvent /* <: js.Object */, TResource /* <: js.Object */] (val x: Self with (Components_[TEvent, TResource])) extends AnyVal {
    
    @scala.inline
    def setAgenda(value: Date[TEvent]): Self = StObject.set(x, "agenda", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgendaUndefined: Self = StObject.set(x, "agenda", js.undefined)
    
    @scala.inline
    def setDateCellWrapper(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "dateCellWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateCellWrapperComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "dateCellWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateCellWrapperFunctionComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "dateCellWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateCellWrapperUndefined: Self = StObject.set(x, "dateCellWrapper", js.undefined)
    
    @scala.inline
    def setDay(value: Header[TEvent]): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    @scala.inline
    def setEvent(value: ReactComponentClass[EventProps[TEvent]]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventComponentClass(value: ReactComponentClass[EventProps[TEvent]]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventContainerWrapper(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "eventContainerWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventContainerWrapperComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "eventContainerWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventContainerWrapperFunctionComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "eventContainerWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventContainerWrapperUndefined: Self = StObject.set(x, "eventContainerWrapper", js.undefined)
    
    @scala.inline
    def setEventFunctionComponent(value: ReactComponentClass[EventProps[TEvent]]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setEventWrapper(value: ReactComponentClass[EventWrapperProps[TEvent]]): Self = StObject.set(x, "eventWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventWrapperComponentClass(value: ReactComponentClass[EventWrapperProps[TEvent]]): Self = StObject.set(x, "eventWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventWrapperFunctionComponent(value: ReactComponentClass[EventWrapperProps[TEvent]]): Self = StObject.set(x, "eventWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventWrapperUndefined: Self = StObject.set(x, "eventWrapper", js.undefined)
    
    @scala.inline
    def setHeader(value: ReactComponentClass[HeaderProps]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderComponentClass(value: ReactComponentClass[HeaderProps]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderFunctionComponent(value: ReactComponentClass[HeaderProps]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setMonth(value: DateHeader[TEvent]): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    @scala.inline
    def setResourceHeader(value: ReactComponentClass[ResourceHeaderProps]): Self = StObject.set(x, "resourceHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceHeaderComponentClass(value: ReactComponentClass[ResourceHeaderProps]): Self = StObject.set(x, "resourceHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceHeaderFunctionComponent(value: ReactComponentClass[ResourceHeaderProps]): Self = StObject.set(x, "resourceHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceHeaderUndefined: Self = StObject.set(x, "resourceHeader", js.undefined)
    
    @scala.inline
    def setTimeGutterHeader(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "timeGutterHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeGutterHeaderComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "timeGutterHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeGutterHeaderFunctionComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "timeGutterHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeGutterHeaderUndefined: Self = StObject.set(x, "timeGutterHeader", js.undefined)
    
    @scala.inline
    def setTimeGutterWrapper(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "timeGutterWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeGutterWrapperComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "timeGutterWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeGutterWrapperFunctionComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "timeGutterWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeGutterWrapperUndefined: Self = StObject.set(x, "timeGutterWrapper", js.undefined)
    
    @scala.inline
    def setTimeSlotWrapper(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "timeSlotWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSlotWrapperComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "timeSlotWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSlotWrapperFunctionComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "timeSlotWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSlotWrapperUndefined: Self = StObject.set(x, "timeSlotWrapper", js.undefined)
    
    @scala.inline
    def setToolbar(value: ReactComponentClass[ToolbarProps[TEvent, TResource]]): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarComponentClass(value: ReactComponentClass[ToolbarProps[TEvent, TResource]]): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarFunctionComponent(value: ReactComponentClass[ToolbarProps[TEvent, TResource]]): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    @scala.inline
    def setWeek(value: Header[TEvent]): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekUndefined: Self = StObject.set(x, "week", js.undefined)
  }
}
