package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLayerRequest extends js.Object {
  /**
    * One or more user-defined key-value pairs to be added to the stack attributes. To create a cluster layer, set the EcsClusterArn attribute to the cluster's ARN.
    */
  var Attributes: js.UndefOr[LayerAttributes] = js.native
  /**
    * Whether to automatically assign an Elastic IP address to the layer's instances. For more information, see How to Edit a Layer.
    */
  var AutoAssignElasticIps: js.UndefOr[Boolean] = js.native
  /**
    * For stacks that are running in a VPC, whether to automatically assign a public IP address to the layer's instances. For more information, see How to Edit a Layer.
    */
  var AutoAssignPublicIps: js.UndefOr[Boolean] = js.native
  /**
    * Specifies CloudWatch Logs configuration options for the layer. For more information, see CloudWatchLogsLogStream.
    */
  var CloudWatchLogsConfiguration: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.CloudWatchLogsConfiguration] = js.native
  /**
    * The ARN of an IAM profile to be used for the layer's EC2 instances. For more information about IAM ARNs, see Using Identifiers.
    */
  var CustomInstanceProfileArn: js.UndefOr[String] = js.native
  /**
    * A JSON-formatted string containing custom stack configuration and deployment attributes to be installed on the layer's instances. For more information, see  Using Custom JSON. This feature is supported as of version 1.7.42 of the AWS CLI. 
    */
  var CustomJson: js.UndefOr[String] = js.native
  /**
    * A LayerCustomRecipes object that specifies the layer custom recipes.
    */
  var CustomRecipes: js.UndefOr[Recipes] = js.native
  /**
    * An array containing the layer custom security group IDs.
    */
  var CustomSecurityGroupIds: js.UndefOr[Strings] = js.native
  /**
    * Whether to disable auto healing for the layer.
    */
  var EnableAutoHealing: js.UndefOr[Boolean] = js.native
  /**
    * Whether to install operating system and package updates when the instance boots. The default value is true. To control when updates are installed, set this value to false. You must then update your instances manually by using CreateDeployment to run the update_dependencies stack command or by manually running yum (Amazon Linux) or apt-get (Ubuntu) on the instances.   To ensure that your instances have the latest security updates, we strongly recommend using the default value of true. 
    */
  var InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.native
  /**
    * A LifeCycleEventConfiguration object that you can use to configure the Shutdown event to specify an execution timeout and enable or disable Elastic Load Balancer connection draining.
    */
  var LifecycleEventConfiguration: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.LifecycleEventConfiguration] = js.native
  /**
    * The layer name, which is used by the console.
    */
  var Name: String = js.native
  /**
    * An array of Package objects that describes the layer packages.
    */
  var Packages: js.UndefOr[Strings] = js.native
  /**
    * For custom layers only, use this parameter to specify the layer's short name, which is used internally by AWS OpsWorks Stacks and by Chef recipes. The short name is also used as the name for the directory where your app files are installed. It can have a maximum of 200 characters, which are limited to the alphanumeric characters, '-', '_', and '.'. The built-in layers' short names are defined by AWS OpsWorks Stacks. For more information, see the Layer Reference.
    */
  var Shortname: String = js.native
  /**
    * The layer stack ID.
    */
  var StackId: String = js.native
  /**
    * The layer type. A stack cannot have more than one built-in layer of the same type. It can have any number of custom layers. Built-in layers are not available in Chef 12 stacks.
    */
  var Type: LayerType = js.native
  /**
    * Whether to use Amazon EBS-optimized instances.
    */
  var UseEbsOptimizedInstances: js.UndefOr[Boolean] = js.native
  /**
    * A VolumeConfigurations object that describes the layer's Amazon EBS volumes.
    */
  var VolumeConfigurations: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.VolumeConfigurations] = js.native
}

object CreateLayerRequest {
  @scala.inline
  def apply(Name: String, Shortname: String, StackId: String, Type: LayerType): CreateLayerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Shortname = Shortname.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLayerRequest]
  }
  @scala.inline
  implicit class CreateLayerRequestOps[Self <: CreateLayerRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shortname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStackId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: LayerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: LayerAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoAssignElasticIps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoAssignElasticIps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAssignElasticIps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoAssignElasticIps")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoAssignPublicIps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoAssignPublicIps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAssignPublicIps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoAssignPublicIps")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudWatchLogsConfiguration(value: CloudWatchLogsConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLogsConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWatchLogsConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLogsConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomInstanceProfileArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomInstanceProfileArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomInstanceProfileArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomInstanceProfileArn")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomJson(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomJson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomJson")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomRecipes(value: Recipes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomRecipes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomRecipes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomRecipes")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomSecurityGroupIds(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomSecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomSecurityGroupIds")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAutoHealing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableAutoHealing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAutoHealing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableAutoHealing")(js.undefined)
        ret
    }
    @scala.inline
    def withInstallUpdatesOnBoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstallUpdatesOnBoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallUpdatesOnBoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstallUpdatesOnBoot")(js.undefined)
        ret
    }
    @scala.inline
    def withLifecycleEventConfiguration(value: LifecycleEventConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LifecycleEventConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifecycleEventConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LifecycleEventConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withPackages(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Packages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Packages")(js.undefined)
        ret
    }
    @scala.inline
    def withUseEbsOptimizedInstances(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseEbsOptimizedInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseEbsOptimizedInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseEbsOptimizedInstances")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeConfigurations(value: VolumeConfigurations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeConfigurations")(js.undefined)
        ret
    }
  }
  
}

