package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsLambdaFunctionCode extends js.Object {
  /**
    * An Amazon S3 bucket in the same AWS Region as your function. The bucket can be in a different AWS account.
    */
  var S3Bucket: js.UndefOr[NonEmptyString] = js.native
  /**
    * The Amazon S3 key of the deployment package.
    */
  var S3Key: js.UndefOr[NonEmptyString] = js.native
  /**
    * For versioned objects, the version of the deployment package object to use.
    */
  var S3ObjectVersion: js.UndefOr[NonEmptyString] = js.native
  /**
    * The base64-encoded contents of the deployment package. AWS SDK and AWS CLI clients handle the encoding for you.
    */
  var ZipFile: js.UndefOr[NonEmptyString] = js.native
}

object AwsLambdaFunctionCode {
  @scala.inline
  def apply(): AwsLambdaFunctionCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsLambdaFunctionCode]
  }
  @scala.inline
  implicit class AwsLambdaFunctionCodeOps[Self <: AwsLambdaFunctionCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3Bucket(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Bucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Bucket")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Key(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Key")(js.undefined)
        ret
    }
    @scala.inline
    def withS3ObjectVersion(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3ObjectVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3ObjectVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3ObjectVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withZipFile(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZipFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZipFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZipFile")(js.undefined)
        ret
    }
  }
  
}

