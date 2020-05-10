package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveFileFailCallbackResult extends js.Object {
  /** 错误信息
    *
    * 可选值：
    * - 'fail tempFilePath file not exist': 指定的 tempFilePath 找不到文件;
    * - 'fail permission denied, open "${filePath}"': 指定的 filePath 路径没有写权限;
    * - 'fail no such file or directory "${dirPath}"': 上级目录不存在; */
  var errMsg: String = js.native
}

object SaveFileFailCallbackResult {
  @scala.inline
  def apply(errMsg: String): SaveFileFailCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveFileFailCallbackResult]
  }
  @scala.inline
  implicit class SaveFileFailCallbackResultOps[Self <: SaveFileFailCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errMsg")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

