package typingsSlinky.pulumiAws.s3BucketMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.s3.BucketCorsRule
import typingsSlinky.pulumiAws.outputMod.s3.BucketGrant
import typingsSlinky.pulumiAws.outputMod.s3.BucketLifecycleRule
import typingsSlinky.pulumiAws.outputMod.s3.BucketLogging
import typingsSlinky.pulumiAws.outputMod.s3.BucketObjectLockConfiguration
import typingsSlinky.pulumiAws.outputMod.s3.BucketReplicationConfiguration
import typingsSlinky.pulumiAws.outputMod.s3.BucketServerSideEncryptionConfiguration
import typingsSlinky.pulumiAws.outputMod.s3.BucketVersioning
import typingsSlinky.pulumiAws.outputMod.s3.BucketWebsite
import typingsSlinky.pulumiAws.s3MixinsMod.BucketEventHandler
import typingsSlinky.pulumiAws.s3MixinsMod.BucketEventSubscription
import typingsSlinky.pulumiAws.s3MixinsMod.BucketEventSubscriptionArgs
import typingsSlinky.pulumiAws.s3MixinsMod.ObjectCreatedSubscriptionArgs
import typingsSlinky.pulumiAws.s3MixinsMod.ObjectRemovedSubscriptionArgs
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.ComponentResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/s3/bucket", "Bucket")
@js.native
class Bucket protected () extends CustomResource {
  /**
    * Create a Bucket resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: BucketArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: BucketArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Sets the accelerate configuration of an existing bucket. Can be `Enabled` or `Suspended`.
    */
  val accelerationStatus: Output_[String] = js.native
  
  /**
    * The [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Valid values are `private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, and `log-delivery-write`. Defaults to `private`.  Conflicts with `grant`.
    */
  val acl: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The ARN of the bucket. Will be of format `arn:aws:s3:::bucketname`.
    */
  val arn: Output_[String] = js.native
  
  /**
    * The name of the bucket. If omitted, this provider will assign a random, unique name. Must be less than or equal to 63 characters in length.
    */
  val bucket: Output_[String] = js.native
  
  /**
    * The bucket domain name. Will be of format `bucketname.s3.amazonaws.com`.
    */
  val bucketDomainName: Output_[String] = js.native
  
