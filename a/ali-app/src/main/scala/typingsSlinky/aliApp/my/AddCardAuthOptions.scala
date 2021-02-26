package typingsSlinky.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddCardAuthOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  var success_AddCardAuthOptions: js.UndefOr[js.Function1[/* res */ AddCardAuthResult, Unit]] = js.native
  
  /**
    * 开卡授权的页面地址，从alipay.marketing.card.activateurl.apply接口获取
    */
  var url: String = js.native
}
object AddCardAuthOptions {
  
  @scala.inline
  def apply(url: String): AddCardAuthOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCardAuthOptions]
  }
  
  @scala.inline
  implicit class AddCardAuthOptionsMutableBuilder[Self <: AddCardAuthOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: /* res */ AddCardAuthResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
