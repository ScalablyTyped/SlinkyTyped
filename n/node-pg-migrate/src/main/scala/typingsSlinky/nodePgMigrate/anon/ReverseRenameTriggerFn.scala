package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.triggersTypesMod.RenameTriggerFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseRenameTriggerFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameTriggerFn = js.native
  def reverse(
    tableName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    oldTriggerName: String,
    newTriggerName: String
  ): String | js.Array[String] = js.native
}

