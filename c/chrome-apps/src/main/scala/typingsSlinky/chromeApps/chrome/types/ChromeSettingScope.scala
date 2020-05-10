package typingsSlinky.chromeApps.chrome.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The scope of the ChromeSetting. One of
  * • regular: setting for the regular profile (which is inherited by the incognito profile if not overridden elsewhere),
  * • regular_only: setting for the regular profile only (not inherited by the incognito profile),
  * • incognito_persistent: setting for the incognito profile that survives browser restarts (overrides regular preferences),
  * • incognito_session_only: setting for the incognito profile that can only be set during an incognito session and is deleted
  *     when the incognito session ends (overrides regular and incognito_persistent preferences).
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chromeAppsStrings.regular
  - typingsSlinky.chromeApps.chromeAppsStrings.regular_only
  - typingsSlinky.chromeApps.chromeAppsStrings.incognito_persistent
  - typingsSlinky.chromeApps.chromeAppsStrings.incognito_session_only
*/
trait ChromeSettingScope extends js.Object

object ChromeSettingScope {
  @scala.inline
  def incognito_persistent: typingsSlinky.chromeApps.chromeAppsStrings.incognito_persistent = "incognito_persistent".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.incognito_persistent]
  @scala.inline
  def incognito_session_only: typingsSlinky.chromeApps.chromeAppsStrings.incognito_session_only = "incognito_session_only".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.incognito_session_only]
  @scala.inline
  def regular: typingsSlinky.chromeApps.chromeAppsStrings.regular = "regular".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.regular]
  @scala.inline
  def regular_only: typingsSlinky.chromeApps.chromeAppsStrings.regular_only = "regular_only".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.regular_only]
}

