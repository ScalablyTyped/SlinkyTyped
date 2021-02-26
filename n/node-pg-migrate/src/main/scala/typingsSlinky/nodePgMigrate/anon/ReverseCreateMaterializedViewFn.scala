package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions
import typingsSlinky.nodePgMigrate.viewsMaterializedTypesMod.CreateMaterializedViewFn
import typingsSlinky.nodePgMigrate.viewsMaterializedTypesMod.CreateMaterializedViewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseCreateMaterializedViewFn extends StObject {
  
  def reverse(
    viewName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    options: CreateMaterializedViewOptions with DropOptions,
    definition: String
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: CreateMaterializedViewFn = js.native
}
