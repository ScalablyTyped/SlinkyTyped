package typingsSlinky.awsSdkClientGlacierNode.typesS3LocationMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.REDUCED_REDUNDANCY
import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.STANDARD
import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.STANDARD_IA
import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.`authenticated-read`
import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.`aws-exec-read`
import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.`bucket-owner-full-control`
import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.`bucket-owner-read`
import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.`private`
import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.`public-read-write`
import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.`public-read`
import typingsSlinky.awsSdkClientGlacierNode.typesEncryptionMod.Encryption
import typingsSlinky.awsSdkClientGlacierNode.typesGrantMod.Grant
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
    * <p>The name of the Amazon S3 bucket where the job results are stored.</p>
    */
  var BucketName: js.UndefOr[String] = js.native
  /**
    * <p>The canned access control list (ACL) to apply to the job results.</p>
    */
  var CannedACL: js.UndefOr[
    `private` | `public-read` | `public-read-write` | `aws-exec-read` | `authenticated-read` | `bucket-owner-read` | `bucket-owner-full-control` | String
  ] = js.native
  /**
    * <p>Contains information about the encryption used to store the job results in Amazon S3.</p>
    */
  var Encryption: js.UndefOr[typingsSlinky.awsSdkClientGlacierNode.typesEncryptionMod.Encryption] = js.native
  /**
    * <p>The prefix that is prepended to the results for this request.</p>
    */
  var Prefix: js.UndefOr[String] = js.native
  /**
    * <p>The storage class used to store the job results.</p>
    */
  var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | String] = js.native
  /**
    * <p>The tag-set that is applied to the job results.</p>
    */
  var Tagging: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.native
  /**
    * <p>A map of metadata to store with the job results in Amazon S3.</p>
    */
  var UserMetadata: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.native
}

object S3Location {
  @scala.inline
  def apply(): S3Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Location]
  }
  @scala.inline
  implicit class S3LocationOps[Self <: S3Location] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withBucketName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BucketName")(js.undefined)
        ret
    }
    @scala.inline
    def withCannedACL(
      value: `private` | `public-read` | `public-read-write` | `aws-exec-read` | `authenticated-read` | `bucket-owner-read` | `bucket-owner-full-control` | String
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
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageClass(value: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | String): Self = {
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
    def withTaggingIterable(value: js.Iterable[js.Tuple2[String, String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tagging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagging(value: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): Self = {
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
    def withUserMetadataIterable(value: js.Iterable[js.Tuple2[String, String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserMetadata(value: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): Self = {
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

