package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.channelMod.ChannelArgs
import typingsSlinky.pulumiAws.channelMod.ChannelState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediapackageMod {
  
  @JSImport("@pulumi/aws/mediapackage", "Channel")
  @js.native
  class Channel protected ()
    extends typingsSlinky.pulumiAws.channelMod.Channel {
    /**
      * Create a Channel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ChannelArgs) = this()
    def this(name: String, args: ChannelArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Channel {
    
    /**
      * Get an existing Channel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/mediapackage", "Channel.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.channelMod.Channel = js.native
    @JSImport("@pulumi/aws/mediapackage", "Channel.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.channelMod.Channel = js.native
    @JSImport("@pulumi/aws/mediapackage", "Channel.get")
    @js.native
    def get(name: String, id: Input[ID], state: ChannelState): typingsSlinky.pulumiAws.channelMod.Channel = js.native
    @JSImport("@pulumi/aws/mediapackage", "Channel.get")
    @js.native
    def get(name: String, id: Input[ID], state: ChannelState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.channelMod.Channel = js.native
    
    /**
      * Returns true if the given object is an instance of Channel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/mediapackage", "Channel.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mediapackage/channel.Channel */ Boolean = js.native
  }
}
