package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.CollectClassNamesRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.CSS.CollectClassNamesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeCollectClassNamesResponse extends StObject {
  
  var paramsType: js.Array[CollectClassNamesRequest] = js.native
  
  var returnType: CollectClassNamesResponse = js.native
}
object ReturnTypeCollectClassNamesResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[CollectClassNamesRequest], returnType: CollectClassNamesResponse): ReturnTypeCollectClassNamesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeCollectClassNamesResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeCollectClassNamesResponseMutableBuilder[Self <: ReturnTypeCollectClassNamesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[CollectClassNamesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: CollectClassNamesRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: CollectClassNamesResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
