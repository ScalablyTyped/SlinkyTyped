package typingsSlinky.pulumiAws.bucketPolicyMod

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/s3control/bucketPolicy", "BucketPolicy")
@js.native
class BucketPolicy protected () extends CustomResource {
  /**
    * Create a BucketPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: BucketPolicyArgs) = this()
  def this(name: String, args: BucketPolicyArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Amazon Resource Name (ARN) of the bucket.
    */
  val bucket: Output_[String] = js.native
  
  val policy: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/s3control/bucketPolicy", "BucketPolicy")
@js.native
object BucketPolicy extends js.Object {
  
  /**
    * Get an existing BucketPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): BucketPolicy = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): BucketPolicy = js.native
  def get(name: String, id: Input[ID], state: BucketPolicyState): BucketPolicy = js.native
  def get(name: String, id: Input[ID], state: BucketPolicyState, opts: CustomResourceOptions): BucketPolicy = js.native
  
  /**
    * Returns true if the given object is an instance of BucketPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3control/bucketPolicy.BucketPolicy */ Boolean = js.native
}
