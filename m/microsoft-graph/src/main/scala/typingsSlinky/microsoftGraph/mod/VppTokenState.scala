package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.valid
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.expired
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.invalid
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.assignedToExternalMDM
*/
trait VppTokenState extends js.Object

object VppTokenState {
  @scala.inline
  def assignedToExternalMDM: typingsSlinky.microsoftGraph.microsoftGraphStrings.assignedToExternalMDM = this.cast("assignedToExternalMDM")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def expired: typingsSlinky.microsoftGraph.microsoftGraphStrings.expired = this.cast("expired")
  @scala.inline
  def invalid: typingsSlinky.microsoftGraph.microsoftGraphStrings.invalid = this.cast("invalid")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def valid: typingsSlinky.microsoftGraph.microsoftGraphStrings.valid = this.cast("valid")
}

