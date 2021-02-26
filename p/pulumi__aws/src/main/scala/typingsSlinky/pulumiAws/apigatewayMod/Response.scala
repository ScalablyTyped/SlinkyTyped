package typingsSlinky.pulumiAws.apigatewayMod

import typingsSlinky.pulumiAws.responseMod.ResponseArgs
import typingsSlinky.pulumiAws.responseMod.ResponseState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/apigateway", "Response")
@js.native
class Response protected ()
  extends typingsSlinky.pulumiAws.responseMod.Response {
  /**
    * Create a Response resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ResponseArgs) = this()
  def this(name: String, args: ResponseArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object Response {
  
  /**
    * Get an existing Response resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws/apigateway", "Response.get")
  @js.native
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.responseMod.Response = js.native
  @JSImport("@pulumi/aws/apigateway", "Response.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.responseMod.Response = js.native
  @JSImport("@pulumi/aws/apigateway", "Response.get")
  @js.native
  def get(name: String, id: Input[ID], state: ResponseState): typingsSlinky.pulumiAws.responseMod.Response = js.native
  @JSImport("@pulumi/aws/apigateway", "Response.get")
  @js.native
  def get(name: String, id: Input[ID], state: ResponseState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.responseMod.Response = js.native
  
  /**
    * Returns true if the given object is an instance of Response.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws/apigateway", "Response.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/response.Response */ Boolean = js.native
}
