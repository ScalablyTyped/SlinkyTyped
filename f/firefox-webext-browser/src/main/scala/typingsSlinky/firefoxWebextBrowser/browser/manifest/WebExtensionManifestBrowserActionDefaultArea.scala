package typingsSlinky.firefoxWebextBrowser.browser.manifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the location the browserAction will appear by default. The default location is navbar. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.navbar
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.menupanel
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.tabstrip
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.personaltoolbar
*/
trait WebExtensionManifestBrowserActionDefaultArea extends js.Object

object WebExtensionManifestBrowserActionDefaultArea {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def menupanel: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.menupanel = this.cast("menupanel")
  @scala.inline
  def navbar: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.navbar = this.cast("navbar")
  @scala.inline
  def personaltoolbar: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.personaltoolbar = this.cast("personaltoolbar")
  @scala.inline
  def tabstrip: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.tabstrip = this.cast("tabstrip")
}

