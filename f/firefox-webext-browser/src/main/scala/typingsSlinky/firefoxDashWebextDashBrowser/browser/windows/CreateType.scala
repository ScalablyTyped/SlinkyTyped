package typingsSlinky.firefoxDashWebextDashBrowser.browser.windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies what type of browser window to create. The 'panel' and 'detached_panel' types create a popup unless
  * the '--enable-panels' flag is set.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.normal
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.popup
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.panel
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.detached_panel
*/
trait CreateType extends js.Object

object CreateType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def detached_panel: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.detached_panel = this.cast("detached_panel")
  @scala.inline
  def normal: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.normal = this.cast("normal")
  @scala.inline
  def panel: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.panel = this.cast("panel")
  @scala.inline
  def popup: typingsSlinky.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.popup = this.cast("popup")
}

