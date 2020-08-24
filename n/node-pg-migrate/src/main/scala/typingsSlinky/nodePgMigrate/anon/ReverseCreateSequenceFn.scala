package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions
import typingsSlinky.nodePgMigrate.sequencesTypesMod.CreateSequenceFn
import typingsSlinky.nodePgMigrate.sequencesTypesMod.SequenceOptionsCreate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseCreateSequenceFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: CreateSequenceFn = js.native
  def reverse(sequenceName: typingsSlinky.nodePgMigrate.generalTypesMod.Name): String | js.Array[String] = js.native
  def reverse(
    sequenceName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    sequenceOptions: SequenceOptionsCreate with DropOptions
  ): String | js.Array[String] = js.native
}

