package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraContextStartRecordOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[CameraContextStartRecordCompleteCallback] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[CameraContextStartRecordFailCallback] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[CameraContextStartRecordSuccessCallback] = js.native
  /** 超过30s或页面 `onHide` 时会结束录像 */
  var timeoutCallback: js.UndefOr[StartRecordTimeoutCallback] = js.native
}

object CameraContextStartRecordOption {
  @scala.inline
  def apply(): CameraContextStartRecordOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraContextStartRecordOption]
  }
  @scala.inline
  implicit class CameraContextStartRecordOptionOps[Self <: CameraContextStartRecordOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = {
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
    @scala.inline
    def withTimeoutCallback(value: /* result */ StartRecordTimeoutCallbackResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTimeoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutCallback")(js.undefined)
        ret
    }
  }
  
}

