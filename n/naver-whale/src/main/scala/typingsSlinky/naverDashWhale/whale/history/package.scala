package typingsSlinky.naverDashWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object history {
  import typingsSlinky.chrome.chrome.events.Event

  type HistoryVisitRemovedEvent = Event[
    js.Function1[/* removed */ typingsSlinky.chrome.chrome.history.RemovedResult, Unit]
  ]
  type HistoryVisitedEvent = Event[js.Function1[/* result */ typingsSlinky.chrome.chrome.history.HistoryItem, Unit]]
}
