package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions
import typingsSlinky.nodePgMigrate.viewsTypesMod.CreateViewFn
import typingsSlinky.nodePgMigrate.viewsTypesMod.CreateViewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseCreateViewFn extends js.Object {
  
  def reverse(
    viewName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    options: CreateViewOptions with DropOptions,
    definition: String
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: CreateViewFn = js.native
}
