package typingsSlinky.moment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MomentInputObject extends _MomentInput {
  
  var D: js.UndefOr[numberlike] = js.native
  
  var M: js.UndefOr[numberlike] = js.native
  
  var d: js.UndefOr[numberlike] = js.native
  
  var date: js.UndefOr[numberlike] = js.native
  
  var dates: js.UndefOr[numberlike] = js.native
  
  var day: js.UndefOr[numberlike] = js.native
  
  var days: js.UndefOr[numberlike] = js.native
  
  var h: js.UndefOr[numberlike] = js.native
  
  var hour: js.UndefOr[numberlike] = js.native
  
  var hours: js.UndefOr[numberlike] = js.native
  
  var m: js.UndefOr[numberlike] = js.native
  
  var millisecond: js.UndefOr[numberlike] = js.native
  
  var milliseconds: js.UndefOr[numberlike] = js.native
  
  var minute: js.UndefOr[numberlike] = js.native
  
  var minutes: js.UndefOr[numberlike] = js.native
  
  var month: js.UndefOr[numberlike] = js.native
  
  var months: js.UndefOr[numberlike] = js.native
  
  var ms: js.UndefOr[numberlike] = js.native
  
  var s: js.UndefOr[numberlike] = js.native
  
  var second: js.UndefOr[numberlike] = js.native
  
  var seconds: js.UndefOr[numberlike] = js.native
  
  var y: js.UndefOr[numberlike] = js.native
  
  var year: js.UndefOr[numberlike] = js.native
  
  var years: js.UndefOr[numberlike] = js.native
}
object MomentInputObject {
  
  @scala.inline
  def apply(): MomentInputObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MomentInputObject]
  }
  
  @scala.inline
  implicit class MomentInputObjectOps[Self <: MomentInputObject] (val x: Self) extends AnyVal {
    
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
    def setD(value: numberlike): Self = this.set("D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteD: Self = this.set("D", js.undefined)
    
    @scala.inline
    def setM(value: numberlike): Self = this.set("M", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteM: Self = this.set("M", js.undefined)
    
    @scala.inline
    def setDate(value: numberlike): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDates(value: numberlike): Self = this.set("dates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDates: Self = this.set("dates", js.undefined)
    
    @scala.inline
    def setDay(value: numberlike): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    
    @scala.inline
    def setDays(value: numberlike): Self = this.set("days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDays: Self = this.set("days", js.undefined)
    
    @scala.inline
    def setH(value: numberlike): Self = this.set("h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH: Self = this.set("h", js.undefined)
    
    @scala.inline
    def setHour(value: numberlike): Self = this.set("hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHour: Self = this.set("hour", js.undefined)
    
    @scala.inline
    def setHours(value: numberlike): Self = this.set("hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHours: Self = this.set("hours", js.undefined)
    
    @scala.inline
    def setMillisecond(value: numberlike): Self = this.set("millisecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMillisecond: Self = this.set("millisecond", js.undefined)
    
    @scala.inline
    def setMilliseconds(value: numberlike): Self = this.set("milliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMilliseconds: Self = this.set("milliseconds", js.undefined)
    
    @scala.inline
    def setMinute(value: numberlike): Self = this.set("minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinute: Self = this.set("minute", js.undefined)
    
    @scala.inline
    def setMinutes(value: numberlike): Self = this.set("minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinutes: Self = this.set("minutes", js.undefined)
    
    @scala.inline
    def setMonth(value: numberlike): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    
    @scala.inline
    def setMonths(value: numberlike): Self = this.set("months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonths: Self = this.set("months", js.undefined)
    
    @scala.inline
    def setMs(value: numberlike): Self = this.set("ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMs: Self = this.set("ms", js.undefined)
    
    @scala.inline
    def setS(value: numberlike): Self = this.set("s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS: Self = this.set("s", js.undefined)
    
    @scala.inline
    def setSecond(value: numberlike): Self = this.set("second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecond: Self = this.set("second", js.undefined)
    
    @scala.inline
    def setSeconds(value: numberlike): Self = this.set("seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeconds: Self = this.set("seconds", js.undefined)
    
    @scala.inline
    def setY(value: numberlike): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    
    @scala.inline
    def setYear(value: numberlike): Self = this.set("year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
    
    @scala.inline
    def setYears(value: numberlike): Self = this.set("years", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYears: Self = this.set("years", js.undefined)
  }
}
