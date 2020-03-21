package typingsSlinky.pulumiAws.mod.directconnect

import typingsSlinky.pulumiAws.gatewayMod.GatewayArgs
import typingsSlinky.pulumiAws.gatewayMod.GatewayState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "directconnect.Gateway")
@js.native
class Gateway protected ()
  extends typingsSlinky.pulumiAws.directconnectMod.Gateway {
  /**
    * Create a Gateway resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: GatewayArgs) = this()
  def this(name: String, args: GatewayArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "directconnect.Gateway")
@js.native
object Gateway extends js.Object {
  /**
    * Get an existing Gateway resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.gatewayMod.Gateway = js.native
  def get(name: String, id: Input[ID], state: GatewayState): typingsSlinky.pulumiAws.gatewayMod.Gateway = js.native
  def get(name: String, id: Input[ID], state: GatewayState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.gatewayMod.Gateway = js.native
  /**
    * Returns true if the given object is an instance of Gateway.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/gateway.Gateway */ Boolean = js.native
}

