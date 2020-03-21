package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.notConfigured
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.blocked
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.allowed
*/
trait StateManagementSetting extends js.Object

object StateManagementSetting {
  @scala.inline
  def allowed: typingsSlinky.microsoftGraph.microsoftGraphStrings.allowed = this.cast("allowed")
  @scala.inline
  def blocked: typingsSlinky.microsoftGraph.microsoftGraphStrings.blocked = this.cast("blocked")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def notConfigured: typingsSlinky.microsoftGraph.microsoftGraphStrings.notConfigured = this.cast("notConfigured")
}

