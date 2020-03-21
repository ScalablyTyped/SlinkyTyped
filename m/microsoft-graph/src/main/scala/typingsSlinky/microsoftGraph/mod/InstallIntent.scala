package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.available
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.required
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.uninstall
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.availableWithoutEnrollment
*/
trait InstallIntent extends js.Object

object InstallIntent {
  @scala.inline
  def available: typingsSlinky.microsoftGraph.microsoftGraphStrings.available = this.cast("available")
  @scala.inline
  def availableWithoutEnrollment: typingsSlinky.microsoftGraph.microsoftGraphStrings.availableWithoutEnrollment = this.cast("availableWithoutEnrollment")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def required: typingsSlinky.microsoftGraph.microsoftGraphStrings.required = this.cast("required")
  @scala.inline
  def uninstall: typingsSlinky.microsoftGraph.microsoftGraphStrings.uninstall = this.cast("uninstall")
}

