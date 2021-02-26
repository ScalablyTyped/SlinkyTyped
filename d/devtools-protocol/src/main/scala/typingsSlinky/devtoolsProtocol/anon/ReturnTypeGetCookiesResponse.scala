package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Network.GetCookiesRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Network.GetCookiesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetCookiesResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[GetCookiesRequest]] = js.native
  
  var returnType: GetCookiesResponse = js.native
}
object ReturnTypeGetCookiesResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[GetCookiesRequest]], returnType: GetCookiesResponse): ReturnTypeGetCookiesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetCookiesResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetCookiesResponseMutableBuilder[Self <: ReturnTypeGetCookiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[GetCookiesRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.UndefOr[GetCookiesRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetCookiesResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
