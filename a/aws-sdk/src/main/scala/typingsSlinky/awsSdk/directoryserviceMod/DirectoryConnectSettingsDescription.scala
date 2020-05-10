package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryConnectSettingsDescription extends js.Object {
  /**
    * A list of the Availability Zones that the directory is in.
    */
  var AvailabilityZones: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.AvailabilityZones] = js.native
  /**
    * The IP addresses of the AD Connector servers.
    */
  var ConnectIps: js.UndefOr[IpAddrs] = js.native
  /**
    * The user name of the service account in the on-premises directory.
    */
  var CustomerUserName: js.UndefOr[UserName] = js.native
  /**
    * The security group identifier for the AD Connector directory.
    */
  var SecurityGroupId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.SecurityGroupId] = js.native
  /**
    * A list of subnet identifiers in the VPC that the AD Connector is in.
    */
  var SubnetIds: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.SubnetIds] = js.native
  /**
    * The identifier of the VPC that the AD Connector is in.
    */
  var VpcId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.VpcId] = js.native
}

object DirectoryConnectSettingsDescription {
  @scala.inline
  def apply(): DirectoryConnectSettingsDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryConnectSettingsDescription]
  }
  @scala.inline
  implicit class DirectoryConnectSettingsDescriptionOps[Self <: DirectoryConnectSettingsDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZones(value: AvailabilityZones): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZones")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectIps(value: IpAddrs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectIps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectIps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectIps")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerUserName(value: UserName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerUserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerUserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerUserName")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroupId(value: SecurityGroupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetIds(value: SubnetIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIds")(js.undefined)
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

