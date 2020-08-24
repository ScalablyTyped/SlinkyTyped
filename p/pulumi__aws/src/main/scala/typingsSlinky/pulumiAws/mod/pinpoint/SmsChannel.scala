package typingsSlinky.pulumiAws.mod.pinpoint

import typingsSlinky.pulumiAws.smsChannelMod.SmsChannelArgs
import typingsSlinky.pulumiAws.smsChannelMod.SmsChannelState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "pinpoint.SmsChannel")
@js.native
class SmsChannel protected ()
  extends typingsSlinky.pulumiAws.pinpointMod.SmsChannel {
  /**
    * Create a SmsChannel resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SmsChannelArgs) = this()
  def this(name: String, args: SmsChannelArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "pinpoint.SmsChannel")
@js.native
object SmsChannel extends js.Object {
  /**
    * Get an existing SmsChannel resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.smsChannelMod.SmsChannel = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.smsChannelMod.SmsChannel = js.native
  def get(name: String, id: Input[ID], state: SmsChannelState): typingsSlinky.pulumiAws.smsChannelMod.SmsChannel = js.native
  def get(name: String, id: Input[ID], state: SmsChannelState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.smsChannelMod.SmsChannel = js.native
  /**
    * Returns true if the given object is an instance of SmsChannel.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/smsChannel.SmsChannel */ Boolean = js.native
}

