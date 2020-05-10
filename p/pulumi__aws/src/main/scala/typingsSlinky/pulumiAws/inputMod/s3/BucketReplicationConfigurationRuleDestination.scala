package typingsSlinky.pulumiAws.inputMod.s3

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketReplicationConfigurationRuleDestination extends js.Object {
  /**
    * Specifies the overrides to use for object owners on replication. Must be used in conjunction with `accountId` owner override configuration.
    */
  var accessControlTranslation: js.UndefOr[Input[BucketReplicationConfigurationRuleDestinationAccessControlTranslation]] = js.native
  /**
    * The Account ID to use for overriding the object owner on replication. Must be used in conjunction with `accessControlTranslation` override configuration.
    */
  var accountId: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the S3 bucket where you want Amazon S3 to store replicas of the object identified by the rule.
    */
  var bucket: Input[String] = js.native
  /**
    * Destination KMS encryption key ARN for SSE-KMS replication. Must be used in conjunction with
    * `sseKmsEncryptedObjects` source selection criteria.
    */
  var replicaKmsKeyId: js.UndefOr[Input[String]] = js.native
  /**
    * The class of storage used to store the object. Can be `STANDARD`, `REDUCED_REDUNDANCY`, `STANDARD_IA`, `ONEZONE_IA`, `INTELLIGENT_TIERING`, `GLACIER`, or `DEEP_ARCHIVE`.
    */
  var storageClass: js.UndefOr[Input[String]] = js.native
}

object BucketReplicationConfigurationRuleDestination {
  @scala.inline
  def apply(bucket: Input[String]): BucketReplicationConfigurationRuleDestination = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketReplicationConfigurationRuleDestination]
  }
  @scala.inline
  implicit class BucketReplicationConfigurationRuleDestinationOps[Self <: BucketReplicationConfigurationRuleDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessControlTranslation(value: Input[BucketReplicationConfigurationRuleDestinationAccessControlTranslation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessControlTranslation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessControlTranslation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessControlTranslation")(js.undefined)
        ret
    }
    @scala.inline
    def withAccountId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicaKmsKeyId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicaKmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicaKmsKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageClass(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageClass")(js.undefined)
        ret
    }
  }
  
}

