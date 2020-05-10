package typingsSlinky.minappEnv.wx

import typingsSlinky.minappEnv.Array
import typingsSlinky.minappEnv.minappEnvStrings.facial
import typingsSlinky.minappEnv.minappEnvStrings.fingerPrint
import typingsSlinky.minappEnv.minappEnvStrings.speech
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckIsSoterEnrolledInDeviceOption extends js.Object {
  /** 认证方式
    *
    * 可选值：
    * - 'fingerPrint': 指纹识别;
    * - 'facial': 人脸识别（暂未支持）;
    * - 'speech': 声纹识别（暂未支持）; */
  var checkAuthMode: Array[fingerPrint | facial | speech] = js.native
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[CheckIsSoterEnrolledInDeviceCompleteCallback] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[CheckIsSoterEnrolledInDeviceFailCallback] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[CheckIsSoterEnrolledInDeviceSuccessCallback] = js.native
}

object CheckIsSoterEnrolledInDeviceOption {
  @scala.inline
  def apply(checkAuthMode: Array[fingerPrint | facial | speech]): CheckIsSoterEnrolledInDeviceOption = {
    val __obj = js.Dynamic.literal(checkAuthMode = checkAuthMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckIsSoterEnrolledInDeviceOption]
  }
  @scala.inline
  implicit class CheckIsSoterEnrolledInDeviceOptionOps[Self <: CheckIsSoterEnrolledInDeviceOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckAuthMode(value: Array[fingerPrint | facial | speech]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkAuthMode")(value.asInstanceOf[js.Any])
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
    def withSuccess(value: /* result */ CheckIsSoterEnrolledInDeviceSuccessCallbackResult => Unit): Self = {
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

