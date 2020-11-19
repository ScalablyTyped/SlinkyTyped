package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.SearchInContentRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.SearchInContentResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeSearchInContentResponse extends js.Object {
  
  var paramsType: js.Array[SearchInContentRequest] = js.native
  
  var returnType: SearchInContentResponse = js.native
}
object ReturnTypeSearchInContentResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[SearchInContentRequest], returnType: SearchInContentResponse): ReturnTypeSearchInContentResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSearchInContentResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeSearchInContentResponseOps[Self <: ReturnTypeSearchInContentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParamsTypeVarargs(value: SearchInContentRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[SearchInContentRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: SearchInContentResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
