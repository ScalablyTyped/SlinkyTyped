package typingsSlinky.pulumiAws.resourceServerMod

import typingsSlinky.pulumiAws.outputMod.cognito.ResourceServerScope
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/cognito/resourceServer", "ResourceServer")
@js.native
class ResourceServer protected () extends CustomResource {
  /**
    * Create a ResourceServer resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ResourceServerArgs) = this()
  def this(name: String, args: ResourceServerArgs, opts: CustomResourceOptions) = this()
  
  /**
    * An identifier for the resource server.
    */
  val identifier: Output_[String] = js.native
  
  /**
    * A name for the resource server.
    */
  val name: Output_[String] = js.native
  
  /**
    * A list of all scopes configured for this resource server in the format identifier/scope_name.
    */
  val scopeIdentifiers: Output_[js.Array[String]] = js.native
  
  /**
    * A list of Authorization Scope.
    */
  val scopes: Output_[js.UndefOr[js.Array[ResourceServerScope]]] = js.native
  
  val userPoolId: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/cognito/resourceServer", "ResourceServer")
@js.native
object ResourceServer extends js.Object {
  
  /**
    * Get an existing ResourceServer resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): ResourceServer = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ResourceServer = js.native
  def get(name: String, id: Input[ID], state: ResourceServerState): ResourceServer = js.native
  def get(name: String, id: Input[ID], state: ResourceServerState, opts: CustomResourceOptions): ResourceServer = js.native
  
  /**
    * Returns true if the given object is an instance of ResourceServer.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/resourceServer.ResourceServer */ Boolean = js.native
}
