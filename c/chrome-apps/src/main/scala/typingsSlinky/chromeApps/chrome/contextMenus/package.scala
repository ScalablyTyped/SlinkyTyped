package typingsSlinky.chromeApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object contextMenus {
  type MenuClickedEvent = typingsSlinky.chromeApps.chrome.events.Event[
    js.Function1[/* info */ typingsSlinky.chromeApps.chrome.contextMenus.OnClickData, scala.Unit]
  ]
}
