package typingsSlinky.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CameraContextStartRecordOption extends StObject {
  
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
  implicit class CameraContextStartRecordOptionMutableBuilder[Self <: CameraContextStartRecordOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTimeoutCallback(value: /* result */ StartRecordTimeoutCallbackResult => Unit): Self = StObject.set(x, "timeoutCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeoutCallbackUndefined: Self = StObject.set(x, "timeoutCallback", js.undefined)
  }
}
