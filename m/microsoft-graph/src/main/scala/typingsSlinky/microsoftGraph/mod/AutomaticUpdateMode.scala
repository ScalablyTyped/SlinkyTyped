package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.userDefined
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.notifyDownload
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.autoInstallAtMaintenanceTime
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.autoInstallAndRebootAtMaintenanceTime
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.autoInstallAndRebootAtScheduledTime
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.autoInstallAndRebootWithoutEndUserControl
*/
trait AutomaticUpdateMode extends js.Object

object AutomaticUpdateMode {
  @scala.inline
  def autoInstallAndRebootAtMaintenanceTime: typingsSlinky.microsoftGraph.microsoftGraphStrings.autoInstallAndRebootAtMaintenanceTime = this.cast("autoInstallAndRebootAtMaintenanceTime")
  @scala.inline
  def autoInstallAndRebootAtScheduledTime: typingsSlinky.microsoftGraph.microsoftGraphStrings.autoInstallAndRebootAtScheduledTime = this.cast("autoInstallAndRebootAtScheduledTime")
  @scala.inline
  def autoInstallAndRebootWithoutEndUserControl: typingsSlinky.microsoftGraph.microsoftGraphStrings.autoInstallAndRebootWithoutEndUserControl = this.cast("autoInstallAndRebootWithoutEndUserControl")
  @scala.inline
  def autoInstallAtMaintenanceTime: typingsSlinky.microsoftGraph.microsoftGraphStrings.autoInstallAtMaintenanceTime = this.cast("autoInstallAtMaintenanceTime")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def notifyDownload: typingsSlinky.microsoftGraph.microsoftGraphStrings.notifyDownload = this.cast("notifyDownload")
  @scala.inline
  def userDefined: typingsSlinky.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

