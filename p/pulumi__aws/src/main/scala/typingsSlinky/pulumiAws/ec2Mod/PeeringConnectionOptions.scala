package typingsSlinky.pulumiAws.ec2Mod

import typingsSlinky.pulumiAws.peeringConnectionOptionsMod.PeeringConnectionOptionsArgs
import typingsSlinky.pulumiAws.peeringConnectionOptionsMod.PeeringConnectionOptionsState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "PeeringConnectionOptions")
@js.native
class PeeringConnectionOptions protected ()
  extends typingsSlinky.pulumiAws.peeringConnectionOptionsMod.PeeringConnectionOptions {
  /**
    * Create a PeeringConnectionOptions resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PeeringConnectionOptionsArgs) = this()
  def this(name: String, args: PeeringConnectionOptionsArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ec2", "PeeringConnectionOptions")
@js.native
object PeeringConnectionOptions extends js.Object {
  /**
    * Get an existing PeeringConnectionOptions resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.peeringConnectionOptionsMod.PeeringConnectionOptions = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.peeringConnectionOptionsMod.PeeringConnectionOptions = js.native
  def get(name: String, id: Input[ID], state: PeeringConnectionOptionsState): typingsSlinky.pulumiAws.peeringConnectionOptionsMod.PeeringConnectionOptions = js.native
  def get(name: String, id: Input[ID], state: PeeringConnectionOptionsState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.peeringConnectionOptionsMod.PeeringConnectionOptions = js.native
  /**
    * Returns true if the given object is an instance of PeeringConnectionOptions.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/peeringConnectionOptions.PeeringConnectionOptions */ Boolean = js.native
}

