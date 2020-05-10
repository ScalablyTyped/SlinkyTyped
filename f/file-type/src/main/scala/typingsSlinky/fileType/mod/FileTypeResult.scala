package typingsSlinky.fileType.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileTypeResult extends js.Object {
  /**
  		One of the supported [file types](https://github.com/sindresorhus/file-type#supported-file-types).
  		*/
  var ext: FileType = js.native
  /**
  		The detected [MIME type](https://en.wikipedia.org/wiki/Internet_media_type).
  		*/
  var mime: MimeType = js.native
}

object FileTypeResult {
  @scala.inline
  def apply(ext: FileType, mime: MimeType): FileTypeResult = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileTypeResult]
  }
  @scala.inline
  implicit class FileTypeResultOps[Self <: FileTypeResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExt(value: FileType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMime(value: MimeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

