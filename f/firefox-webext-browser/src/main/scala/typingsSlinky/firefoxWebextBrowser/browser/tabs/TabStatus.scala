package typingsSlinky.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Whether the tabs have completed loading. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.loading
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.complete
*/
trait TabStatus extends js.Object

object TabStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.complete = this.cast("complete")
  @scala.inline
  def loading: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.loading = this.cast("loading")
}

