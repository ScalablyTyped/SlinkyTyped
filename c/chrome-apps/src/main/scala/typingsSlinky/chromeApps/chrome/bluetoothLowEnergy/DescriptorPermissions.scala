package typingsSlinky.chromeApps.chrome.bluetoothLowEnergy

import typingsSlinky.chromeApps.chromeAppsStrings.read_
import typingsSlinky.chromeApps.chromeAppsStrings.write_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chromeAppsStrings.read_
  - typingsSlinky.chromeApps.chromeAppsStrings.write_
  - typingsSlinky.chromeApps.chromeAppsStrings.encryptedRead
  - typingsSlinky.chromeApps.chromeAppsStrings.encryptedWrite
  - typingsSlinky.chromeApps.chromeAppsStrings.encryptedAuthenticatedRead
  - typingsSlinky.chromeApps.chromeAppsStrings.encryptedAuthenticatedWrite
*/
trait DescriptorPermissions extends js.Object

object DescriptorPermissions {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def encryptedAuthenticatedRead: typingsSlinky.chromeApps.chromeAppsStrings.encryptedAuthenticatedRead = this.cast("encryptedAuthenticatedRead")
  @scala.inline
  def encryptedAuthenticatedWrite: typingsSlinky.chromeApps.chromeAppsStrings.encryptedAuthenticatedWrite = this.cast("encryptedAuthenticatedWrite")
  @scala.inline
  def encryptedRead: typingsSlinky.chromeApps.chromeAppsStrings.encryptedRead = this.cast("encryptedRead")
  @scala.inline
  def encryptedWrite: typingsSlinky.chromeApps.chromeAppsStrings.encryptedWrite = this.cast("encryptedWrite")
  @scala.inline
  def read: read_ = this.cast("read")
  @scala.inline
  def write: write_ = this.cast("write")
}

