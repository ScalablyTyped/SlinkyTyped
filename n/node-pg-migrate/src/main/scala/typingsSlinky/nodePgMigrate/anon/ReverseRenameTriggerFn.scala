package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.triggersTypesMod.RenameTriggerFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseRenameTriggerFn extends js.Object {
  
  def reverse(
    tableName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    oldTriggerName: String,
    newTriggerName: String
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: RenameTriggerFn = js.native
}
