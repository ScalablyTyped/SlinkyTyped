package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chrome.browser.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofbrowser extends StObject {
  
  /**
    * Opens a new tab in a browser window associated with the current application
    * and Chrome profile. If no browser window for the Chrome profile is opened,
    * a new one is opened prior to creating the new tab. Since Chrome 42 only.
    * @param options Configures how the tab should be opened.
    */
  def openTab(options: Options): Unit = js.native
  /**
    * Opens a new tab in a browser window associated with the current application
    * and Chrome profile. If no browser window for the Chrome profile is opened,
    * a new one is opened prior to creating the new tab.
    * @param options Configures how the tab should be opened.
    * @param callback Called when the tab was successfully
    * created, or failed to be created. If failed, runtime.lastError will be set.
    */
  def openTab(options: Options, callback: js.Function0[Unit]): Unit = js.native
}
