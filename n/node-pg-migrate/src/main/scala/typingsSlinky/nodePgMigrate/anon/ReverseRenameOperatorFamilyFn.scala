package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.operatorsTypesMod.RenameOperatorFamilyFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseRenameOperatorFamilyFn extends js.Object {
  
  def reverse(
    oldOperatorFamilyName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    indexMethod: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    newOperatorFamilyName: typingsSlinky.nodePgMigrate.generalTypesMod.Name
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: RenameOperatorFamilyFn = js.native
}
