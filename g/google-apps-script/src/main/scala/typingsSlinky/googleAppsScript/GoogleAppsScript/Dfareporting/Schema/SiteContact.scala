package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SiteContact extends js.Object {
  
  var address: js.UndefOr[String] = js.native
  
  var contactType: js.UndefOr[String] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var firstName: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var lastName: js.UndefOr[String] = js.native
  
  var phone: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object SiteContact {
  
  @scala.inline
  def apply(): SiteContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiteContact]
  }
  
  @scala.inline
  implicit class SiteContactOps[Self <: SiteContact] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setContactType(value: String): Self = this.set("contactType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactType: Self = this.set("contactType", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstName: Self = this.set("firstName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastName: Self = this.set("lastName", js.undefined)
    
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
