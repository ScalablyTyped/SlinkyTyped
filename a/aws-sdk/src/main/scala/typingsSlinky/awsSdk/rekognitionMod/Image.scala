package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Image extends js.Object {
  /**
    * Blob of image bytes up to 5 MBs.
    */
  var Bytes: js.UndefOr[ImageBlob] = js.native
  /**
    * Identifies an S3 object as the image source.
    */
  var S3Object: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.S3Object] = js.native
}

object Image {
  @scala.inline
  def apply(): Image = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Image]
  }
  @scala.inline
  implicit class ImageOps[Self <: Image] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytesUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBytes(value: ImageBlob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bytes")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Object(value: S3Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Object: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Object")(js.undefined)
        ret
    }
  }
  
}

