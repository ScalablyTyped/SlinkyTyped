package typingsSlinky.contentfulManagement.spaceMemberMod

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.anon.SpaceMemberPropstoPlainOb
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentful-management/dist/typings/entities/space-member", "wrapSpaceMemberCollection")
@js.native
object wrapSpaceMemberCollection extends js.Object {
  
  def apply(http: AxiosInstance, data: CollectionProp[SpaceMemberProps]): Collection[SpaceMemberPropstoPlainOb, SpaceMemberProps] = js.native
}
