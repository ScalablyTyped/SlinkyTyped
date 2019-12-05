package typingsSlinky.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object windows {
  import typingsSlinky.chrome.chrome.events.Event

  type WindowIdEvent = Event[
    js.Function2[/* windowId */ Double, /* filters */ js.UndefOr[WindowEventFilter], Unit]
  ]
  type WindowReferenceEvent = Event[
    js.Function2[
      /* window */ typingsSlinky.chrome.chrome.windows.Window, 
      /* filters */ js.UndefOr[WindowEventFilter], 
      Unit
    ]
  ]
}
