package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSoterAuthenticationSuccessCallbackResult extends js.Object {
  /** 生物认证方式 */
  var authMode: String = js.native
  /** 错误码 */
  var errCode: Double = js.native
  /** 错误信息 */
  var errMsg: String = js.native
  /** 在设备安全区域（TEE）内获得的本机安全信息（如TEE名称版本号等以及防重放参数）以及本次认证信息（仅Android支持，本次认证的指纹ID）。具体说明见下文 */
  var resultJSON: String = js.native
  /** 用SOTER安全密钥对 `resultJSON` 的签名(SHA256 with RSA/PSS, saltlen=20) */
  var resultJSONSignature: String = js.native
}

object StartSoterAuthenticationSuccessCallbackResult {
  @scala.inline
  def apply(authMode: String, errCode: Double, errMsg: String, resultJSON: String, resultJSONSignature: String): StartSoterAuthenticationSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], resultJSON = resultJSON.asInstanceOf[js.Any], resultJSONSignature = resultJSONSignature.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSoterAuthenticationSuccessCallbackResult]
  }
  @scala.inline
  implicit class StartSoterAuthenticationSuccessCallbackResultOps[Self <: StartSoterAuthenticationSuccessCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultJSON(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultJSON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultJSONSignature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultJSONSignature")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

