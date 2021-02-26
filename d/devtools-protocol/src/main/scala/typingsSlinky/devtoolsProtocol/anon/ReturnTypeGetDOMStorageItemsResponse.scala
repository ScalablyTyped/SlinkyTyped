package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.DOMStorage.GetDOMStorageItemsRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOMStorage.GetDOMStorageItemsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetDOMStorageItemsResponse extends StObject {
  
  var paramsType: js.Array[GetDOMStorageItemsRequest] = js.native
  
  var returnType: GetDOMStorageItemsResponse = js.native
}
object ReturnTypeGetDOMStorageItemsResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetDOMStorageItemsRequest], returnType: GetDOMStorageItemsResponse): ReturnTypeGetDOMStorageItemsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetDOMStorageItemsResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetDOMStorageItemsResponseMutableBuilder[Self <: ReturnTypeGetDOMStorageItemsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetDOMStorageItemsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetDOMStorageItemsRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetDOMStorageItemsResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
