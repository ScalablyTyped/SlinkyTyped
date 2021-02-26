package typingsSlinky.contentfulManagement.anon

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import typingsSlinky.contentfulManagement.organizationMembershipMod.OrganizationMembership
import typingsSlinky.contentfulManagement.organizationMembershipMod.OrganizationMembershipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeoforganizationMembers extends StObject {
  
  def wrapOrganizationMembership(http: AxiosInstance, data: OrganizationMembershipProps): OrganizationMembership = js.native
  
  def wrapOrganizationMembershipCollection(http: AxiosInstance, data: CollectionProp[OrganizationMembershipProps]): Collection[OrganizationMembership, OrganizationMembershipProps] = js.native
}
object TypeoforganizationMembers {
  
  @scala.inline
  def apply(
    wrapOrganizationMembership: (AxiosInstance, OrganizationMembershipProps) => OrganizationMembership,
    wrapOrganizationMembershipCollection: (AxiosInstance, CollectionProp[OrganizationMembershipProps]) => Collection[OrganizationMembership, OrganizationMembershipProps]
  ): TypeoforganizationMembers = {
    val __obj = js.Dynamic.literal(wrapOrganizationMembership = js.Any.fromFunction2(wrapOrganizationMembership), wrapOrganizationMembershipCollection = js.Any.fromFunction2(wrapOrganizationMembershipCollection))
    __obj.asInstanceOf[TypeoforganizationMembers]
  }
  
  @scala.inline
  implicit class TypeoforganizationMembersMutableBuilder[Self <: TypeoforganizationMembers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapOrganizationMembership(value: (AxiosInstance, OrganizationMembershipProps) => OrganizationMembership): Self = StObject.set(x, "wrapOrganizationMembership", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapOrganizationMembershipCollection(
      value: (AxiosInstance, CollectionProp[OrganizationMembershipProps]) => Collection[OrganizationMembership, OrganizationMembershipProps]
    ): Self = StObject.set(x, "wrapOrganizationMembershipCollection", js.Any.fromFunction2(value))
  }
}
