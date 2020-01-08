package typingsSlinky.atPulumiAws.directconnectMod

import typingsSlinky.atPulumiAws.directconnectHostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepterArgs
import typingsSlinky.atPulumiAws.directconnectHostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepterState
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directconnect", "HostedPrivateVirtualInterfaceAccepter")
@js.native
class HostedPrivateVirtualInterfaceAccepter protected ()
  extends typingsSlinky.atPulumiAws.directconnectHostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepter {
  /**
    * Create a HostedPrivateVirtualInterfaceAccepter resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: HostedPrivateVirtualInterfaceAccepterArgs) = this()
  def this(name: String, args: HostedPrivateVirtualInterfaceAccepterArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/directconnect", "HostedPrivateVirtualInterfaceAccepter")
@js.native
object HostedPrivateVirtualInterfaceAccepter extends js.Object {
  /**
    * Get an existing HostedPrivateVirtualInterfaceAccepter resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.directconnectHostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepter = js.native
  def get(name: String, id: Input[ID], state: HostedPrivateVirtualInterfaceAccepterState): typingsSlinky.atPulumiAws.directconnectHostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepter = js.native
  def get(
    name: String,
    id: Input[ID],
    state: HostedPrivateVirtualInterfaceAccepterState,
    opts: CustomResourceOptions
  ): typingsSlinky.atPulumiAws.directconnectHostedPrivateVirtualInterfaceAccepterMod.HostedPrivateVirtualInterfaceAccepter = js.native
  /**
    * Returns true if the given object is an instance of HostedPrivateVirtualInterfaceAccepter.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/hostedPrivateVirtualInterfaceAccepter.HostedPrivateVirtualInterfaceAccepter */ Boolean = js.native
}

