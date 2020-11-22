package typingsSlinky.pulumiAws.gatewayRouteMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.appmesh.GatewayRouteSpec
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/appmesh/gatewayRoute", "GatewayRoute")
@js.native
class GatewayRoute protected () extends CustomResource {
  /**
    * Create a GatewayRoute resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: GatewayRouteArgs) = this()
  def this(name: String, args: GatewayRouteArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN of the gateway route.
    */
  val arn: Output_[String] = js.native
  
  /**
    * The creation date of the gateway route.
    */
  val createdDate: Output_[String] = js.native
  
  /**
    * The last update date of the gateway route.
    */
  val lastUpdatedDate: Output_[String] = js.native
  
  /**
    * The name of the service mesh in which to create the gateway route. Must be between 1 and 255 characters in length.
    */
  val meshName: Output_[String] = js.native
  
  /**
    * The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
    */
  val meshOwner: Output_[String] = js.native
  
  /**
    * The name to use for the gateway route. Must be between 1 and 255 characters in length.
    */
  val name: Output_[String] = js.native
  
  /**
    * The resource owner's AWS account ID.
    */
  val resourceOwner: Output_[String] = js.native
  
  /**
    * The gateway route specification to apply.
    */
  val spec: Output_[GatewayRouteSpec] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * The name of the [virtual gateway](https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_gateway.html) to associate the gateway route with. Must be between 1 and 255 characters in length.
    */
  val virtualGatewayName: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/appmesh/gatewayRoute", "GatewayRoute")
@js.native
object GatewayRoute extends js.Object {
  
  /**
    * Get an existing GatewayRoute resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): GatewayRoute = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): GatewayRoute = js.native
  def get(name: String, id: Input[ID], state: GatewayRouteState): GatewayRoute = js.native
  def get(name: String, id: Input[ID], state: GatewayRouteState, opts: CustomResourceOptions): GatewayRoute = js.native
  
  /**
    * Returns true if the given object is an instance of GatewayRoute.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/gatewayRoute.GatewayRoute */ Boolean = js.native
}
