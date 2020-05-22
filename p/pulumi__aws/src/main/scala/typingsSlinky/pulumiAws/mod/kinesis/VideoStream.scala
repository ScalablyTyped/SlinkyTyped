package typingsSlinky.pulumiAws.mod.kinesis

import typingsSlinky.pulumiAws.videoStreamMod.VideoStreamArgs
import typingsSlinky.pulumiAws.videoStreamMod.VideoStreamState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "kinesis.VideoStream")
@js.native
class VideoStream protected ()
  extends typingsSlinky.pulumiAws.kinesisMod.VideoStream {
  /**
    * Create a VideoStream resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: VideoStreamArgs) = this()
  def this(name: String, args: VideoStreamArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "kinesis.VideoStream")
@js.native
object VideoStream extends js.Object {
  /**
    * Get an existing VideoStream resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.videoStreamMod.VideoStream = js.native
  def get(name: String, id: Input[ID], state: VideoStreamState): typingsSlinky.pulumiAws.videoStreamMod.VideoStream = js.native
  def get(name: String, id: Input[ID], state: VideoStreamState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.videoStreamMod.VideoStream = js.native
  /**
    * Returns true if the given object is an instance of VideoStream.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesis/videoStream.VideoStream */ Boolean = js.native
}

