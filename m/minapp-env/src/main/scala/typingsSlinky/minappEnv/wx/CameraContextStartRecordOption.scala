package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setTimeoutCallback(value: /* result */ StartRecordTimeoutCallbackResult => Unit): Self = this.set("timeoutCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTimeoutCallback: Self = this.set("timeoutCallback", js.undefined)
  }
}
