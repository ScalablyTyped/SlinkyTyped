package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.sequencesTypesMod.RenameSequenceFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseRenameSequenceFn extends js.Object {
  
  def reverse(
    oldSequenceName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    newSequenceName: typingsSlinky.nodePgMigrate.generalTypesMod.Name
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: RenameSequenceFn = js.native
}
