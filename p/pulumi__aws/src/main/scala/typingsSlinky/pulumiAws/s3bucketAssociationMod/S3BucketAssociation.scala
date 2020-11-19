package typingsSlinky.pulumiAws.s3bucketAssociationMod

import typingsSlinky.pulumiAws.outputMod.macie.S3BucketAssociationClassificationType
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/macie/s3bucketAssociation", "S3BucketAssociation")
@js.native
class S3BucketAssociation protected () extends CustomResource {
  /**
    * Create a S3BucketAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: S3BucketAssociationArgs) = this()
  def this(name: String, args: S3BucketAssociationArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The name of the S3 bucket that you want to associate with Amazon Macie.
    */
  val bucketName: Output_[String] = js.native
  
  /**
    * The configuration of how Amazon Macie classifies the S3 objects.
    */
  val classificationType: Output_[S3BucketAssociationClassificationType] = js.native
  
  /**
    * The ID of the Amazon Macie member account whose S3 resources you want to associate with Macie. If `memberAccountId` isn't specified, the action associates specified S3 resources with Macie for the current master account.
    */
  val memberAccountId: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Object key prefix identifying one or more S3 objects to which the association applies.
    */
  val prefix: Output_[js.UndefOr[String]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/macie/s3bucketAssociation", "S3BucketAssociation")
@js.native
object S3BucketAssociation extends js.Object {
  
  /**
    * Get an existing S3BucketAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): S3BucketAssociation = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): S3BucketAssociation = js.native
  def get(name: String, id: Input[ID], state: S3BucketAssociationState): S3BucketAssociation = js.native
  def get(name: String, id: Input[ID], state: S3BucketAssociationState, opts: CustomResourceOptions): S3BucketAssociation = js.native
  
  /**
    * Returns true if the given object is an instance of S3BucketAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/macie/s3bucketAssociation.S3BucketAssociation */ Boolean = js.native
}
