package typingsSlinky.firefoxWebextBrowser.browser.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Result of the update check. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.throttled
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.no_update
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.update_available
*/
trait RequestUpdateCheckStatus extends js.Object

object RequestUpdateCheckStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def no_update: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.no_update = this.cast("no_update")
  @scala.inline
  def throttled: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.throttled = this.cast("throttled")
  @scala.inline
  def update_available: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.update_available = this.cast("update_available")
}

