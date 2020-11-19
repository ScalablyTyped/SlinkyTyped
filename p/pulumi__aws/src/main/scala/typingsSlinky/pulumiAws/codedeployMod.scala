package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.applicationMod.ApplicationArgs
import typingsSlinky.pulumiAws.applicationMod.ApplicationState
import typingsSlinky.pulumiAws.deploymentConfigMod.DeploymentConfigArgs
import typingsSlinky.pulumiAws.deploymentConfigMod.DeploymentConfigState
import typingsSlinky.pulumiAws.deploymentGroupMod.DeploymentGroupArgs
import typingsSlinky.pulumiAws.deploymentGroupMod.DeploymentGroupState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/codedeploy", JSImport.Namespace)
@js.native
object codedeployMod extends js.Object {
  
  @js.native
  class Application protected ()
    extends typingsSlinky.pulumiAws.applicationMod.Application {
    /**
      * Create a Application resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ApplicationArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ApplicationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object Application extends js.Object {
    
    /**
      * Get an existing Application resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.applicationMod.Application = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.applicationMod.Application = js.native
    def get(name: String, id: Input[ID], state: ApplicationState): typingsSlinky.pulumiAws.applicationMod.Application = js.native
    def get(name: String, id: Input[ID], state: ApplicationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.applicationMod.Application = js.native
    
    /**
      * Returns true if the given object is an instance of Application.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codedeploy/application.Application */ Boolean = js.native
  }
  
  @js.native
  class DeploymentConfig protected ()
    extends typingsSlinky.pulumiAws.deploymentConfigMod.DeploymentConfig {
    /**
      * Create a DeploymentConfig resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DeploymentConfigArgs) = this()
    def this(name: String, args: DeploymentConfigArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object DeploymentConfig extends js.Object {
    
    /**
      * Get an existing DeploymentConfig resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.deploymentConfigMod.DeploymentConfig = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.deploymentConfigMod.DeploymentConfig = js.native
    def get(name: String, id: Input[ID], state: DeploymentConfigState): typingsSlinky.pulumiAws.deploymentConfigMod.DeploymentConfig = js.native
    def get(name: String, id: Input[ID], state: DeploymentConfigState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.deploymentConfigMod.DeploymentConfig = js.native
    
    /**
      * Returns true if the given object is an instance of DeploymentConfig.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codedeploy/deploymentConfig.DeploymentConfig */ Boolean = js.native
  }
  
  @js.native
  class DeploymentGroup protected ()
    extends typingsSlinky.pulumiAws.deploymentGroupMod.DeploymentGroup {
    /**
      * Create a DeploymentGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DeploymentGroupArgs) = this()
    def this(name: String, args: DeploymentGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object DeploymentGroup extends js.Object {
    
    /**
      * Get an existing DeploymentGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.deploymentGroupMod.DeploymentGroup = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.deploymentGroupMod.DeploymentGroup = js.native
    def get(name: String, id: Input[ID], state: DeploymentGroupState): typingsSlinky.pulumiAws.deploymentGroupMod.DeploymentGroup = js.native
    def get(name: String, id: Input[ID], state: DeploymentGroupState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.deploymentGroupMod.DeploymentGroup = js.native
    
    /**
      * Returns true if the given object is an instance of DeploymentGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codedeploy/deploymentGroup.DeploymentGroup */ Boolean = js.native
  }
}
