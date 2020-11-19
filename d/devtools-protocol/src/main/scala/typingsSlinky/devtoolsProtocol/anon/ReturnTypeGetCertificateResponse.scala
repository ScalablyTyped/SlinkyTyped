package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.Network.GetCertificateRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Network.GetCertificateResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetCertificateResponse extends js.Object {
  
  var paramsType: js.Array[GetCertificateRequest] = js.native
  
  var returnType: GetCertificateResponse = js.native
}
object ReturnTypeGetCertificateResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetCertificateRequest], returnType: GetCertificateResponse): ReturnTypeGetCertificateResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetCertificateResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetCertificateResponseOps[Self <: ReturnTypeGetCertificateResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: GetCertificateRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[GetCertificateRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: GetCertificateResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
