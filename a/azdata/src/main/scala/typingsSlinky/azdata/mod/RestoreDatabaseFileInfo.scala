package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreDatabaseFileInfo extends js.Object {
  var fileType: String = js.native
  var logicalFileName: String = js.native
  var originalFileName: String = js.native
  var restoreAsFileName: String = js.native
}

object RestoreDatabaseFileInfo {
  @scala.inline
  def apply(fileType: String, logicalFileName: String, originalFileName: String, restoreAsFileName: String): RestoreDatabaseFileInfo = {
    val __obj = js.Dynamic.literal(fileType = fileType.asInstanceOf[js.Any], logicalFileName = logicalFileName.asInstanceOf[js.Any], originalFileName = originalFileName.asInstanceOf[js.Any], restoreAsFileName = restoreAsFileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreDatabaseFileInfo]
  }
  @scala.inline
  implicit class RestoreDatabaseFileInfoOps[Self <: RestoreDatabaseFileInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogicalFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logicalFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestoreAsFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreAsFileName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

