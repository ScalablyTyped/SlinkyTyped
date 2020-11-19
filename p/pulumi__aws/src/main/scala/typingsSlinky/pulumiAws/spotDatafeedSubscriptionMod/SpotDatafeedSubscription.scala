package typingsSlinky.pulumiAws.spotDatafeedSubscriptionMod

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2/spotDatafeedSubscription", "SpotDatafeedSubscription")
@js.native
class SpotDatafeedSubscription protected () extends CustomResource {
  /**
    * Create a SpotDatafeedSubscription resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SpotDatafeedSubscriptionArgs) = this()
  def this(name: String, args: SpotDatafeedSubscriptionArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The Amazon S3 bucket in which to store the Spot instance data feed.
    */
  val bucket: Output_[String] = js.native
  
  /**
    * Path of folder inside bucket to place spot pricing data.
    */
  val prefix: Output_[js.UndefOr[String]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/ec2/spotDatafeedSubscription", "SpotDatafeedSubscription")
@js.native
object SpotDatafeedSubscription extends js.Object {
  
  /**
    * Get an existing SpotDatafeedSubscription resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): SpotDatafeedSubscription = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SpotDatafeedSubscription = js.native
  def get(name: String, id: Input[ID], state: SpotDatafeedSubscriptionState): SpotDatafeedSubscription = js.native
  def get(name: String, id: Input[ID], state: SpotDatafeedSubscriptionState, opts: CustomResourceOptions): SpotDatafeedSubscription = js.native
  
  /**
    * Returns true if the given object is an instance of SpotDatafeedSubscription.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/spotDatafeedSubscription.SpotDatafeedSubscription */ Boolean = js.native
}
