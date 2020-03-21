package typingsSlinky.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines how zoom changes are handled, i.e. which entity is responsible for the actual scaling of the page;
  * defaults to `automatic`.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.automatic
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.manual
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.disabled
*/
trait ZoomSettingsMode extends js.Object

object ZoomSettingsMode {
  @scala.inline
  def automatic: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.automatic = this.cast("automatic")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disabled: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.disabled = this.cast("disabled")
  @scala.inline
  def manual: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.manual = this.cast("manual")
}

