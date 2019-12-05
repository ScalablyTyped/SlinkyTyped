package typingsSlinky.naverDashWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pageAction {
  import typingsSlinky.chrome.chrome.events.Event
  import typingsSlinky.chrome.chrome.tabs.Tab

  type PageActionClickedEvent = Event[js.Function1[/* tab */ Tab, Unit]]
}
