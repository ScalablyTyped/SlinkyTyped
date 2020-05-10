package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Host extends js.Object {
  /**
    * The time that the Dedicated Host was allocated.
    */
  var AllocationTime: js.UndefOr[js.Date] = js.native
  /**
    * Indicates whether the Dedicated Host supports multiple instance types of the same instance family, or a specific instance type only. one indicates that the Dedicated Host supports multiple instance types in the instance family. off indicates that the Dedicated Host supports a single instance type only.
    */
  var AllowsMultipleInstanceTypes: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.AllowsMultipleInstanceTypes] = js.native
  /**
    * Whether auto-placement is on or off.
    */
  var AutoPlacement: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.AutoPlacement] = js.native
  /**
    * The Availability Zone of the Dedicated Host.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The ID of the Availability Zone in which the Dedicated Host is allocated.
    */
  var AvailabilityZoneId: js.UndefOr[String] = js.native
  /**
    * Information about the instances running on the Dedicated Host.
    */
  var AvailableCapacity: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.AvailableCapacity] = js.native
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * The ID of the Dedicated Host.
    */
  var HostId: js.UndefOr[String] = js.native
  /**
    * The hardware specifications of the Dedicated Host.
    */
  var HostProperties: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.HostProperties] = js.native
  /**
    * Indicates whether host recovery is enabled or disabled for the Dedicated Host.
    */
  var HostRecovery: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.HostRecovery] = js.native
  /**
    * The reservation ID of the Dedicated Host. This returns a null response if the Dedicated Host doesn't have an associated reservation.
    */
  var HostReservationId: js.UndefOr[String] = js.native
  /**
    * The IDs and instance type that are currently running on the Dedicated Host.
    */
  var Instances: js.UndefOr[HostInstanceList] = js.native
  /**
    * Indicates whether the Dedicated Host is in a host resource group. If memberOfServiceLinkedResourceGroup is true, the host is in a host resource group; otherwise, it is not.
    */
  var MemberOfServiceLinkedResourceGroup: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the AWS account that owns the Dedicated Host.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * The time that the Dedicated Host was released.
    */
  var ReleaseTime: js.UndefOr[js.Date] = js.native
  /**
    * The Dedicated Host's state.
    */
  var State: js.UndefOr[AllocationState] = js.native
  /**
    * Any tags assigned to the Dedicated Host.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object Host {
  @scala.inline
  def apply(): Host = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Host]
  }
  @scala.inline
  implicit class HostOps[Self <: Host] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllocationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllocationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllocationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllocationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowsMultipleInstanceTypes(value: AllowsMultipleInstanceTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowsMultipleInstanceTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowsMultipleInstanceTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowsMultipleInstanceTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoPlacement(value: AutoPlacement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoPlacement")(js.undefined)
        ret
    }
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
    def withAvailabilityZoneId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZoneId")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailableCapacity(value: AvailableCapacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailableCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailableCapacity")(js.undefined)
        ret
    }
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
    def withHostId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostId")(js.undefined)
        ret
    }
    @scala.inline
    def withHostProperties(value: HostProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withHostRecovery(value: HostRecovery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostRecovery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostRecovery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostRecovery")(js.undefined)
        ret
    }
    @scala.inline
    def withHostReservationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostReservationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostReservationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostReservationId")(js.undefined)
        ret
    }
    @scala.inline
    def withInstances(value: HostInstanceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Instances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Instances")(js.undefined)
        ret
    }
    @scala.inline
    def withMemberOfServiceLinkedResourceGroup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberOfServiceLinkedResourceGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemberOfServiceLinkedResourceGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberOfServiceLinkedResourceGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReleaseTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReleaseTime")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: AllocationState): Self = {
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
  }
  
}

