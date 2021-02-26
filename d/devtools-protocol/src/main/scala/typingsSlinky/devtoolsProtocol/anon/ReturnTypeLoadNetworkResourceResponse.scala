package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Network.LoadNetworkResourceRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Network.LoadNetworkResourceResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeLoadNetworkResourceResponse extends StObject {
  
  var paramsType: js.Array[LoadNetworkResourceRequest] = js.native
  
  var returnType: LoadNetworkResourceResponse = js.native
}
object ReturnTypeLoadNetworkResourceResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[LoadNetworkResourceRequest], returnType: LoadNetworkResourceResponse): ReturnTypeLoadNetworkResourceResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeLoadNetworkResourceResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeLoadNetworkResourceResponseMutableBuilder[Self <: ReturnTypeLoadNetworkResourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[LoadNetworkResourceRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: LoadNetworkResourceRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: LoadNetworkResourceResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
