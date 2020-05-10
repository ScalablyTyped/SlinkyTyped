package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster extends js.Object {
  /**
    * The applications installed on this cluster.
    */
  var Applications: js.UndefOr[ApplicationList] = js.native
  /**
    * An IAM role for automatic scaling policies. The default role is EMR_AutoScaling_DefaultRole. The IAM role provides permissions that the automatic scaling feature requires to launch and terminate EC2 instances in an instance group.
    */
  var AutoScalingRole: js.UndefOr[XmlString] = js.native
  /**
    * Specifies whether the cluster should terminate after completing all steps.
    */
  var AutoTerminate: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Name of the cluster.
    */
  var ClusterArn: js.UndefOr[ArnType] = js.native
  /**
    * Applies only to Amazon EMR releases 4.x and later. The list of Configurations supplied to the EMR cluster.
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.native
  /**
    * Available only in Amazon EMR version 5.7.0 and later. The ID of a custom Amazon EBS-backed Linux AMI if the cluster uses a custom AMI.
    */
  var CustomAmiId: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * The size, in GiB, of the EBS root device volume of the Linux AMI that is used for each EC2 instance. Available in Amazon EMR version 4.x and later.
    */
  var EbsRootVolumeSize: js.UndefOr[Integer] = js.native
  /**
    * Provides information about the EC2 instances in a cluster grouped by category. For example, key name, subnet ID, IAM instance profile, and so on.
    */
  var Ec2InstanceAttributes: js.UndefOr[typingsSlinky.awsSdk.emrMod.Ec2InstanceAttributes] = js.native
  /**
    * The unique identifier for the cluster.
    */
  var Id: js.UndefOr[ClusterId] = js.native
  /**
    *  The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions.  The instance group configuration of the cluster. A value of INSTANCE_GROUP indicates a uniform instance group configuration. A value of INSTANCE_FLEET indicates an instance fleets configuration.
    */
  var InstanceCollectionType: js.UndefOr[typingsSlinky.awsSdk.emrMod.InstanceCollectionType] = js.native
  /**
    * Attributes for Kerberos configuration when Kerberos authentication is enabled using a security configuration. For more information see Use Kerberos Authentication in the EMR Management Guide.
    */
  var KerberosAttributes: js.UndefOr[typingsSlinky.awsSdk.emrMod.KerberosAttributes] = js.native
  /**
    * The path to the Amazon S3 location where logs for this cluster are stored.
    */
  var LogUri: js.UndefOr[String] = js.native
  /**
    * The DNS name of the master node. If the cluster is on a private subnet, this is the private DNS name. On a public subnet, this is the public DNS name.
    */
  var MasterPublicDnsName: js.UndefOr[String] = js.native
  /**
    * The name of the cluster.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * An approximation of the cost of the cluster, represented in m1.small/hours. This value is incremented one time for every hour an m1.small instance runs. Larger instances are weighted more, so an EC2 instance that is roughly four times more expensive would result in the normalized instance hours being incremented by four. This result is only an approximation and does not reflect the actual billing rate.
    */
  var NormalizedInstanceHours: js.UndefOr[Integer] = js.native
  /**
    *  The Amazon Resource Name (ARN) of the Outpost where the cluster is launched. 
    */
  var OutpostArn: js.UndefOr[OptionalArnType] = js.native
  /**
    * The Amazon EMR release label, which determines the version of open-source application packages installed on the cluster. Release labels are in the form emr-x.x.x, where x.x.x is an Amazon EMR release version such as emr-5.14.0. For more information about Amazon EMR release versions and included application versions and features, see https://docs.aws.amazon.com/emr/latest/ReleaseGuide/. The release label applies only to Amazon EMR releases version 4.0 and later. Earlier versions use AmiVersion.
    */
  var ReleaseLabel: js.UndefOr[String] = js.native
  /**
    * Applies only when CustomAmiID is used. Specifies the type of updates that are applied from the Amazon Linux AMI package repositories when an instance boots using the AMI.
    */
  var RepoUpgradeOnBoot: js.UndefOr[typingsSlinky.awsSdk.emrMod.RepoUpgradeOnBoot] = js.native
  /**
    * The AMI version requested for this cluster.
    */
  var RequestedAmiVersion: js.UndefOr[String] = js.native
  /**
    * The AMI version running on this cluster.
    */
  var RunningAmiVersion: js.UndefOr[String] = js.native
  /**
    * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an instance group is resized. TERMINATE_AT_INSTANCE_HOUR indicates that Amazon EMR terminates nodes at the instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option is only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version. TERMINATE_AT_TASK_COMPLETION indicates that Amazon EMR blacklists and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption. TERMINATE_AT_TASK_COMPLETION is available only in Amazon EMR version 4.1.0 and later, and is the default for versions of Amazon EMR earlier than 5.1.0.
    */
  var ScaleDownBehavior: js.UndefOr[typingsSlinky.awsSdk.emrMod.ScaleDownBehavior] = js.native
  /**
    * The name of the security configuration applied to the cluster.
    */
  var SecurityConfiguration: js.UndefOr[XmlString] = js.native
  /**
    * The IAM role that will be assumed by the Amazon EMR service to access AWS resources on your behalf.
    */
  var ServiceRole: js.UndefOr[String] = js.native
  /**
    * The current status details about the cluster.
    */
  var Status: js.UndefOr[ClusterStatus] = js.native
  /**
    * Specifies the number of steps that can be executed concurrently.
    */
  var StepConcurrencyLevel: js.UndefOr[Integer] = js.native
  /**
    * A list of tags associated with a cluster.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * Indicates whether Amazon EMR will lock the cluster to prevent the EC2 instances from being terminated by an API call or user intervention, or in the event of a cluster error.
    */
  var TerminationProtected: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the cluster is visible to all IAM users of the AWS account associated with the cluster. The default value, true, indicates that all IAM users in the AWS account can perform cluster actions if they have the proper IAM policy permissions. If this value is false, only the IAM user that created the cluster can perform actions. This value can be changed on a running cluster by using the SetVisibleToAllUsers action. You can override the default value of true when you create a cluster by using the VisibleToAllUsers parameter of the RunJobFlow action.
    */
  var VisibleToAllUsers: js.UndefOr[Boolean] = js.native
}

