package typingsSlinky.chromeApps.chrome.certificateProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Hash type */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chromeAppsStrings.MD5_SHA1
  - typingsSlinky.chromeApps.chromeAppsStrings.SHA1
  - typingsSlinky.chromeApps.chromeAppsStrings.SHA256
  - typingsSlinky.chromeApps.chromeAppsStrings.SHA384
  - typingsSlinky.chromeApps.chromeAppsStrings.SHA512
*/
trait Hash extends js.Object

object Hash {
  @scala.inline
  def MD5_SHA1: typingsSlinky.chromeApps.chromeAppsStrings.MD5_SHA1 = this.cast("MD5_SHA1")
  @scala.inline
  def SHA1: typingsSlinky.chromeApps.chromeAppsStrings.SHA1 = this.cast("SHA1")
  @scala.inline
  def SHA256: typingsSlinky.chromeApps.chromeAppsStrings.SHA256 = this.cast("SHA256")
  @scala.inline
  def SHA384: typingsSlinky.chromeApps.chromeAppsStrings.SHA384 = this.cast("SHA384")
  @scala.inline
  def SHA512: typingsSlinky.chromeApps.chromeAppsStrings.SHA512 = this.cast("SHA512")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

