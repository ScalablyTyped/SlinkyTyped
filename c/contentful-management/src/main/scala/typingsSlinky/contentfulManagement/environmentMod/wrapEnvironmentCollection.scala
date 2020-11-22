package typingsSlinky.contentfulManagement.environmentMod

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentful-management/dist/typings/entities/environment", "wrapEnvironmentCollection")
@js.native
object wrapEnvironmentCollection extends js.Object {
  
  def apply(http: AxiosInstance, data: CollectionProp[EnvironmentProps]): Collection[Environment, EnvironmentProps] = js.native
}
