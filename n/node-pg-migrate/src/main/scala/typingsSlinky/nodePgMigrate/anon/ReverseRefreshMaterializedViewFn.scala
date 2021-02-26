package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.viewsMaterializedTypesMod.RefreshMaterializedViewFn
import typingsSlinky.nodePgMigrate.viewsMaterializedTypesMod.RefreshMaterializedViewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseRefreshMaterializedViewFn extends StObject {
  
  def reverse(viewName: typingsSlinky.nodePgMigrate.generalTypesMod.Name): String | js.Array[String] = js.native
  def reverse(
    viewName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    options: RefreshMaterializedViewOptions
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: RefreshMaterializedViewFn = js.native
}
