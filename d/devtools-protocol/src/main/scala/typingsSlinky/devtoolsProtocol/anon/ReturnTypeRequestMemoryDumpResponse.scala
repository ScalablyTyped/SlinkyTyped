package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Tracing.RequestMemoryDumpRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Tracing.RequestMemoryDumpResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeRequestMemoryDumpResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[RequestMemoryDumpRequest]] = js.native
  
  var returnType: RequestMemoryDumpResponse = js.native
}
object ReturnTypeRequestMemoryDumpResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[RequestMemoryDumpRequest]], returnType: RequestMemoryDumpResponse): ReturnTypeRequestMemoryDumpResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeRequestMemoryDumpResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeRequestMemoryDumpResponseMutableBuilder[Self <: ReturnTypeRequestMemoryDumpResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[RequestMemoryDumpRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.UndefOr[RequestMemoryDumpRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: RequestMemoryDumpResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
