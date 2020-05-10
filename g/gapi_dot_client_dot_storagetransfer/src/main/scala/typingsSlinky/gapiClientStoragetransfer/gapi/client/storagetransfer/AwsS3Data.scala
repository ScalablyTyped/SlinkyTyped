package typingsSlinky.gapiClientStoragetransfer.gapi.client.storagetransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsS3Data extends js.Object {
  /**
    * AWS access key used to sign the API requests to the AWS S3 bucket.
    * Permissions on the bucket must be granted to the access ID of the
    * AWS access key.
    * Required.
    */
  var awsAccessKey: js.UndefOr[AwsAccessKey] = js.native
  /**
    * S3 Bucket name (see
    * [Creating a bucket](http://docs.aws.amazon.com/AmazonS3/latest/dev/create-bucket-get-location-example.html)).
    * Required.
    */
  var bucketName: js.UndefOr[String] = js.native
}

object AwsS3Data {
  @scala.inline
  def apply(): AwsS3Data = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3Data]
  }
  @scala.inline
  implicit class AwsS3DataOps[Self <: AwsS3Data] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsAccessKey(value: AwsAccessKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsAccessKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsAccessKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsAccessKey")(js.undefined)
        ret
    }
    @scala.inline
    def withBucketName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketName")(js.undefined)
        ret
    }
  }
  
}

