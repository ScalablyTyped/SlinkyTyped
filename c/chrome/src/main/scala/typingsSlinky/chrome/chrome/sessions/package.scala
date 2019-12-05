package typingsSlinky.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sessions {
  import typingsSlinky.chrome.chrome.events.Event

  type SessionChangedEvent = Event[js.Function0[Unit]]
}
