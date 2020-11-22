package typingsSlinky.reactDateRange.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateRangeObject extends js.Object {
  
  def endDate(now: js.Date): js.Date = js.native
  
  def startDate(now: js.Date): js.Date = js.native
}
object DateRangeObject {
  
  @scala.inline
  def apply(endDate: js.Date => js.Date, startDate: js.Date => js.Date): DateRangeObject = {
    val __obj = js.Dynamic.literal(endDate = js.Any.fromFunction1(endDate), startDate = js.Any.fromFunction1(startDate))
    __obj.asInstanceOf[DateRangeObject]
  }
  
  @scala.inline
  implicit class DateRangeObjectOps[Self <: DateRangeObject] (val x: Self) extends AnyVal {
    
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
    def setEndDate(value: js.Date => js.Date): Self = this.set("endDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartDate(value: js.Date => js.Date): Self = this.set("startDate", js.Any.fromFunction1(value))
  }
}
