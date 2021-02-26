package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.GlobalLexicalScopeNamesRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.GlobalLexicalScopeNamesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGlobalLexicalScopeNamesResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[GlobalLexicalScopeNamesRequest]] = js.native
  
  var returnType: GlobalLexicalScopeNamesResponse = js.native
}
object ReturnTypeGlobalLexicalScopeNamesResponse {
  
  @scala.inline
  def apply(
    paramsType: js.Array[js.UndefOr[GlobalLexicalScopeNamesRequest]],
    returnType: GlobalLexicalScopeNamesResponse
  ): ReturnTypeGlobalLexicalScopeNamesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGlobalLexicalScopeNamesResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGlobalLexicalScopeNamesResponseMutableBuilder[Self <: ReturnTypeGlobalLexicalScopeNamesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[GlobalLexicalScopeNamesRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.UndefOr[GlobalLexicalScopeNamesRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GlobalLexicalScopeNamesResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
