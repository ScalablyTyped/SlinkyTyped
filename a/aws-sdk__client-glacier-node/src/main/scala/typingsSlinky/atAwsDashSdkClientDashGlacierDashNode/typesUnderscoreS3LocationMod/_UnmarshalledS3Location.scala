package typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreS3LocationMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.REDUCED_REDUNDANCY
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.STANDARD
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.STANDARD_IA
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.`authenticated-read`
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.`aws-exec-read`
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.`bucket-owner-full-control`
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.`bucket-owner-read`
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.`private`
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.`public-read-write`
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.`public-read`
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreEncryptionMod._UnmarshalledEncryption
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreGrantMod._UnmarshalledGrant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledS3Location extends _S3Location {
  /**
    * <p>A list of grants that control access to the staged results.</p>
    */
  @JSName("AccessControlList")
  var AccessControlList__UnmarshalledS3Location: js.UndefOr[js.Array[_UnmarshalledGrant]] = js.undefined
  /**
    * <p>Contains information about the encryption used to store the job results in Amazon S3.</p>
    */
  @JSName("Encryption")
  var Encryption__UnmarshalledS3Location: js.UndefOr[_UnmarshalledEncryption] = js.undefined
  /**
    * <p>The tag-set that is applied to the job results.</p>
    */
  @JSName("Tagging")
  var Tagging__UnmarshalledS3Location: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * <p>A map of metadata to store with the job results in Amazon S3.</p>
    */
  @JSName("UserMetadata")
  var UserMetadata__UnmarshalledS3Location: js.UndefOr[StringDictionary[String]] = js.undefined
}

object _UnmarshalledS3Location {
  @scala.inline
  def apply(
    AccessControlList: js.Array[_UnmarshalledGrant] = null,
    BucketName: String = null,
    CannedACL: `private` | `public-read` | `public-read-write` | `aws-exec-read` | `authenticated-read` | `bucket-owner-read` | `bucket-owner-full-control` | String = null,
    Encryption: _UnmarshalledEncryption = null,
    Prefix: String = null,
    StorageClass: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | String = null,
    Tagging: StringDictionary[String] = null,
    UserMetadata: StringDictionary[String] = null
  ): _UnmarshalledS3Location = {
    val __obj = js.Dynamic.literal()
    if (AccessControlList != null) __obj.updateDynamic("AccessControlList")(AccessControlList.asInstanceOf[js.Any])
    if (BucketName != null) __obj.updateDynamic("BucketName")(BucketName.asInstanceOf[js.Any])
    if (CannedACL != null) __obj.updateDynamic("CannedACL")(CannedACL.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (Tagging != null) __obj.updateDynamic("Tagging")(Tagging.asInstanceOf[js.Any])
    if (UserMetadata != null) __obj.updateDynamic("UserMetadata")(UserMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledS3Location]
  }
}

