package typingsSlinky.minappEnv.wx

import typingsSlinky.minappEnv.minappEnvStrings.dark
import typingsSlinky.minappEnv.minappEnvStrings.light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetBackgroundTextStyleOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SetBackgroundTextStyleCompleteCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SetBackgroundTextStyleFailCallback] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SetBackgroundTextStyleSuccessCallback] = js.native
  
  /** 下拉背景字体、loading 图的样式。
    *
    * 可选值：
    * - 'dark': dark 样式;
    * - 'light': light 样式; */
  var textStyle: dark | light = js.native
}
object SetBackgroundTextStyleOption {
  
  @scala.inline
  def apply(textStyle: dark | light): SetBackgroundTextStyleOption = {
    val __obj = js.Dynamic.literal(textStyle = textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBackgroundTextStyleOption]
  }
  
  @scala.inline
  implicit class SetBackgroundTextStyleOptionMutableBuilder[Self <: SetBackgroundTextStyleOption] (val x: Self) extends AnyVal {
    
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
    def setTextStyle(value: dark | light): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
  }
}
