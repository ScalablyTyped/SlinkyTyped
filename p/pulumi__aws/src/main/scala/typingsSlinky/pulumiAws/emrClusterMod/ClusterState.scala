package typingsSlinky.pulumiAws.emrClusterMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.emr.ClusterBootstrapAction
import typingsSlinky.pulumiAws.inputMod.emr.ClusterCoreInstanceGroup
import typingsSlinky.pulumiAws.inputMod.emr.ClusterEc2Attributes
import typingsSlinky.pulumiAws.inputMod.emr.ClusterInstanceGroup
import typingsSlinky.pulumiAws.inputMod.emr.ClusterKerberosAttributes
import typingsSlinky.pulumiAws.inputMod.emr.ClusterMasterInstanceGroup
import typingsSlinky.pulumiAws.inputMod.emr.ClusterStep
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterState extends js.Object {
  /**
    * A JSON string for selecting additional features such as adding proxy information. Note: Currently there is no API to retrieve the value of this argument after EMR cluster creation from provider, therefore this provider cannot detect drift from the actual EMR cluster if its value is changed outside this provider.
    */
  val additionalInfo: js.UndefOr[Input[String]] = js.native
  /**
    * A list of applications for the cluster. Valid values are: `Flink`, `Hadoop`, `Hive`, `Mahout`, `Pig`, `Spark`, and `JupyterHub` (as of EMR 5.14.0). Case insensitive
    */
  val applications: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * An IAM role for automatic scaling policies. The IAM role provides permissions that the automatic scaling feature requires to launch and terminate EC2 instances in an instance group.
    */
  val autoscalingRole: js.UndefOr[Input[String]] = js.native
  /**
    * List of bootstrap actions that will be run before Hadoop is started on the cluster nodes. Defined below
    */
  val bootstrapActions: js.UndefOr[Input[js.Array[Input[ClusterBootstrapAction]]]] = js.native
  val clusterState: js.UndefOr[Input[String]] = js.native
  /**
    * List of configurations supplied for the EMR cluster you are creating
    */
  val configurations: js.UndefOr[Input[String]] = js.native
  /**
    * A JSON string for supplying list of configurations for the EMR cluster.
    */
  val configurationsJson: js.UndefOr[Input[String]] = js.native
  /**
    * Use the `coreInstanceGroup` configuration block `instanceCount` argument instead. Number of Amazon EC2 instances used to execute the job flow. EMR will use one node as the cluster's master node and use the remainder of the nodes (`coreInstanceCount`-1) as core nodes. Cannot be specified if `coreInstanceGroup` or `instanceGroup` configuration blocks are set. Default `1`
    *
    * @deprecated use `core_instance_group` configuration block `instance_count` argument instead
    */
  val coreInstanceCount: js.UndefOr[Input[Double]] = js.native
  /**
    * Configuration block to use an [Instance Group](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-group-configuration.html#emr-plan-instance-groups) for the [core node type](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-master-core-task-nodes.html#emr-plan-core). Cannot be specified if `coreInstanceCount` argument, `coreInstanceType` argument, or `instanceGroup` configuration blocks are set. Detailed below.
    */
  val coreInstanceGroup: js.UndefOr[Input[ClusterCoreInstanceGroup]] = js.native
  /**
    * Use the `coreInstanceGroup` configuration block `instanceType` argument instead. The EC2 instance type of the slave nodes. Cannot be specified if `coreInstanceGroup` or `instanceGroup` configuration blocks are set.
    *
    * @deprecated use `core_instance_group` configuration block `instance_type` argument instead
    */
  val coreInstanceType: js.UndefOr[Input[String]] = js.native
  /**
    * A custom Amazon Linux AMI for the cluster (instead of an EMR-owned AMI). Available in Amazon EMR version 5.7.0 and later.
    */
  val customAmiId: js.UndefOr[Input[String]] = js.native
  /**
    * Size in GiB of the EBS root device volume of the Linux AMI that is used for each EC2 instance. Available in Amazon EMR version 4.x and later.
    */
  val ebsRootVolumeSize: js.UndefOr[Input[Double]] = js.native
  /**
    * Attributes for the EC2 instances running the job flow. Defined below
    */
  val ec2Attributes: js.UndefOr[Input[ClusterEc2Attributes]] = js.native
  /**
    * Use the `masterInstanceGroup` configuration block, `coreInstanceGroup` configuration block and [`aws.emr.InstanceGroup` resource(s)](https://www.terraform.io/docs/providers/aws/r/emr_instance_group.html) instead. A list of `instanceGroup` objects for each instance group in the cluster. Exactly one of `masterInstanceType` and `instanceGroup` must be specified. If `instanceGroup` is set, then it must contain a configuration block for at least the `MASTER` instance group type (as well as any additional instance groups). Cannot be specified if `masterInstanceGroup` or `coreInstanceGroup` configuration blocks are set. Defined below
    *
    * @deprecated use `master_instance_group` configuration block, `core_instance_group` configuration block, and `aws_emr_instance_group` resource(s) instead
    */
  val instanceGroups: js.UndefOr[Input[js.Array[Input[ClusterInstanceGroup]]]] = js.native
  /**
    * Switch on/off run cluster with no steps or when all steps are complete (default is on)
    */
  val keepJobFlowAliveWhenNoSteps: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Kerberos configuration for the cluster. Defined below
    */
  val kerberosAttributes: js.UndefOr[Input[ClusterKerberosAttributes]] = js.native
  /**
    * S3 bucket to write the log files of the job flow. If a value is not provided, logs are not created
    */
  val logUri: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block to use an [Instance Group](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-group-configuration.html#emr-plan-instance-groups) for the [master node type](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-master-core-task-nodes.html#emr-plan-master). Cannot be specified if `masterInstanceType` argument or `instanceGroup` configuration blocks are set. Detailed below.
    */
  val masterInstanceGroup: js.UndefOr[Input[ClusterMasterInstanceGroup]] = js.native
  /**
    * Use the `masterInstanceGroup` configuration block `instanceType` argument instead. The EC2 instance type of the master node. Cannot be specified if `masterInstanceGroup` or `instanceGroup` configuration blocks are set.
    *
    * @deprecated use `master_instance_group` configuration block `instance_type` argument instead
    */
  val masterInstanceType: js.UndefOr[Input[String]] = js.native
  /**
    * The public DNS name of the master EC2 instance.
    * * `core_instance_group.0.id` - Core node type Instance Group ID, if using Instance Group for this node type.
    */
  val masterPublicDns: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the job flow
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The release label for the Amazon EMR release
    */
  val releaseLabel: js.UndefOr[Input[String]] = js.native
  /**
    * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an `instance group` is resized.
    */
  val scaleDownBehavior: js.UndefOr[Input[String]] = js.native
  /**
    * The security configuration name to attach to the EMR cluster. Only valid for EMR clusters with `releaseLabel` 4.8.0 or greater
    */
  val securityConfiguration: js.UndefOr[Input[String]] = js.native
  /**
    * IAM role that will be assumed by the Amazon EMR service to access AWS resources
    */
  val serviceRole: js.UndefOr[Input[String]] = js.native
  /**
    * The number of steps that can be executed concurrently. You can specify a maximum of 256 steps. Only valid for EMR clusters with `releaseLabel` 5.28.0 or greater. (default is 1)
    */
  val stepConcurrencyLevel: js.UndefOr[Input[Double]] = js.native
  /**
    * List of steps to run when creating the cluster. Defined below. It is highly recommended to utilize the [lifecycle configuration block](https://www.terraform.io/docs/configuration/resources.html) with `ignoreChanges` if other steps are being managed outside of this provider. This argument is processed in [attribute-as-blocks mode](https://www.terraform.io/docs/configuration/attr-as-blocks.html).
    */
  val steps: js.UndefOr[Input[js.Array[Input[ClusterStep]]]] = js.native
  /**
    * list of tags to apply to the EMR Cluster
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Switch on/off termination protection (default is `false`, except when using multiple master nodes). Before attempting to destroy the resource when termination protection is enabled, this configuration must be applied with its value set to `false`.
    */
  val terminationProtection: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Whether the job flow is visible to all IAM users of the AWS account associated with the job flow. Default `true`
    */
  val visibleToAllUsers: js.UndefOr[Input[Boolean]] = js.native
}

object ClusterState {
  @scala.inline
  def apply(): ClusterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterState]
  }
  @scala.inline
  implicit class ClusterStateOps[Self <: ClusterState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalInfo(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withApplications(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applications")(js.undefined)
        ret
    }
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoscalingRole(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscalingRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoscalingRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscalingRole")(js.undefined)
        ret
    }
    @scala.inline
    def withBootstrapActions(value: Input[js.Array[Input[ClusterBootstrapAction]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrapActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBootstrapActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootstrapActions")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterState(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterState")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurations(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurations")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurationsJson(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationsJson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationsJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationsJson")(js.undefined)
        ret
    }
    @scala.inline
    def withCoreInstanceCount(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coreInstanceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoreInstanceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coreInstanceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withCoreInstanceGroup(value: Input[ClusterCoreInstanceGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coreInstanceGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoreInstanceGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coreInstanceGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withCoreInstanceType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coreInstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoreInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coreInstanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomAmiId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAmiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomAmiId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAmiId")(js.undefined)
        ret
    }
    @scala.inline
    def withEbsRootVolumeSize(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsRootVolumeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbsRootVolumeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsRootVolumeSize")(js.undefined)
        ret
    }
    @scala.inline
    def withEc2Attributes(value: Input[ClusterEc2Attributes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc2Attributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2Attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceGroups(value: Input[js.Array[Input[ClusterInstanceGroup]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepJobFlowAliveWhenNoSteps(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepJobFlowAliveWhenNoSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepJobFlowAliveWhenNoSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepJobFlowAliveWhenNoSteps")(js.undefined)
        ret
    }
    @scala.inline
    def withKerberosAttributes(value: Input[ClusterKerberosAttributes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kerberosAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKerberosAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kerberosAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withLogUri(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logUri")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterInstanceGroup(value: Input[ClusterMasterInstanceGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterInstanceGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterInstanceGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterInstanceGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterInstanceType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterInstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterInstanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterPublicDns(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterPublicDns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterPublicDns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterPublicDns")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseLabel(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleDownBehavior(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleDownBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleDownBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleDownBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityConfiguration(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceRole(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceRole")(js.undefined)
        ret
    }
    @scala.inline
    def withStepConcurrencyLevel(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepConcurrencyLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepConcurrencyLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepConcurrencyLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withSteps(value: Input[js.Array[Input[ClusterStep]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTerminationProtection(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminationProtection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerminationProtection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminationProtection")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleToAllUsers(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleToAllUsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleToAllUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleToAllUsers")(js.undefined)
        ret
    }
  }
  
}

