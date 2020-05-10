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
  def complete: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.complete = "complete".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.complete]
  @scala.inline
  def loading: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.loading = "loading".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.loading]
}

