package typingsSlinky.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object history {
  
  type HistoryVisitRemovedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function1[/* removed */ typingsSlinky.chrome.chrome.history.RemovedResult, scala.Unit]
  ]
  
  type HistoryVisitedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function1[/* result */ typingsSlinky.chrome.chrome.history.HistoryItem, scala.Unit]
  ]
}
