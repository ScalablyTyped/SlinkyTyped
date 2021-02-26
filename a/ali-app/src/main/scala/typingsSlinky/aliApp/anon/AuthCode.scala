package typingsSlinky.aliApp.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthCode extends StObject {
  
  var authCode: String = js.native
  
  // 授权码
  var authErrorScope: StringDictionary[Double] = js.native
  
  // 失败的授权类型，key是授权失败的 scope，value 是对应的错误码
  var authSucessScope: js.Array[String] = js.native
}
object AuthCode {
  
  @scala.inline
  def apply(authCode: String, authErrorScope: StringDictionary[Double], authSucessScope: js.Array[String]): AuthCode = {
    val __obj = js.Dynamic.literal(authCode = authCode.asInstanceOf[js.Any], authErrorScope = authErrorScope.asInstanceOf[js.Any], authSucessScope = authSucessScope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthCode]
  }
  
  @scala.inline
  implicit class AuthCodeMutableBuilder[Self <: AuthCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthCode(value: String): Self = StObject.set(x, "authCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthErrorScope(value: StringDictionary[Double]): Self = StObject.set(x, "authErrorScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthSucessScope(value: js.Array[String]): Self = StObject.set(x, "authSucessScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthSucessScopeVarargs(value: String*): Self = StObject.set(x, "authSucessScope", js.Array(value :_*))
  }
}
