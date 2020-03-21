package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unavailable
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.enabled
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.terminated
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.rejected
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unresponsive
*/
trait DeviceManagementPartnerTenantState extends js.Object

object DeviceManagementPartnerTenantState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def enabled: typingsSlinky.microsoftGraph.microsoftGraphStrings.enabled = this.cast("enabled")
  @scala.inline
  def rejected: typingsSlinky.microsoftGraph.microsoftGraphStrings.rejected = this.cast("rejected")
  @scala.inline
  def terminated: typingsSlinky.microsoftGraph.microsoftGraphStrings.terminated = this.cast("terminated")
  @scala.inline
  def unavailable: typingsSlinky.microsoftGraph.microsoftGraphStrings.unavailable = this.cast("unavailable")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unresponsive: typingsSlinky.microsoftGraph.microsoftGraphStrings.unresponsive = this.cast("unresponsive")
}

