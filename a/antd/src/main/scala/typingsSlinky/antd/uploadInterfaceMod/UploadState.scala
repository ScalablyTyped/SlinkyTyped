package typingsSlinky.antd.uploadInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadState extends js.Object {
  var dragState: String = js.native
  var fileList: js.Array[UploadFile[_]] = js.native
}

object UploadState {
  @scala.inline
  def apply(dragState: String, fileList: js.Array[UploadFile[_]]): UploadState = {
    val __obj = js.Dynamic.literal(dragState = dragState.asInstanceOf[js.Any], fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadState]
  }
  @scala.inline
  implicit class UploadStateOps[Self <: UploadState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDragState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileList(value: js.Array[UploadFile[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

