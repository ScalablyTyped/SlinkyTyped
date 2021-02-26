package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.GetCookiesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsTypeReturnTypeGetCookiesResponse extends StObject {
  
  var paramsType: js.Array[js.Any] = js.native
  
  var returnType: GetCookiesResponse = js.native
}
object ParamsTypeReturnTypeGetCookiesResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.Any], returnType: GetCookiesResponse): ParamsTypeReturnTypeGetCookiesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsTypeReturnTypeGetCookiesResponse]
  }
  
  @scala.inline
  implicit class ParamsTypeReturnTypeGetCookiesResponseMutableBuilder[Self <: ParamsTypeReturnTypeGetCookiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.Any*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetCookiesResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
