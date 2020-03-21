package typingsSlinky.chosenJs.Chosen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chosenJs.chosenJsStrings.chosenColonupdated
  - typingsSlinky.chosenJs.chosenJsStrings.chosenColonactivate
  - typingsSlinky.chosenJs.chosenJsStrings.chosenColonopen
  - typingsSlinky.chosenJs.chosenJsStrings.chosenColonclose
*/
trait TriggerEvent extends js.Object

object TriggerEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chosenColonactivate: typingsSlinky.chosenJs.chosenJsStrings.chosenColonactivate = this.cast("chosen:activate")
  @scala.inline
  def chosenColonclose: typingsSlinky.chosenJs.chosenJsStrings.chosenColonclose = this.cast("chosen:close")
  @scala.inline
  def chosenColonopen: typingsSlinky.chosenJs.chosenJsStrings.chosenColonopen = this.cast("chosen:open")
  @scala.inline
  def chosenColonupdated: typingsSlinky.chosenJs.chosenJsStrings.chosenColonupdated = this.cast("chosen:updated")
}

