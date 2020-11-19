package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.rolesTypesMod.RenameRoleFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseRenameRoleFn extends js.Object {
  
  def reverse(
    oldRoleName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    newRoleName: typingsSlinky.nodePgMigrate.generalTypesMod.Name
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: RenameRoleFn = js.native
}
