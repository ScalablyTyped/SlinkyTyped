package typingsSlinky.firefoxWebextBrowser.browser.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* types types */
/**
  * The scope of the Setting. One of
  *
  * *   `regular`: setting for the regular profile (which is inherited by the incognito profile if not overridden elsewhere),
  * *   `regular_only`: setting for the regular profile only (not inherited by the incognito profile),
  * *   `incognito_persistent`: setting for the incognito profile that survives browser restarts (overrides regular preferences),
  * *   `incognito_session_only`: setting for the incognito profile that can only be set during an incognito session and is deleted when the incognito session ends (overrides regular and incognito_persistent preferences).
  *
  * Only `regular` is supported by Firefox at this time.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.regular
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.regular_only
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.incognito_persistent
  - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.incognito_session_only
*/
trait SettingScope extends js.Object
object SettingScope {
  
  @scala.inline
  def incognito_persistent: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.incognito_persistent = "incognito_persistent".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.incognito_persistent]
  
  @scala.inline
  def incognito_session_only: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.incognito_session_only = "incognito_session_only".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.incognito_session_only]
  
  @scala.inline
  def regular: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.regular = "regular".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.regular]
  
  @scala.inline
  def regular_only: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.regular_only = "regular_only".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.regular_only]
}
