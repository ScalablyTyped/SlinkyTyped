package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.HeapProfiler.GetHeapObjectIdRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.HeapProfiler.GetHeapObjectIdResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetHeapObjectIdResponse extends StObject {
  
  var paramsType: js.Array[GetHeapObjectIdRequest] = js.native
  
  var returnType: GetHeapObjectIdResponse = js.native
}
object ReturnTypeGetHeapObjectIdResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetHeapObjectIdRequest], returnType: GetHeapObjectIdResponse): ReturnTypeGetHeapObjectIdResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetHeapObjectIdResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetHeapObjectIdResponseMutableBuilder[Self <: ReturnTypeGetHeapObjectIdResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetHeapObjectIdRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetHeapObjectIdRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetHeapObjectIdResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
