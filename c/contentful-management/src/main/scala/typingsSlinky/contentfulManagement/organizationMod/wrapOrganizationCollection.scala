package typingsSlinky.contentfulManagement.organizationMod

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentful-management/dist/typings/entities/organization", "wrapOrganizationCollection")
@js.native
object wrapOrganizationCollection extends js.Object {
  
  def apply(http: AxiosInstance, data: CollectionProp[OrganizationProp]): Collection[Organization, OrganizationProp] = js.native
}
