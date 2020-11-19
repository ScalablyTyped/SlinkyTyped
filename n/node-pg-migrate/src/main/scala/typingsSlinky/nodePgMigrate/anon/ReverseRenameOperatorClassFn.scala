package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.operatorsTypesMod.RenameOperatorClassFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseRenameOperatorClassFn extends js.Object {
  
  def reverse(
    oldOperatorClassName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    indexMethod: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    newOperatorClassName: typingsSlinky.nodePgMigrate.generalTypesMod.Name
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: RenameOperatorClassFn = js.native
}
