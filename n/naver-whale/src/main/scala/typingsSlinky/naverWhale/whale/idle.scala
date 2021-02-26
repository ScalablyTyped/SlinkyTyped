package typingsSlinky.naverWhale.whale

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
    - typingsSlinky.naverWhale.naverWhaleStrings.active
    - typingsSlinky.naverWhale.naverWhaleStrings.idle
    - typingsSlinky.naverWhale.naverWhaleStrings.locked
  */
  trait IdleState extends StObject
  object IdleState {
    
    @scala.inline
    def active: typingsSlinky.naverWhale.naverWhaleStrings.active = "active".asInstanceOf[typingsSlinky.naverWhale.naverWhaleStrings.active]
    
    @scala.inline
    def idle: typingsSlinky.naverWhale.naverWhaleStrings.idle = "idle".asInstanceOf[typingsSlinky.naverWhale.naverWhaleStrings.idle]
    
    @scala.inline
    def locked: typingsSlinky.naverWhale.naverWhaleStrings.locked = "locked".asInstanceOf[typingsSlinky.naverWhale.naverWhaleStrings.locked]
  }
  
  type IdleStateChangedEvent = Event[js.Function1[/* newState */ typingsSlinky.chrome.chrome.idle.IdleState, Unit]]
}
