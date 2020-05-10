package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunJobFlowInput extends js.Object {
  /**
    * A JSON string for selecting additional features.
    */
  var AdditionalInfo: js.UndefOr[XmlString] = js.native
  /**
    * Applies only to Amazon EMR AMI versions 3.x and 2.x. For Amazon EMR releases 4.0 and later, ReleaseLabel is used. To specify a custom AMI, use CustomAmiID.
    */
  var AmiVersion: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * Applies to Amazon EMR releases 4.0 and later. A case-insensitive list of applications for Amazon EMR to install and configure when launching the cluster. For a list of applications available for each Amazon EMR release version, see the Amazon EMR Release Guide.
    */
  var Applications: js.UndefOr[ApplicationList] = js.native
  /**
    * An IAM role for automatic scaling policies. The default role is EMR_AutoScaling_DefaultRole. The IAM role provides permissions that the automatic scaling feature requires to launch and terminate EC2 instances in an instance group.
    */
  var AutoScalingRole: js.UndefOr[XmlString] = js.native
  /**
    * A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
    */
  var BootstrapActions: js.UndefOr[BootstrapActionConfigList] = js.native
  /**
    * For Amazon EMR releases 4.0 and later. The list of configurations supplied for the EMR cluster you are creating.
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.native
  /**
    * Available only in Amazon EMR version 5.7.0 and later. The ID of a custom Amazon EBS-backed Linux AMI. If specified, Amazon EMR uses this AMI when it launches cluster EC2 instances. For more information about custom AMIs in Amazon EMR, see Using a Custom AMI in the Amazon EMR Management Guide. If omitted, the cluster uses the base Linux AMI for the ReleaseLabel specified. For Amazon EMR versions 2.x and 3.x, use AmiVersion instead. For information about creating a custom AMI, see Creating an Amazon EBS-Backed Linux AMI in the Amazon Elastic Compute Cloud User Guide for Linux Instances. For information about finding an AMI ID, see Finding a Linux AMI. 
    */
  var CustomAmiId: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * The size, in GiB, of the EBS root device volume of the Linux AMI that is used for each EC2 instance. Available in Amazon EMR version 4.x and later.
    */
  var EbsRootVolumeSize: js.UndefOr[Integer] = js.native
  /**
    * A specification of the number and type of Amazon EC2 instances.
    */
  var Instances: JobFlowInstancesConfig = js.native
  /**
    * Also called instance profile and EC2 role. An IAM role for an EMR cluster. The EC2 instances of the cluster assume this role. The default role is EMR_EC2_DefaultRole. In order to use the default role, you must have already created it using the CLI or console.
    */
  var JobFlowRole: js.UndefOr[XmlString] = js.native
  /**
    * Attributes for Kerberos configuration when Kerberos authentication is enabled using a security configuration. For more information see Use Kerberos Authentication in the EMR Management Guide.
    */
  var KerberosAttributes: js.UndefOr[typingsSlinky.awsSdk.emrMod.KerberosAttributes] = js.native
  /**
    * The location in Amazon S3 to write the log files of the job flow. If a value is not provided, logs are not created.
    */
  var LogUri: js.UndefOr[XmlString] = js.native
  /**
    * The name of the job flow.
    */
  var Name: XmlStringMaxLen256 = js.native
  /**
    *  For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and later, use Applications.  A list of strings that indicates third-party software to use with the job flow that accepts a user argument list. EMR accepts and forwards the argument list to the corresponding installation script as bootstrap action arguments. For more information, see "Launch a Job Flow on the MapR Distribution for Hadoop" in the Amazon EMR Developer Guide. Supported values are:   "mapr-m3" - launch the cluster using MapR M3 Edition.   "mapr-m5" - launch the cluster using MapR M5 Edition.   "mapr" with the user arguments specifying "--edition,m3" or "--edition,m5" - launch the job flow using MapR M3 or M5 Edition respectively.   "mapr-m7" - launch the cluster using MapR M7 Edition.   "hunk" - launch the cluster with the Hunk Big Data Analtics Platform.   "hue"- launch the cluster with Hue installed.   "spark" - launch the cluster with Apache Spark installed.   "ganglia" - launch the cluster with the Ganglia Monitoring System installed.  
    */
  var NewSupportedProducts: js.UndefOr[NewSupportedProductsList] = js.native
  /**
    * The Amazon EMR release label, which determines the version of open-source application packages installed on the cluster. Release labels are in the form emr-x.x.x, where x.x.x is an Amazon EMR release version such as emr-5.14.0. For more information about Amazon EMR release versions and included application versions and features, see https://docs.aws.amazon.com/emr/latest/ReleaseGuide/. The release label applies only to Amazon EMR releases version 4.0 and later. Earlier versions use AmiVersion.
    */
  var ReleaseLabel: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * Applies only when CustomAmiID is used. Specifies which updates from the Amazon Linux AMI package repositories to apply automatically when the instance boots using the AMI. If omitted, the default is SECURITY, which indicates that only security updates are applied. If NONE is specified, no updates are applied, and all updates must be applied manually.
    */
  var RepoUpgradeOnBoot: js.UndefOr[typingsSlinky.awsSdk.emrMod.RepoUpgradeOnBoot] = js.native
  /**
    * Specifies the way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an instance group is resized. TERMINATE_AT_INSTANCE_HOUR indicates that Amazon EMR terminates nodes at the instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option is only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version. TERMINATE_AT_TASK_COMPLETION indicates that Amazon EMR blacklists and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption. TERMINATE_AT_TASK_COMPLETION available only in Amazon EMR version 4.1.0 and later, and is the default for versions of Amazon EMR earlier than 5.1.0.
    */
  var ScaleDownBehavior: js.UndefOr[typingsSlinky.awsSdk.emrMod.ScaleDownBehavior] = js.native
  /**
    * The name of a security configuration to apply to the cluster.
    */
  var SecurityConfiguration: js.UndefOr[XmlString] = js.native
  /**
    * The IAM role that will be assumed by the Amazon EMR service to access AWS resources on your behalf.
    */
  var ServiceRole: js.UndefOr[XmlString] = js.native
  /**
    * Specifies the number of steps that can be executed concurrently. The default value is 1. The maximum value is 256.
    */
  var StepConcurrencyLevel: js.UndefOr[Integer] = js.native
  /**
    * A list of steps to run.
    */
  var Steps: js.UndefOr[StepConfigList] = js.native
  /**
    *  For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and later, use Applications.  A list of strings that indicates third-party software to use. For more information, see the Amazon EMR Developer Guide. Currently supported values are:   "mapr-m3" - launch the job flow using MapR M3 Edition.   "mapr-m5" - launch the job flow using MapR M5 Edition.  
    */
  var SupportedProducts: js.UndefOr[SupportedProductsList] = js.native
  /**
    * A list of tags to associate with a cluster and propagate to Amazon EC2 instances.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * A value of true indicates that all IAM users in the AWS account can perform cluster actions if they have the proper IAM policy permissions. This is the default. A value of false indicates that only the IAM user who created the cluster can perform actions.
    */
  var VisibleToAllUsers: js.UndefOr[Boolean] = js.native
}

object RunJobFlowInput {
  @scala.inline
  def apply(Instances: JobFlowInstancesConfig, Name: XmlStringMaxLen256): RunJobFlowInput = {
    val __obj = js.Dynamic.literal(Instances = Instances.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunJobFlowInput]
  }
  @scala.inline
  implicit class RunJobFlowInputOps[Self <: RunJobFlowInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstances(value: JobFlowInstancesConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Instances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: XmlStringMaxLen256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalInfo(value: XmlString): Self = {
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
    def withBootstrapActions(value: BootstrapActionConfigList): Self = {
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
    def withNewSupportedProducts(value: NewSupportedProductsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewSupportedProducts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewSupportedProducts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NewSupportedProducts")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseLabel(value: XmlStringMaxLen256): Self = {
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
    def withSteps(value: StepConfigList): Self = {
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

