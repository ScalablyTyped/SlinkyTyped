package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.allApps
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.managedAppsWithPasteIn
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.managedApps
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.blocked
*/
trait ManagedAppClipboardSharingLevel extends js.Object

object ManagedAppClipboardSharingLevel {
  @scala.inline
  def allApps: typingsSlinky.microsoftGraph.microsoftGraphStrings.allApps = this.cast("allApps")
  @scala.inline
  def blocked: typingsSlinky.microsoftGraph.microsoftGraphStrings.blocked = this.cast("blocked")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def managedApps: typingsSlinky.microsoftGraph.microsoftGraphStrings.managedApps = this.cast("managedApps")
  @scala.inline
  def managedAppsWithPasteIn: typingsSlinky.microsoftGraph.microsoftGraphStrings.managedAppsWithPasteIn = this.cast("managedAppsWithPasteIn")
}

