package typingsSlinky.naverDashWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gcm {
  import typingsSlinky.chrome.chrome.events.Event

  type GcmErrorEvent = Event[js.Function1[/* error */ typingsSlinky.chrome.chrome.gcm.GcmError, Unit]]
  type MessageDeletionEvent = Event[js.Function0[Unit]]
  type MessageReceptionEvent = Event[
    js.Function1[/* message */ typingsSlinky.chrome.chrome.gcm.IncomingMessage, Unit]
  ]
}
