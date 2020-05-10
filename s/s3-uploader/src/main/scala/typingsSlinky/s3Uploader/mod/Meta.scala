package typingsSlinky.s3Uploader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Meta extends js.Object {
  var colorSpace: String = js.native
  var compression: String = js.native
  var fileSize: String = js.native
  var format: String = js.native
  var imageSize: typingsSlinky.s3Uploader.mod.imageSize = js.native
  var orientation: String = js.native
  var quallity: String = js.native
}

object Meta {
  @scala.inline
  def apply(
    colorSpace: String,
    compression: String,
    fileSize: String,
    format: String,
    imageSize: imageSize,
    orientation: String,
    quallity: String
  ): Meta = {
    val __obj = js.Dynamic.literal(colorSpace = colorSpace.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], imageSize = imageSize.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], quallity = quallity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
  @scala.inline
  implicit class MetaOps[Self <: Meta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorSpace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageSize(value: imageSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuallity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quallity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

