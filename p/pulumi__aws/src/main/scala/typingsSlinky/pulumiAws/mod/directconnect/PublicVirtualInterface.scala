package typingsSlinky.pulumiAws.mod.directconnect

import typingsSlinky.pulumiAws.publicVirtualInterfaceMod.PublicVirtualInterfaceArgs
import typingsSlinky.pulumiAws.publicVirtualInterfaceMod.PublicVirtualInterfaceState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "directconnect.PublicVirtualInterface")
@js.native
class PublicVirtualInterface protected ()
  extends typingsSlinky.pulumiAws.directconnectMod.PublicVirtualInterface {
  /**
    * Create a PublicVirtualInterface resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PublicVirtualInterfaceArgs) = this()
  def this(name: String, args: PublicVirtualInterfaceArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/aws", "directconnect.PublicVirtualInterface")
@js.native
object PublicVirtualInterface extends js.Object {
  
  /**
    * Get an existing PublicVirtualInterface resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.publicVirtualInterfaceMod.PublicVirtualInterface = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.publicVirtualInterfaceMod.PublicVirtualInterface = js.native
  def get(name: String, id: Input[ID], state: PublicVirtualInterfaceState): typingsSlinky.pulumiAws.publicVirtualInterfaceMod.PublicVirtualInterface = js.native
  def get(name: String, id: Input[ID], state: PublicVirtualInterfaceState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.publicVirtualInterfaceMod.PublicVirtualInterface = js.native
  
  /**
    * Returns true if the given object is an instance of PublicVirtualInterface.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/publicVirtualInterface.PublicVirtualInterface */ Boolean = js.native
}