  /**
    * Creates a unique bucket name beginning with the specified prefix. Conflicts with `bucket`. Must be less than or equal to 37 characters in length.
    */
  val bucketPrefix: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The bucket region-specific domain name. The bucket domain name including the region name, please refer [here](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region) for format. Note: The AWS CloudFront allows specifying S3 region-specific endpoint when creating S3 origin, it will prevent [redirect issues](https://forums.aws.amazon.com/thread.jspa?threadID=216814) from CloudFront to S3 Origin URL.
    */
  val bucketRegionalDomainName: Output_[String] = js.native
  
  /**
    * A rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) (documented below).
    */
  val corsRules: Output_[js.UndefOr[js.Array[BucketCorsRule]]] = js.native
  
  /**
    * A boolean that indicates all objects (including any [locked objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html)) should be deleted from the bucket so that the bucket can be destroyed without error. These objects are *not* recoverable.
    */
  val forceDestroy: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * An [ACL policy grant](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#sample-acl) (documented below). Conflicts with `acl`.
    */
  val grants: Output_[js.UndefOr[js.Array[BucketGrant]]] = js.native
  
  /**
    * The [Route 53 Hosted Zone ID](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_website_region_endpoints) for this bucket's region.
    */
  val hostedZoneId: Output_[String] = js.native
  
  /**
    * A configuration of [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) (documented below).
    */
  val lifecycleRules: Output_[js.UndefOr[js.Array[BucketLifecycleRule]]] = js.native
  
  /**
    * A settings of [bucket logging](https://docs.aws.amazon.com/AmazonS3/latest/UG/ManagingBucketLogging.html) (documented below).
    */
  val loggings: Output_[js.UndefOr[js.Array[BucketLogging]]] = js.native
  
  /**
    * A configuration of [S3 object locking](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) (documented below)
    */
  val objectLockConfiguration: Output_[js.UndefOr[BucketObjectLockConfiguration]] = js.native
  
  /**
    * Creates a new subscription to events fired from this Bucket to the handler provided,
    * along with options to control the behavior of the subscription.  This function should be
    * used when full control over the subscription is wanted, and other helpers (like
    * onObjectCreated/onObjectRemoved) are not sufficient.
    */
  def onEvent(name: String, handler: BucketEventHandler, args: BucketEventSubscriptionArgs): BucketEventSubscription = js.native
  def onEvent(
    name: String,
    handler: BucketEventHandler,
    args: BucketEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ): BucketEventSubscription = js.native
  
  /**
    * Creates a new subscription to events fired from this Bucket to the handler provided,
    * along with options to control the behavior of the subscription.  The handler will be
    * called whenever a matching [s3.Object] is created.
    */
  def onObjectCreated(name: String, handler: BucketEventHandler): BucketEventSubscription = js.native
  def onObjectCreated(
    name: String,
    handler: BucketEventHandler,
    args: js.UndefOr[scala.Nothing],
    opts: ComponentResourceOptions
  ): BucketEventSubscription = js.native
  def onObjectCreated(name: String, handler: BucketEventHandler, args: ObjectCreatedSubscriptionArgs): BucketEventSubscription = js.native
  def onObjectCreated(
    name: String,
    handler: BucketEventHandler,
    args: ObjectCreatedSubscriptionArgs,
    opts: ComponentResourceOptions
  ): BucketEventSubscription = js.native
  
  /**
    * Creates a new subscription to events fired from this Bucket to the handler provided,
    * along with options to control the behavior of the subscription.  The handler will be
    * called whenever an matching [s3.Object] is removed.
    */
  def onObjectRemoved(name: String, handler: BucketEventHandler): BucketEventSubscription = js.native
  def onObjectRemoved(
    name: String,
    handler: BucketEventHandler,
    args: js.UndefOr[scala.Nothing],
    opts: ComponentResourceOptions
  ): BucketEventSubscription = js.native
  def onObjectRemoved(name: String, handler: BucketEventHandler, args: ObjectRemovedSubscriptionArgs): BucketEventSubscription = js.native
  def onObjectRemoved(
    name: String,
    handler: BucketEventHandler,
    args: ObjectRemovedSubscriptionArgs,
    opts: ComponentResourceOptions
  ): BucketEventSubscription = js.native
  
  /**
    * A valid [bucket policy](https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html) JSON document. Note that if the policy document is not specific enough (but still valid), the provider may view the policy as constantly changing in a `pulumi up / preview / update`. In this case, please make sure you use the verbose/specific version of the policy.
    */
  val policy: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The AWS region this bucket resides in.
    */
  val region: Output_[String] = js.native
  
  /**
    * A configuration of [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html) (documented below).
    */
  val replicationConfiguration: Output_[js.UndefOr[BucketReplicationConfiguration]] = js.native
  
  /**
    * Specifies who should bear the cost of Amazon S3 data transfer.
    * Can be either `BucketOwner` or `Requester`. By default, the owner of the S3 bucket would incur
    * the costs of any data transfer. See [Requester Pays Buckets](http://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html)
    * developer guide for more information.
    */
  val requestPayer: Output_[String] = js.native
  
  /**
    * A configuration of [server-side encryption configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html) (documented below)
    */
  val serverSideEncryptionConfiguration: Output_[js.UndefOr[BucketServerSideEncryptionConfiguration]] = js.native
  
  /**
    * A mapping of tags to assign to the bucket.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * A state of [versioning](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html) (documented below)
    */
  val versioning: Output_[BucketVersioning] = js.native
  
  /**
    * A website object (documented below).
    */
  val website: Output_[js.UndefOr[BucketWebsite]] = js.native
  
  /**
    * The domain of the website endpoint, if the bucket is configured with a website. If not, this will be an empty string. This is used to create Route 53 alias records.
    */
  val websiteDomain: Output_[String] = js.native
  
  /**
    * The website endpoint, if the bucket is configured with a website. If not, this will be an empty string.
    */
  val websiteEndpoint: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/s3/bucket", "Bucket")
@js.native
object Bucket extends js.Object {
  
  /**
    * Get an existing Bucket resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Bucket = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Bucket = js.native
  def get(name: String, id: Input[ID], state: BucketState): Bucket = js.native
  def get(name: String, id: Input[ID], state: BucketState, opts: CustomResourceOptions): Bucket = js.native
  
  /**
    * Returns true if the given object is an instance of Bucket.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucket.Bucket */ Boolean = js.native
}
