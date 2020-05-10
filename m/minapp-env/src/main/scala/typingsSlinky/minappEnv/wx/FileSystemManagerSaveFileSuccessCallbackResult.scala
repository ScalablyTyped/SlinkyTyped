package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemManagerSaveFileSuccessCallbackResult extends js.Object {
  /** 存储后的文件路径 */
  var savedFilePath: Double = js.native
}

object FileSystemManagerSaveFileSuccessCallbackResult {
  @scala.inline
  def apply(savedFilePath: Double): FileSystemManagerSaveFileSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(savedFilePath = savedFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemManagerSaveFileSuccessCallbackResult]
  }
  @scala.inline
  implicit class FileSystemManagerSaveFileSuccessCallbackResultOps[Self <: FileSystemManagerSaveFileSuccessCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSavedFilePath(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedFilePath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

