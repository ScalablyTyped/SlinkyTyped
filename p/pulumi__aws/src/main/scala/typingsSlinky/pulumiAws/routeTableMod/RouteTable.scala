package typingsSlinky.pulumiAws.routeTableMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2transitgateway/routeTable", "RouteTable")
@js.native
class RouteTable protected () extends CustomResource {
  /**
    * Create a RouteTable resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RouteTableArgs) = this()
  def this(name: String, args: RouteTableArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Boolean whether this is the default association route table for the EC2 Transit Gateway.
    */
  val defaultAssociationRouteTable: Output_[Boolean] = js.native
  
  /**
    * Boolean whether this is the default propagation route table for the EC2 Transit Gateway.
    */
  val defaultPropagationRouteTable: Output_[Boolean] = js.native
  
  /**
    * Key-value tags for the EC2 Transit Gateway Route Table.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * Identifier of EC2 Transit Gateway.
    */
  val transitGatewayId: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/ec2transitgateway/routeTable", "RouteTable")
@js.native
object RouteTable extends js.Object {
  
  /**
    * Get an existing RouteTable resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): RouteTable = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): RouteTable = js.native
  def get(name: String, id: Input[ID], state: RouteTableState): RouteTable = js.native
  def get(name: String, id: Input[ID], state: RouteTableState, opts: CustomResourceOptions): RouteTable = js.native
  
  /**
    * Returns true if the given object is an instance of RouteTable.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/routeTable.RouteTable */ Boolean = js.native
}
