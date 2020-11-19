package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.EnableRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.EnableResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsTypeReturnType extends js.Object {
  
  var paramsType: js.Array[js.UndefOr[EnableRequest]] = js.native
  
  var returnType: EnableResponse = js.native
}
object ParamsTypeReturnType {
  
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[EnableRequest]], returnType: EnableResponse): ParamsTypeReturnType = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsTypeReturnType]
  }
  
  @scala.inline
  implicit class ParamsTypeReturnTypeOps[Self <: ParamsTypeReturnType] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: js.UndefOr[EnableRequest]*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[EnableRequest]]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: EnableResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
