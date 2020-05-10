package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerLaunchConfiguration extends js.Object {
  /**
    * If true, a publicly accessible IP address is created when launching the server.
    */
  var associatePublicIpAddress: js.UndefOr[AssociatePublicIpAddress] = js.native
  /**
    * Name of the EC2 SSH Key to be used for connecting to the launched server.
    */
  var ec2KeyName: js.UndefOr[EC2KeyName] = js.native
  /**
    * Instance type to be used for launching the server.
    */
  var instanceType: js.UndefOr[InstanceType] = js.native
  /**
    * Logical ID of the server in the Amazon CloudFormation template.
    */
  var logicalId: js.UndefOr[LogicalId] = js.native
  /**
    * Identifier of the security group that applies to the launched server.
    */
  var securityGroup: js.UndefOr[SecurityGroup] = js.native
  /**
    * Identifier of the server the launch configuration is associated with.
    */
  var server: js.UndefOr[Server] = js.native
  /**
    * Identifier of the subnet the server should be launched into.
    */
  var subnet: js.UndefOr[Subnet] = js.native
  /**
    * Location of the user-data script to be executed when launching the server.
    */
  var userData: js.UndefOr[UserData] = js.native
  /**
    * Identifier of the VPC the server should be launched into.
    */
  var vpc: js.UndefOr[VPC] = js.native
}

object ServerLaunchConfiguration {
  @scala.inline
  def apply(): ServerLaunchConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerLaunchConfiguration]
  }
  @scala.inline
  implicit class ServerLaunchConfigurationOps[Self <: ServerLaunchConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociatePublicIpAddress(value: AssociatePublicIpAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatePublicIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociatePublicIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatePublicIpAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withEc2KeyName(value: EC2KeyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2KeyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc2KeyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2KeyName")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: InstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withLogicalId(value: LogicalId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logicalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogicalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logicalId")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroup(value: SecurityGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withServer(value: Server): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnet(value: Subnet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnet")(js.undefined)
        ret
    }
    @scala.inline
    def withUserData(value: UserData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(js.undefined)
        ret
    }
    @scala.inline
    def withVpc(value: VPC): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpc")(js.undefined)
        ret
    }
  }
  
}

