package typingsSlinky.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageScrollToOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[PageScrollToCompleteCallback] = js.native
  
  /** 滚动动画的时长，单位 ms */
  var duration: js.UndefOr[Double] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[PageScrollToFailCallback] = js.native
  
  /** 滚动到页面的目标位置，单位 px */
  var scrollTop: Double = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[PageScrollToSuccessCallback] = js.native
}
object PageScrollToOption {
  
  @scala.inline
  def apply(scrollTop: Double): PageScrollToOption = {
    val __obj = js.Dynamic.literal(scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageScrollToOption]
  }
  
  @scala.inline
  implicit class PageScrollToOptionMutableBuilder[Self <: PageScrollToOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
