package typingsSlinky.apolloServerCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileUploadOptions extends js.Object {
  var maxFieldSize: js.UndefOr[Double] = js.native
  var maxFileSize: js.UndefOr[Double] = js.native
  var maxFiles: js.UndefOr[Double] = js.native
}

object FileUploadOptions {
  @scala.inline
  def apply(): FileUploadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileUploadOptions]
  }
  @scala.inline
  implicit class FileUploadOptionsOps[Self <: FileUploadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxFieldSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFieldSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFieldSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFieldSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFileSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFiles(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFiles")(js.undefined)
        ret
    }
  }
  
}

