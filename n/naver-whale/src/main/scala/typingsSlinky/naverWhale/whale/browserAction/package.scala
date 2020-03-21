package typingsSlinky.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object browserAction {
  type BrowserClickedEvent = typingsSlinky.chrome.chrome.events.Event[js.Function1[/* tab */ typingsSlinky.chrome.chrome.tabs.Tab, scala.Unit]]
  type ColorArray = js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
}
