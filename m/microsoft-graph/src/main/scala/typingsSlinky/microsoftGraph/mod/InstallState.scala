package typingsSlinky.microsoftGraph.mod

import typingsSlinky.microsoftGraph.microsoftGraphStrings.failed_
import typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.notApplicable
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.installed
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.failed_
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.notInstalled
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.uninstallFailed
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.unknown_
*/
trait InstallState extends js.Object

object InstallState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failed: failed_ = this.cast("failed")
  @scala.inline
  def installed: typingsSlinky.microsoftGraph.microsoftGraphStrings.installed = this.cast("installed")
  @scala.inline
  def notApplicable: typingsSlinky.microsoftGraph.microsoftGraphStrings.notApplicable = this.cast("notApplicable")
  @scala.inline
  def notInstalled: typingsSlinky.microsoftGraph.microsoftGraphStrings.notInstalled = this.cast("notInstalled")
  @scala.inline
  def uninstallFailed: typingsSlinky.microsoftGraph.microsoftGraphStrings.uninstallFailed = this.cast("uninstallFailed")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

