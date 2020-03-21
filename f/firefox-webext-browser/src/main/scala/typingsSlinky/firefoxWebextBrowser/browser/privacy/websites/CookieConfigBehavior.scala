package typingsSlinky.firefoxWebextBrowser.browser.privacy.websites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The type of cookies to allow. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.allow_all
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_all
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_third_party
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.allow_visited
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_trackers
*/
trait CookieConfigBehavior extends js.Object

object CookieConfigBehavior {
  @scala.inline
  def allow_all: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.allow_all = this.cast("allow_all")
  @scala.inline
  def allow_visited: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.allow_visited = this.cast("allow_visited")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def reject_all: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_all = this.cast("reject_all")
  @scala.inline
  def reject_third_party: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_third_party = this.cast("reject_third_party")
  @scala.inline
  def reject_trackers: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_trackers = this.cast("reject_trackers")
}

