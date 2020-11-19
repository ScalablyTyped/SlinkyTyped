package typingsSlinky.pulumiAws.s3Mod

import typingsSlinky.pulumiAws.bucketNotificationMod.BucketNotificationArgs
import typingsSlinky.pulumiAws.bucketNotificationMod.BucketNotificationState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/s3", "BucketNotification")
@js.native
class BucketNotification protected ()
  extends typingsSlinky.pulumiAws.bucketNotificationMod.BucketNotification {
  /**
    * Create a BucketNotification resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: BucketNotificationArgs) = this()
  def this(name: String, args: BucketNotificationArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/aws/s3", "BucketNotification")
@js.native
object BucketNotification extends js.Object {
  
  /**
    * Get an existing BucketNotification resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.bucketNotificationMod.BucketNotification = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.bucketNotificationMod.BucketNotification = js.native
  def get(name: String, id: Input[ID], state: BucketNotificationState): typingsSlinky.pulumiAws.bucketNotificationMod.BucketNotification = js.native
  def get(name: String, id: Input[ID], state: BucketNotificationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.bucketNotificationMod.BucketNotification = js.native
  
  /**
    * Returns true if the given object is an instance of BucketNotification.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketNotification.BucketNotification */ Boolean = js.native
}
