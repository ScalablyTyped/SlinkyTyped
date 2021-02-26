package typingsSlinky.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeekBackgroundAudioOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SeekBackgroundAudioCompleteCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SeekBackgroundAudioFailCallback] = js.native
  
  /** 音乐位置，单位：秒 */
  var position: Double = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SeekBackgroundAudioSuccessCallback] = js.native
}
object SeekBackgroundAudioOption {
  
  @scala.inline
  def apply(position: Double): SeekBackgroundAudioOption = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeekBackgroundAudioOption]
  }
  
  @scala.inline
  implicit class SeekBackgroundAudioOptionMutableBuilder[Self <: SeekBackgroundAudioOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
