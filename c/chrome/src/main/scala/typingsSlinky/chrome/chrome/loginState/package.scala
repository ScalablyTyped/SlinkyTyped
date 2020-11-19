package typingsSlinky.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object loginState {
  
  type SessionStateChangedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function1[/* sessionState */ typingsSlinky.chrome.chrome.loginState.SessionState, scala.Unit]
  ]
}