object Cluster {
  @scala.inline
  def apply(): Cluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cluster]
  }
  @scala.inline
  implicit class ClusterOps[Self <: Cluster] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplications(value: ApplicationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Applications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Applications")(js.undefined)
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
    def withAutoTerminate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoTerminate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoTerminate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoTerminate")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterArn(value: ArnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterArn")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurations(value: ConfigurationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Configurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Configurations")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomAmiId(value: XmlStringMaxLen256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomAmiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomAmiId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomAmiId")(js.undefined)
        ret
    }
    @scala.inline
    def withEbsRootVolumeSize(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbsRootVolumeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbsRootVolumeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EbsRootVolumeSize")(js.undefined)
        ret
    }
    @scala.inline
    def withEc2InstanceAttributes(value: Ec2InstanceAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ec2InstanceAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc2InstanceAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ec2InstanceAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: ClusterId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceCollectionType(value: InstanceCollectionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceCollectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceCollectionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceCollectionType")(js.undefined)
        ret
    }
    @scala.inline
    def withKerberosAttributes(value: KerberosAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KerberosAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKerberosAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KerberosAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withLogUri(value: String): Self = {
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
    def withMasterPublicDnsName(value: String): Self = {
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
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
    def withOutpostArn(value: OptionalArnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutpostArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutpostArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutpostArn")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReleaseLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReleaseLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withRepoUpgradeOnBoot(value: RepoUpgradeOnBoot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RepoUpgradeOnBoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepoUpgradeOnBoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RepoUpgradeOnBoot")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestedAmiVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestedAmiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedAmiVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestedAmiVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withRunningAmiVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RunningAmiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunningAmiVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RunningAmiVersion")(js.undefined)
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
    def withSecurityConfiguration(value: XmlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceRole(value: String): Self = {
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
    def withStatus(value: ClusterStatus): Self = {
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
    def withStepConcurrencyLevel(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepConcurrencyLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepConcurrencyLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepConcurrencyLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
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

