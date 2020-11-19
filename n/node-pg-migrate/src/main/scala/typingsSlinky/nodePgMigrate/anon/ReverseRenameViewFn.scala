package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.viewsTypesMod.RenameViewFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseRenameViewFn extends js.Object {
  
  def reverse(
    viewName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    newViewName: typingsSlinky.nodePgMigrate.generalTypesMod.Name
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: RenameViewFn = js.native
}
