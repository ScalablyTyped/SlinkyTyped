package typingsSlinky.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object extension {
  import typingsSlinky.chrome.chrome.events.Event
  import typingsSlinky.chrome.chrome.runtime.MessageSender

  type OnRequestEvent = Event[
    (js.Function3[
      /* request */ js.Any, 
      /* sender */ MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ]) | (js.Function2[
      /* sender */ MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.Any, Unit], 
      Unit
    ])
  ]
}
