package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ec2InstanceAttributes extends js.Object {
  /**
    * A list of additional Amazon EC2 security group IDs for the master node.
    */
  var AdditionalMasterSecurityGroups: js.UndefOr[StringList] = js.native
  /**
    * A list of additional Amazon EC2 security group IDs for the core and task nodes.
    */
  var AdditionalSlaveSecurityGroups: js.UndefOr[StringList] = js.native
  /**
    * The Availability Zone in which the cluster will run. 
    */
  var Ec2AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The name of the Amazon EC2 key pair to use when connecting with SSH into the master node as a user named "hadoop".
    */
  var Ec2KeyName: js.UndefOr[String] = js.native
  /**
    * Set this parameter to the identifier of the Amazon VPC subnet where you want the cluster to launch. If you do not specify this value, and your account supports EC2-Classic, the cluster launches in EC2-Classic.
    */
  var Ec2SubnetId: js.UndefOr[String] = js.native
  /**
    * The identifier of the Amazon EC2 security group for the master node.
    */
  var EmrManagedMasterSecurityGroup: js.UndefOr[String] = js.native
  /**
    * The identifier of the Amazon EC2 security group for the core and task nodes.
    */
  var EmrManagedSlaveSecurityGroup: js.UndefOr[String] = js.native
  /**
    * The IAM role that was specified when the cluster was launched. The EC2 instances of the cluster assume this role.
    */
  var IamInstanceProfile: js.UndefOr[String] = js.native
  /**
    * Applies to clusters configured with the instance fleets option. Specifies one or more Availability Zones in which to launch EC2 cluster instances when the EC2-Classic network configuration is supported. Amazon EMR chooses the Availability Zone with the best fit from among the list of RequestedEc2AvailabilityZones, and then launches all cluster instances within that Availability Zone. If you do not specify this value, Amazon EMR chooses the Availability Zone for you. RequestedEc2SubnetIDs and RequestedEc2AvailabilityZones cannot be specified together.
    */
  var RequestedEc2AvailabilityZones: js.UndefOr[XmlStringMaxLen256List] = js.native
  /**
    * Applies to clusters configured with the instance fleets option. Specifies the unique identifier of one or more Amazon EC2 subnets in which to launch EC2 cluster instances. Subnets must exist within the same VPC. Amazon EMR chooses the EC2 subnet with the best fit from among the list of RequestedEc2SubnetIds, and then launches all cluster instances within that Subnet. If this value is not specified, and the account and Region support EC2-Classic networks, the cluster launches instances in the EC2-Classic network and uses RequestedEc2AvailabilityZones instead of this setting. If EC2-Classic is not supported, and no Subnet is specified, Amazon EMR chooses the subnet for you. RequestedEc2SubnetIDs and RequestedEc2AvailabilityZones cannot be specified together.
    */
  var RequestedEc2SubnetIds: js.UndefOr[XmlStringMaxLen256List] = js.native
  /**
    * The identifier of the Amazon EC2 security group for the Amazon EMR service to access clusters in VPC private subnets.
    */
  var ServiceAccessSecurityGroup: js.UndefOr[String] = js.native
}

object Ec2InstanceAttributes {
  @scala.inline
  def apply(): Ec2InstanceAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ec2InstanceAttributes]
  }
  @scala.inline
  implicit class Ec2InstanceAttributesOps[Self <: Ec2InstanceAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalMasterSecurityGroups(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalMasterSecurityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalMasterSecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalMasterSecurityGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditionalSlaveSecurityGroups(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalSlaveSecurityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalSlaveSecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdditionalSlaveSecurityGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withEc2AvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ec2AvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc2AvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ec2AvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withEc2KeyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ec2KeyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc2KeyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ec2KeyName")(js.undefined)
        ret
    }
    @scala.inline
    def withEc2SubnetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ec2SubnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc2SubnetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ec2SubnetId")(js.undefined)
        ret
    }
    @scala.inline
    def withEmrManagedMasterSecurityGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmrManagedMasterSecurityGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmrManagedMasterSecurityGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmrManagedMasterSecurityGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withEmrManagedSlaveSecurityGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmrManagedSlaveSecurityGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmrManagedSlaveSecurityGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmrManagedSlaveSecurityGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withIamInstanceProfile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamInstanceProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamInstanceProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamInstanceProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestedEc2AvailabilityZones(value: XmlStringMaxLen256List): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestedEc2AvailabilityZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedEc2AvailabilityZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestedEc2AvailabilityZones")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestedEc2SubnetIds(value: XmlStringMaxLen256List): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestedEc2SubnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedEc2SubnetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestedEc2SubnetIds")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAccessSecurityGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceAccessSecurityGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccessSecurityGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceAccessSecurityGroup")(js.undefined)
        ret
    }
  }
  
}

