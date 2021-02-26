package typingsSlinky.chromeApps.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.idle
//////////
// Idle //
//////////
/**
  * Use the chrome.idle API to detect when the machine's idle state changes.
  * @requires Permissions: 'idle'
  * @since Chrome 25.
  */
object idle {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.chromeApps.chromeAppsStrings.active
    - typingsSlinky.chromeApps.chromeAppsStrings.idle
    - typingsSlinky.chromeApps.chromeAppsStrings.locked
  */
  trait IdleState extends StObject
  object IdleState {
    
    @scala.inline
    def active: typingsSlinky.chromeApps.chromeAppsStrings.active = "active".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.active]
    
    @scala.inline
    def idle: typingsSlinky.chromeApps.chromeAppsStrings.idle = "idle".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.idle]
    
    @scala.inline
    def locked: typingsSlinky.chromeApps.chromeAppsStrings.locked = "locked".asInstanceOf[typingsSlinky.chromeApps.chromeAppsStrings.locked]
  }
}
