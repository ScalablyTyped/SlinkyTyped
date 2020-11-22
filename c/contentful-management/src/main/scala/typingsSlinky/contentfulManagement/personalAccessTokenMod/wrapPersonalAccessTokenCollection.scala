package typingsSlinky.contentfulManagement.personalAccessTokenMod

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentful-management/dist/typings/entities/personal-access-token", "wrapPersonalAccessTokenCollection")
@js.native
object wrapPersonalAccessTokenCollection extends js.Object {
  
  def apply(http: AxiosInstance, data: CollectionProp[PersonalAccessTokenProp]): Collection[PersonalAccessToken, PersonalAccessTokenProp] = js.native
}
