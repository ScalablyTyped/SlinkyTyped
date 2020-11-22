package typingsSlinky.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonthlySchedule extends js.Object {
  
  /**
    * The numeric day of the month when Amazon Macie runs the job. This value can be an integer from 1 through 31. If this value exceeds the number of days in a certain month, Macie runs the job on the last day of that month. For example, if this value is 31 and a month has only 30 days, Macie runs the job on day 30 of that month.
    */
  var dayOfMonth: js.UndefOr[integer] = js.native
}
object MonthlySchedule {
  
  @scala.inline
  def apply(): MonthlySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonthlySchedule]
  }
  
  @scala.inline
  implicit class MonthlyScheduleOps[Self <: MonthlySchedule] (val x: Self) extends AnyVal {
    
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
    def setDayOfMonth(value: integer): Self = this.set("dayOfMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayOfMonth: Self = this.set("dayOfMonth", js.undefined)
  }
}
