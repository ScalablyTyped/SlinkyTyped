package typingsSlinky.chromeDashApps.chrome.bluetoothLowEnergy

import typingsSlinky.chromeDashApps.chromeDashAppsStrings.read_
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.write_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeDashApps.chromeDashAppsStrings.read_
  - typings.chromeDashApps.chromeDashAppsStrings.write_
  - typings.chromeDashApps.chromeDashAppsStrings.encryptedRead
  - typings.chromeDashApps.chromeDashAppsStrings.encryptedWrite
  - typings.chromeDashApps.chromeDashAppsStrings.encryptedAuthenticatedRead
  - typings.chromeDashApps.chromeDashAppsStrings.encryptedAuthenticatedWrite
*/
trait DescriptorPermissions extends js.Object

object DescriptorPermissions {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def encryptedAuthenticatedRead: typingsSlinky.chromeDashApps.chromeDashAppsStrings.encryptedAuthenticatedRead = this.cast("encryptedAuthenticatedRead")
  @scala.inline
  def encryptedAuthenticatedWrite: typingsSlinky.chromeDashApps.chromeDashAppsStrings.encryptedAuthenticatedWrite = this.cast("encryptedAuthenticatedWrite")
  @scala.inline
  def encryptedRead: typingsSlinky.chromeDashApps.chromeDashAppsStrings.encryptedRead = this.cast("encryptedRead")
  @scala.inline
  def encryptedWrite: typingsSlinky.chromeDashApps.chromeDashAppsStrings.encryptedWrite = this.cast("encryptedWrite")
  @scala.inline
  def read: read_ = this.cast("read")
  @scala.inline
  def write: write_ = this.cast("write")
}

