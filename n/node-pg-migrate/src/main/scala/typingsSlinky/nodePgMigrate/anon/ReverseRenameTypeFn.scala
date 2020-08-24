package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.typesTypesMod.RenameTypeFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseRenameTypeFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameTypeFn = js.native
  def reverse(
    typeName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    newTypeName: typingsSlinky.nodePgMigrate.generalTypesMod.Name
  ): String | js.Array[String] = js.native
}

