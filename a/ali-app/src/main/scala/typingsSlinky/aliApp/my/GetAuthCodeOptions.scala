package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.anon.AuthCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region 用户授权 https://docs.alipay.com/mini/api/openapi-authorize
@js.native
trait GetAuthCodeOptions
  extends BaseOptions[js.Any, js.Any] {
  
  var scopes: js.UndefOr[String | js.Array[String]] = js.native
  
  // 授权类型，默认 auth_base。支持 auth_base（静默授权）/ auth_user（主动授权） / auth_zhima（芝麻信用）
  @JSName("success")
  var success_GetAuthCodeOptions: js.UndefOr[js.Function1[/* res */ AuthCode, Unit]] = js.native
}
object GetAuthCodeOptions {
  
  @scala.inline
  def apply(): GetAuthCodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAuthCodeOptions]
  }
  
  @scala.inline
  implicit class GetAuthCodeOptionsMutableBuilder[Self <: GetAuthCodeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScopes(value: String | js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    
    @scala.inline
    def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: /* res */ AuthCode => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
