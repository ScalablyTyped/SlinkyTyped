package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobFlowInstancesDetail extends js.Object {
  /**
    * The name of an Amazon EC2 key pair that can be used to ssh to the master node.
    */
  var Ec2KeyName: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * For clusters launched within Amazon Virtual Private Cloud, this is the identifier of the subnet where the cluster was launched.
    */
  var Ec2SubnetId: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * The Hadoop version for the cluster.
    */
  var HadoopVersion: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * The number of Amazon EC2 instances in the cluster. If the value is 1, the same instance serves as both the master and core and task node. If the value is greater than 1, one instance is the master node and all others are core and task nodes.
    */
  var InstanceCount: Integer = js.native
  /**
    * Details about the instance groups in a cluster.
    */
  var InstanceGroups: js.UndefOr[InstanceGroupDetailList] = js.native
  /**
    * Specifies whether the cluster should remain available after completing all steps.
    */
  var KeepJobFlowAliveWhenNoSteps: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon EC2 instance identifier of the master node.
    */
  var MasterInstanceId: js.UndefOr[XmlString] = js.native
  /**
    * The Amazon EC2 master node instance type.
    */
  var MasterInstanceType: InstanceType = js.native
  /**
    * The DNS name of the master node. If the cluster is on a private subnet, this is the private DNS name. On a public subnet, this is the public DNS name.
    */
  var MasterPublicDnsName: js.UndefOr[XmlString] = js.native
  /**
    * An approximation of the cost of the cluster, represented in m1.small/hours. This value is incremented one time for every hour that an m1.small runs. Larger instances are weighted more, so an Amazon EC2 instance that is roughly four times more expensive would result in the normalized instance hours being incremented by four. This result is only an approximation and does not reflect the actual billing rate.
    */
  var NormalizedInstanceHours: js.UndefOr[Integer] = js.native
  /**
    * The Amazon EC2 Availability Zone for the cluster.
    */
  var Placement: js.UndefOr[PlacementType] = js.native
  /**
    * The Amazon EC2 core and task node instance type.
    */
  var SlaveInstanceType: InstanceType = js.native
  /**
    * Specifies whether the Amazon EC2 instances in the cluster are protected from termination by API calls, user intervention, or in the event of a job-flow error.
    */
  var TerminationProtected: js.UndefOr[Boolean] = js.native
}

object JobFlowInstancesDetail {
  @scala.inline
  def apply(InstanceCount: Integer, MasterInstanceType: InstanceType, SlaveInstanceType: InstanceType): JobFlowInstancesDetail = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount.asInstanceOf[js.Any], MasterInstanceType = MasterInstanceType.asInstanceOf[js.Any], SlaveInstanceType = SlaveInstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobFlowInstancesDetail]
  }
  @scala.inline
  implicit class JobFlowInstancesDetailOps[Self <: JobFlowInstancesDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMasterInstanceType(value: InstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterInstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlaveInstanceType(value: InstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlaveInstanceType")(value.asInstanceOf[js.Any])
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
    def withInstanceGroups(value: InstanceGroupDetailList): Self = {
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
    def withMasterInstanceId(value: XmlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterInstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterInstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterPublicDnsName(value: XmlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterPublicDnsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterPublicDnsName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterPublicDnsName")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalizedInstanceHours(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NormalizedInstanceHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalizedInstanceHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NormalizedInstanceHours")(js.undefined)
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

