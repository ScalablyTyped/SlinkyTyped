package typingsSlinky.contentfulManagement.apiKeyMod

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentful-management/dist/typings/entities/api-key", "wrapApiKeyCollection")
@js.native
object wrapApiKeyCollection extends js.Object {
  
  def apply(http: AxiosInstance, data: CollectionProp[ApiKeyProps]): Collection[ApiKey, ApiKeyProps] = js.native
}
