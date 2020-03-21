package typingsSlinky.firefoxWebextBrowser.browser.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The operating system the browser is running on. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.mac
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.win
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.android
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.cros
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.linux
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.openbsd
*/
trait PlatformOs extends js.Object

object PlatformOs {
  @scala.inline
  def android: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.android = this.cast("android")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cros: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.cros = this.cast("cros")
  @scala.inline
  def linux: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.linux = this.cast("linux")
  @scala.inline
  def mac: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.mac = this.cast("mac")
  @scala.inline
  def openbsd: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.openbsd = this.cast("openbsd")
  @scala.inline
  def win: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.win = this.cast("win")
}

