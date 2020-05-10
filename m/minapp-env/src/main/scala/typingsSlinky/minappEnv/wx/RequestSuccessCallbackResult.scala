package typingsSlinky.minappEnv.wx

import typingsSlinky.minappEnv.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestSuccessCallbackResult extends js.Object {
  /** 开发者服务器返回的数据 */
  var data: String | js.Object | ArrayBuffer = js.native
  /** 开发者服务器返回的 HTTP Response Header
    *
    * 最低基础库： `1.2.0` */
  var header: js.Object = js.native
  /** 开发者服务器返回的 HTTP 状态码 */
  var statusCode: Double = js.native
}

object RequestSuccessCallbackResult {
  @scala.inline
  def apply(data: String | js.Object | ArrayBuffer, header: js.Object, statusCode: Double): RequestSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestSuccessCallbackResult]
  }
  @scala.inline
  implicit class RequestSuccessCallbackResultOps[Self <: RequestSuccessCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String | js.Object | ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

