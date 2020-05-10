package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobFlowInstancesConfig extends js.Object {
  /**
    * A list of additional Amazon EC2 security group IDs for the master node.
    */
  var AdditionalMasterSecurityGroups: js.UndefOr[SecurityGroupsList] = js.native
  /**
    * A list of additional Amazon EC2 security group IDs for the core and task nodes.
    */
  var AdditionalSlaveSecurityGroups: js.UndefOr[SecurityGroupsList] = js.native
  /**
    * The name of the EC2 key pair that can be used to ssh to the master node as the user called "hadoop."
    */
  var Ec2KeyName: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * Applies to clusters that use the uniform instance group configuration. To launch the cluster in Amazon Virtual Private Cloud (Amazon VPC), set this parameter to the identifier of the Amazon VPC subnet where you want the cluster to launch. If you do not specify this value and your account supports EC2-Classic, the cluster launches in EC2-Classic.
    */
  var Ec2SubnetId: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * Applies to clusters that use the instance fleet configuration. When multiple EC2 subnet IDs are specified, Amazon EMR evaluates them and launches instances in the optimal subnet.  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions. 
    */
  var Ec2SubnetIds: js.UndefOr[XmlStringMaxLen256List] = js.native
  /**
    * The identifier of the Amazon EC2 security group for the master node.
    */
  var EmrManagedMasterSecurityGroup: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * The identifier of the Amazon EC2 security group for the core and task nodes.
    */
  var EmrManagedSlaveSecurityGroup: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * Applies only to Amazon EMR release versions earlier than 4.0. The Hadoop version for the cluster. Valid inputs are "0.18" (deprecated), "0.20" (deprecated), "0.20.205" (deprecated), "1.0.3", "2.2.0", or "2.4.0". If you do not set this value, the default of 0.18 is used, unless the AmiVersion parameter is set in the RunJobFlow call, in which case the default version of Hadoop for that AMI version is used.
    */
  var HadoopVersion: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * The number of EC2 instances in the cluster.
    */
  var InstanceCount: js.UndefOr[Integer] = js.native
  /**
    *  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions.  Describes the EC2 instances and instance configurations for clusters that use the instance fleet configuration.
    */
  var InstanceFleets: js.UndefOr[InstanceFleetConfigList] = js.native
  /**
    * Configuration for the instance groups in a cluster.
    */
  var InstanceGroups: js.UndefOr[InstanceGroupConfigList] = js.native
  /**
    * Specifies whether the cluster should remain available after completing all steps.
    */
  var KeepJobFlowAliveWhenNoSteps: js.UndefOr[Boolean] = js.native
  /**
    * The EC2 instance type of the master node.
    */
  var MasterInstanceType: js.UndefOr[InstanceType] = js.native
  /**
    * The Availability Zone in which the cluster runs.
    */
  var Placement: js.UndefOr[PlacementType] = js.native
  /**
    * The identifier of the Amazon EC2 security group for the Amazon EMR service to access clusters in VPC private subnets.
    */
  var ServiceAccessSecurityGroup: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * The EC2 instance type of the core and task nodes.
    */
  var SlaveInstanceType: js.UndefOr[InstanceType] = js.native
  /**
    * Specifies whether to lock the cluster to prevent the Amazon EC2 instances from being terminated by API call, user intervention, or in the event of a job-flow error.
    */
  var TerminationProtected: js.UndefOr[Boolean] = js.native
}

object JobFlowInstancesConfig {
  @scala.inline
  def apply(): JobFlowInstancesConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobFlowInstancesConfig]
  }
  @scala.inline
  implicit class JobFlowInstancesConfigOps[Self <: JobFlowInstancesConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalMasterSecurityGroups(value: SecurityGroupsList): Self = {
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
    def withAdditionalSlaveSecurityGroups(value: SecurityGroupsList): Self = {
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
    def withEc2KeyName(value: XmlStringMaxLen256): Self = {
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
    def withEc2SubnetId(value: XmlStringMaxLen256): Self = {
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
    def withEc2SubnetIds(value: XmlStringMaxLen256List): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ec2SubnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc2SubnetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ec2SubnetIds")(js.undefined)
        ret
    }
    @scala.inline
    def withEmrManagedMasterSecurityGroup(value: XmlStringMaxLen256): Self = {
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
    def withEmrManagedSlaveSecurityGroup(value: XmlStringMaxLen256): Self = {
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
    def withHadoopVersion(value: XmlStringMaxLen256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HadoopVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHadoopVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HadoopVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceFleets(value: InstanceFleetConfigList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceFleets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceFleets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceFleets")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceGroups(value: InstanceGroupConfigList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepJobFlowAliveWhenNoSteps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeepJobFlowAliveWhenNoSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepJobFlowAliveWhenNoSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeepJobFlowAliveWhenNoSteps")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterInstanceType(value: InstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterInstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterInstanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(value: PlacementType): Self = {
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
    def withServiceAccessSecurityGroup(value: XmlStringMaxLen256): Self = {
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
    @scala.inline
    def withSlaveInstanceType(value: InstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlaveInstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlaveInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlaveInstanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminationProtected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminationProtected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminationProtected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminationProtected")(js.undefined)
        ret
    }
  }
  
}

