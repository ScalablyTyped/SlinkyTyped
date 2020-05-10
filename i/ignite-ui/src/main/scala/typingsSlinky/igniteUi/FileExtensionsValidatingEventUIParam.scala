package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileExtensionsValidatingEventUIParam extends js.Object {
  /**
  	 * Gets the file extension.
  	 */
  var fileExtension: js.UndefOr[String] = js.native
  /**
  	 * Gets the full file name.
  	 */
  var fileName: js.UndefOr[String] = js.native
  /**
  	 * Gets the the igUpload widget object.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object FileExtensionsValidatingEventUIParam {
  @scala.inline
  def apply(): FileExtensionsValidatingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileExtensionsValidatingEventUIParam]
  }
  @scala.inline
  implicit class FileExtensionsValidatingEventUIParamOps[Self <: FileExtensionsValidatingEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExtension")(js.undefined)
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
  }
  
}

