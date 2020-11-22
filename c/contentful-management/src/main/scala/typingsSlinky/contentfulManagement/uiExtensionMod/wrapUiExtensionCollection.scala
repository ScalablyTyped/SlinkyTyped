package typingsSlinky.contentfulManagement.uiExtensionMod

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentful-management/dist/typings/entities/ui-extension", "wrapUiExtensionCollection")
@js.native
object wrapUiExtensionCollection extends js.Object {
  
  def apply(http: AxiosInstance, data: CollectionProp[UIExtensionProps]): Collection[UIExtension, UIExtensionProps] = js.native
}
