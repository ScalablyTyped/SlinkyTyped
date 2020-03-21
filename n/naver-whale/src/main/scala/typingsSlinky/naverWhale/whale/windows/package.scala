package typingsSlinky.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object windows {
  type WindowIdEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[
      /* windowId */ scala.Double, 
      /* filters */ js.UndefOr[typingsSlinky.chrome.chrome.windows.WindowEventFilter], 
      scala.Unit
    ]
  ]
  type WindowReferenceEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[
      /* window */ typingsSlinky.chrome.chrome.windows.Window, 
      /* filters */ js.UndefOr[typingsSlinky.chrome.chrome.windows.WindowEventFilter], 
      scala.Unit
    ]
  ]
}
