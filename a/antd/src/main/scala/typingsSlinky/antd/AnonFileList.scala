package typingsSlinky.antd

import typingsSlinky.antd.uploadInterfaceMod.UploadFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFileList extends js.Object {
  var fileList: js.Array[UploadFile[_]] = js.native
}

object AnonFileList {
  @scala.inline
  def apply(fileList: js.Array[UploadFile[_]]): AnonFileList = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFileList]
  }
  @scala.inline
  implicit class AnonFileListOps[Self <: AnonFileList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileList(value: js.Array[UploadFile[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

