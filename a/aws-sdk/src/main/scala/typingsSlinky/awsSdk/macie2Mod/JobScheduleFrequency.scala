package typingsSlinky.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobScheduleFrequency extends StObject {
  
  /**
    * Specifies a daily recurrence pattern for running the job.
    */
  var dailySchedule: js.UndefOr[DailySchedule] = js.native
  
  /**
    * Specifies a monthly recurrence pattern for running the job.
    */
  var monthlySchedule: js.UndefOr[MonthlySchedule] = js.native
  
  /**
    * Specifies a weekly recurrence pattern for running the job.
    */
  var weeklySchedule: js.UndefOr[WeeklySchedule] = js.native
}
object JobScheduleFrequency {
  
  @scala.inline
  def apply(): JobScheduleFrequency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobScheduleFrequency]
  }
  
  @scala.inline
  implicit class JobScheduleFrequencyMutableBuilder[Self <: JobScheduleFrequency] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDailySchedule(value: DailySchedule): Self = StObject.set(x, "dailySchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyScheduleUndefined: Self = StObject.set(x, "dailySchedule", js.undefined)
    
    @scala.inline
    def setMonthlySchedule(value: MonthlySchedule): Self = StObject.set(x, "monthlySchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthlyScheduleUndefined: Self = StObject.set(x, "monthlySchedule", js.undefined)
    
    @scala.inline
    def setWeeklySchedule(value: WeeklySchedule): Self = StObject.set(x, "weeklySchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeeklyScheduleUndefined: Self = StObject.set(x, "weeklySchedule", js.undefined)
  }
}
