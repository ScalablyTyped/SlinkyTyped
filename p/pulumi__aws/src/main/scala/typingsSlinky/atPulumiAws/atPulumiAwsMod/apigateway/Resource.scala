package typingsSlinky.atPulumiAws.atPulumiAwsMod.apigateway

import typingsSlinky.atPulumiAws.apigatewayResourceMod.ResourceArgs
import typingsSlinky.atPulumiAws.apigatewayResourceMod.ResourceState
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "apigateway.Resource")
@js.native
class Resource protected ()
  extends typingsSlinky.atPulumiAws.apigatewayMod.Resource {
  /**
    * Create a Resource resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ResourceArgs) = this()
  def this(name: String, args: ResourceArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "apigateway.Resource")
@js.native
object Resource extends js.Object {
  /**
    * Get an existing Resource resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.apigatewayResourceMod.Resource = js.native
  def get(name: String, id: Input[ID], state: ResourceState): typingsSlinky.atPulumiAws.apigatewayResourceMod.Resource = js.native
  def get(name: String, id: Input[ID], state: ResourceState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.apigatewayResourceMod.Resource = js.native
  /**
    * Returns true if the given object is an instance of Resource.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/resource.Resource */ Boolean = js.native
}

