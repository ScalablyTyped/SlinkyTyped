package typingsSlinky.pulumiAws.bucketMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.cannedAclMod.CannedAcl
import typingsSlinky.pulumiAws.documentsMod.PolicyDocument
import typingsSlinky.pulumiAws.inputMod.s3.BucketCorsRule
import typingsSlinky.pulumiAws.inputMod.s3.BucketGrant
import typingsSlinky.pulumiAws.inputMod.s3.BucketLifecycleRule
import typingsSlinky.pulumiAws.inputMod.s3.BucketLogging
import typingsSlinky.pulumiAws.inputMod.s3.BucketObjectLockConfiguration
import typingsSlinky.pulumiAws.inputMod.s3.BucketReplicationConfiguration
import typingsSlinky.pulumiAws.inputMod.s3.BucketServerSideEncryptionConfiguration
import typingsSlinky.pulumiAws.inputMod.s3.BucketVersioning
import typingsSlinky.pulumiAws.inputMod.s3.BucketWebsite
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketArgs extends js.Object {
  /**
    * Sets the accelerate configuration of an existing bucket. Can be `Enabled` or `Suspended`.
    */
  val accelerationStatus: js.UndefOr[Input[String]] = js.native
  /**
    * The [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Defaults to "private".  Conflicts with `grant`.
    */
  val acl: js.UndefOr[Input[String | CannedAcl]] = js.native
  /**
    * The ARN of the bucket. Will be of format `arn:aws:s3:::bucketname`.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the S3 bucket where you want Amazon S3 to store replicas of the object identified by the rule.
    */
  val bucket: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique bucket name beginning with the specified prefix. Conflicts with `bucket`.
    */
  val bucketPrefix: js.UndefOr[Input[String]] = js.native
  /**
    * A rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) (documented below).
    */
  val corsRules: js.UndefOr[Input[js.Array[Input[BucketCorsRule]]]] = js.native
  /**
    * A boolean that indicates all objects (including any [locked objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html)) should be deleted from the bucket so that the bucket can be destroyed without error. These objects are *not* recoverable.
    */
  val forceDestroy: js.UndefOr[Input[Boolean]] = js.native
  /**
    * An [ACL policy grant](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#sample-acl) (documented below). Conflicts with `acl`.
    */
  val grants: js.UndefOr[Input[js.Array[Input[BucketGrant]]]] = js.native
  /**
    * The [Route 53 Hosted Zone ID](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_website_region_endpoints) for this bucket's region.
    */
  val hostedZoneId: js.UndefOr[Input[String]] = js.native
  /**
    * A configuration of [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) (documented below).
    */
  val lifecycleRules: js.UndefOr[Input[js.Array[Input[BucketLifecycleRule]]]] = js.native
  /**
    * A settings of [bucket logging](https://docs.aws.amazon.com/AmazonS3/latest/UG/ManagingBucketLogging.html) (documented below).
    */
  val loggings: js.UndefOr[Input[js.Array[Input[BucketLogging]]]] = js.native
  /**
    * A configuration of [S3 object locking](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) (documented below)
    */
  val objectLockConfiguration: js.UndefOr[Input[BucketObjectLockConfiguration]] = js.native
  /**
    * A valid [bucket policy](https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html) JSON document.
    */
  val policy: js.UndefOr[Input[String | PolicyDocument]] = js.native
  /**
    * If specified, the AWS region this bucket should reside in. Otherwise, the region used by the callee.
    */
  val region: js.UndefOr[Input[String]] = js.native
  /**
    * A configuration of [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html) (documented below).
    */
  val replicationConfiguration: js.UndefOr[Input[BucketReplicationConfiguration]] = js.native
  /**
    * Specifies who should bear the cost of Amazon S3 data transfer.
    * Can be either `BucketOwner` or `Requester`. By default, the owner of the S3 bucket would incur
    * the costs of any data transfer. See [Requester Pays Buckets](http://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html)
    * developer guide for more information.
    */
  val requestPayer: js.UndefOr[Input[String]] = js.native
  /**
    * A configuration of [server-side encryption configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html) (documented below)
    */
  val serverSideEncryptionConfiguration: js.UndefOr[Input[BucketServerSideEncryptionConfiguration]] = js.native
  /**
    * A mapping of tags that identifies subset of objects to which the rule applies.
    * The rule applies only to objects having all the tags in its tagset.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * A state of [versioning](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html) (documented below)
    */
  val versioning: js.UndefOr[Input[BucketVersioning]] = js.native
  /**
    * A website object (documented below).
    */
  val website: js.UndefOr[Input[BucketWebsite]] = js.native
  /**
    * The domain of the website endpoint, if the bucket is configured with a website. If not, this will be an empty string. This is used to create Route 53 alias records.
    */
  val websiteDomain: js.UndefOr[Input[String]] = js.native
  /**
    * The website endpoint, if the bucket is configured with a website. If not, this will be an empty string.
    */
  val websiteEndpoint: js.UndefOr[Input[String]] = js.native
}

object BucketArgs {
  @scala.inline
  def apply(): BucketArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketArgs]
  }
  @scala.inline
  implicit class BucketArgsOps[Self <: BucketArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccelerationStatus(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccelerationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerationStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withAcl(value: Input[String | CannedAcl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acl")(js.undefined)
        ret
    }
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withBucket(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(js.undefined)
        ret
    }
    @scala.inline
    def withBucketPrefix(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withCorsRules(value: Input[js.Array[Input[BucketCorsRule]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corsRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorsRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corsRules")(js.undefined)
        ret
    }
    @scala.inline
    def withForceDestroy(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceDestroy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withGrants(value: Input[js.Array[Input[BucketGrant]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrants: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grants")(js.undefined)
        ret
    }
    @scala.inline
    def withHostedZoneId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostedZoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostedZoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostedZoneId")(js.undefined)
        ret
    }
    @scala.inline
    def withLifecycleRules(value: Input[js.Array[Input[BucketLifecycleRule]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycleRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifecycleRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycleRules")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggings(value: Input[js.Array[Input[BucketLogging]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggings")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectLockConfiguration(value: Input[BucketObjectLockConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectLockConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectLockConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectLockConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicy(value: Input[String | PolicyDocument]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationConfiguration(value: Input[BucketReplicationConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestPayer(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestPayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestPayer")(js.undefined)
        ret
    }
    @scala.inline
    def withServerSideEncryptionConfiguration(value: Input[BucketServerSideEncryptionConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSideEncryptionConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerSideEncryptionConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSideEncryptionConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withVersioning(value: Input[BucketVersioning]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersioning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versioning")(js.undefined)
        ret
    }
    @scala.inline
    def withWebsite(value: Input[BucketWebsite]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("website")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("website")(js.undefined)
        ret
    }
    @scala.inline
    def withWebsiteDomain(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websiteDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsiteDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websiteDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withWebsiteEndpoint(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websiteEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsiteEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websiteEndpoint")(js.undefined)
        ret
    }
  }
  
}

