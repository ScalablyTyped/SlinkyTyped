package typingsSlinky.atPulumiAws.apigatewayMod

import typingsSlinky.atPulumiAws.apigatewayModelMod.ModelArgs
import typingsSlinky.atPulumiAws.apigatewayModelMod.ModelState
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway", "Model")
@js.native
class Model protected ()
  extends typingsSlinky.atPulumiAws.apigatewayModelMod.Model {
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
@JSImport("@pulumi/aws/apigateway", "Model")
@js.native
object Model extends js.Object {
  /**
    * Get an existing Model resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.apigatewayModelMod.Model = js.native
  def get(name: String, id: Input[ID], state: ModelState): typingsSlinky.atPulumiAws.apigatewayModelMod.Model = js.native
  def get(name: String, id: Input[ID], state: ModelState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.apigatewayModelMod.Model = js.native
  /**
    * Returns true if the given object is an instance of Model.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/model.Model */ Boolean = js.native
}

