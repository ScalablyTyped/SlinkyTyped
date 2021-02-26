package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.AddScriptToEvaluateOnNewDocumentRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Page.AddScriptToEvaluateOnNewDocumentResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeAddScriptToEvaluateOnNewDocumentResponse extends StObject {
  
  var paramsType: js.Array[AddScriptToEvaluateOnNewDocumentRequest] = js.native
  
  var returnType: AddScriptToEvaluateOnNewDocumentResponse = js.native
}
object ReturnTypeAddScriptToEvaluateOnNewDocumentResponse {
  
  @scala.inline
  def apply(
    paramsType: js.Array[AddScriptToEvaluateOnNewDocumentRequest],
    returnType: AddScriptToEvaluateOnNewDocumentResponse
  ): ReturnTypeAddScriptToEvaluateOnNewDocumentResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeAddScriptToEvaluateOnNewDocumentResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeAddScriptToEvaluateOnNewDocumentResponseMutableBuilder[Self <: ReturnTypeAddScriptToEvaluateOnNewDocumentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[AddScriptToEvaluateOnNewDocumentRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: AddScriptToEvaluateOnNewDocumentRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: AddScriptToEvaluateOnNewDocumentResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
