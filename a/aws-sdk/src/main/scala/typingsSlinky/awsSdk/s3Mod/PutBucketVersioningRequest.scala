package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketVersioningRequest extends js.Object {
  /**
    * The bucket name.
    */
  var Bucket: BucketName = js.native
  /**
    * &gt;The base64-encoded 128-bit MD5 digest of the data. You must use this header as a message integrity check to verify that the request body was not corrupted in transit. For more information, see RFC 1864.
    */
  var ContentMD5: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ContentMD5] = js.native
  /**
    * The concatenation of the authentication device's serial number, a space, and the value that is displayed on your authentication device.
    */
  var MFA: js.UndefOr[typingsSlinky.awsSdk.s3Mod.MFA] = js.native
  /**
    * Container for setting the versioning state.
    */
  var VersioningConfiguration: typingsSlinky.awsSdk.s3Mod.VersioningConfiguration = js.native
}

object PutBucketVersioningRequest {
  @scala.inline
  def apply(Bucket: BucketName, VersioningConfiguration: VersioningConfiguration): PutBucketVersioningRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], VersioningConfiguration = VersioningConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketVersioningRequest]
  }
  @scala.inline
  implicit class PutBucketVersioningRequestOps[Self <: PutBucketVersioningRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: BucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersioningConfiguration(value: VersioningConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersioningConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentMD5(value: ContentMD5): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentMD5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentMD5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentMD5")(js.undefined)
        ret
    }
    @scala.inline
    def withMFA(value: MFA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MFA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMFA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MFA")(js.undefined)
        ret
    }
  }
  
}

