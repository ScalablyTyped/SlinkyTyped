package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.outputMod.codedeploy.DeploymentConfigMinimumHealthyHosts
import typingsSlinky.pulumiAws.outputMod.codedeploy.DeploymentConfigTrafficRoutingConfig
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deploymentConfigMod {
  
  @JSImport("@pulumi/aws/codedeploy/deploymentConfig", "DeploymentConfig")
  @js.native
  class DeploymentConfig protected () extends CustomResource {
    /**
      * Create a DeploymentConfig resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DeploymentConfigArgs) = this()
    def this(name: String, args: DeploymentConfigArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The compute platform can be `Server`, `Lambda`, or `ECS`. Default is `Server`.
      */
    val computePlatform: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The AWS Assigned deployment config id
      */
    val deploymentConfigId: Output_[String] = js.native
    
    /**
      * The name of the deployment config.
      */
    val deploymentConfigName: Output_[String] = js.native
    
    /**
      * A minimumHealthyHosts block. Required for `Server` compute platform. Minimum Healthy Hosts are documented below.
      */
    val minimumHealthyHosts: Output_[js.UndefOr[DeploymentConfigMinimumHealthyHosts]] = js.native
    
    /**
      * A trafficRoutingConfig block. Traffic Routing Config is documented below.
      */
    val trafficRoutingConfig: Output_[js.UndefOr[DeploymentConfigTrafficRoutingConfig]] = js.native
  }
  /* static members */
  object DeploymentConfig {
    
    /**
      * Get an existing DeploymentConfig resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/codedeploy/deploymentConfig", "DeploymentConfig.get")
    @js.native
    def get(name: String, id: Input[ID]): DeploymentConfig = js.native
    @JSImport("@pulumi/aws/codedeploy/deploymentConfig", "DeploymentConfig.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): DeploymentConfig = js.native
    @JSImport("@pulumi/aws/codedeploy/deploymentConfig", "DeploymentConfig.get")
    @js.native
    def get(name: String, id: Input[ID], state: DeploymentConfigState): DeploymentConfig = js.native
    @JSImport("@pulumi/aws/codedeploy/deploymentConfig", "DeploymentConfig.get")
    @js.native
    def get(name: String, id: Input[ID], state: DeploymentConfigState, opts: CustomResourceOptions): DeploymentConfig = js.native
    
    /**
      * Returns true if the given object is an instance of DeploymentConfig.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/codedeploy/deploymentConfig", "DeploymentConfig.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codedeploy/deploymentConfig.DeploymentConfig */ Boolean = js.native
  }
  
  @js.native
  trait DeploymentConfigArgs extends StObject {
    
    /**
      * The compute platform can be `Server`, `Lambda`, or `ECS`. Default is `Server`.
      */
    val computePlatform: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the deployment config.
      */
    val deploymentConfigName: Input[String] = js.native
    
    /**
      * A minimumHealthyHosts block. Required for `Server` compute platform. Minimum Healthy Hosts are documented below.
      */
    val minimumHealthyHosts: js.UndefOr[
        Input[typingsSlinky.pulumiAws.inputMod.codedeploy.DeploymentConfigMinimumHealthyHosts]
      ] = js.native
    
    /**
      * A trafficRoutingConfig block. Traffic Routing Config is documented below.
      */
    val trafficRoutingConfig: js.UndefOr[
        Input[typingsSlinky.pulumiAws.inputMod.codedeploy.DeploymentConfigTrafficRoutingConfig]
      ] = js.native
  }
  object DeploymentConfigArgs {
    
    @scala.inline
    def apply(deploymentConfigName: Input[String]): DeploymentConfigArgs = {
      val __obj = js.Dynamic.literal(deploymentConfigName = deploymentConfigName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeploymentConfigArgs]
    }
    
    @scala.inline
    implicit class DeploymentConfigArgsMutableBuilder[Self <: DeploymentConfigArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComputePlatform(value: Input[String]): Self = StObject.set(x, "computePlatform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComputePlatformUndefined: Self = StObject.set(x, "computePlatform", js.undefined)
      
      @scala.inline
      def setDeploymentConfigName(value: Input[String]): Self = StObject.set(x, "deploymentConfigName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumHealthyHosts(value: Input[typingsSlinky.pulumiAws.inputMod.codedeploy.DeploymentConfigMinimumHealthyHosts]): Self = StObject.set(x, "minimumHealthyHosts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumHealthyHostsUndefined: Self = StObject.set(x, "minimumHealthyHosts", js.undefined)
      
      @scala.inline
      def setTrafficRoutingConfig(value: Input[typingsSlinky.pulumiAws.inputMod.codedeploy.DeploymentConfigTrafficRoutingConfig]): Self = StObject.set(x, "trafficRoutingConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrafficRoutingConfigUndefined: Self = StObject.set(x, "trafficRoutingConfig", js.undefined)
    }
  }
  
  @js.native
  trait DeploymentConfigState extends StObject {
    
    /**
      * The compute platform can be `Server`, `Lambda`, or `ECS`. Default is `Server`.
      */
    val computePlatform: js.UndefOr[Input[String]] = js.native
    
    /**
      * The AWS Assigned deployment config id
      */
    val deploymentConfigId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the deployment config.
      */
    val deploymentConfigName: js.UndefOr[Input[String]] = js.native
    
    /**
      * A minimumHealthyHosts block. Required for `Server` compute platform. Minimum Healthy Hosts are documented below.
      */
    val minimumHealthyHosts: js.UndefOr[
        Input[typingsSlinky.pulumiAws.inputMod.codedeploy.DeploymentConfigMinimumHealthyHosts]
      ] = js.native
    
    /**
      * A trafficRoutingConfig block. Traffic Routing Config is documented below.
      */
    val trafficRoutingConfig: js.UndefOr[
        Input[typingsSlinky.pulumiAws.inputMod.codedeploy.DeploymentConfigTrafficRoutingConfig]
      ] = js.native
  }
  object DeploymentConfigState {
    
    @scala.inline
    def apply(): DeploymentConfigState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeploymentConfigState]
    }
    
    @scala.inline
    implicit class DeploymentConfigStateMutableBuilder[Self <: DeploymentConfigState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComputePlatform(value: Input[String]): Self = StObject.set(x, "computePlatform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComputePlatformUndefined: Self = StObject.set(x, "computePlatform", js.undefined)
      
      @scala.inline
      def setDeploymentConfigId(value: Input[String]): Self = StObject.set(x, "deploymentConfigId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeploymentConfigIdUndefined: Self = StObject.set(x, "deploymentConfigId", js.undefined)
      
      @scala.inline
      def setDeploymentConfigName(value: Input[String]): Self = StObject.set(x, "deploymentConfigName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeploymentConfigNameUndefined: Self = StObject.set(x, "deploymentConfigName", js.undefined)
      
      @scala.inline
      def setMinimumHealthyHosts(value: Input[typingsSlinky.pulumiAws.inputMod.codedeploy.DeploymentConfigMinimumHealthyHosts]): Self = StObject.set(x, "minimumHealthyHosts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumHealthyHostsUndefined: Self = StObject.set(x, "minimumHealthyHosts", js.undefined)
      
      @scala.inline
      def setTrafficRoutingConfig(value: Input[typingsSlinky.pulumiAws.inputMod.codedeploy.DeploymentConfigTrafficRoutingConfig]): Self = StObject.set(x, "trafficRoutingConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrafficRoutingConfigUndefined: Self = StObject.set(x, "trafficRoutingConfig", js.undefined)
    }
  }
}
