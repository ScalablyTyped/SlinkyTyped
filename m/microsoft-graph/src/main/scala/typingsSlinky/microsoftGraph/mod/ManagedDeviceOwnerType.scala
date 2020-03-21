package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.company
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.personal
*/
trait ManagedDeviceOwnerType extends js.Object

object ManagedDeviceOwnerType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def company: typingsSlinky.microsoftGraph.microsoftGraphStrings.company = this.cast("company")
  @scala.inline
  def personal: typingsSlinky.microsoftGraph.microsoftGraphStrings.personal = this.cast("personal")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

