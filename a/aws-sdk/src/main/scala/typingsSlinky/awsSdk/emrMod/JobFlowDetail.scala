package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobFlowDetail extends js.Object {
  /**
    * Applies only to Amazon EMR AMI versions 3.x and 2.x. For Amazon EMR releases 4.0 and later, ReleaseLabel is used. To specify a custom AMI, use CustomAmiID.
    */
  var AmiVersion: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * An IAM role for automatic scaling policies. The default role is EMR_AutoScaling_DefaultRole. The IAM role provides a way for the automatic scaling feature to get the required permissions it needs to launch and terminate EC2 instances in an instance group.
    */
  var AutoScalingRole: js.UndefOr[XmlString] = js.native
  /**
    * A list of the bootstrap actions run by the job flow.
    */
  var BootstrapActions: js.UndefOr[BootstrapActionDetailList] = js.native
  /**
    * Describes the execution status of the job flow.
    */
  var ExecutionStatusDetail: JobFlowExecutionStatusDetail = js.native
  /**
    * Describes the Amazon EC2 instances of the job flow.
    */
  var Instances: JobFlowInstancesDetail = js.native
  /**
    * The job flow identifier.
    */
  var JobFlowId: XmlStringMaxLen256 = js.native
  /**
    * The IAM role that was specified when the job flow was launched. The EC2 instances of the job flow assume this role.
    */
  var JobFlowRole: js.UndefOr[XmlString] = js.native
  /**
    * The location in Amazon S3 where log files for the job are stored.
    */
  var LogUri: js.UndefOr[XmlString] = js.native
  /**
    * The name of the job flow.
    */
  var Name: XmlStringMaxLen256 = js.native
  /**
    * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an instance group is resized. TERMINATE_AT_INSTANCE_HOUR indicates that Amazon EMR terminates nodes at the instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option is only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version. TERMINATE_AT_TASK_COMPLETION indicates that Amazon EMR blacklists and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption. TERMINATE_AT_TASK_COMPLETION available only in Amazon EMR version 4.1.0 and later, and is the default for versions of Amazon EMR earlier than 5.1.0.
    */
  var ScaleDownBehavior: js.UndefOr[typingsSlinky.awsSdk.emrMod.ScaleDownBehavior] = js.native
  /**
    * The IAM role that will be assumed by the Amazon EMR service to access AWS resources on your behalf.
    */
  var ServiceRole: js.UndefOr[XmlString] = js.native
  /**
    * A list of steps run by the job flow.
    */
  var Steps: js.UndefOr[StepDetailList] = js.native
  /**
    * A list of strings set by third party software when the job flow is launched. If you are not using third party software to manage the job flow this value is empty.
    */
  var SupportedProducts: js.UndefOr[SupportedProductsList] = js.native
  /**
    * Indicates whether the cluster is visible to all IAM users of the AWS account associated with the cluster. The default value, true, indicates that all IAM users in the AWS account can perform cluster actions if they have the proper IAM policy permissions. If this value is false, only the IAM user that created the cluster can perform actions. This value can be changed on a running cluster by using the SetVisibleToAllUsers action. You can override the default value of true when you create a cluster by using the VisibleToAllUsers parameter of the RunJobFlow action.
    */
  var VisibleToAllUsers: js.UndefOr[Boolean] = js.native
}

object JobFlowDetail {
  @scala.inline
  def apply(
    ExecutionStatusDetail: JobFlowExecutionStatusDetail,
    Instances: JobFlowInstancesDetail,
    JobFlowId: XmlStringMaxLen256,
    Name: XmlStringMaxLen256
  ): JobFlowDetail = {
    val __obj = js.Dynamic.literal(ExecutionStatusDetail = ExecutionStatusDetail.asInstanceOf[js.Any], Instances = Instances.asInstanceOf[js.Any], JobFlowId = JobFlowId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobFlowDetail]
  }
  @scala.inline
  implicit class JobFlowDetailOps[Self <: JobFlowDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecutionStatusDetail(value: JobFlowExecutionStatusDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionStatusDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstances(value: JobFlowInstancesDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Instances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobFlowId(value: XmlStringMaxLen256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobFlowId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: XmlStringMaxLen256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmiVersion(value: XmlStringMaxLen256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmiVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmiVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoScalingRole(value: XmlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScalingRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoScalingRole")(js.undefined)
        ret
    }
    @scala.inline
    def withBootstrapActions(value: BootstrapActionDetailList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BootstrapActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBootstrapActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BootstrapActions")(js.undefined)
        ret
    }
    @scala.inline
    def withJobFlowRole(value: XmlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobFlowRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobFlowRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobFlowRole")(js.undefined)
        ret
    }
    @scala.inline
    def withLogUri(value: XmlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogUri")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleDownBehavior(value: ScaleDownBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScaleDownBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleDownBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScaleDownBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceRole(value: XmlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceRole")(js.undefined)
        ret
    }
    @scala.inline
    def withSteps(value: StepDetailList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Steps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Steps")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedProducts(value: SupportedProductsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedProducts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedProducts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedProducts")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleToAllUsers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VisibleToAllUsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleToAllUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VisibleToAllUsers")(js.undefined)
        ret
    }
  }
  
}

