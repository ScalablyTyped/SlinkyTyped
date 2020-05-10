package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedInstancesListing extends js.Object {
  /**
    * A unique, case-sensitive key supplied by the client to ensure that the request is idempotent. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * The time the listing was created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.native
  /**
    * The number of instances in this state.
    */
  var InstanceCounts: js.UndefOr[InstanceCountList] = js.native
  /**
    * The price of the Reserved Instance listing.
    */
  var PriceSchedules: js.UndefOr[PriceScheduleList] = js.native
  /**
    * The ID of the Reserved Instance.
    */
  var ReservedInstancesId: js.UndefOr[String] = js.native
  /**
    * The ID of the Reserved Instance listing.
    */
  var ReservedInstancesListingId: js.UndefOr[String] = js.native
  /**
    * The status of the Reserved Instance listing.
    */
  var Status: js.UndefOr[ListingStatus] = js.native
  /**
    * The reason for the current status of the Reserved Instance listing. The response can be blank.
    */
  var StatusMessage: js.UndefOr[String] = js.native
  /**
    * Any tags assigned to the resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The last modified timestamp of the listing.
    */
  var UpdateDate: js.UndefOr[js.Date] = js.native
}

object ReservedInstancesListing {
  @scala.inline
  def apply(): ReservedInstancesListing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedInstancesListing]
  }
  @scala.inline
  implicit class ReservedInstancesListingOps[Self <: ReservedInstancesListing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateDate")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceCounts(value: InstanceCountList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceCounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceCounts")(js.undefined)
        ret
    }
    @scala.inline
    def withPriceSchedules(value: PriceScheduleList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PriceSchedules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriceSchedules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PriceSchedules")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedInstancesId(value: String): Self = {
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
    def withReservedInstancesListingId(value: String): Self = {
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
    @scala.inline
    def withStatus(value: ListingStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateDate")(js.undefined)
        ret
    }
  }
  
}

