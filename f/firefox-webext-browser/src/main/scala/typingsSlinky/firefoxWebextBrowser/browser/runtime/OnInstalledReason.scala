package typingsSlinky.firefoxWebextBrowser.browser.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The reason that this event is being dispatched. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.install
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.update
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.browser_update
*/
trait OnInstalledReason extends js.Object

object OnInstalledReason {
  @scala.inline
  def browser_update: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.browser_update = this.cast("browser_update")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def install: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.install = this.cast("install")
  @scala.inline
  def update: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.update = this.cast("update")
}

