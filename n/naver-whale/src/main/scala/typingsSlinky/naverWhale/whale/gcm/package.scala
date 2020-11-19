package typingsSlinky.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object gcm {
  
  type GcmErrorEvent = typingsSlinky.chrome.chrome.events.Event[js.Function1[/* error */ typingsSlinky.chrome.chrome.gcm.GcmError, scala.Unit]]
  
  type MessageDeletionEvent = typingsSlinky.chrome.chrome.events.Event[js.Function0[scala.Unit]]
  
  type MessageReceptionEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function1[/* message */ typingsSlinky.chrome.chrome.gcm.IncomingMessage, scala.Unit]
  ]
}
