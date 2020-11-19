package typingsSlinky.pulumiAws.mod.apigateway

import typingsSlinky.pulumiAws.apigatewayDeploymentMod.DeploymentArgs
import typingsSlinky.pulumiAws.apigatewayDeploymentMod.DeploymentState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "apigateway.Deployment")
@js.native
class Deployment protected ()
  extends typingsSlinky.pulumiAws.apigatewayMod.Deployment {
  /**
    * Create a Deployment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DeploymentArgs) = this()
  def this(name: String, args: DeploymentArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/aws", "apigateway.Deployment")
@js.native
object Deployment extends js.Object {
  
  /**
    * Get an existing Deployment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.apigatewayDeploymentMod.Deployment = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.apigatewayDeploymentMod.Deployment = js.native
  def get(name: String, id: Input[ID], state: DeploymentState): typingsSlinky.pulumiAws.apigatewayDeploymentMod.Deployment = js.native
  def get(name: String, id: Input[ID], state: DeploymentState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.apigatewayDeploymentMod.Deployment = js.native
  
  /**
    * Returns true if the given object is an instance of Deployment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/deployment.Deployment */ Boolean = js.native
}
