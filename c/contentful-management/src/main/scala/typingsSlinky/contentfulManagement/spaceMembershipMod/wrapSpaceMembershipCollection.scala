package typingsSlinky.contentfulManagement.spaceMembershipMod

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentful-management/dist/typings/entities/space-membership", "wrapSpaceMembershipCollection")
@js.native
object wrapSpaceMembershipCollection extends js.Object {
  
  def apply(http: AxiosInstance, data: CollectionProp[SpaceMembershipProps]): Collection[SpaceMembership, SpaceMembershipProps] = js.native
}
