package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartRecordTimeoutCallbackResult extends js.Object {
  /** 封面图片文件的临时路径 */
  var tempThumbPath: String = js.native
  /** 视频的文件的临时路径 */
  var tempVideoPath: String = js.native
}

object StartRecordTimeoutCallbackResult {
  @scala.inline
  def apply(tempThumbPath: String, tempVideoPath: String): StartRecordTimeoutCallbackResult = {
    val __obj = js.Dynamic.literal(tempThumbPath = tempThumbPath.asInstanceOf[js.Any], tempVideoPath = tempVideoPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartRecordTimeoutCallbackResult]
  }
  @scala.inline
  implicit class StartRecordTimeoutCallbackResultOps[Self <: StartRecordTimeoutCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTempThumbPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempThumbPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTempVideoPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempVideoPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

