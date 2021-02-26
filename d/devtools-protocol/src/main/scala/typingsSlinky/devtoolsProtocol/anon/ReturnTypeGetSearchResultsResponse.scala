package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetSearchResultsRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetSearchResultsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetSearchResultsResponse extends StObject {
  
  var paramsType: js.Array[GetSearchResultsRequest] = js.native
  
  var returnType: GetSearchResultsResponse = js.native
}
object ReturnTypeGetSearchResultsResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetSearchResultsRequest], returnType: GetSearchResultsResponse): ReturnTypeGetSearchResultsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetSearchResultsResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetSearchResultsResponseMutableBuilder[Self <: ReturnTypeGetSearchResultsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetSearchResultsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetSearchResultsRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetSearchResultsResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
