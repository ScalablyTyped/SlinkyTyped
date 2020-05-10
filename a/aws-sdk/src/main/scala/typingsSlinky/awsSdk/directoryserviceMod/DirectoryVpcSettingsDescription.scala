package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryVpcSettingsDescription extends js.Object {
  /**
    * The list of Availability Zones that the directory is in.
    */
  var AvailabilityZones: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.AvailabilityZones] = js.native
  /**
    * The domain controller security group identifier for the directory.
    */
  var SecurityGroupId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.SecurityGroupId] = js.native
  /**
    * The identifiers of the subnets for the directory servers.
    */
  var SubnetIds: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.SubnetIds] = js.native
  /**
    * The identifier of the VPC that the directory is in.
    */
  var VpcId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.VpcId] = js.native
}

object DirectoryVpcSettingsDescription {
  @scala.inline
  def apply(): DirectoryVpcSettingsDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryVpcSettingsDescription]
  }
  @scala.inline
  implicit class DirectoryVpcSettingsDescriptionOps[Self <: DirectoryVpcSettingsDescription] (val x: Self) extends AnyVal {
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

