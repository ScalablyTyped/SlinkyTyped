package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateLayerRequest extends js.Object {
  /**
    * One or more user-defined key/value pairs to be added to the stack attributes.
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
    * The ARN of an IAM profile to be used for all of the layer's EC2 instances. For more information about IAM ARNs, see Using Identifiers.
    */
  var CustomInstanceProfileArn: js.UndefOr[String] = js.native
  /**
    * A JSON-formatted string containing custom stack configuration and deployment attributes to be installed on the layer's instances. For more information, see  Using Custom JSON. 
    */
  var CustomJson: js.UndefOr[String] = js.native
  /**
    * A LayerCustomRecipes object that specifies the layer's custom recipes.
    */
  var CustomRecipes: js.UndefOr[Recipes] = js.native
  /**
    * An array containing the layer's custom security group IDs.
    */
  var CustomSecurityGroupIds: js.UndefOr[Strings] = js.native
  /**
    * Whether to disable auto healing for the layer.
    */
  var EnableAutoHealing: js.UndefOr[Boolean] = js.native
  /**
    * Whether to install operating system and package updates when the instance boots. The default value is true. To control when updates are installed, set this value to false. You must then update your instances manually by using CreateDeployment to run the update_dependencies stack command or manually running yum (Amazon Linux) or apt-get (Ubuntu) on the instances.   We strongly recommend using the default value of true, to ensure that your instances have the latest security updates. 
    */
  var InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.native
  /**
    * The layer ID.
    */
  var LayerId: String = js.native
  /**
    * 
    */
  var LifecycleEventConfiguration: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.LifecycleEventConfiguration] = js.native
  /**
    * The layer name, which is used by the console.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * An array of Package objects that describe the layer's packages.
    */
  var Packages: js.UndefOr[Strings] = js.native
  /**
    * For custom layers only, use this parameter to specify the layer's short name, which is used internally by AWS OpsWorks Stacks and by Chef. The short name is also used as the name for the directory where your app files are installed. It can have a maximum of 200 characters and must be in the following format: /\A[a-z0-9\-\_\.]+\Z/. The built-in layers' short names are defined by AWS OpsWorks Stacks. For more information, see the Layer Reference 
    */
  var Shortname: js.UndefOr[String] = js.native
  /**
    * Whether to use Amazon EBS-optimized instances.
    */
  var UseEbsOptimizedInstances: js.UndefOr[Boolean] = js.native
  /**
    * A VolumeConfigurations object that describes the layer's Amazon EBS volumes.
    */
  var VolumeConfigurations: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.VolumeConfigurations] = js.native
}

object UpdateLayerRequest {
  @scala.inline
  def apply(LayerId: String): UpdateLayerRequest = {
    val __obj = js.Dynamic.literal(LayerId = LayerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLayerRequest]
  }
  @scala.inline
  implicit class UpdateLayerRequestOps[Self <: UpdateLayerRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayerId")(value.asInstanceOf[js.Any])
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
    def withShortname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shortname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shortname")(js.undefined)
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

