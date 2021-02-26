package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.aliAppStrings.exception
import typingsSlinky.aliApp.aliAppStrings.fail
import typingsSlinky.aliApp.aliAppStrings.none
import typingsSlinky.aliApp.aliAppStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToastOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 文字内容
    */
  var content: String = js.native
  
  /**
    * 显示时长，单位为 ms，默认 2000
    */
  var duration: js.UndefOr[Double] = js.native
  
  /** toast 类型，展示相应图标，默认 none，支持 success / fail / exception / none’。其中 exception 类型必须传文字信息 */
  var `type`: js.UndefOr[none | success | fail | exception | String] = js.native
}
object ToastOptions {
  
  @scala.inline
  def apply(content: String): ToastOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastOptions]
  }
  
  @scala.inline
  implicit class ToastOptionsMutableBuilder[Self <: ToastOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setType(value: none | success | fail | exception | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
