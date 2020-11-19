package typingsSlinky.bulmaCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndDate extends js.Object {
  
  var endDate: js.UndefOr[js.Date] = js.native
  
  var startDate: js.Date = js.native
}
object EndDate {
  
  @scala.inline
  def apply(startDate: js.Date): EndDate = {
    val __obj = js.Dynamic.literal(startDate = startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndDate]
  }
  
  @scala.inline
  implicit class EndDateOps[Self <: EndDate] (val x: Self) extends AnyVal {
    
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
    def setStartDate(value: js.Date): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDate(value: js.Date): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
  }
}
