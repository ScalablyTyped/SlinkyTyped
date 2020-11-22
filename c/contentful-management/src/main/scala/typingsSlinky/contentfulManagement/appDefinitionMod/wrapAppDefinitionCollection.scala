package typingsSlinky.contentfulManagement.appDefinitionMod

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentful-management/dist/typings/entities/app-definition", "wrapAppDefinitionCollection")
@js.native
object wrapAppDefinitionCollection extends js.Object {
  
  def apply(http: AxiosInstance, data: CollectionProp[AppDefinitionProps]): Collection[AppDefinition, AppDefinitionProps] = js.native
}
