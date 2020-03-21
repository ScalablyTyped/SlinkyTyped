package typingsSlinky.firefoxWebextBrowser.browser.captivePortal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The current captive portal state. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.not_captive
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.unlocked_portal
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.locked_portal
*/
trait UndefinedState extends js.Object

object UndefinedState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def locked_portal: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.locked_portal = this.cast("locked_portal")
  @scala.inline
  def not_captive: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.not_captive = this.cast("not_captive")
  @scala.inline
  def unknown: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown = this.cast("unknown")
  @scala.inline
  def unlocked_portal: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.unlocked_portal = this.cast("unlocked_portal")
}

