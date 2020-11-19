package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetContentQuadsRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOM.GetContentQuadsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetContentQuadsResponse extends js.Object {
  
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
  implicit class ReturnTypeGetContentQuadsResponseOps[Self <: ReturnTypeGetContentQuadsResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: js.UndefOr[GetContentQuadsRequest]*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[GetContentQuadsRequest]]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: GetContentQuadsResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
