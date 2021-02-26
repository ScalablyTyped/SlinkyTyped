package typingsSlinky.reactBigCalendar.anon

import slinky.core.ReactComponentClass
import typingsSlinky.reactBigCalendar.mod.EventProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Date[TEvent /* <: js.Object */] extends StObject {
  
  var date: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  
  var event: js.UndefOr[ReactComponentClass[EventProps[TEvent]]] = js.native
  
  var time: js.UndefOr[ReactComponentClass[js.Object]] = js.native
}
object Date {
  
  @scala.inline
  def apply[TEvent /* <: js.Object */](): Date[TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Date[TEvent]]
  }
  
  @scala.inline
  implicit class DateMutableBuilder[Self <: Date[_], TEvent /* <: js.Object */] (val x: Self with Date[TEvent]) extends AnyVal {
    
    @scala.inline
    def setDate(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFunctionComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setEvent(value: ReactComponentClass[EventProps[TEvent]]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventComponentClass(value: ReactComponentClass[EventProps[TEvent]]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventFunctionComponent(value: ReactComponentClass[EventProps[TEvent]]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setTime(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeComponentClass(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeFunctionComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
