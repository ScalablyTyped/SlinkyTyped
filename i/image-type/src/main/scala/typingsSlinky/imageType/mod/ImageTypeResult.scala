package typingsSlinky.imageType.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageTypeResult extends js.Object {
  /**
  		One of the supported [file types](https://github.com/sindresorhus/image-type#supported-file-types).
  		*/
  var ext: ImageType = js.native
  /**
  		The detected [MIME type](https://en.wikipedia.org/wiki/Internet_media_type).
  		*/
  var mime: String = js.native
}

object ImageTypeResult {
  @scala.inline
  def apply(ext: ImageType, mime: String): ImageTypeResult = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageTypeResult]
  }
  @scala.inline
  implicit class ImageTypeResultOps[Self <: ImageTypeResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExt(value: ImageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

