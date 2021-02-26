package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduledInstanceRecurrenceRequest extends StObject {
  
  /**
    * The frequency (Daily, Weekly, or Monthly).
    */
  var Frequency: js.UndefOr[String] = js.native
  
  /**
    * The interval quantity. The interval unit depends on the value of Frequency. For example, every 2 weeks or every 2 months.
    */
  var Interval: js.UndefOr[Integer] = js.native
  
  /**
    * The days. For a monthly schedule, this is one or more days of the month (1-31). For a weekly schedule, this is one or more days of the week (1-7, where 1 is Sunday). You can't specify this value with a daily schedule. If the occurrence is relative to the end of the month, you can specify only a single day.
    */
  var OccurrenceDays: js.UndefOr[OccurrenceDayRequestSet] = js.native
  
  /**
    * Indicates whether the occurrence is relative to the end of the specified week or month. You can't specify this value with a daily schedule.
    */
  var OccurrenceRelativeToEnd: js.UndefOr[Boolean] = js.native
  
  /**
    * The unit for OccurrenceDays (DayOfWeek or DayOfMonth). This value is required for a monthly schedule. You can't specify DayOfWeek with a weekly schedule. You can't specify this value with a daily schedule.
    */
  var OccurrenceUnit: js.UndefOr[String] = js.native
}
object ScheduledInstanceRecurrenceRequest {
  
  @scala.inline
  def apply(): ScheduledInstanceRecurrenceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledInstanceRecurrenceRequest]
  }
  
  @scala.inline
  implicit class ScheduledInstanceRecurrenceRequestMutableBuilder[Self <: ScheduledInstanceRecurrenceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrequency(value: String): Self = StObject.set(x, "Frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyUndefined: Self = StObject.set(x, "Frequency", js.undefined)
    
    @scala.inline
    def setInterval(value: Integer): Self = StObject.set(x, "Interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "Interval", js.undefined)
    
    @scala.inline
    def setOccurrenceDays(value: OccurrenceDayRequestSet): Self = StObject.set(x, "OccurrenceDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrenceDaysUndefined: Self = StObject.set(x, "OccurrenceDays", js.undefined)
    
    @scala.inline
    def setOccurrenceDaysVarargs(value: Integer*): Self = StObject.set(x, "OccurrenceDays", js.Array(value :_*))
    
    @scala.inline
    def setOccurrenceRelativeToEnd(value: Boolean): Self = StObject.set(x, "OccurrenceRelativeToEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrenceRelativeToEndUndefined: Self = StObject.set(x, "OccurrenceRelativeToEnd", js.undefined)
    
    @scala.inline
    def setOccurrenceUnit(value: String): Self = StObject.set(x, "OccurrenceUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrenceUnitUndefined: Self = StObject.set(x, "OccurrenceUnit", js.undefined)
  }
}
