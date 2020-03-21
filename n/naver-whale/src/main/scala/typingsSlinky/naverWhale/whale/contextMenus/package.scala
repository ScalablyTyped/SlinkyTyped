package typingsSlinky.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object contextMenus {
  type MenuClickedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[
      /* info */ typingsSlinky.chrome.chrome.contextMenus.OnClickData, 
      /* tab */ js.UndefOr[typingsSlinky.chrome.chrome.tabs.Tab], 
      scala.Unit
    ]
  ]
}
