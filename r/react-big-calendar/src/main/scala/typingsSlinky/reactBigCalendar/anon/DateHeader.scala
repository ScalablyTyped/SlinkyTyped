package typingsSlinky.reactBigCalendar.anon

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateHeader extends js.Object {
  
  var dateHeader: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.native
  
  var event: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.native
  
  var header: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.native
}
object DateHeader {
  
  @scala.inline
  def apply(): DateHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateHeader]
  }
  
  @scala.inline
  implicit class DateHeaderOps[Self <: DateHeader] (val x: Self) extends AnyVal {
    
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
    def setDateHeaderReactElement(value: ReactElement): Self = this.set("dateHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateHeader(value: ReactComponentClass[js.Object] | ReactElement): Self = this.set("dateHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateHeaderFunctionComponent(value: ReactComponentClass[js.Object]): Self = this.set("dateHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateHeaderComponent(value: ReactComponentClass[js.Object]): Self = this.set("dateHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateHeaderComponentClass(value: ReactComponentClass[js.Object]): Self = this.set("dateHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateHeader: Self = this.set("dateHeader", js.undefined)
    
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
    def setHeader(value: ReactComponentClass[js.Object] | ReactElement): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderComponentClass(value: ReactComponentClass[js.Object]): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderFunctionComponent(value: ReactComponentClass[js.Object]): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderComponent(value: ReactComponentClass[js.Object]): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderReactElement(value: ReactElement): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
  }
}
