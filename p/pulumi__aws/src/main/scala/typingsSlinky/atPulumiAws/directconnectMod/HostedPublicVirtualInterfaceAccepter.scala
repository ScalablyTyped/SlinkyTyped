package typingsSlinky.atPulumiAws.directconnectMod

import typingsSlinky.atPulumiAws.directconnectHostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepterArgs
import typingsSlinky.atPulumiAws.directconnectHostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepterState
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directconnect", "HostedPublicVirtualInterfaceAccepter")
@js.native
class HostedPublicVirtualInterfaceAccepter protected ()
  extends typingsSlinky.atPulumiAws.directconnectHostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepter {
  /**
    * Create a HostedPublicVirtualInterfaceAccepter resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: HostedPublicVirtualInterfaceAccepterArgs) = this()
  def this(name: String, args: HostedPublicVirtualInterfaceAccepterArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/directconnect", "HostedPublicVirtualInterfaceAccepter")
@js.native
object HostedPublicVirtualInterfaceAccepter extends js.Object {
  /**
    * Get an existing HostedPublicVirtualInterfaceAccepter resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.directconnectHostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepter = js.native
  def get(name: String, id: Input[ID], state: HostedPublicVirtualInterfaceAccepterState): typingsSlinky.atPulumiAws.directconnectHostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepter = js.native
  def get(
    name: String,
    id: Input[ID],
    state: HostedPublicVirtualInterfaceAccepterState,
    opts: CustomResourceOptions
  ): typingsSlinky.atPulumiAws.directconnectHostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepter = js.native
  /**
    * Returns true if the given object is an instance of HostedPublicVirtualInterfaceAccepter.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/hostedPublicVirtualInterfaceAccepter.HostedPublicVirtualInterfaceAccepter */ Boolean = js.native
}

