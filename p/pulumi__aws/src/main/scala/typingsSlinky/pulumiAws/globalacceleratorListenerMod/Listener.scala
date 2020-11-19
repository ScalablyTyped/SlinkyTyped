package typingsSlinky.pulumiAws.globalacceleratorListenerMod

import typingsSlinky.pulumiAws.outputMod.globalaccelerator.ListenerPortRange
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/globalaccelerator/listener", "Listener")
@js.native
class Listener protected () extends CustomResource {
  /**
    * Create a Listener resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ListenerArgs) = this()
  def this(name: String, args: ListenerArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The Amazon Resource Name (ARN) of your accelerator.
    */
  val acceleratorArn: Output_[String] = js.native
  
  /**
    * Direct all requests from a user to the same endpoint. Valid values are `NONE`, `SOURCE_IP`. Default: `NONE`. If `NONE`, Global Accelerator uses the "five-tuple" properties of source IP address, source port, destination IP address, destination port, and protocol to select the hash value. If `SOURCE_IP`, Global Accelerator uses the "two-tuple" properties of source (client) IP address and destination IP address to select the hash value.
    */
  val clientAffinity: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The list of port ranges for the connections from clients to the accelerator. Fields documented below.
    */
  val portRanges: Output_[js.Array[ListenerPortRange]] = js.native
  
  /**
    * The protocol for the connections from clients to the accelerator. Valid values are `TCP`, `UDP`.
    */
  val protocol: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/globalaccelerator/listener", "Listener")
@js.native
object Listener extends js.Object {
  
  /**
    * Get an existing Listener resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Listener = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Listener = js.native
  def get(name: String, id: Input[ID], state: ListenerState): Listener = js.native
  def get(name: String, id: Input[ID], state: ListenerState, opts: CustomResourceOptions): Listener = js.native
  
  /**
    * Returns true if the given object is an instance of Listener.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/globalaccelerator/listener.Listener */ Boolean = js.native
}
