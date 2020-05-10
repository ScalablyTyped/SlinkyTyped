package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Storage extends js.Object {
  /**
    * The access key ID of the owner of the bucket. Before you specify a value for your access key ID, review and follow the guidance in Best Practices for Managing AWS Access Keys.
    */
  var AWSAccessKeyId: js.UndefOr[String] = js.native
  /**
    * The bucket in which to store the AMI. You can specify a bucket that you already own or a new bucket that Amazon EC2 creates on your behalf. If you specify a bucket that belongs to someone else, Amazon EC2 returns an error.
    */
  var Bucket: js.UndefOr[String] = js.native
  /**
    * The beginning of the file name of the AMI.
    */
  var Prefix: js.UndefOr[String] = js.native
  /**
    * An Amazon S3 upload policy that gives Amazon EC2 permission to upload items into Amazon S3 on your behalf.
    */
  var UploadPolicy: js.UndefOr[_Blob] = js.native
  /**
    * The signature of the JSON document.
    */
  var UploadPolicySignature: js.UndefOr[String] = js.native
}

object S3Storage {
  @scala.inline
  def apply(): S3Storage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Storage]
  }
  @scala.inline
  implicit class S3StorageOps[Self <: S3Storage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAWSAccessKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AWSAccessKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAWSAccessKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AWSAccessKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(js.undefined)
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
    def withUploadPolicyUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploadPolicy(value: _Blob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadPolicySignature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadPolicySignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadPolicySignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadPolicySignature")(js.undefined)
        ret
    }
  }
  
}

