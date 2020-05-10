package typingsSlinky.reactNativeFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadFileItem extends js.Object {
  // Name of the file, if not defined then filename is used
  var filename: String = js.native
  // Name of file
  var filepath: String = js.native
  // Path to file
  var filetype: String = js.native
  var name: String = js.native
}

object UploadFileItem {
  @scala.inline
  def apply(filename: String, filepath: String, filetype: String, name: String): UploadFileItem = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], filepath = filepath.asInstanceOf[js.Any], filetype = filetype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileItem]
  }
  @scala.inline
  implicit class UploadFileItemOps[Self <: UploadFileItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilepath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filepath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFiletype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filetype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

