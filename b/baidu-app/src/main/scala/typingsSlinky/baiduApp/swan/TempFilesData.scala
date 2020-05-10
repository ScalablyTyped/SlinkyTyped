package typingsSlinky.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TempFilesData extends js.Object {
  /** 文件的临时路径 */
  var tempFilePaths: String = js.native
  /**
  		 * 图片的本地文件列表，每一项是一个 File 对象
  		 * @version 1.2.0
  		 */
  var tempFiles: js.Array[TempFile] = js.native
}

object TempFilesData {
  @scala.inline
  def apply(tempFilePaths: String, tempFiles: js.Array[TempFile]): TempFilesData = {
    val __obj = js.Dynamic.literal(tempFilePaths = tempFilePaths.asInstanceOf[js.Any], tempFiles = tempFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempFilesData]
  }
  @scala.inline
  implicit class TempFilesDataOps[Self <: TempFilesData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTempFilePaths(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempFilePaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTempFiles(value: js.Array[TempFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempFiles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

