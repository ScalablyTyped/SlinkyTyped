package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainController extends js.Object {
  /**
    * The Availability Zone where the domain controller is located.
    */
  var AvailabilityZone: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.AvailabilityZone] = js.native
  /**
    * Identifier of the directory where the domain controller resides.
    */
  var DirectoryId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.DirectoryId] = js.native
  /**
    * The IP address of the domain controller.
    */
  var DnsIpAddr: js.UndefOr[IpAddr] = js.native
  /**
    * Identifies a specific domain controller in the directory.
    */
  var DomainControllerId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.DomainControllerId] = js.native
  /**
    * Specifies when the domain controller was created.
    */
  var LaunchTime: js.UndefOr[js.Date] = js.native
  /**
    * The status of the domain controller.
    */
  var Status: js.UndefOr[DomainControllerStatus] = js.native
  /**
    * The date and time that the status was last updated.
    */
  var StatusLastUpdatedDateTime: js.UndefOr[js.Date] = js.native
  /**
    * A description of the domain controller state.
    */
  var StatusReason: js.UndefOr[DomainControllerStatusReason] = js.native
  /**
    * Identifier of the subnet in the VPC that contains the domain controller.
    */
  var SubnetId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.SubnetId] = js.native
  /**
    * The identifier of the VPC that contains the domain controller.
    */
  var VpcId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.VpcId] = js.native
}

object DomainController {
  @scala.inline
  def apply(): DomainController = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainController]
  }
  @scala.inline
  implicit class DomainControllerOps[Self <: DomainController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZone(value: AvailabilityZone): Self = {
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
    def withDirectoryId(value: DirectoryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryId")(js.undefined)
        ret
    }
    @scala.inline
    def withDnsIpAddr(value: IpAddr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsIpAddr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsIpAddr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsIpAddr")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainControllerId(value: DomainControllerId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainControllerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainControllerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainControllerId")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: DomainControllerStatus): Self = {
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
    def withStatusLastUpdatedDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusLastUpdatedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusLastUpdatedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusLastUpdatedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusReason(value: DomainControllerStatusReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusReason")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetId(value: SubnetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcId(value: VpcId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(js.undefined)
        ret
    }
  }
  
}

