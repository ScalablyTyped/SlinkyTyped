package typingsSlinky.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region 导航栏 https://docs.alipay.com/mini/api/ui-navigate
@js.native
trait NavigateToOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** 需要跳转的应用内页面的路径 */
  var url: String = js.native
}
object NavigateToOptions {
  
  @scala.inline
  def apply(url: String): NavigateToOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateToOptions]
  }
  
  @scala.inline
  implicit class NavigateToOptionsMutableBuilder[Self <: NavigateToOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
