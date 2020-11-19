package typingsSlinky.pulumiAws.mod.kinesis

import typingsSlinky.pulumiAws.firehoseDeliveryStreamMod.FirehoseDeliveryStreamArgs
import typingsSlinky.pulumiAws.firehoseDeliveryStreamMod.FirehoseDeliveryStreamState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "kinesis.FirehoseDeliveryStream")
@js.native
class FirehoseDeliveryStream protected ()
  extends typingsSlinky.pulumiAws.kinesisMod.FirehoseDeliveryStream {
  /**
    * Create a FirehoseDeliveryStream resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: FirehoseDeliveryStreamArgs) = this()
  def this(name: String, args: FirehoseDeliveryStreamArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/aws", "kinesis.FirehoseDeliveryStream")
@js.native
object FirehoseDeliveryStream extends js.Object {
  
  /**
    * Get an existing FirehoseDeliveryStream resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.firehoseDeliveryStreamMod.FirehoseDeliveryStream = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.firehoseDeliveryStreamMod.FirehoseDeliveryStream = js.native
  def get(name: String, id: Input[ID], state: FirehoseDeliveryStreamState): typingsSlinky.pulumiAws.firehoseDeliveryStreamMod.FirehoseDeliveryStream = js.native
  def get(name: String, id: Input[ID], state: FirehoseDeliveryStreamState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.firehoseDeliveryStreamMod.FirehoseDeliveryStream = js.native
  
  /**
    * Returns true if the given object is an instance of FirehoseDeliveryStream.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesis/firehoseDeliveryStream.FirehoseDeliveryStream */ Boolean = js.native
}
