package typingsSlinky.chromeApps.WebView.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The requested disposition of the new window. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chromeAppsStrings.ignore
  - typingsSlinky.chromeApps.chromeAppsStrings.save_to_disk
  - typingsSlinky.chromeApps.chromeAppsStrings.current_tab
  - typingsSlinky.chromeApps.chromeAppsStrings.new_background_tab
  - typingsSlinky.chromeApps.chromeAppsStrings.new_foreground_tab
  - typingsSlinky.chromeApps.chromeAppsStrings.new_window
  - typingsSlinky.chromeApps.chromeAppsStrings.new_popup
*/
trait WindowOpenDisposition extends js.Object

object WindowOpenDisposition {
  @scala.inline
  def current_tab: typingsSlinky.chromeApps.chromeAppsStrings.current_tab = "current_tab".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.current_tab]
  @scala.inline
  def ignore: typingsSlinky.chromeApps.chromeAppsStrings.ignore = "ignore".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.ignore]
  @scala.inline
  def new_background_tab: typingsSlinky.chromeApps.chromeAppsStrings.new_background_tab = "new_background_tab".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.new_background_tab]
  @scala.inline
  def new_foreground_tab: typingsSlinky.chromeApps.chromeAppsStrings.new_foreground_tab = "new_foreground_tab".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.new_foreground_tab]
  @scala.inline
  def new_popup: typingsSlinky.chromeApps.chromeAppsStrings.new_popup = "new_popup".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.new_popup]
  @scala.inline
  def new_window: typingsSlinky.chromeApps.chromeAppsStrings.new_window = "new_window".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.new_window]
  @scala.inline
  def save_to_disk: typingsSlinky.chromeApps.chromeAppsStrings.save_to_disk = "save_to_disk".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.save_to_disk]
}

