package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetContentQuadsRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetContentQuadsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetContentQuadsResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[GetContentQuadsRequest]] = js.native
  
  var returnType: GetContentQuadsResponse = js.native
}
object ReturnTypeGetContentQuadsResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[GetContentQuadsRequest]], returnType: GetContentQuadsResponse): ReturnTypeGetContentQuadsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetContentQuadsResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetContentQuadsResponseMutableBuilder[Self <: ReturnTypeGetContentQuadsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[GetContentQuadsRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.UndefOr[GetContentQuadsRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetContentQuadsResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
