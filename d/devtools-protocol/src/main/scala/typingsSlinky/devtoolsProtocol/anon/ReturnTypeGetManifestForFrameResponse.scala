package typingsSlinky.devtoolsProtocol.anon

import typingsSlinky.devtoolsProtocol.mod.Protocol.ApplicationCache.GetManifestForFrameRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.ApplicationCache.GetManifestForFrameResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetManifestForFrameResponse extends js.Object {
  
  var paramsType: js.Array[GetManifestForFrameRequest] = js.native
  
  var returnType: GetManifestForFrameResponse = js.native
}
object ReturnTypeGetManifestForFrameResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetManifestForFrameRequest], returnType: GetManifestForFrameResponse): ReturnTypeGetManifestForFrameResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetManifestForFrameResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetManifestForFrameResponseOps[Self <: ReturnTypeGetManifestForFrameResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: GetManifestForFrameRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[GetManifestForFrameRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: GetManifestForFrameResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
