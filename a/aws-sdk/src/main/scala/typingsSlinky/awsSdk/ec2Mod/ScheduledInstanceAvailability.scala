package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledInstanceAvailability extends js.Object {
  /**
    * The Availability Zone.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The number of available instances.
    */
  var AvailableInstanceCount: js.UndefOr[Integer] = js.native
  /**
    * The time period for the first schedule to start.
    */
  var FirstSlotStartTime: js.UndefOr[js.Date] = js.native
  /**
    * The hourly price for a single instance.
    */
  var HourlyPrice: js.UndefOr[String] = js.native
  /**
    * The instance type. You can specify one of the C3, C4, M4, or R3 instance types.
    */
  var InstanceType: js.UndefOr[String] = js.native
  /**
    * The maximum term. The only possible value is 365 days.
    */
  var MaxTermDurationInDays: js.UndefOr[Integer] = js.native
  /**
    * The minimum term. The only possible value is 365 days.
    */
  var MinTermDurationInDays: js.UndefOr[Integer] = js.native
  /**
    * The network platform (EC2-Classic or EC2-VPC).
    */
  var NetworkPlatform: js.UndefOr[String] = js.native
  /**
    * The platform (Linux/UNIX or Windows).
    */
  var Platform: js.UndefOr[String] = js.native
  /**
    * The purchase token. This token expires in two hours.
    */
  var PurchaseToken: js.UndefOr[String] = js.native
  /**
    * The schedule recurrence.
    */
  var Recurrence: js.UndefOr[ScheduledInstanceRecurrence] = js.native
  /**
    * The number of hours in the schedule.
    */
  var SlotDurationInHours: js.UndefOr[Integer] = js.native
  /**
    * The total number of hours for a single instance for the entire term.
    */
  var TotalScheduledInstanceHours: js.UndefOr[Integer] = js.native
}

object ScheduledInstanceAvailability {
  @scala.inline
  def apply(): ScheduledInstanceAvailability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledInstanceAvailability]
  }
  @scala.inline
  implicit class ScheduledInstanceAvailabilityOps[Self <: ScheduledInstanceAvailability] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(js.undefined)
        ret
    }
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
    def withFirstSlotStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstSlotStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstSlotStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstSlotStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withHourlyPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HourlyPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHourlyPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HourlyPrice")(js.undefined)
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
    def withMaxTermDurationInDays(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxTermDurationInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTermDurationInDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxTermDurationInDays")(js.undefined)
        ret
    }
    @scala.inline
    def withMinTermDurationInDays(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinTermDurationInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinTermDurationInDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinTermDurationInDays")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkPlatform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkPlatform")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Platform")(js.undefined)
        ret
    }
    @scala.inline
    def withPurchaseToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PurchaseToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurchaseToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PurchaseToken")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurrence(value: ScheduledInstanceRecurrence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Recurrence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurrence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Recurrence")(js.undefined)
        ret
    }
    @scala.inline
    def withSlotDurationInHours(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlotDurationInHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlotDurationInHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlotDurationInHours")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalScheduledInstanceHours(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalScheduledInstanceHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalScheduledInstanceHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalScheduledInstanceHours")(js.undefined)
        ret
    }
  }
  
}

