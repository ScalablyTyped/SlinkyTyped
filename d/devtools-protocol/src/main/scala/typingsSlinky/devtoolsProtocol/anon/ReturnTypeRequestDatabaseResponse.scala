package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.IndexedDB.RequestDatabaseRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.IndexedDB.RequestDatabaseResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeRequestDatabaseResponse extends StObject {
  
  var paramsType: js.Array[RequestDatabaseRequest] = js.native
  
  var returnType: RequestDatabaseResponse = js.native
}
object ReturnTypeRequestDatabaseResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[RequestDatabaseRequest], returnType: RequestDatabaseResponse): ReturnTypeRequestDatabaseResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeRequestDatabaseResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeRequestDatabaseResponseMutableBuilder[Self <: ReturnTypeRequestDatabaseResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[RequestDatabaseRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: RequestDatabaseRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: RequestDatabaseResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
