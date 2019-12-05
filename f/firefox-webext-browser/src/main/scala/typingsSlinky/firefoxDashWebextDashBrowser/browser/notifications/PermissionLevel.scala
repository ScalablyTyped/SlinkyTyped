package typingsSlinky.firefoxDashWebextDashBrowser.browser.notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.granted
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.denied
*/
trait PermissionLevel extends js.Object

object PermissionLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def denied: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.denied = this.cast("denied")
  @scala.inline
  def granted: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.granted = this.cast("granted")
}

