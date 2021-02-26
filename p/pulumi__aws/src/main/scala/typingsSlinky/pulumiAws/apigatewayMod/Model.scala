package typingsSlinky.pulumiAws.apigatewayMod

import typingsSlinky.pulumiAws.apigatewayModelMod.ModelArgs
import typingsSlinky.pulumiAws.apigatewayModelMod.ModelState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/apigateway", "Model")
@js.native
class Model protected ()
  extends typingsSlinky.pulumiAws.apigatewayModelMod.Model {
  /**
    * Create a Model resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ModelArgs) = this()
  def this(name: String, args: ModelArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object Model {
  
  /**
    * Get an existing Model resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws/apigateway", "Model.get")
  @js.native
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.apigatewayModelMod.Model = js.native
  @JSImport("@pulumi/aws/apigateway", "Model.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.apigatewayModelMod.Model = js.native
  @JSImport("@pulumi/aws/apigateway", "Model.get")
  @js.native
  def get(name: String, id: Input[ID], state: ModelState): typingsSlinky.pulumiAws.apigatewayModelMod.Model = js.native
  @JSImport("@pulumi/aws/apigateway", "Model.get")
  @js.native
  def get(name: String, id: Input[ID], state: ModelState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.apigatewayModelMod.Model = js.native
  
  /**
    * Returns true if the given object is an instance of Model.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws/apigateway", "Model.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/model.Model */ Boolean = js.native
}
