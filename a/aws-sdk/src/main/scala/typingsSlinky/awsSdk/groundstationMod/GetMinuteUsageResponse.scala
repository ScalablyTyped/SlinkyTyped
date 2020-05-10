package typingsSlinky.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMinuteUsageResponse extends js.Object {
  /**
    * Estimated number of minutes remaining for an account, specific to the month being requested.
    */
  var estimatedMinutesRemaining: js.UndefOr[Integer] = js.native
  /**
    * Returns whether or not an account has signed up for the reserved minutes pricing plan, specific to the month being requested.
    */
  var isReservedMinutesCustomer: js.UndefOr[Boolean] = js.native
  /**
    * Total number of reserved minutes allocated, specific to the month being requested.
    */
  var totalReservedMinuteAllocation: js.UndefOr[Integer] = js.native
  /**
    * Total scheduled minutes for an account, specific to the month being requested.
    */
  var totalScheduledMinutes: js.UndefOr[Integer] = js.native
  /**
    * Upcoming minutes scheduled for an account, specific to the month being requested.
    */
  var upcomingMinutesScheduled: js.UndefOr[Integer] = js.native
}

object GetMinuteUsageResponse {
  @scala.inline
  def apply(): GetMinuteUsageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMinuteUsageResponse]
  }
  @scala.inline
  implicit class GetMinuteUsageResponseOps[Self <: GetMinuteUsageResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEstimatedMinutesRemaining(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedMinutesRemaining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedMinutesRemaining: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimatedMinutesRemaining")(js.undefined)
        ret
    }
    @scala.inline
    def withIsReservedMinutesCustomer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReservedMinutesCustomer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsReservedMinutesCustomer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReservedMinutesCustomer")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalReservedMinuteAllocation(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalReservedMinuteAllocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalReservedMinuteAllocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalReservedMinuteAllocation")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalScheduledMinutes(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalScheduledMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalScheduledMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalScheduledMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withUpcomingMinutesScheduled(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upcomingMinutesScheduled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpcomingMinutesScheduled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upcomingMinutesScheduled")(js.undefined)
        ret
    }
  }
  
}

