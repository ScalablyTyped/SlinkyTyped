package typingsSlinky.atPulumiAws.atPulumiAwsMod.pinpoint

import typingsSlinky.atPulumiAws.pinpointApnsVoipSandboxChannelMod.ApnsVoipSandboxChannelArgs
import typingsSlinky.atPulumiAws.pinpointApnsVoipSandboxChannelMod.ApnsVoipSandboxChannelState
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "pinpoint.ApnsVoipSandboxChannel")
@js.native
class ApnsVoipSandboxChannel protected ()
  extends typingsSlinky.atPulumiAws.pinpointMod.ApnsVoipSandboxChannel {
  /**
    * Create a ApnsVoipSandboxChannel resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ApnsVoipSandboxChannelArgs) = this()
  def this(name: String, args: ApnsVoipSandboxChannelArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "pinpoint.ApnsVoipSandboxChannel")
@js.native
object ApnsVoipSandboxChannel extends js.Object {
  /**
    * Get an existing ApnsVoipSandboxChannel resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.pinpointApnsVoipSandboxChannelMod.ApnsVoipSandboxChannel = js.native
  def get(name: String, id: Input[ID], state: ApnsVoipSandboxChannelState): typingsSlinky.atPulumiAws.pinpointApnsVoipSandboxChannelMod.ApnsVoipSandboxChannel = js.native
  def get(name: String, id: Input[ID], state: ApnsVoipSandboxChannelState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.pinpointApnsVoipSandboxChannelMod.ApnsVoipSandboxChannel = js.native
  /**
    * Returns true if the given object is an instance of ApnsVoipSandboxChannel.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/apnsVoipSandboxChannel.ApnsVoipSandboxChannel */ Boolean = js.native
}

