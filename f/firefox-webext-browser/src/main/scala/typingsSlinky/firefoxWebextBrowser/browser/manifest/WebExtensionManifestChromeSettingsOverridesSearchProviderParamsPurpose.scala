package typingsSlinky.firefoxWebextBrowser.browser.manifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The context that initiates a search, required if condition is "purpose". */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.contextmenu
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.searchbar
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.homepage
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.keyword
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.newtab
*/
trait WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose extends js.Object

object WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def contextmenu: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.contextmenu = this.cast("contextmenu")
  @scala.inline
  def homepage: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.homepage = this.cast("homepage")
  @scala.inline
  def keyword: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.keyword = this.cast("keyword")
  @scala.inline
  def newtab: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.newtab = this.cast("newtab")
  @scala.inline
  def searchbar: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.searchbar = this.cast("searchbar")
}

