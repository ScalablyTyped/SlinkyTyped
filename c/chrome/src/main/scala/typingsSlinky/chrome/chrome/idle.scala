package typingsSlinky.chrome.chrome

import typingsSlinky.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Idle
////////////////////
/**
  * Use the chrome.idle API to detect when the machine's idle state changes.
  * Permissions:  "idle"
  * @since Chrome 6.
  */
object idle {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.chrome.chromeStrings.active
    - typingsSlinky.chrome.chromeStrings.idle
    - typingsSlinky.chrome.chromeStrings.locked
  */
  trait IdleState extends StObject
  object IdleState {
    
    @scala.inline
    def active: typingsSlinky.chrome.chromeStrings.active = "active".asInstanceOf[typingsSlinky.chrome.chromeStrings.active]
    
    @scala.inline
    def idle: typingsSlinky.chrome.chromeStrings.idle = "idle".asInstanceOf[typingsSlinky.chrome.chromeStrings.idle]
    
    @scala.inline
    def locked: typingsSlinky.chrome.chromeStrings.locked = "locked".asInstanceOf[typingsSlinky.chrome.chromeStrings.locked]
  }
  
  type IdleStateChangedEvent = Event[js.Function1[/* newState */ IdleState, Unit]]
}
