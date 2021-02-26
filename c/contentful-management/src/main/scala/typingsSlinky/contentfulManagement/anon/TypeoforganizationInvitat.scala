package typingsSlinky.contentfulManagement.anon

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.organizationInvitationMod.OrganizationInvitation
import typingsSlinky.contentfulManagement.organizationInvitationMod.OrganizationInvitationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeoforganizationInvitat extends StObject {
  
  def wrapOrganizationInvitation(http: AxiosInstance, data: OrganizationInvitationProps): OrganizationInvitation = js.native
}
object TypeoforganizationInvitat {
  
  @scala.inline
  def apply(wrapOrganizationInvitation: (AxiosInstance, OrganizationInvitationProps) => OrganizationInvitation): TypeoforganizationInvitat = {
    val __obj = js.Dynamic.literal(wrapOrganizationInvitation = js.Any.fromFunction2(wrapOrganizationInvitation))
    __obj.asInstanceOf[TypeoforganizationInvitat]
  }
  
  @scala.inline
  implicit class TypeoforganizationInvitatMutableBuilder[Self <: TypeoforganizationInvitat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapOrganizationInvitation(value: (AxiosInstance, OrganizationInvitationProps) => OrganizationInvitation): Self = StObject.set(x, "wrapOrganizationInvitation", js.Any.fromFunction2(value))
  }
}
