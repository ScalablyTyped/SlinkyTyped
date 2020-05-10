package typingsSlinky.amapJsApiGeolocation.AMap.Geolocation

import typingsSlinky.amapJsApiGeolocation.amapJsApiGeolocationNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorStatus extends js.Object {
  /**
    * 错误信息
    */
  var info: String = js.native
  /**
    * 造成定位失败结果的一些有用信息
    */
  var message: String = js.native
  /**
    * 状态码
    */
  var status: `0` = js.native
}

object ErrorStatus {
  @scala.inline
  def apply(info: String, message: String, status: `0`): ErrorStatus = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorStatus]
  }
  @scala.inline
  implicit class ErrorStatusOps[Self <: ErrorStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

