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
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreEncryptionMod._Encryption
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreGrantMod._Grant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _S3Location extends js.Object {
  /**
    * <p>A list of grants that control access to the staged results.</p>
    */
  var AccessControlList: js.UndefOr[js.Array[_Grant] | js.Iterable[_Grant]] = js.undefined
  /**
    * <p>The name of the Amazon S3 bucket where the job results are stored.</p>
    */
  var BucketName: js.UndefOr[String] = js.undefined
  /**
    * <p>The canned access control list (ACL) to apply to the job results.</p>
    */
  var CannedACL: js.UndefOr[
    `private` | `public-read` | `public-read-write` | `aws-exec-read` | `authenticated-read` | `bucket-owner-read` | `bucket-owner-full-control` | String
  ] = js.undefined
  /**
    * <p>Contains information about the encryption used to store the job results in Amazon S3.</p>
    */
  var Encryption: js.UndefOr[_Encryption] = js.undefined
  /**
    * <p>The prefix that is prepended to the results for this request.</p>
    */
  var Prefix: js.UndefOr[String] = js.undefined
  /**
    * <p>The storage class used to store the job results.</p>
    */
  var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | String] = js.undefined
  /**
    * <p>The tag-set that is applied to the job results.</p>
    */
  var Tagging: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.undefined
  /**
    * <p>A map of metadata to store with the job results in Amazon S3.</p>
    */
  var UserMetadata: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.undefined
}

object _S3Location {
  @scala.inline
  def apply(
    AccessControlList: js.Array[_Grant] | js.Iterable[_Grant] = null,
    BucketName: String = null,
    CannedACL: `private` | `public-read` | `public-read-write` | `aws-exec-read` | `authenticated-read` | `bucket-owner-read` | `bucket-owner-full-control` | String = null,
    Encryption: _Encryption = null,
    Prefix: String = null,
    StorageClass: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | String = null,
    Tagging: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]]) = null,
    UserMetadata: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]]) = null
  ): _S3Location = {
    val __obj = js.Dynamic.literal()
    if (AccessControlList != null) __obj.updateDynamic("AccessControlList")(AccessControlList.asInstanceOf[js.Any])
    if (BucketName != null) __obj.updateDynamic("BucketName")(BucketName.asInstanceOf[js.Any])
    if (CannedACL != null) __obj.updateDynamic("CannedACL")(CannedACL.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (Tagging != null) __obj.updateDynamic("Tagging")(Tagging.asInstanceOf[js.Any])
    if (UserMetadata != null) __obj.updateDynamic("UserMetadata")(UserMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[_S3Location]
  }
}

