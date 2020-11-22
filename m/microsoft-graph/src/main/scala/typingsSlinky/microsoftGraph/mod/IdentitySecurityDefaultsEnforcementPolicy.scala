package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentitySecurityDefaultsEnforcementPolicy extends PolicyBase {
  
  // If set to true, Azure Active Directory security defaults is enabled for the tenant.
  var isEnabled: js.UndefOr[Boolean] = js.native
}
object IdentitySecurityDefaultsEnforcementPolicy {
  
  @scala.inline
  def apply(): IdentitySecurityDefaultsEnforcementPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitySecurityDefaultsEnforcementPolicy]
  }
  
  @scala.inline
  implicit class IdentitySecurityDefaultsEnforcementPolicyOps[Self <: IdentitySecurityDefaultsEnforcementPolicy] (val x: Self) extends AnyVal {
    
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
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEnabled: Self = this.set("isEnabled", js.undefined)
  }
}
