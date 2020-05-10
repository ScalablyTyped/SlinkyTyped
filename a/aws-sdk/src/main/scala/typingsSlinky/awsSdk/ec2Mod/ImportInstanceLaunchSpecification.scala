package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportInstanceLaunchSpecification extends js.Object {
  /**
    * Reserved.
    */
  var AdditionalInfo: js.UndefOr[String] = js.native
  /**
    * The architecture of the instance.
    */
  var Architecture: js.UndefOr[ArchitectureValues] = js.native
  /**
    * The security group IDs.
    */
  var GroupIds: js.UndefOr[SecurityGroupIdStringList] = js.native
  /**
    * The security group names.
    */
  var GroupNames: js.UndefOr[SecurityGroupStringList] = js.native
  /**
    * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the operating system command for system shutdown).
    */
  var InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior] = js.native
  /**
    * The instance type. For more information about the instance types that you can import, see Instance Types in the VM Import/Export User Guide.
    */
  var InstanceType: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.InstanceType] = js.native
  /**
    * Indicates whether monitoring is enabled.
    */
  var Monitoring: js.UndefOr[Boolean] = js.native
  /**
    * The placement information for the instance.
    */
  var Placement: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.Placement] = js.native
  /**
    * [EC2-VPC] An available IP address from the IP address range of the subnet.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
  /**
    * [EC2-VPC] The ID of the subnet in which to launch the instance.
    */
  var SubnetId: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.SubnetId] = js.native
  /**
    * The Base64-encoded user data to make available to the instance.
    */
  var UserData: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.UserData] = js.native
}

object ImportInstanceLaunchSpecification {
  @scala.inline
  def apply(): ImportInstanceLaunchSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportInstanceLaunchSpecification]
  }
  @scala.inline
  implicit class ImportInstanceLaunchSpecificationOps[Self <: ImportInstanceLaunchSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withArchitecture(value: ArchitectureValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Architecture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArchitecture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Architecture")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupIds(value: SecurityGroupIdStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupIds")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupNames(value: SecurityGroupStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupNames")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceInitiatedShutdownBehavior(value: ShutdownBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceInitiatedShutdownBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceInitiatedShutdownBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceInitiatedShutdownBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: InstanceType): Self = {
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
    def withMonitoring(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Monitoring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitoring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Monitoring")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(value: Placement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Placement")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateIpAddress")(js.undefined)
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
    def withUserData(value: UserData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserData")(js.undefined)
        ret
    }
  }
  
}

