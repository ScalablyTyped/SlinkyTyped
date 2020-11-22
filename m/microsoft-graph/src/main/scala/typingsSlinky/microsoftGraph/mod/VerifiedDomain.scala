package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerifiedDomain extends js.Object {
  
  // For example, 'Email', 'OfficeCommunicationsOnline'.
  var capabilities: js.UndefOr[NullableOption[String]] = js.native
  
  // true if this is the default domain associated with the tenant; otherwise, false.
  var isDefault: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // true if this is the initial domain associated with the tenant; otherwise, false
  var isInitial: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // The domain name; for example, 'contoso.onmicrosoft.com'
  var name: js.UndefOr[NullableOption[String]] = js.native
  
  // For example, 'Managed'.
  var `type`: js.UndefOr[NullableOption[String]] = js.native
}
object VerifiedDomain {
  
  @scala.inline
  def apply(): VerifiedDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifiedDomain]
  }
  
  @scala.inline
  implicit class VerifiedDomainOps[Self <: VerifiedDomain] (val x: Self) extends AnyVal {
    
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
    def setCapabilities(value: NullableOption[String]): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapabilities: Self = this.set("capabilities", js.undefined)
    
    @scala.inline
    def setCapabilitiesNull: Self = this.set("capabilities", null)
    
    @scala.inline
    def setIsDefault(value: NullableOption[Boolean]): Self = this.set("isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDefault: Self = this.set("isDefault", js.undefined)
    
    @scala.inline
    def setIsDefaultNull: Self = this.set("isDefault", null)
    
    @scala.inline
    def setIsInitial(value: NullableOption[Boolean]): Self = this.set("isInitial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInitial: Self = this.set("isInitial", js.undefined)
    
    @scala.inline
    def setIsInitialNull: Self = this.set("isInitial", null)
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    
    @scala.inline
    def setType(value: NullableOption[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
  }
}
