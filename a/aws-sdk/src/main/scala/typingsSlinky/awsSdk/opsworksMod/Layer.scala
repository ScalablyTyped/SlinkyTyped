package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layer extends js.Object {
  /**
    * The Amazon Resource Number (ARN) of a layer.
    */
  var Arn: js.UndefOr[String] = js.native
  /**
    * The layer attributes. For the HaproxyStatsPassword, MysqlRootPassword, and GangliaPassword attributes, AWS OpsWorks Stacks returns *****FILTERED***** instead of the actual value For an ECS Cluster layer, AWS OpsWorks Stacks the EcsClusterArn attribute is set to the cluster's ARN.
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
    * The Amazon CloudWatch Logs configuration settings for the layer.
    */
  var CloudWatchLogsConfiguration: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.CloudWatchLogsConfiguration] = js.native
  /**
    * Date when the layer was created.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.native
  /**
    * The ARN of the default IAM profile to be used for the layer's EC2 instances. For more information about IAM ARNs, see Using Identifiers.
    */
  var CustomInstanceProfileArn: js.UndefOr[String] = js.native
  /**
    * A JSON formatted string containing the layer's custom stack configuration and deployment attributes.
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
    * AWS OpsWorks Stacks supports five lifecycle events: setup, configuration, deploy, undeploy, and shutdown. For each layer, AWS OpsWorks Stacks runs a set of standard recipes for each event. You can also provide custom recipes for any or all layers and events. AWS OpsWorks Stacks runs custom event recipes after the standard recipes. LayerCustomRecipes specifies the custom recipes for a particular layer to be run in response to each of the five events. To specify a recipe, use the cookbook's directory name in the repository followed by two colons and the recipe name, which is the recipe's file name without the .rb extension. For example: phpapp2::dbsetup specifies the dbsetup.rb recipe in the repository's phpapp2 folder.
    */
  var DefaultRecipes: js.UndefOr[Recipes] = js.native
  /**
    * An array containing the layer's security group names.
    */
  var DefaultSecurityGroupNames: js.UndefOr[Strings] = js.native
  /**
    * Whether auto healing is disabled for the layer.
    */
  var EnableAutoHealing: js.UndefOr[Boolean] = js.native
  /**
    * Whether to install operating system and package updates when the instance boots. The default value is true. If this value is set to false, you must then update your instances manually by using CreateDeployment to run the update_dependencies stack command or manually running yum (Amazon Linux) or apt-get (Ubuntu) on the instances.   We strongly recommend using the default value of true, to ensure that your instances have the latest security updates. 
    */
  var InstallUpdatesOnBoot: js.UndefOr[Boolean] = js.native
  /**
    * The layer ID.
    */
  var LayerId: js.UndefOr[String] = js.native
  /**
    * A LifeCycleEventConfiguration object that specifies the Shutdown event configuration.
    */
  var LifecycleEventConfiguration: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.LifecycleEventConfiguration] = js.native
  /**
    * The layer name.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * An array of Package objects that describe the layer's packages.
    */
  var Packages: js.UndefOr[Strings] = js.native
  /**
    * The layer short name.
    */
  var Shortname: js.UndefOr[String] = js.native
  /**
    * The layer stack ID.
    */
  var StackId: js.UndefOr[String] = js.native
  /**
    * The layer type.
    */
  var Type: js.UndefOr[LayerType] = js.native
  /**
    * Whether the layer uses Amazon EBS-optimized instances.
    */
  var UseEbsOptimizedInstances: js.UndefOr[Boolean] = js.native
  /**
    * A VolumeConfigurations object that describes the layer's Amazon EBS volumes.
    */
  var VolumeConfigurations: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.VolumeConfigurations] = js.native
}

object Layer {
  @scala.inline
  def apply(): Layer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layer]
  }
  @scala.inline
  implicit class LayerOps[Self <: Layer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
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
    def withCreatedAt(value: DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(js.undefined)
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
    def withDefaultRecipes(value: Recipes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultRecipes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRecipes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultRecipes")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSecurityGroupNames(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultSecurityGroupNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSecurityGroupNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultSecurityGroupNames")(js.undefined)
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
    def withLayerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayerId")(js.undefined)
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
    def withStackId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: LayerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
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

