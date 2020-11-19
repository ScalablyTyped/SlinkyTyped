package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetProxySessionResponse extends js.Object {
  
  /**
    * The proxy session details.
    */
  var ProxySession: js.UndefOr[typingsSlinky.awsSdk.chimeMod.ProxySession] = js.native
}
object GetProxySessionResponse {
  
  @scala.inline
  def apply(): GetProxySessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProxySessionResponse]
  }
  
  @scala.inline
  implicit class GetProxySessionResponseOps[Self <: GetProxySessionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProxySession(value: ProxySession): Self = this.set("ProxySession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxySession: Self = this.set("ProxySession", js.undefined)
  }
}
