package typingsSlinky.pulumiAws.mod.apigatewayv2

import typingsSlinky.pulumiAws.apiMod.ApiArgs
import typingsSlinky.pulumiAws.apiMod.ApiState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "apigatewayv2.Api")
@js.native
class Api protected ()
  extends typingsSlinky.pulumiAws.apigatewayv2Mod.Api {
  /**
    * Create a Api resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ApiArgs) = this()
  def this(name: String, args: ApiArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "apigatewayv2.Api")
@js.native
object Api extends js.Object {
  /**
    * Get an existing Api resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.apiMod.Api = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.apiMod.Api = js.native
  def get(name: String, id: Input[ID], state: ApiState): typingsSlinky.pulumiAws.apiMod.Api = js.native
  def get(name: String, id: Input[ID], state: ApiState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.apiMod.Api = js.native
  /**
    * Returns true if the given object is an instance of Api.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/api.Api */ Boolean = js.native
}

