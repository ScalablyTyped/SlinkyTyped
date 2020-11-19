package typingsSlinky.nodeSchedule.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecurrenceSpecDateRange extends js.Object {
  
  /**
    * Ending date in date range.
    */
  var end: js.Date | String | Double = js.native
  
  /**
    * Cron expression string.
    */
  var rule: String = js.native
  
  /**
    * Starting date in date range.
    */
  var start: js.Date | String | Double = js.native
  
  /**
    * Timezone
    */
  var tz: js.UndefOr[Timezone] = js.native
}
object RecurrenceSpecDateRange {
  
  @scala.inline
  def apply(end: js.Date | String | Double, rule: String, start: js.Date | String | Double): RecurrenceSpecDateRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurrenceSpecDateRange]
  }
  
  @scala.inline
  implicit class RecurrenceSpecDateRangeOps[Self <: RecurrenceSpecDateRange] (val x: Self) extends AnyVal {
    
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
    def setEndDate(value: js.Date): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: js.Date | String | Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRule(value: String): Self = this.set("rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDate(value: js.Date): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: js.Date | String | Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTz(value: Timezone): Self = this.set("tz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTz: Self = this.set("tz", js.undefined)
  }
}
