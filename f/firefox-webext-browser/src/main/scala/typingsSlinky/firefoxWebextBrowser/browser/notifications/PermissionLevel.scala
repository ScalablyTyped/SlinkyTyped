package typingsSlinky.firefoxWebextBrowser.browser.notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.granted
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.denied
*/
trait PermissionLevel extends js.Object

object PermissionLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def denied: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.denied = this.cast("denied")
  @scala.inline
  def granted: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.granted = this.cast("granted")
}

