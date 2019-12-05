package typingsSlinky.naverDashWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cookies {
  import typingsSlinky.chrome.chrome.events.Event

  type CookieChangedEvent = Event[
    js.Function1[/* changeInfo */ typingsSlinky.chrome.chrome.cookies.CookieChangeInfo, Unit]
  ]
}
