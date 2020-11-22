package typingsSlinky.contentfulManagement.roleMod

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentful-management/dist/typings/entities/role", "wrapRoleCollection")
@js.native
object wrapRoleCollection extends js.Object {
  
  def apply(http: AxiosInstance, data: CollectionProp[RoleProps]): Collection[Role, RoleProps] = js.native
}
