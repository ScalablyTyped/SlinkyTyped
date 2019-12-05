package typingsSlinky.naverDashWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object proxy {
  import typingsSlinky.chrome.chrome.events.Event

  type ProxyErrorEvent = Event[js.Function1[/* details */ typingsSlinky.chrome.chrome.proxy.ErrorDetails, Unit]]
}
