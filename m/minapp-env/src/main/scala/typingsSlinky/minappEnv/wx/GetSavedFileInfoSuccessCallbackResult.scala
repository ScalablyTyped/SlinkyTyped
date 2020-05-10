package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSavedFileInfoSuccessCallbackResult extends js.Object {
  /** 文件保存时的时间戳，从1970/01/01 08:00:00 到该时刻的秒数 */
  var createTime: Double = js.native
  /** 文件大小，单位 B */
  var size: Double = js.native
}

object GetSavedFileInfoSuccessCallbackResult {
  @scala.inline
  def apply(createTime: Double, size: Double): GetSavedFileInfoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavedFileInfoSuccessCallbackResult]
  }
  @scala.inline
  implicit class GetSavedFileInfoSuccessCallbackResultOps[Self <: GetSavedFileInfoSuccessCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

