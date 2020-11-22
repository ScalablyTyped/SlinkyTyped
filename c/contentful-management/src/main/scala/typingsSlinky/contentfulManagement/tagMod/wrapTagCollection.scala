package typingsSlinky.contentfulManagement.tagMod

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentful-management/dist/typings/entities/tag", "wrapTagCollection")
@js.native
object wrapTagCollection extends js.Object {
  
  def apply(http: AxiosInstance, data: CollectionProp[TagProps]): Collection[Tag, TagProps] = js.native
}
