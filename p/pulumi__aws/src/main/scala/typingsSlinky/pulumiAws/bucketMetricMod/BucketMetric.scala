package typingsSlinky.pulumiAws.bucketMetricMod

import typingsSlinky.pulumiAws.outputMod.s3.BucketMetricFilter
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/s3/bucketMetric", "BucketMetric")
@js.native
class BucketMetric protected () extends CustomResource {
  /**
    * Create a BucketMetric resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: BucketMetricArgs) = this()
  def this(name: String, args: BucketMetricArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The name of the bucket to put metric configuration.
    */
  val bucket: Output_[String] = js.native
  
  /**
    * [Object filtering](http://docs.aws.amazon.com/AmazonS3/latest/dev/metrics-configurations.html#metrics-configurations-filter) that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
    */
  val filter: Output_[js.UndefOr[BucketMetricFilter]] = js.native
  
  /**
    * Unique identifier of the metrics configuration for the bucket.
    */
  val name: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/s3/bucketMetric", "BucketMetric")
@js.native
object BucketMetric extends js.Object {
  
  /**
    * Get an existing BucketMetric resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): BucketMetric = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): BucketMetric = js.native
  def get(name: String, id: Input[ID], state: BucketMetricState): BucketMetric = js.native
  def get(name: String, id: Input[ID], state: BucketMetricState, opts: CustomResourceOptions): BucketMetric = js.native
  
  /**
    * Returns true if the given object is an instance of BucketMetric.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketMetric.BucketMetric */ Boolean = js.native
}
