package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.typesTypesMod.RenameTypeAttributeFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseRenameTypeAttributeFn extends js.Object {
  
  def reverse(
    typeName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    attributeName: String,
    newAttributeName: String
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: RenameTypeAttributeFn = js.native
}
