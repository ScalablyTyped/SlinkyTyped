package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
import typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.allowed
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.blocked
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.quarantined
*/
trait DeviceManagementExchangeAccessState extends js.Object

object DeviceManagementExchangeAccessState {
  @scala.inline
  def allowed: typingsSlinky.microsoftGraph.microsoftGraphStrings.allowed = this.cast("allowed")
  @scala.inline
  def blocked: typingsSlinky.microsoftGraph.microsoftGraphStrings.blocked = this.cast("blocked")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def quarantined: typingsSlinky.microsoftGraph.microsoftGraphStrings.quarantined = this.cast("quarantined")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

