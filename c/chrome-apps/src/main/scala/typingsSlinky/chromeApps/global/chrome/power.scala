package typingsSlinky.chromeApps.global.chrome

import typingsSlinky.chromeApps.anon.DISPLAY
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chromeAppsStrings.SYSTEM
import typingsSlinky.chromeApps.chromeAppsStrings.display_
import typingsSlinky.chromeApps.chromeAppsStrings.system_
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.power
///////////
// Power //
///////////
/**
  * Use the chrome.power API to override the system's power management features.
  * @requires Permissions: 'power'
  * @since Chrome 27.
  */
@JSGlobal("chrome.power")
@js.native
object power extends js.Object {
  
  /** Releases a request previously made via requestKeepAwake(). */
  def releaseKeepAwake(): Unit = js.native
  
  /**
    * Requests that power management be temporarily disabled.
    * @param level Level describes the degree to which power management should be disabled.
    *              If a request previously made by the same app is still active, it will be replaced by the new request.
    * @see Enum: chrome.power.Level
    */
  def requestKeepAwake(
    level: ToStringLiteral[
      DISPLAY, 
      /* keyof chrome-apps.anon.DISPLAY */ SYSTEM | typingsSlinky.chromeApps.chromeAppsStrings.DISPLAY, 
      Exclude[
        /* keyof chrome-apps.anon.DISPLAY */ SYSTEM | typingsSlinky.chromeApps.chromeAppsStrings.DISPLAY, 
        system_ | display_
      ]
    ]
  ): Unit = js.native
  
  /**
    * @enum
    * @property SYSTEM - Prevent the system from sleeping in response to user inactivity.
    * @property DISPLAY - Prevent the display from being turned off or dimmed or the system from sleeping in response to user inactivity.
    */
  @js.native
  object Level extends js.Object {
    
    var DISPLAY: display_ = js.native
    
    var SYSTEM: system_ = js.native
  }
}
