package typingsSlinky.awsSdkClientS3Node.typesDestinationMod

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ONEZONE_IA
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.REDUCED_REDUNDANCY
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD_IA
import typingsSlinky.awsSdkClientS3Node.typesAccessControlTranslationMod.AccessControlTranslation
import typingsSlinky.awsSdkClientS3Node.typesEncryptionConfigurationMod.EncryptionConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Destination extends js.Object {
  /**
    * <p> Container for information regarding the access control for replicas. </p> <p> Use only in a cross-account scenario, where source and destination bucket owners are not the same, when you want to change replica ownership to the AWS account that owns the destination bucket. If you don't add this element to the replication configuration, the replicas are owned by same AWS account that owns the source object. </p>
    */
  var AccessControlTranslation: js.UndefOr[
    typingsSlinky.awsSdkClientS3Node.typesAccessControlTranslationMod.AccessControlTranslation
  ] = js.native
  /**
    * <p> Account ID of the destination bucket. Currently Amazon S3 verifies this value only if Access Control Translation is enabled. </p> <p> In a cross-account scenario, if you tell Amazon S3 to change replica ownership to the AWS account that owns the destination bucket by adding the <code>AccessControlTranslation</code> element, this is the account ID of the destination bucket owner. </p>
    */
  var Account: js.UndefOr[String] = js.native
  /**
    * <p> Amazon resource name (ARN) of the bucket where you want Amazon S3 to store replicas of the object identified by the rule. </p> <p> If you have multiple rules in your replication configuration, all rules must specify the same bucket as the destination. A replication configuration can replicate objects only to one destination bucket. </p>
    */
  var Bucket: String = js.native
  /**
    * <p> Container that provides encryption-related information. You must specify this element if the <code>SourceSelectionCriteria</code> is specified. </p>
    */
  var EncryptionConfiguration: js.UndefOr[
    typingsSlinky.awsSdkClientS3Node.typesEncryptionConfigurationMod.EncryptionConfiguration
  ] = js.native
  /**
    * <p>The class of storage used to store the object.</p>
    */
  var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String] = js.native
}

object Destination {
  @scala.inline
  def apply(Bucket: String): Destination = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destination]
  }
  @scala.inline
  implicit class DestinationOps[Self <: Destination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessControlTranslation(value: AccessControlTranslation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessControlTranslation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessControlTranslation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessControlTranslation")(js.undefined)
        ret
    }
    @scala.inline
    def withAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Account")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionConfiguration(value: EncryptionConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageClass(value: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageClass")(js.undefined)
        ret
    }
  }
  
}

