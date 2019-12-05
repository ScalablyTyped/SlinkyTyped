package typingsSlinky.naverDashWhale.whale.devtools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object network {
  import typingsSlinky.chrome.chrome.events.Event

  type NavigatedEvent = Event[js.Function1[/* url */ String, Unit]]
  type RequestFinishedEvent = Event[
    js.Function1[/* request */ typingsSlinky.chrome.chrome.devtools.network.Request, Unit]
  ]
}
