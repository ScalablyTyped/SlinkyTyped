package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileUploadedEventUIParam extends js.Object {
  /**
  	 * Gets the unique identifier of the file.
  	 */
  var fileId: js.UndefOr[Double] = js.native
  /**
  	 * Gets reference to the fileInfo object - containing information for  fileName, fileSize, serverMessage(if returned from server side), etc.
  	 */
  var fileInfo: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets the name of the uploaded file.
  	 */
  var filePath: js.UndefOr[String] = js.native
  /**
  	 * Gets the igUpload widget object.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets the file size of the uploaded file.
  	 */
  var totalSize: js.UndefOr[Double] = js.native
}

object FileUploadedEventUIParam {
  @scala.inline
  def apply(): FileUploadedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileUploadedEventUIParam]
  }
  @scala.inline
  implicit class FileUploadedEventUIParamOps[Self <: FileUploadedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileId")(js.undefined)
        ret
    }
    @scala.inline
    def withFileInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(js.undefined)
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
    @scala.inline
    def withTotalSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSize")(js.undefined)
        ret
    }
  }
  
}

