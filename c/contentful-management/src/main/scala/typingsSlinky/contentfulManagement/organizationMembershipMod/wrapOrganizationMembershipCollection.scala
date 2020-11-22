package typingsSlinky.contentfulManagement.organizationMembershipMod

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentful-management/dist/typings/entities/organization-membership", "wrapOrganizationMembershipCollection")
@js.native
object wrapOrganizationMembershipCollection extends js.Object {
  
  def apply(http: AxiosInstance, data: CollectionProp[OrganizationMembershipProps]): Collection[OrganizationMembership, OrganizationMembershipProps] = js.native
}
