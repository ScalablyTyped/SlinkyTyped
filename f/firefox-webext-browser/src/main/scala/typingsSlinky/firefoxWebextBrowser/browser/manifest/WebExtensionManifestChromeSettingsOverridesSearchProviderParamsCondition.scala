package typingsSlinky.firefoxWebextBrowser.browser.manifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The type of param can be either "purpose" or "pref". */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.purpose
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.pref
*/
trait WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition extends js.Object

object WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pref: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.pref = this.cast("pref")
  @scala.inline
  def purpose: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.purpose = this.cast("purpose")
}

