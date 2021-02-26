package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeScheduledInstanceAvailabilityRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The filters.    availability-zone - The Availability Zone (for example, us-west-2a).    instance-type - The instance type (for example, c4.large).    network-platform - The network platform (EC2-Classic or EC2-VPC).    platform - The platform (Linux/UNIX or Windows).  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The time period for the first schedule to start.
    */
  var FirstSlotStartTimeRange: SlotDateTimeRangeRequest = js.native
  
  /**
    * The maximum number of results to return in a single call. This value can be between 5 and 300. The default value is 300. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[DescribeScheduledInstanceAvailabilityMaxResults] = js.native
  
  /**
    * The maximum available duration, in hours. This value must be greater than MinSlotDurationInHours and less than 1,720.
    */
  var MaxSlotDurationInHours: js.UndefOr[Integer] = js.native
  
  /**
    * The minimum available duration, in hours. The minimum required duration is 1,200 hours per year. For example, the minimum daily schedule is 4 hours, the minimum weekly schedule is 24 hours, and the minimum monthly schedule is 100 hours.
    */
  var MinSlotDurationInHours: js.UndefOr[Integer] = js.native
  
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The schedule recurrence.
    */
  var Recurrence: ScheduledInstanceRecurrenceRequest = js.native
}
object DescribeScheduledInstanceAvailabilityRequest {
  
  @scala.inline
  def apply(FirstSlotStartTimeRange: SlotDateTimeRangeRequest, Recurrence: ScheduledInstanceRecurrenceRequest): DescribeScheduledInstanceAvailabilityRequest = {
    val __obj = js.Dynamic.literal(FirstSlotStartTimeRange = FirstSlotStartTimeRange.asInstanceOf[js.Any], Recurrence = Recurrence.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScheduledInstanceAvailabilityRequest]
  }
  
  @scala.inline
  implicit class DescribeScheduledInstanceAvailabilityRequestMutableBuilder[Self <: DescribeScheduledInstanceAvailabilityRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setFirstSlotStartTimeRange(value: SlotDateTimeRangeRequest): Self = StObject.set(x, "FirstSlotStartTimeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: DescribeScheduledInstanceAvailabilityMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setMaxSlotDurationInHours(value: Integer): Self = StObject.set(x, "MaxSlotDurationInHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSlotDurationInHoursUndefined: Self = StObject.set(x, "MaxSlotDurationInHours", js.undefined)
    
    @scala.inline
    def setMinSlotDurationInHours(value: Integer): Self = StObject.set(x, "MinSlotDurationInHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSlotDurationInHoursUndefined: Self = StObject.set(x, "MinSlotDurationInHours", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRecurrence(value: ScheduledInstanceRecurrenceRequest): Self = StObject.set(x, "Recurrence", value.asInstanceOf[js.Any])
  }
}
