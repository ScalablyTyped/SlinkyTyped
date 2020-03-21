package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.allApps
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.managedApps
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.none_
*/
trait ManagedAppDataTransferLevel extends js.Object

object ManagedAppDataTransferLevel {
  @scala.inline
  def allApps: typingsSlinky.microsoftGraph.microsoftGraphStrings.allApps = this.cast("allApps")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def managedApps: typingsSlinky.microsoftGraph.microsoftGraphStrings.managedApps = this.cast("managedApps")
  @scala.inline
  def none: none_ = this.cast("none")
}

