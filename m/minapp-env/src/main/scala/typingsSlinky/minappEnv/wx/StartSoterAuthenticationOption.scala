package typingsSlinky.minappEnv.wx

import typingsSlinky.minappEnv.Array
import typingsSlinky.minappEnv.minappEnvStrings.facial
import typingsSlinky.minappEnv.minappEnvStrings.fingerPrint
import typingsSlinky.minappEnv.minappEnvStrings.speech
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSoterAuthenticationOption extends js.Object {
  /** 验证描述，即识别过程中显示在界面上的对话框提示内容 */
  var authContent: js.UndefOr[String] = js.native
  /** 挑战因子。挑战因子为调用者为此次生物鉴权准备的用于签名的字符串关键识别信息，将作为 `resultJSON` 的一部分，供调用者识别本次请求。例如：如果场景为请求用户对某订单进行授权确认，则可以将订单号填入此参数。 */
  var challenge: String = js.native
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[StartSoterAuthenticationCompleteCallback] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[StartSoterAuthenticationFailCallback] = js.native
  /** 请求使用的可接受的生物认证方式
    *
    * 可选值：
    * - 'fingerPrint': 指纹识别;
    * - 'facial': 人脸识别（暂未支持）;
    * - 'speech': 声纹识别（暂未支持）; */
  var requestAuthModes: Array[fingerPrint | facial | speech] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[StartSoterAuthenticationSuccessCallback] = js.native
}

object StartSoterAuthenticationOption {
  @scala.inline
  def apply(challenge: String, requestAuthModes: Array[fingerPrint | facial | speech]): StartSoterAuthenticationOption = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], requestAuthModes = requestAuthModes.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSoterAuthenticationOption]
  }
  @scala.inline
  implicit class StartSoterAuthenticationOptionOps[Self <: StartSoterAuthenticationOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChallenge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challenge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestAuthModes(value: Array[fingerPrint | facial | speech]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestAuthModes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authContent")(js.undefined)
        ret
    }
    @scala.inline
    def withComplete(value: /* res */ GeneralCallbackResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withFail(value: /* res */ GeneralCallbackResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* result */ StartSoterAuthenticationSuccessCallbackResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

