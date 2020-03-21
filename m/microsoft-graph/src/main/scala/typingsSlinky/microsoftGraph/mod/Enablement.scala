package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.notConfigured
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.enabled
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.disabled
*/
trait Enablement extends js.Object

object Enablement {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disabled: typingsSlinky.microsoftGraph.microsoftGraphStrings.disabled = this.cast("disabled")
  @scala.inline
  def enabled: typingsSlinky.microsoftGraph.microsoftGraphStrings.enabled = this.cast("enabled")
  @scala.inline
  def notConfigured: typingsSlinky.microsoftGraph.microsoftGraphStrings.notConfigured = this.cast("notConfigured")
}

