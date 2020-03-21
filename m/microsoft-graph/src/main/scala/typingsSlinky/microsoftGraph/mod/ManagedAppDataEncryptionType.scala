package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.useDeviceSettings
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.afterDeviceRestart
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.whenDeviceLockedExceptOpenFiles
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.whenDeviceLocked
*/
trait ManagedAppDataEncryptionType extends js.Object

object ManagedAppDataEncryptionType {
  @scala.inline
  def afterDeviceRestart: typingsSlinky.microsoftGraph.microsoftGraphStrings.afterDeviceRestart = this.cast("afterDeviceRestart")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def useDeviceSettings: typingsSlinky.microsoftGraph.microsoftGraphStrings.useDeviceSettings = this.cast("useDeviceSettings")
  @scala.inline
  def whenDeviceLocked: typingsSlinky.microsoftGraph.microsoftGraphStrings.whenDeviceLocked = this.cast("whenDeviceLocked")
  @scala.inline
  def whenDeviceLockedExceptOpenFiles: typingsSlinky.microsoftGraph.microsoftGraphStrings.whenDeviceLockedExceptOpenFiles = this.cast("whenDeviceLockedExceptOpenFiles")
}

