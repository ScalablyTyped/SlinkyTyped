package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.RunScriptRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.RunScriptResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeRunScriptResponse extends js.Object {
  
  var paramsType: js.Array[RunScriptRequest] = js.native
  
  var returnType: RunScriptResponse = js.native
}
object ReturnTypeRunScriptResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[RunScriptRequest], returnType: RunScriptResponse): ReturnTypeRunScriptResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeRunScriptResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeRunScriptResponseOps[Self <: ReturnTypeRunScriptResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: RunScriptRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[RunScriptRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: RunScriptResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
