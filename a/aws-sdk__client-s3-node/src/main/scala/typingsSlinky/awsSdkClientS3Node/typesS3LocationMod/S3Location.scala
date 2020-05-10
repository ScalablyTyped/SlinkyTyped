package typingsSlinky.awsSdkClientS3Node.typesS3LocationMod

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ONEZONE_IA
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.REDUCED_REDUNDANCY
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD_IA
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`authenticated-read`
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`aws-exec-read`
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`bucket-owner-full-control`
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`bucket-owner-read`
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`private`
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`public-read-write`
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.`public-read`
import typingsSlinky.awsSdkClientS3Node.typesEncryptionMod.Encryption
import typingsSlinky.awsSdkClientS3Node.typesGrantMod.Grant
import typingsSlinky.awsSdkClientS3Node.typesMetadataEntryMod.MetadataEntry
import typingsSlinky.awsSdkClientS3Node.typesTaggingMod.Tagging
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Location extends js.Object {
  /**
    * <p>A list of grants that control access to the staged results.</p>
    */
  var AccessControlList: js.UndefOr[js.Array[Grant] | js.Iterable[Grant]] = js.native
  /**
    * <p>The name of the bucket where the restore results will be placed.</p>
    */
  var BucketName: String = js.native
  /**
    * <p>The canned ACL to apply to the restore results.</p>
    */
  var CannedACL: js.UndefOr[
    `private` | `public-read` | `public-read-write` | `authenticated-read` | `aws-exec-read` | `bucket-owner-read` | `bucket-owner-full-control` | String
  ] = js.native
  /**
    * <p>Describes the server-side encryption that will be applied to the restore results.</p>
    */
  var Encryption: js.UndefOr[typingsSlinky.awsSdkClientS3Node.typesEncryptionMod.Encryption] = js.native
  /**
    * <p>The prefix that is prepended to the restore results for this request.</p>
    */
  var Prefix: String = js.native
  /**
    * <p>The class of storage used to store the restore results.</p>
    */
  var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String] = js.native
  /**
    * <p>The tag-set that is applied to the restore results.</p>
    */
  var Tagging: js.UndefOr[typingsSlinky.awsSdkClientS3Node.typesTaggingMod.Tagging] = js.native
  /**
    * <p>A list of metadata to store with the restore results in S3.</p>
    */
  var UserMetadata: js.UndefOr[js.Array[MetadataEntry] | js.Iterable[MetadataEntry]] = js.native
}

object S3Location {
  @scala.inline
  def apply(BucketName: String, Prefix: String): S3Location = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Location]
  }
  @scala.inline
  implicit class S3LocationOps[Self <: S3Location] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessControlListIterable(value: js.Iterable[Grant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessControlList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessControlList(value: js.Array[Grant] | js.Iterable[Grant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessControlList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessControlList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessControlList")(js.undefined)
        ret
    }
    @scala.inline
    def withCannedACL(
      value: `private` | `public-read` | `public-read-write` | `authenticated-read` | `aws-exec-read` | `bucket-owner-read` | `bucket-owner-full-control` | String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CannedACL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCannedACL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CannedACL")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryption(value: Encryption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encryption")(js.undefined)
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
    @scala.inline
    def withTagging(value: Tagging): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tagging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tagging")(js.undefined)
        ret
    }
    @scala.inline
    def withUserMetadataIterable(value: js.Iterable[MetadataEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserMetadata(value: js.Array[MetadataEntry] | js.Iterable[MetadataEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserMetadata")(js.undefined)
        ret
    }
  }
  
}

