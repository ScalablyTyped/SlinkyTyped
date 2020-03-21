package typingsSlinky.firefoxWebextBrowser.browser.windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The state of this browser window. Under some circumstances a Window may not be assigned state property, for
  * example when querying closed windows from the `sessions` API.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.minimized
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.maximized
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.fullscreen
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.docked
*/
trait WindowState extends js.Object

object WindowState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def docked: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.docked = this.cast("docked")
  @scala.inline
  def fullscreen: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.fullscreen = this.cast("fullscreen")
  @scala.inline
  def maximized: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.maximized = this.cast("maximized")
  @scala.inline
  def minimized: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.minimized = this.cast("minimized")
  @scala.inline
  def normal: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = this.cast("normal")
}

