package typingsSlinky.atPulumiAws.s3Mod

import typingsSlinky.atPulumiAws.s3BucketMetricMod.BucketMetricArgs
import typingsSlinky.atPulumiAws.s3BucketMetricMod.BucketMetricState
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/s3", "BucketMetric")
@js.native
class BucketMetric protected ()
  extends typingsSlinky.atPulumiAws.s3BucketMetricMod.BucketMetric {
  /**
    * Create a BucketMetric resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: BucketMetricArgs) = this()
  def this(name: String, args: BucketMetricArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/s3", "BucketMetric")
@js.native
object BucketMetric extends js.Object {
  /**
    * Get an existing BucketMetric resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.s3BucketMetricMod.BucketMetric = js.native
  def get(name: String, id: Input[ID], state: BucketMetricState): typingsSlinky.atPulumiAws.s3BucketMetricMod.BucketMetric = js.native
  def get(name: String, id: Input[ID], state: BucketMetricState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.s3BucketMetricMod.BucketMetric = js.native
  /**
    * Returns true if the given object is an instance of BucketMetric.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketMetric.BucketMetric */ Boolean = js.native
}

