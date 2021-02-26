package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Browser.GetHistogramsRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Browser.GetHistogramsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetHistogramsResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[GetHistogramsRequest]] = js.native
  
  var returnType: GetHistogramsResponse = js.native
}
object ReturnTypeGetHistogramsResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[GetHistogramsRequest]], returnType: GetHistogramsResponse): ReturnTypeGetHistogramsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetHistogramsResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetHistogramsResponseMutableBuilder[Self <: ReturnTypeGetHistogramsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[GetHistogramsRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.UndefOr[GetHistogramsRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetHistogramsResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
