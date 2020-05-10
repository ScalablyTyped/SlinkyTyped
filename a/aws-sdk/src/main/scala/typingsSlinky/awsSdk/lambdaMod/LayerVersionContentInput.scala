package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerVersionContentInput extends js.Object {
  /**
    * The Amazon S3 bucket of the layer archive.
    */
  var S3Bucket: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.S3Bucket] = js.native
  /**
    * The Amazon S3 key of the layer archive.
    */
  var S3Key: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.S3Key] = js.native
  /**
    * For versioned objects, the version of the layer archive object to use.
    */
  var S3ObjectVersion: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.S3ObjectVersion] = js.native
  /**
    * The base64-encoded contents of the layer archive. AWS SDK and AWS CLI clients handle the encoding for you.
    */
  var ZipFile: js.UndefOr[_Blob] = js.native
}

object LayerVersionContentInput {
  @scala.inline
  def apply(): LayerVersionContentInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerVersionContentInput]
  }
  @scala.inline
  implicit class LayerVersionContentInputOps[Self <: LayerVersionContentInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

