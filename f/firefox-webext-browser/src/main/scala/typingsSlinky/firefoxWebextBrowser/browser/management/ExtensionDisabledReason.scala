package typingsSlinky.firefoxWebextBrowser.browser.management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A reason the item is disabled. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.permissions_increase
*/
trait ExtensionDisabledReason extends js.Object

object ExtensionDisabledReason {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def permissions_increase: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.permissions_increase = this.cast("permissions_increase")
  @scala.inline
  def unknown: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown = this.cast("unknown")
}

