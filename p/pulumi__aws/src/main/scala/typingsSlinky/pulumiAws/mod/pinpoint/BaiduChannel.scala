package typingsSlinky.pulumiAws.mod.pinpoint

import typingsSlinky.pulumiAws.baiduChannelMod.BaiduChannelArgs
import typingsSlinky.pulumiAws.baiduChannelMod.BaiduChannelState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "pinpoint.BaiduChannel")
@js.native
class BaiduChannel protected ()
  extends typingsSlinky.pulumiAws.pinpointMod.BaiduChannel {
  /**
    * Create a BaiduChannel resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: BaiduChannelArgs) = this()
  def this(name: String, args: BaiduChannelArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "pinpoint.BaiduChannel")
@js.native
object BaiduChannel extends js.Object {
  /**
    * Get an existing BaiduChannel resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.baiduChannelMod.BaiduChannel = js.native
  def get(name: String, id: Input[ID], state: BaiduChannelState): typingsSlinky.pulumiAws.baiduChannelMod.BaiduChannel = js.native
  def get(name: String, id: Input[ID], state: BaiduChannelState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.baiduChannelMod.BaiduChannel = js.native
  /**
    * Returns true if the given object is an instance of BaiduChannel.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/baiduChannel.BaiduChannel */ Boolean = js.native
}

