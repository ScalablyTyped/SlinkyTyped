package typingsSlinky.contentfulManagement.entryMod

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentful-management/dist/typings/entities/entry", "wrapEntryCollection")
@js.native
object wrapEntryCollection extends js.Object {
  
  def apply(http: AxiosInstance, data: CollectionProp[EntryProp]): Collection[Entry, EntryProp] = js.native
}
