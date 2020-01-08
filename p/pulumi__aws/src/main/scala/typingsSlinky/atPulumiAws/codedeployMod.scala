package typingsSlinky.atPulumiAws

import typingsSlinky.atPulumiAws.codedeployApplicationMod.ApplicationArgs
import typingsSlinky.atPulumiAws.codedeployApplicationMod.ApplicationState
import typingsSlinky.atPulumiAws.codedeployDeploymentConfigMod.DeploymentConfigArgs
import typingsSlinky.atPulumiAws.codedeployDeploymentConfigMod.DeploymentConfigState
import typingsSlinky.atPulumiAws.codedeployDeploymentGroupMod.DeploymentGroupArgs
import typingsSlinky.atPulumiAws.codedeployDeploymentGroupMod.DeploymentGroupState
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/codedeploy", JSImport.Namespace)
@js.native
object codedeployMod extends js.Object {
  @js.native
  class Application protected ()
    extends typingsSlinky.atPulumiAws.codedeployApplicationMod.Application {
    /**
      * Create a Application resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ApplicationArgs) = this()
    def this(name: String, args: ApplicationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class DeploymentConfig protected ()
    extends typingsSlinky.atPulumiAws.codedeployDeploymentConfigMod.DeploymentConfig {
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
  
  @js.native
  class DeploymentGroup protected ()
    extends typingsSlinky.atPulumiAws.codedeployDeploymentGroupMod.DeploymentGroup {
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
  object Application extends js.Object {
    /**
      * Get an existing Application resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.codedeployApplicationMod.Application = js.native
    def get(name: String, id: Input[ID], state: ApplicationState): typingsSlinky.atPulumiAws.codedeployApplicationMod.Application = js.native
    def get(name: String, id: Input[ID], state: ApplicationState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.codedeployApplicationMod.Application = js.native
    /**
      * Returns true if the given object is an instance of Application.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codedeploy/application.Application */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.codedeployDeploymentConfigMod.DeploymentConfig = js.native
    def get(name: String, id: Input[ID], state: DeploymentConfigState): typingsSlinky.atPulumiAws.codedeployDeploymentConfigMod.DeploymentConfig = js.native
    def get(name: String, id: Input[ID], state: DeploymentConfigState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.codedeployDeploymentConfigMod.DeploymentConfig = js.native
    /**
      * Returns true if the given object is an instance of DeploymentConfig.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codedeploy/deploymentConfig.DeploymentConfig */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.codedeployDeploymentGroupMod.DeploymentGroup = js.native
    def get(name: String, id: Input[ID], state: DeploymentGroupState): typingsSlinky.atPulumiAws.codedeployDeploymentGroupMod.DeploymentGroup = js.native
    def get(name: String, id: Input[ID], state: DeploymentGroupState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.codedeployDeploymentGroupMod.DeploymentGroup = js.native
    /**
      * Returns true if the given object is an instance of DeploymentGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codedeploy/deploymentGroup.DeploymentGroup */ Boolean = js.native
  }
  
}

