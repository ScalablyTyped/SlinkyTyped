package typingsSlinky.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object idle {
  type IdleStateChangedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function1[/* newState */ typingsSlinky.chrome.chrome.idle.IdleState, scala.Unit]
  ]
}
