package typingsSlinky.pulumiAws.mod.pinpoint

import typingsSlinky.pulumiAws.apnsChannelMod.ApnsChannelArgs
import typingsSlinky.pulumiAws.apnsChannelMod.ApnsChannelState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "pinpoint.ApnsChannel")
@js.native
class ApnsChannel protected ()
  extends typingsSlinky.pulumiAws.pinpointMod.ApnsChannel {
  /**
    * Create a ApnsChannel resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ApnsChannelArgs) = this()
  def this(name: String, args: ApnsChannelArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/aws", "pinpoint.ApnsChannel")
@js.native
object ApnsChannel extends js.Object {
  
  /**
    * Get an existing ApnsChannel resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.apnsChannelMod.ApnsChannel = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.apnsChannelMod.ApnsChannel = js.native
  def get(name: String, id: Input[ID], state: ApnsChannelState): typingsSlinky.pulumiAws.apnsChannelMod.ApnsChannel = js.native
  def get(name: String, id: Input[ID], state: ApnsChannelState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.apnsChannelMod.ApnsChannel = js.native
  
  /**
    * Returns true if the given object is an instance of ApnsChannel.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/apnsChannel.ApnsChannel */ Boolean = js.native
}
