package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.viewsTypesMod.RenameViewFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseRenameViewFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameViewFn = js.native
  def reverse(
    viewName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    newViewName: typingsSlinky.nodePgMigrate.generalTypesMod.Name
  ): String | js.Array[String] = js.native
}

