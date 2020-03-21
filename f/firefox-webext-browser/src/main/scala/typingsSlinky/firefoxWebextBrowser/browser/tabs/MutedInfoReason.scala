package typingsSlinky.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* tabs types */
/** An event that caused a muted state change. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.user
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.capture
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.extension
*/
trait MutedInfoReason extends js.Object

object MutedInfoReason {
  @scala.inline
  def capture: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.capture = this.cast("capture")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def extension: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.extension = this.cast("extension")
  @scala.inline
  def user: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.user = this.cast("user")
}

