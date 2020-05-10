package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFunctionCodeRequest extends js.Object {
  /**
    * Set to true to validate the request parameters and access permissions without modifying the function code.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The name of the Lambda function.  Name formats     Function name - my-function.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typingsSlinky.awsSdk.lambdaMod.FunctionName = js.native
  /**
    * Set to true to publish a new version of the function after updating the code. This has the same effect as calling PublishVersion separately.
    */
  var Publish: js.UndefOr[Boolean] = js.native
  /**
    * Only update the function if the revision ID matches the ID that's specified. Use this option to avoid modifying a function that has changed since you last read it.
    */
  var RevisionId: js.UndefOr[String] = js.native
  /**
    * An Amazon S3 bucket in the same AWS Region as your function. The bucket can be in a different AWS account.
    */
  var S3Bucket: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.S3Bucket] = js.native
  /**
    * The Amazon S3 key of the deployment package.
    */
  var S3Key: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.S3Key] = js.native
  /**
    * For versioned objects, the version of the deployment package object to use.
    */
  var S3ObjectVersion: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.S3ObjectVersion] = js.native
  /**
    * The base64-encoded contents of the deployment package. AWS SDK and AWS CLI clients handle the encoding for you.
    */
  var ZipFile: js.UndefOr[_Blob] = js.native
}

object UpdateFunctionCodeRequest {
  @scala.inline
  def apply(FunctionName: FunctionName): UpdateFunctionCodeRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFunctionCodeRequest]
  }
  @scala.inline
  implicit class UpdateFunctionCodeRequestOps[Self <: UpdateFunctionCodeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunctionName(value: FunctionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDryRun(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
    @scala.inline
    def withPublish(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Publish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublish: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Publish")(js.undefined)
        ret
    }
    @scala.inline
    def withRevisionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RevisionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RevisionId")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Bucket(value: S3Bucket): Self = {
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
    def withS3Key(value: S3Key): Self = {
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
    def withS3ObjectVersion(value: S3ObjectVersion): Self = {
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
    def withZipFileUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZipFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZipFile(value: _Blob): Self = {
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

