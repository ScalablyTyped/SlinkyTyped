package typingsSlinky.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppsRevokeGrantForApplicationEndpoint extends js.Object {
  
  var access_token: String = js.native
  
  var client_id: String = js.native
}
object AppsRevokeGrantForApplicationEndpoint {
  
  @scala.inline
  def apply(access_token: String, client_id: String): AppsRevokeGrantForApplicationEndpoint = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsRevokeGrantForApplicationEndpoint]
  }
  
  @scala.inline
  implicit class AppsRevokeGrantForApplicationEndpointOps[Self <: AppsRevokeGrantForApplicationEndpoint] (val x: Self) extends AnyVal {
    
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
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_id(value: String): Self = this.set("client_id", value.asInstanceOf[js.Any])
  }
}
