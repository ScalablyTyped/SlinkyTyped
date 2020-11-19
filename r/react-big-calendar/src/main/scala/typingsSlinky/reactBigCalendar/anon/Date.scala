package typingsSlinky.reactBigCalendar.anon

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Date extends js.Object {
  
  var date: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.native
  
  var event: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.native
  
  var time: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.native
}
object Date {
  
  @scala.inline
  def apply(): Date = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Date]
  }
  
  @scala.inline
  implicit class DateOps[Self <: Date] (val x: Self) extends AnyVal {
    
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
    def setDateFunctionComponent(value: ReactComponentClass[js.Object]): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateComponent(value: ReactComponentClass[js.Object]): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateComponentClass(value: ReactComponentClass[js.Object]): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: ReactComponentClass[js.Object] | ReactElement): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateReactElement(value: ReactElement): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setEventComponentClass(value: ReactComponentClass[js.Object]): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventComponent(value: ReactComponentClass[js.Object]): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: ReactComponentClass[js.Object] | ReactElement): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventFunctionComponent(value: ReactComponentClass[js.Object]): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventReactElement(value: ReactElement): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setTimeComponent(value: ReactComponentClass[js.Object]): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeComponentClass(value: ReactComponentClass[js.Object]): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeReactElement(value: ReactElement): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeFunctionComponent(value: ReactComponentClass[js.Object]): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: ReactComponentClass[js.Object] | ReactElement): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
}
