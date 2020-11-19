package typingsSlinky.pulumiAws.requestValidatorMod

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/apigateway/requestValidator", "RequestValidator")
@js.native
class RequestValidator protected () extends CustomResource {
  /**
    * Create a RequestValidator resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RequestValidatorArgs) = this()
  def this(name: String, args: RequestValidatorArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The name of the request validator
    */
  val name: Output_[String] = js.native
  
  /**
    * The ID of the associated Rest API
    */
  val restApi: Output_[String] = js.native
  
  /**
    * Boolean whether to validate request body. Defaults to `false`.
    */
  val validateRequestBody: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * Boolean whether to validate request parameters. Defaults to `false`.
    */
  val validateRequestParameters: Output_[js.UndefOr[Boolean]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/apigateway/requestValidator", "RequestValidator")
@js.native
object RequestValidator extends js.Object {
  
  /**
    * Get an existing RequestValidator resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): RequestValidator = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): RequestValidator = js.native
  def get(name: String, id: Input[ID], state: RequestValidatorState): RequestValidator = js.native
  def get(name: String, id: Input[ID], state: RequestValidatorState, opts: CustomResourceOptions): RequestValidator = js.native
  
  /**
    * Returns true if the given object is an instance of RequestValidator.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/requestValidator.RequestValidator */ Boolean = js.native
}
