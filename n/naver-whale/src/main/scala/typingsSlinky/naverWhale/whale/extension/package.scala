package typingsSlinky.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object extension {
  type OnRequestEvent = typingsSlinky.chrome.chrome.events.Event[
    (js.Function3[
      /* request */ js.Any, 
      /* sender */ typingsSlinky.chrome.chrome.runtime.MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.Any, scala.Unit], 
      scala.Unit
    ]) | (js.Function2[
      /* sender */ typingsSlinky.chrome.chrome.runtime.MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.Any, scala.Unit], 
      scala.Unit
    ])
  ]
}
