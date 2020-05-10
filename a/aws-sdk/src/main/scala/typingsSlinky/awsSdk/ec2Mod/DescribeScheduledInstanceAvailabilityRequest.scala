package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScheduledInstanceAvailabilityRequest extends js.Object {
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
  implicit class DescribeScheduledInstanceAvailabilityRequestOps[Self <: DescribeScheduledInstanceAvailabilityRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstSlotStartTimeRange(value: SlotDateTimeRangeRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstSlotStartTimeRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecurrence(value: ScheduledInstanceRecurrenceRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Recurrence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: FilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: DescribeScheduledInstanceAvailabilityMaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSlotDurationInHours(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxSlotDurationInHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSlotDurationInHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxSlotDurationInHours")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSlotDurationInHours(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinSlotDurationInHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSlotDurationInHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinSlotDurationInHours")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

