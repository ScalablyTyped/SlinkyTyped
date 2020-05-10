package typingsSlinky.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  /**
    * A blob of base64-encoded document bytes. The maximum size of a document that's provided in a blob of bytes is 5 MB. The document bytes must be in PNG or JPEG format. If you're using an AWS SDK to call Amazon Textract, you might not need to base64-encode image bytes passed using the Bytes field. 
    */
  var Bytes: js.UndefOr[ImageBlob] = js.native
  /**
    * Identifies an S3 object as the document source. The maximum size of a document that's stored in an S3 bucket is 5 MB.
    */
  var S3Object: js.UndefOr[typingsSlinky.awsSdk.textractMod.S3Object] = js.native
}

object Document {
  @scala.inline
  def apply(): Document = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Document]
  }
  @scala.inline
  implicit class DocumentOps[Self <: Document] (val x: Self) extends AnyVal {
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

