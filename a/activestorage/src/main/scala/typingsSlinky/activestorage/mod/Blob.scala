package typingsSlinky.activestorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Blob extends js.Object {
  var byte_size: Double = js.native
  var checksum: String = js.native
  var content_type: String = js.native
  var filename: String = js.native
  var signed_id: String = js.native
}

object Blob {
  @scala.inline
  def apply(byte_size: Double, checksum: String, content_type: String, filename: String, signed_id: String): Blob = {
    val __obj = js.Dynamic.literal(byte_size = byte_size.asInstanceOf[js.Any], checksum = checksum.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], signed_id = signed_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blob]
  }
  @scala.inline
  implicit class BlobOps[Self <: Blob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withByte_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byte_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChecksum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checksum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigned_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signed_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

