package typingsSlinky.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuerySchedule extends js.Object {
  
  /** Datetime to periodically run the query until. */
  var endTimeMs: js.UndefOr[String] = js.native
  
  /** How often the query is run. */
  var frequency: js.UndefOr[String] = js.native
  
  /** Time of day at which a new report will be generated, represented as minutes past midnight. Range is 0 to 1439. Only applies to scheduled reports. */
  var nextRunMinuteOfDay: js.UndefOr[Double] = js.native
  
  /** Canonical timezone code for report generation time. Defaults to America/New_York. */
  var nextRunTimezoneCode: js.UndefOr[String] = js.native
  
  /** When to start running the query. Not applicable to `ONE_TIME` frequency. */
  var startTimeMs: js.UndefOr[String] = js.native
}
object QuerySchedule {
  
  @scala.inline
  def apply(): QuerySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuerySchedule]
  }
  
  @scala.inline
  implicit class QueryScheduleOps[Self <: QuerySchedule] (val x: Self) extends AnyVal {
    
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
    def setEndTimeMs(value: String): Self = this.set("endTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTimeMs: Self = this.set("endTimeMs", js.undefined)
    
    @scala.inline
    def setFrequency(value: String): Self = this.set("frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrequency: Self = this.set("frequency", js.undefined)
    
    @scala.inline
    def setNextRunMinuteOfDay(value: Double): Self = this.set("nextRunMinuteOfDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextRunMinuteOfDay: Self = this.set("nextRunMinuteOfDay", js.undefined)
    
    @scala.inline
    def setNextRunTimezoneCode(value: String): Self = this.set("nextRunTimezoneCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextRunTimezoneCode: Self = this.set("nextRunTimezoneCode", js.undefined)
    
    @scala.inline
    def setStartTimeMs(value: String): Self = this.set("startTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTimeMs: Self = this.set("startTimeMs", js.undefined)
  }
}
