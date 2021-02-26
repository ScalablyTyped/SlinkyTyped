package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.QuerySelectorAllRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.QuerySelectorAllResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeQuerySelectorAllResponse extends StObject {
  
  var paramsType: js.Array[QuerySelectorAllRequest] = js.native
  
  var returnType: QuerySelectorAllResponse = js.native
}
object ReturnTypeQuerySelectorAllResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[QuerySelectorAllRequest], returnType: QuerySelectorAllResponse): ReturnTypeQuerySelectorAllResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeQuerySelectorAllResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeQuerySelectorAllResponseMutableBuilder[Self <: ReturnTypeQuerySelectorAllResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[QuerySelectorAllRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: QuerySelectorAllRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: QuerySelectorAllResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
