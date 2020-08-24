package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.sequencesTypesMod.RenameSequenceFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseRenameSequenceFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameSequenceFn = js.native
  def reverse(
    oldSequenceName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    newSequenceName: typingsSlinky.nodePgMigrate.generalTypesMod.Name
  ): String | js.Array[String] = js.native
}

