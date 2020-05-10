package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.AnonAppid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 会员开卡授权 https://docs.alipay.com/mini/api/add-card-auth
@js.native
trait AddCardAuthResult extends js.Object {
  		// false 表示领卡失败
  /**
  		 * 失败的错误码
  		 * 领卡失败 code 说明
  		 * 名称 | 类型 | 说明
  		 * -----|-----|-----
  		 * JSAPI_SERVICE_TERMINATED | String | 用户取消
  		 * JSAPI_PARAM_INVALID | String | url 为空或非法参数
  		 * JSAPI_SYSTEM_ERROR | String | 系统错误
  		 */
  var code: String = js.native
  	// 9000 表示成功
  var result: AnonAppid = js.native
  		// true 表示领卡成功
  var resultStatus: String = js.native
  var success: Boolean = js.native
}

object AddCardAuthResult {
  @scala.inline
  def apply(code: String, result: AnonAppid, resultStatus: String, success: Boolean): AddCardAuthResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], resultStatus = resultStatus.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCardAuthResult]
  }
  @scala.inline
  implicit class AddCardAuthResultOps[Self <: AddCardAuthResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: AnonAppid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

