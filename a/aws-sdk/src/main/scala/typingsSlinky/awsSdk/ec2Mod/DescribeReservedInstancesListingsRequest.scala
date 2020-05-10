package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReservedInstancesListingsRequest extends js.Object {
  /**
    * One or more filters.    reserved-instances-id - The ID of the Reserved Instances.    reserved-instances-listing-id - The ID of the Reserved Instances listing.    status - The status of the Reserved Instance listing (pending | active | cancelled | closed).    status-message - The reason for the status.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * One or more Reserved Instance IDs.
    */
  var ReservedInstancesId: js.UndefOr[ReservationId] = js.native
  /**
    * One or more Reserved Instance listing IDs.
    */
  var ReservedInstancesListingId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ReservedInstancesListingId] = js.native
}

object DescribeReservedInstancesListingsRequest {
  @scala.inline
  def apply(): DescribeReservedInstancesListingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedInstancesListingsRequest]
  }
  @scala.inline
  implicit class DescribeReservedInstancesListingsRequestOps[Self <: DescribeReservedInstancesListingsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withReservedInstancesId(value: ReservationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedInstancesId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedInstancesId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedInstancesId")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedInstancesListingId(value: ReservedInstancesListingId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedInstancesListingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedInstancesListingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedInstancesListingId")(js.undefined)
        ret
    }
  }
  
}

