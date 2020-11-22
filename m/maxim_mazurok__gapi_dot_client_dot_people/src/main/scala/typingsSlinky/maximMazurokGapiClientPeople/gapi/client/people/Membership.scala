package typingsSlinky.maximMazurokGapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Membership extends js.Object {
  
  /** The contact group membership. */
  var contactGroupMembership: js.UndefOr[ContactGroupMembership] = js.native
  
  /** Output only. The domain membership. */
  var domainMembership: js.UndefOr[DomainMembership] = js.native
  
  /** Metadata about the membership. */
  var metadata: js.UndefOr[FieldMetadata] = js.native
}
object Membership {
  
  @scala.inline
  def apply(): Membership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Membership]
  }
  
  @scala.inline
  implicit class MembershipOps[Self <: Membership] (val x: Self) extends AnyVal {
    
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
    def setContactGroupMembership(value: ContactGroupMembership): Self = this.set("contactGroupMembership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactGroupMembership: Self = this.set("contactGroupMembership", js.undefined)
    
    @scala.inline
    def setDomainMembership(value: DomainMembership): Self = this.set("domainMembership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainMembership: Self = this.set("domainMembership", js.undefined)
    
    @scala.inline
    def setMetadata(value: FieldMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
}
