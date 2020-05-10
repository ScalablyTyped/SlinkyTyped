package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasToTempFilePathSuccessCallbackResult extends js.Object {
  /** 生成文件的临时路径 */
  var tempFilePath: String = js.native
}

object CanvasToTempFilePathSuccessCallbackResult {
  @scala.inline
  def apply(tempFilePath: String): CanvasToTempFilePathSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(tempFilePath = tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasToTempFilePathSuccessCallbackResult]
  }
  @scala.inline
  implicit class CanvasToTempFilePathSuccessCallbackResultOps[Self <: CanvasToTempFilePathSuccessCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTempFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempFilePath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

