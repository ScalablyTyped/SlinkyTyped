package typingsSlinky.awsSdkClientS3Browser.typesS3LocationMod

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ONEZONE_IA
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.REDUCED_REDUNDANCY
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.STANDARD
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.STANDARD_IA
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`authenticated-read`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`aws-exec-read`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`bucket-owner-full-control`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`bucket-owner-read`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`private`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`public-read-write`
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.`public-read`
import typingsSlinky.awsSdkClientS3Browser.typesEncryptionMod.Encryption
import typingsSlinky.awsSdkClientS3Browser.typesGrantMod.Grant
import typingsSlinky.awsSdkClientS3Browser.typesMetadataEntryMod.MetadataEntry
import typingsSlinky.awsSdkClientS3Browser.typesTaggingMod.Tagging
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Location extends js.Object {
  /**
    * <p>A list of grants that control access to the staged results.</p>
    */
  var AccessControlList: js.UndefOr[js.Array[Grant] | js.Iterable[Grant]] = js.undefined
  /**
    * <p>The name of the bucket where the restore results will be placed.</p>
    */
  var BucketName: String
  /**
    * <p>The canned ACL to apply to the restore results.</p>
    */
  var CannedACL: js.UndefOr[
    `private` | `public-read` | `public-read-write` | `authenticated-read` | `aws-exec-read` | `bucket-owner-read` | `bucket-owner-full-control` | String
  ] = js.undefined
  /**
    * <p>Describes the server-side encryption that will be applied to the restore results.</p>
    */
  var Encryption: js.UndefOr[typingsSlinky.awsSdkClientS3Browser.typesEncryptionMod.Encryption] = js.undefined
  /**
    * <p>The prefix that is prepended to the restore results for this request.</p>
    */
  var Prefix: String
  /**
    * <p>The class of storage used to store the restore results.</p>
    */
  var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String] = js.undefined
  /**
    * <p>The tag-set that is applied to the restore results.</p>
    */
  var Tagging: js.UndefOr[typingsSlinky.awsSdkClientS3Browser.typesTaggingMod.Tagging] = js.undefined
  /**
    * <p>A list of metadata to store with the restore results in S3.</p>
    */
  var UserMetadata: js.UndefOr[js.Array[MetadataEntry] | js.Iterable[MetadataEntry]] = js.undefined
}

object S3Location {
  @scala.inline
  def apply(
    BucketName: String,
    Prefix: String,
    AccessControlList: js.Array[Grant] | js.Iterable[Grant] = null,
    CannedACL: `private` | `public-read` | `public-read-write` | `authenticated-read` | `aws-exec-read` | `bucket-owner-read` | `bucket-owner-full-control` | String = null,
    Encryption: Encryption = null,
    StorageClass: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String = null,
    Tagging: Tagging = null,
    UserMetadata: js.Array[MetadataEntry] | js.Iterable[MetadataEntry] = null
  ): S3Location = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any])
    if (AccessControlList != null) __obj.updateDynamic("AccessControlList")(AccessControlList.asInstanceOf[js.Any])
    if (CannedACL != null) __obj.updateDynamic("CannedACL")(CannedACL.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (Tagging != null) __obj.updateDynamic("Tagging")(Tagging.asInstanceOf[js.Any])
    if (UserMetadata != null) __obj.updateDynamic("UserMetadata")(UserMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Location]
  }
}

