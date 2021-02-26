package typingsSlinky.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLayerRequest extends StObject {
  
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
  implicit class CreateLayerRequestMutableBuilder[Self <: CreateLayerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: LayerAttributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setAutoAssignElasticIps(value: Boolean): Self = StObject.set(x, "AutoAssignElasticIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoAssignElasticIpsUndefined: Self = StObject.set(x, "AutoAssignElasticIps", js.undefined)
    
    @scala.inline
    def setAutoAssignPublicIps(value: Boolean): Self = StObject.set(x, "AutoAssignPublicIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoAssignPublicIpsUndefined: Self = StObject.set(x, "AutoAssignPublicIps", js.undefined)
    
    @scala.inline
    def setCloudWatchLogsConfiguration(value: CloudWatchLogsConfiguration): Self = StObject.set(x, "CloudWatchLogsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLogsConfigurationUndefined: Self = StObject.set(x, "CloudWatchLogsConfiguration", js.undefined)
    
    @scala.inline
    def setCustomInstanceProfileArn(value: String): Self = StObject.set(x, "CustomInstanceProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomInstanceProfileArnUndefined: Self = StObject.set(x, "CustomInstanceProfileArn", js.undefined)
    
    @scala.inline
    def setCustomJson(value: String): Self = StObject.set(x, "CustomJson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomJsonUndefined: Self = StObject.set(x, "CustomJson", js.undefined)
    
    @scala.inline
    def setCustomRecipes(value: Recipes): Self = StObject.set(x, "CustomRecipes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomRecipesUndefined: Self = StObject.set(x, "CustomRecipes", js.undefined)
    
    @scala.inline
    def setCustomSecurityGroupIds(value: Strings): Self = StObject.set(x, "CustomSecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomSecurityGroupIdsUndefined: Self = StObject.set(x, "CustomSecurityGroupIds", js.undefined)
    
    @scala.inline
    def setCustomSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "CustomSecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setEnableAutoHealing(value: Boolean): Self = StObject.set(x, "EnableAutoHealing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAutoHealingUndefined: Self = StObject.set(x, "EnableAutoHealing", js.undefined)
    
    @scala.inline
    def setInstallUpdatesOnBoot(value: Boolean): Self = StObject.set(x, "InstallUpdatesOnBoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallUpdatesOnBootUndefined: Self = StObject.set(x, "InstallUpdatesOnBoot", js.undefined)
    
    @scala.inline
    def setLifecycleEventConfiguration(value: LifecycleEventConfiguration): Self = StObject.set(x, "LifecycleEventConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleEventConfigurationUndefined: Self = StObject.set(x, "LifecycleEventConfiguration", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackages(value: Strings): Self = StObject.set(x, "Packages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackagesUndefined: Self = StObject.set(x, "Packages", js.undefined)
    
    @scala.inline
    def setPackagesVarargs(value: String*): Self = StObject.set(x, "Packages", js.Array(value :_*))
    
    @scala.inline
    def setShortname(value: String): Self = StObject.set(x, "Shortname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: LayerType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseEbsOptimizedInstances(value: Boolean): Self = StObject.set(x, "UseEbsOptimizedInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseEbsOptimizedInstancesUndefined: Self = StObject.set(x, "UseEbsOptimizedInstances", js.undefined)
    
    @scala.inline
    def setVolumeConfigurations(value: VolumeConfigurations): Self = StObject.set(x, "VolumeConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeConfigurationsUndefined: Self = StObject.set(x, "VolumeConfigurations", js.undefined)
    
    @scala.inline
    def setVolumeConfigurationsVarargs(value: VolumeConfiguration*): Self = StObject.set(x, "VolumeConfigurations", js.Array(value :_*))
  }
}
