package typingsSlinky.naverDashWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object windows {
  import typingsSlinky.chrome.chrome.events.Event

  type WindowIdEvent = Event[
    js.Function2[
      /* windowId */ Double, 
      /* filters */ js.UndefOr[typingsSlinky.chrome.chrome.windows.WindowEventFilter], 
      Unit
    ]
  ]
  type WindowReferenceEvent = Event[
    js.Function2[
      /* window */ typingsSlinky.chrome.chrome.windows.Window, 
      /* filters */ js.UndefOr[typingsSlinky.chrome.chrome.windows.WindowEventFilter], 
      Unit
    ]
  ]
}
