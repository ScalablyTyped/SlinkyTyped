package typingsSlinky.pulumiAws.directconnectMod

import typingsSlinky.pulumiAws.hostedTransitVirtualInterfaceMod.HostedTransitVirtualInterfaceArgs
import typingsSlinky.pulumiAws.hostedTransitVirtualInterfaceMod.HostedTransitVirtualInterfaceState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directconnect", "HostedTransitVirtualInterface")
@js.native
class HostedTransitVirtualInterface protected ()
  extends typingsSlinky.pulumiAws.hostedTransitVirtualInterfaceMod.HostedTransitVirtualInterface {
  /**
    * Create a HostedTransitVirtualInterface resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: HostedTransitVirtualInterfaceArgs) = this()
  def this(name: String, args: HostedTransitVirtualInterfaceArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/directconnect", "HostedTransitVirtualInterface")
@js.native
object HostedTransitVirtualInterface extends js.Object {
  /**
    * Get an existing HostedTransitVirtualInterface resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.hostedTransitVirtualInterfaceMod.HostedTransitVirtualInterface = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.hostedTransitVirtualInterfaceMod.HostedTransitVirtualInterface = js.native
  def get(name: String, id: Input[ID], state: HostedTransitVirtualInterfaceState): typingsSlinky.pulumiAws.hostedTransitVirtualInterfaceMod.HostedTransitVirtualInterface = js.native
  def get(
    name: String,
    id: Input[ID],
    state: HostedTransitVirtualInterfaceState,
    opts: CustomResourceOptions
  ): typingsSlinky.pulumiAws.hostedTransitVirtualInterfaceMod.HostedTransitVirtualInterface = js.native
  /**
    * Returns true if the given object is an instance of HostedTransitVirtualInterface.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/hostedTransitVirtualInterface.HostedTransitVirtualInterface */ Boolean = js.native
}

