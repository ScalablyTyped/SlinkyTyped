package typingsSlinky.awsSdkClientLambdaNode.typesFunctionCodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionCode extends js.Object {
  /**
    * <p>An Amazon S3 bucket in the same region as your function.</p>
    */
  var S3Bucket: js.UndefOr[String] = js.native
  /**
    * <p>The Amazon S3 key of the deployment package.</p>
    */
  var S3Key: js.UndefOr[String] = js.native
  /**
    * <p>For versioned objects, the version of the deployment package object to use.</p>
    */
  var S3ObjectVersion: js.UndefOr[String] = js.native
  /**
    * <p>The base64-encoded contents of your zip file containing your deployment package. AWS SDK and AWS CLI clients handle the encoding for you.</p>
    */
  var ZipFile: js.UndefOr[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String] = js.native
}

object FunctionCode {
  @scala.inline
  def apply(): FunctionCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionCode]
  }
  @scala.inline
  implicit class FunctionCodeOps[Self <: FunctionCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3Bucket(value: String): Self = {
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
    def withS3Key(value: String): Self = {
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
    def withS3ObjectVersion(value: String): Self = {
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
    def withZipFileArrayBufferView(value: js.typedarray.ArrayBufferView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZipFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZipFileArrayBuffer(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZipFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZipFile(value: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): Self = {
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

