package typingsSlinky.firefoxDashWebextDashBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* tabs types */
/** An event that caused a muted state change. */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.user
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.capture
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.extension
*/
trait MutedInfoReason extends js.Object

object MutedInfoReason {
  @scala.inline
  def capture: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.capture = this.cast("capture")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def extension: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.extension = this.cast("extension")
  @scala.inline
  def user: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.user = this.cast("user")
}

