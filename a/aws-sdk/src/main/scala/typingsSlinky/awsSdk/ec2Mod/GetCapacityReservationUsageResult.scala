package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCapacityReservationUsageResult extends js.Object {
  /**
    * The remaining capacity. Indicates the number of instances that can be launched in the Capacity Reservation.
    */
  var AvailableInstanceCount: js.UndefOr[Integer] = js.native
  /**
    * The ID of the Capacity Reservation.
    */
  var CapacityReservationId: js.UndefOr[String] = js.native
  /**
    * The type of instance for which the Capacity Reservation reserves capacity.
    */
  var InstanceType: js.UndefOr[String] = js.native
  /**
    * Information about the Capacity Reservation usage.
    */
  var InstanceUsages: js.UndefOr[InstanceUsageSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The current state of the Capacity Reservation. A Capacity Reservation can be in one of the following states:    active - The Capacity Reservation is active and the capacity is available for your use.    expired - The Capacity Reservation expired automatically at the date and time specified in your request. The reserved capacity is no longer available for your use.    cancelled - The Capacity Reservation was manually cancelled. The reserved capacity is no longer available for your use.    pending - The Capacity Reservation request was successful but the capacity provisioning is still pending.    failed - The Capacity Reservation request has failed. A request might fail due to invalid request parameters, capacity constraints, or instance limit constraints. Failed requests are retained for 60 minutes.  
    */
  var State: js.UndefOr[CapacityReservationState] = js.native
  /**
    * The number of instances for which the Capacity Reservation reserves capacity.
    */
  var TotalInstanceCount: js.UndefOr[Integer] = js.native
}

object GetCapacityReservationUsageResult {
  @scala.inline
  def apply(): GetCapacityReservationUsageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCapacityReservationUsageResult]
  }
  @scala.inline
  implicit class GetCapacityReservationUsageResultOps[Self <: GetCapacityReservationUsageResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailableInstanceCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailableInstanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableInstanceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailableInstanceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withCapacityReservationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapacityReservationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacityReservationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapacityReservationId")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceUsages(value: InstanceUsageSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceUsages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceUsages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceUsages")(js.undefined)
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
    @scala.inline
    def withState(value: CapacityReservationState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalInstanceCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalInstanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalInstanceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalInstanceCount")(js.undefined)
        ret
    }
  }
  
}

