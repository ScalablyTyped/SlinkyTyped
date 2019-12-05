package typingsSlinky.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scriptBadge {
  import typingsSlinky.chrome.chrome.events.Event
  import typingsSlinky.chrome.chrome.tabs.Tab

  type ScriptBadgeClickedEvent = Event[js.Function1[/* tab */ Tab, Unit]]
}
