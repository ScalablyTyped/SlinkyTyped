package typingsSlinky.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAdminCreateRemoveTokenForEnterpriseResponseData extends js.Object {
  
  var expires_at: String = js.native
  
  var token: String = js.native
}
object EnterpriseAdminCreateRemoveTokenForEnterpriseResponseData {
  
  @scala.inline
  def apply(expires_at: String, token: String): EnterpriseAdminCreateRemoveTokenForEnterpriseResponseData = {
    val __obj = js.Dynamic.literal(expires_at = expires_at.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterpriseAdminCreateRemoveTokenForEnterpriseResponseData]
  }
  
  @scala.inline
  implicit class EnterpriseAdminCreateRemoveTokenForEnterpriseResponseDataOps[Self <: EnterpriseAdminCreateRemoveTokenForEnterpriseResponseData] (val x: Self) extends AnyVal {
    
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
    def setExpires_at(value: String): Self = this.set("expires_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
  }
}
